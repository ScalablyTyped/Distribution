package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendAuthUserPoolConfig extends StObject {
  
  /**
    * (DEPRECATED) Describes the forgot password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var ForgotPassword: js.UndefOr[UpdateBackendAuthForgotPasswordConfig] = js.undefined
  
  /**
    * Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool configured as a part of your Amplify project.
    */
  var Mfa: js.UndefOr[UpdateBackendAuthMFAConfig] = js.undefined
  
  /**
    * Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var OAuth: js.UndefOr[UpdateBackendAuthOAuthConfig] = js.undefined
  
  /**
    * Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var PasswordPolicy: js.UndefOr[UpdateBackendAuthPasswordPolicyConfig] = js.undefined
  
  /**
    * Describes the email or SMS verification message for your Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var VerificationMessage: js.UndefOr[UpdateBackendAuthVerificationMessageConfig] = js.undefined
}
object UpdateBackendAuthUserPoolConfig {
  
  inline def apply(): UpdateBackendAuthUserPoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBackendAuthUserPoolConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateBackendAuthUserPoolConfig] (val x: Self) extends AnyVal {
    
    inline def setForgotPassword(value: UpdateBackendAuthForgotPasswordConfig): Self = StObject.set(x, "ForgotPassword", value.asInstanceOf[js.Any])
    
    inline def setForgotPasswordUndefined: Self = StObject.set(x, "ForgotPassword", js.undefined)
    
    inline def setMfa(value: UpdateBackendAuthMFAConfig): Self = StObject.set(x, "Mfa", value.asInstanceOf[js.Any])
    
    inline def setMfaUndefined: Self = StObject.set(x, "Mfa", js.undefined)
    
    inline def setOAuth(value: UpdateBackendAuthOAuthConfig): Self = StObject.set(x, "OAuth", value.asInstanceOf[js.Any])
    
    inline def setOAuthUndefined: Self = StObject.set(x, "OAuth", js.undefined)
    
    inline def setPasswordPolicy(value: UpdateBackendAuthPasswordPolicyConfig): Self = StObject.set(x, "PasswordPolicy", value.asInstanceOf[js.Any])
    
    inline def setPasswordPolicyUndefined: Self = StObject.set(x, "PasswordPolicy", js.undefined)
    
    inline def setVerificationMessage(value: UpdateBackendAuthVerificationMessageConfig): Self = StObject.set(x, "VerificationMessage", value.asInstanceOf[js.Any])
    
    inline def setVerificationMessageUndefined: Self = StObject.set(x, "VerificationMessage", js.undefined)
  }
}
