package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendAuthForgotPasswordConfig extends StObject {
  
  /**
    * (DEPRECATED) Describes which mode to use (either SMS or email) to deliver messages to app users who want to recover their password.
    */
  var DeliveryMethod: typings.awsSdk.clientsAmplifybackendMod.DeliveryMethod
  
  /**
    * (DEPRECATED) The configuration for the email sent when an app user forgets their password.
    */
  var EmailSettings: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.EmailSettings] = js.undefined
  
  /**
    * (DEPRECATED) The configuration for the SMS message sent when an app user forgets their password.
    */
  var SmsSettings: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.SmsSettings] = js.undefined
}
object CreateBackendAuthForgotPasswordConfig {
  
  inline def apply(DeliveryMethod: DeliveryMethod): CreateBackendAuthForgotPasswordConfig = {
    val __obj = js.Dynamic.literal(DeliveryMethod = DeliveryMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendAuthForgotPasswordConfig]
  }
  
  extension [Self <: CreateBackendAuthForgotPasswordConfig](x: Self) {
    
    inline def setDeliveryMethod(value: DeliveryMethod): Self = StObject.set(x, "DeliveryMethod", value.asInstanceOf[js.Any])
    
    inline def setEmailSettings(value: EmailSettings): Self = StObject.set(x, "EmailSettings", value.asInstanceOf[js.Any])
    
    inline def setEmailSettingsUndefined: Self = StObject.set(x, "EmailSettings", js.undefined)
    
    inline def setSmsSettings(value: SmsSettings): Self = StObject.set(x, "SmsSettings", value.asInstanceOf[js.Any])
    
    inline def setSmsSettingsUndefined: Self = StObject.set(x, "SmsSettings", js.undefined)
  }
}
