package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotificationTemplateResponse extends js.Object {
  /**
    * The message template that's used for the ADM (Amazon Device Messaging) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var ADM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The message template that's used for the APNs (Apple Push Notification service) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var APNS: js.UndefOr[APNSPushNotificationTemplate] = js.native
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * The message template that's used for the Baidu (Baidu Cloud Push) channel. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var Baidu: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: __string = js.native
  /**
    * The default message template that's used for push notification channels.
    */
  var Default: js.UndefOr[DefaultPushNotificationTemplate] = js.native
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[__string] = js.native
  /**
    * The message template that's used for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message template overrides the default template for push notification channels (DefaultPushNotificationTemplate).
    */
  var GCM: js.UndefOr[AndroidPushNotificationTemplate] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: __string = js.native
  /**
    * The custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[__string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: __string = js.native
  /**
    * The type of channel that the message template is designed for. For a push notification template, this value is PUSH.
    */
  var TemplateType: typings.awsDashSdk.clientsPinpointMod.TemplateType = js.native
  /**
    * The unique identifier, as an integer, for the active version of the message template, or the version of the template that you specified by using the version parameter in your request.
    */
  var Version: js.UndefOr[__string] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.native
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
    DefaultSubstitutions: __string = null,
    GCM: AndroidPushNotificationTemplate = null,
    TemplateDescription: __string = null,
    Version: __string = null,
    tags: MapOf__string = null
  ): PushNotificationTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    if (ADM != null) __obj.updateDynamic("ADM")(ADM.asInstanceOf[js.Any])
    if (APNS != null) __obj.updateDynamic("APNS")(APNS.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Baidu != null) __obj.updateDynamic("Baidu")(Baidu.asInstanceOf[js.Any])
    if (Default != null) __obj.updateDynamic("Default")(Default.asInstanceOf[js.Any])
    if (DefaultSubstitutions != null) __obj.updateDynamic("DefaultSubstitutions")(DefaultSubstitutions.asInstanceOf[js.Any])
    if (GCM != null) __obj.updateDynamic("GCM")(GCM.asInstanceOf[js.Any])
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationTemplateResponse]
  }
}

