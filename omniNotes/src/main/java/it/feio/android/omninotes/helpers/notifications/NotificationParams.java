package it.feio.android.omninotes.helpers.notifications;

import android.app.PendingIntent;

import lombok.NonNull;

public class NotificationParams {
    @NonNull NotificationChannels.NotificationChannelNames channelName;
    int smallIcon;
    String title;
    PendingIntent notifyIntent;
    boolean isOngoing;

    public NotificationParams(NotificationChannels.NotificationChannelNames channelName, int smallIcon, String title, PendingIntent notifyIntent) {
        this.channelName=channelName;
        this.smallIcon=smallIcon;
        this.title=title;
        this.notifyIntent=notifyIntent;
    }

    void setIsOngoing(boolean isOngoing) {
        this.isOngoing=isOngoing;
    }
}
