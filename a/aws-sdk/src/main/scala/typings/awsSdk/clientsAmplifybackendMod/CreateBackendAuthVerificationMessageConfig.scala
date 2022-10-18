package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendAuthVerificationMessageConfig extends StObject {
  
  /**
    * The type of verification message to send.
    */
  var DeliveryMethod: typings.awsSdk.clientsAmplifybackendMod.DeliveryMethod
  
  /**
    * The settings for the email message.
    */
  var EmailSettings: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.EmailSettings] = js.undefined
  
  /**
    * The settings for the SMS message.
    */
  var SmsSettings: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.SmsSettings] = js.undefined
}
object CreateBackendAuthVerificationMessageConfig {
  
  inline def apply(DeliveryMethod: DeliveryMethod): CreateBackendAuthVerificationMessageConfig = {
    val __obj = js.Dynamic.literal(DeliveryMethod = DeliveryMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendAuthVerificationMessageConfig]
  }
  
  extension [Self <: CreateBackendAuthVerificationMessageConfig](x: Self) {
    
    inline def setDeliveryMethod(value: DeliveryMethod): Self = StObject.set(x, "DeliveryMethod", value.asInstanceOf[js.Any])
    
    inline def setEmailSettings(value: EmailSettings): Self = StObject.set(x, "EmailSettings", value.asInstanceOf[js.Any])
    
    inline def setEmailSettingsUndefined: Self = StObject.set(x, "EmailSettings", js.undefined)
    
    inline def setSmsSettings(value: SmsSettings): Self = StObject.set(x, "SmsSettings", value.asInstanceOf[js.Any])
    
    inline def setSmsSettingsUndefined: Self = StObject.set(x, "SmsSettings", js.undefined)
  }
}
