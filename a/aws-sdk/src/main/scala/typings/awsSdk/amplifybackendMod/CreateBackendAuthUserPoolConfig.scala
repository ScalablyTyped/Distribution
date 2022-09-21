package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendAuthUserPoolConfig extends StObject {
  
  /**
    * (DEPRECATED) Describes the forgotten password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var ForgotPassword: js.UndefOr[CreateBackendAuthForgotPasswordConfig] = js.undefined
  
  /**
    * Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool configured as a part of your Amplify project.
    */
  var Mfa: js.UndefOr[CreateBackendAuthMFAConfig] = js.undefined
  
  /**
    * Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var OAuth: js.UndefOr[CreateBackendAuthOAuthConfig] = js.undefined
  
  /**
    * Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var PasswordPolicy: js.UndefOr[CreateBackendAuthPasswordPolicyConfig] = js.undefined
  
  /**
    * The required attributes to sign up new users in the user pool.
    */
  var RequiredSignUpAttributes: ListOfRequiredSignUpAttributesElement
  
  /**
    * Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var SignInMethod: typings.awsSdk.amplifybackendMod.SignInMethod
  
  /**
    * The Amazon Cognito user pool name.
    */
  var UserPoolName: string
  
  /**
    * Describes the email or SMS verification message for your Amazon Cognito user pool, configured as a part of your Amplify project.
    */
  var VerificationMessage: js.UndefOr[CreateBackendAuthVerificationMessageConfig] = js.undefined
}
object CreateBackendAuthUserPoolConfig {
  
  inline def apply(
    RequiredSignUpAttributes: ListOfRequiredSignUpAttributesElement,
    SignInMethod: SignInMethod,
    UserPoolName: string
  ): CreateBackendAuthUserPoolConfig = {
    val __obj = js.Dynamic.literal(RequiredSignUpAttributes = RequiredSignUpAttributes.asInstanceOf[js.Any], SignInMethod = SignInMethod.asInstanceOf[js.Any], UserPoolName = UserPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendAuthUserPoolConfig]
  }
  
  extension [Self <: CreateBackendAuthUserPoolConfig](x: Self) {
    
    inline def setForgotPassword(value: CreateBackendAuthForgotPasswordConfig): Self = StObject.set(x, "ForgotPassword", value.asInstanceOf[js.Any])
    
    inline def setForgotPasswordUndefined: Self = StObject.set(x, "ForgotPassword", js.undefined)
    
    inline def setMfa(value: CreateBackendAuthMFAConfig): Self = StObject.set(x, "Mfa", value.asInstanceOf[js.Any])
    
    inline def setMfaUndefined: Self = StObject.set(x, "Mfa", js.undefined)
    
    inline def setOAuth(value: CreateBackendAuthOAuthConfig): Self = StObject.set(x, "OAuth", value.asInstanceOf[js.Any])
    
    inline def setOAuthUndefined: Self = StObject.set(x, "OAuth", js.undefined)
    
    inline def setPasswordPolicy(value: CreateBackendAuthPasswordPolicyConfig): Self = StObject.set(x, "PasswordPolicy", value.asInstanceOf[js.Any])
    
    inline def setPasswordPolicyUndefined: Self = StObject.set(x, "PasswordPolicy", js.undefined)
    
    inline def setRequiredSignUpAttributes(value: ListOfRequiredSignUpAttributesElement): Self = StObject.set(x, "RequiredSignUpAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequiredSignUpAttributesVarargs(value: RequiredSignUpAttributesElement*): Self = StObject.set(x, "RequiredSignUpAttributes", js.Array(value*))
    
    inline def setSignInMethod(value: SignInMethod): Self = StObject.set(x, "SignInMethod", value.asInstanceOf[js.Any])
    
    inline def setUserPoolName(value: string): Self = StObject.set(x, "UserPoolName", value.asInstanceOf[js.Any])
    
    inline def setVerificationMessage(value: CreateBackendAuthVerificationMessageConfig): Self = StObject.set(x, "VerificationMessage", value.asInstanceOf[js.Any])
    
    inline def setVerificationMessageUndefined: Self = StObject.set(x, "VerificationMessage", js.undefined)
  }
}
