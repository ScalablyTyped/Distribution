package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotificationTemplateRequest extends js.Object {
  /**
    * The message template to use for the ADM (Amazon Device Messaging) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The message template to use for the APNs (Apple Push Notification service) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var APNS: js.UndefOr[APNSPushNotificationTemplate] = js.native
  /**
    * The message template to use for the Baidu (Baidu Cloud Push) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The default message template to use for push notification channels.
    */
  var Default: js.UndefOr[DefaultPushNotificationTemplate] = js.native
  /**
    * A JSON object that specifies the default values to use for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable. When you create a message that's based on the template, you can override these defaults with message-specific and address-specific variables and values.
    */
  var DefaultSubstitutions: js.UndefOr[__string] = js.native
  /**
    * The message template to use for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * A custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[__string] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.native
}

object PushNotificationTemplateRequest {
  @scala.inline
  def apply(
    ADM: AndroidPushNotificationTemplate = null,
    APNS: APNSPushNotificationTemplate = null,
    Baidu: AndroidPushNotificationTemplate = null,
    Default: DefaultPushNotificationTemplate = null,
    DefaultSubstitutions: __string = null,
    GCM: AndroidPushNotificationTemplate = null,
    TemplateDescription: __string = null,
    tags: MapOf__string = null
  ): PushNotificationTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (ADM != null) __obj.updateDynamic("ADM")(ADM.asInstanceOf[js.Any])
    if (APNS != null) __obj.updateDynamic("APNS")(APNS.asInstanceOf[js.Any])
    if (Baidu != null) __obj.updateDynamic("Baidu")(Baidu.asInstanceOf[js.Any])
    if (Default != null) __obj.updateDynamic("Default")(Default.asInstanceOf[js.Any])
    if (DefaultSubstitutions != null) __obj.updateDynamic("DefaultSubstitutions")(DefaultSubstitutions.asInstanceOf[js.Any])
    if (GCM != null) __obj.updateDynamic("GCM")(GCM.asInstanceOf[js.Any])
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationTemplateRequest]
  }
}

