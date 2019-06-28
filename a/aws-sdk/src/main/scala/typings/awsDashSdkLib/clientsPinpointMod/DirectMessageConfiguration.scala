package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectMessageConfiguration extends js.Object {
  /**
    * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var ADMMessage: js.UndefOr[ADMMessage] = js.undefined
  /**
    * The default push notification message for the APNs (Apple Push Notification service) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var APNSMessage: js.UndefOr[APNSMessage] = js.undefined
  /**
    * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var BaiduMessage: js.UndefOr[BaiduMessage] = js.undefined
  /**
    * The default message body for all channels.
    */
  var DefaultMessage: js.UndefOr[DefaultMessage] = js.undefined
  /**
    * The default push notification message for all push channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[DefaultPushNotificationMessage] = js.undefined
  /**
    * The default message for the email channel. This message overrides the default message (DefaultMessage).
    */
  var EmailMessage: js.UndefOr[EmailMessage] = js.undefined
  /**
    * The default push notification message for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var GCMMessage: js.UndefOr[GCMMessage] = js.undefined
  /**
    * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
    */
  var SMSMessage: js.UndefOr[SMSMessage] = js.undefined
  /**
    * The default message for the voice channel. This message overrides the default message (DefaultMessage).
    */
  var VoiceMessage: js.UndefOr[VoiceMessage] = js.undefined
}

object DirectMessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: ADMMessage = null,
    APNSMessage: APNSMessage = null,
    BaiduMessage: BaiduMessage = null,
    DefaultMessage: DefaultMessage = null,
    DefaultPushNotificationMessage: DefaultPushNotificationMessage = null,
    EmailMessage: EmailMessage = null,
    GCMMessage: GCMMessage = null,
    SMSMessage: SMSMessage = null,
    VoiceMessage: VoiceMessage = null
  ): DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage)
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage)
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage)
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage)
    if (DefaultPushNotificationMessage != null) __obj.updateDynamic("DefaultPushNotificationMessage")(DefaultPushNotificationMessage)
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage)
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage)
    if (VoiceMessage != null) __obj.updateDynamic("VoiceMessage")(VoiceMessage)
    __obj.asInstanceOf[DirectMessageConfiguration]
  }
}

