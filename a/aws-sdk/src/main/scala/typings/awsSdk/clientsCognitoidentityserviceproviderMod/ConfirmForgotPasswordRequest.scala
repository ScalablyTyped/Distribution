package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmForgotPasswordRequest extends StObject {
  
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for ConfirmForgotPassword calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  
  /**
    * The app client ID of the app associated with the user pool.
    */
  var ClientId: ClientIdType
  
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers. You create custom workflows by assigning Lambda functions to user pool triggers. When you use the ConfirmForgotPassword API action, Amazon Cognito invokes the function that is assigned to the post confirmation trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your ConfirmForgotPassword request. In your function code in Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see  Customizing user pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:   Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata parameter serves no purpose.   Validate the ClientMetadata value.   Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
  
  /**
    * The confirmation code from your user's request to reset their password. For more information, see ForgotPassword.
    */
  var ConfirmationCode: ConfirmationCodeType
  
  /**
    * The new password that your user wants to set.
    */
  var Password: PasswordType
  
  /**
    * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
    */
  var SecretHash: js.UndefOr[SecretHashType] = js.undefined
  
  /**
    * Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon Cognito advanced security evaluates the risk of an authentication event based on the context that your app generates and passes to Amazon Cognito when it makes API requests.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
  
  /**
    * The user name of the user for whom you want to enter a code to retrieve a forgotten password.
    */
  var Username: UsernameType
}
object ConfirmForgotPasswordRequest {
  
  inline def apply(
    ClientId: ClientIdType,
    ConfirmationCode: ConfirmationCodeType,
    Password: PasswordType,
    Username: UsernameType
  ): ConfirmForgotPasswordRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], ConfirmationCode = ConfirmationCode.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmForgotPasswordRequest]
  }
  
  extension [Self <: ConfirmForgotPasswordRequest](x: Self) {
    
    inline def setAnalyticsMetadata(value: AnalyticsMetadataType): Self = StObject.set(x, "AnalyticsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsMetadataUndefined: Self = StObject.set(x, "AnalyticsMetadata", js.undefined)
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientMetadata(value: ClientMetadataType): Self = StObject.set(x, "ClientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "ClientMetadata", js.undefined)
    
    inline def setConfirmationCode(value: ConfirmationCodeType): Self = StObject.set(x, "ConfirmationCode", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: PasswordType): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setSecretHash(value: SecretHashType): Self = StObject.set(x, "SecretHash", value.asInstanceOf[js.Any])
    
    inline def setSecretHashUndefined: Self = StObject.set(x, "SecretHash", js.undefined)
    
    inline def setUserContextData(value: UserContextDataType): Self = StObject.set(x, "UserContextData", value.asInstanceOf[js.Any])
    
    inline def setUserContextDataUndefined: Self = StObject.set(x, "UserContextData", js.undefined)
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
