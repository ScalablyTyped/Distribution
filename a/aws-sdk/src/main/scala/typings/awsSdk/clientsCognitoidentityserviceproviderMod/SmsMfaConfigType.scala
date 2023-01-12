package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsMfaConfigType extends StObject {
  
  /**
    * The SMS authentication message that will be sent to users with the code they must sign in. The message must contain the ‘{####}’ placeholder, which is replaced with the code. If the message isn't included, and default message will be used.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  
  /**
    * The SMS configuration with the settings that your Amazon Cognito user pool must use to send an SMS message from your Amazon Web Services account through Amazon Simple Notification Service. To request Amazon SNS in the Amazon Web Services Region that you want, the Amazon Cognito user pool uses an Identity and Access Management (IAM) role that you provide for your Amazon Web Services account.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
}
object SmsMfaConfigType {
  
  inline def apply(): SmsMfaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsMfaConfigType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmsMfaConfigType] (val x: Self) extends AnyVal {
    
    inline def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsAuthenticationMessageUndefined: Self = StObject.set(x, "SmsAuthenticationMessage", js.undefined)
    
    inline def setSmsConfiguration(value: SmsConfigurationType): Self = StObject.set(x, "SmsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSmsConfigurationUndefined: Self = StObject.set(x, "SmsConfiguration", js.undefined)
  }
}
