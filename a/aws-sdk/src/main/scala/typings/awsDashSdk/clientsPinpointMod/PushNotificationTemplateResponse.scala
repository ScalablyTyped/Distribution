package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotificationTemplateResponse extends js.Object {
  /**
    * The message template that's used for the ADM (Amazon Device Messaging) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  /**
    * The message template that's used for the APNs (Apple Push Notification service) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var APNS: js.UndefOr[APNSPushNotificationTemplate] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  /**
    * The date when the message template was created.
    */
  var CreationDate: __string
  /**
    * The default message template that's used for push notification channels.
    */
  var Default: js.UndefOr[DefaultPushNotificationTemplate] = js.undefined
  /**
    * The message template that's used for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.undefined
  /**
    * The date when the message template was last modified.
    */
  var LastModifiedDate: __string
  /**
    * The name of the message template.
    */
  var TemplateName: __string
  /**
    * The type of channel that the message template is designed for. For a push notification template, this value is PUSH.
    */
  var TemplateType: typings.awsDashSdk.clientsPinpointMod.TemplateType
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object PushNotificationTemplateResponse {
  @scala.inline
  def apply(
    CreationDate: __string,
    LastModifiedDate: __string,
    TemplateName: __string,
    TemplateType: TemplateType,
    ADM: AndroidPushNotificationTemplate = null,
    APNS: APNSPushNotificationTemplate = null,
    Arn: __string = null,
    Baidu: AndroidPushNotificationTemplate = null,
    Default: DefaultPushNotificationTemplate = null,
    GCM: AndroidPushNotificationTemplate = null,
    tags: MapOf__string = null
  ): PushNotificationTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate, LastModifiedDate = LastModifiedDate, TemplateName = TemplateName, TemplateType = TemplateType.asInstanceOf[js.Any])
    if (ADM != null) __obj.updateDynamic("ADM")(ADM)
    if (APNS != null) __obj.updateDynamic("APNS")(APNS)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Baidu != null) __obj.updateDynamic("Baidu")(Baidu)
    if (Default != null) __obj.updateDynamic("Default")(Default)
    if (GCM != null) __obj.updateDynamic("GCM")(GCM)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[PushNotificationTemplateResponse]
  }
}

