package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectMessageConfiguration extends StObject {
  
  /**
    * The default push notification message for the ADM (Amazon Device Messaging) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var ADMMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.ADMMessage] = js.undefined
  
  /**
    * The default push notification message for the APNs (Apple Push Notification service) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var APNSMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.APNSMessage] = js.undefined
  
  /**
    * The default push notification message for the Baidu (Baidu Cloud Push) channel. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var BaiduMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.BaiduMessage] = js.undefined
  
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.DefaultMessage] = js.undefined
  
  /**
    * The default push notification message for all push notification channels.
    */
  var DefaultPushNotificationMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.DefaultPushNotificationMessage] = js.undefined
  
  /**
    * The default message for the email channel. This message overrides the default message (DefaultMessage).
    */
  var EmailMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.EmailMessage] = js.undefined
  
  /**
    * The default push notification message for the GCM channel, which is used to send notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service. This message overrides the default push notification message (DefaultPushNotificationMessage).
    */
  var GCMMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.GCMMessage] = js.undefined
  
  /**
    * The default message for the SMS channel. This message overrides the default message (DefaultMessage).
    */
  var SMSMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.SMSMessage] = js.undefined
  
  /**
    * The default message for the voice channel. This message overrides the default message (DefaultMessage).
    */
  var VoiceMessage: js.UndefOr[typings.awsSdk.clientsPinpointMod.VoiceMessage] = js.undefined
}
object DirectMessageConfiguration {
  
  inline def apply(): DirectMessageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectMessageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectMessageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setADMMessage(value: ADMMessage): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
    
    inline def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
    
    inline def setAPNSMessage(value: APNSMessage): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
    
    inline def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
    
    inline def setBaiduMessage(value: BaiduMessage): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
    
    inline def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
    
    inline def setDefaultMessage(value: DefaultMessage): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
    
    inline def setDefaultPushNotificationMessage(value: DefaultPushNotificationMessage): Self = StObject.set(x, "DefaultPushNotificationMessage", value.asInstanceOf[js.Any])
    
    inline def setDefaultPushNotificationMessageUndefined: Self = StObject.set(x, "DefaultPushNotificationMessage", js.undefined)
    
    inline def setEmailMessage(value: EmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    inline def setGCMMessage(value: GCMMessage): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
    
    inline def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
    
    inline def setSMSMessage(value: SMSMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
    
    inline def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    
    inline def setVoiceMessage(value: VoiceMessage): Self = StObject.set(x, "VoiceMessage", value.asInstanceOf[js.Any])
    
    inline def setVoiceMessageUndefined: Self = StObject.set(x, "VoiceMessage", js.undefined)
  }
}
