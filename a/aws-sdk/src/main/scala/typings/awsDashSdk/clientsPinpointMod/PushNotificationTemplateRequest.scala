package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotificationTemplateRequest extends js.Object {
  /**
    * The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  /**
    * The message template to use for the APNs (Apple Push Notification service) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var APNS: js.UndefOr[APNSPushNotificationTemplate] = js.undefined
  /**
    * The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  /**
    * The default message template to use for push notification channels.
    */
  var Default: js.UndefOr[DefaultPushNotificationTemplate] = js.undefined
  /**
    * The message template to use for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object PushNotificationTemplateRequest {
  @scala.inline
  def apply(
    ADM: AndroidPushNotificationTemplate = null,
    APNS: APNSPushNotificationTemplate = null,
    Baidu: AndroidPushNotificationTemplate = null,
    Default: DefaultPushNotificationTemplate = null,
    GCM: AndroidPushNotificationTemplate = null,
    tags: MapOf__string = null
  ): PushNotificationTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (ADM != null) __obj.updateDynamic("ADM")(ADM)
    if (APNS != null) __obj.updateDynamic("APNS")(APNS)
    if (Baidu != null) __obj.updateDynamic("Baidu")(Baidu)
    if (Default != null) __obj.updateDynamic("Default")(Default)
    if (GCM != null) __obj.updateDynamic("GCM")(GCM)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[PushNotificationTemplateRequest]
  }
}

