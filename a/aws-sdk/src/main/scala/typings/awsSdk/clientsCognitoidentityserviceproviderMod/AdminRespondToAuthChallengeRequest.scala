package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminRespondToAuthChallengeRequest extends StObject {
  
  /**
    * The analytics metadata for collecting Amazon Pinpoint metrics for AdminRespondToAuthChallenge calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  
  /**
    * The challenge name. For more information, see AdminInitiateAuth.
    */
  var ChallengeName: ChallengeNameType
  
  /**
    * The challenge responses. These are inputs corresponding to the value of ChallengeName, for example:    SMS_MFA: SMS_MFA_CODE, USERNAME, SECRET_HASH (if app client is configured with client secret).    PASSWORD_VERIFIER: PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, TIMESTAMP, USERNAME, SECRET_HASH (if app client is configured with client secret).   PASSWORD_VERIFIER requires DEVICE_KEY when signing in with a remembered device.     ADMIN_NO_SRP_AUTH: PASSWORD, USERNAME, SECRET_HASH (if app client is configured with client secret).     NEW_PASSWORD_REQUIRED: NEW_PASSWORD, USERNAME, SECRET_HASH (if app client is configured with client secret). To set any required attributes that Amazon Cognito returned as requiredAttributes in the AdminInitiateAuth response, add a userAttributes.attributename  parameter. This parameter can also set values for writable attributes that aren't required by your user pool.  In a NEW_PASSWORD_REQUIRED challenge response, you can't modify a required attribute that already has a value. In AdminRespondToAuthChallenge, set a value for any keys that Amazon Cognito returned in the requiredAttributes parameter, then use the AdminUpdateUserAttributes API operation to modify the value of any additional attributes.     MFA_SETUP requires USERNAME, plus you must use the session value returned by VerifySoftwareToken in the Session parameter.   The value of the USERNAME attribute must be the user's actual username, not an alias (such as an email address or phone number). To make this simpler, the AdminInitiateAuth response includes the actual username value in the USERNAMEUSER_ID_FOR_SRP attribute. This happens even if you specified an alias in your call to AdminInitiateAuth.
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined
  
  /**
    * The app client ID.
    */
  var ClientId: ClientIdType
  
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers. You create custom workflows by assigning Lambda functions to user pool triggers. When you use the AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that you have assigned to the following triggers:    pre sign-up   custom message   post authentication   user migration   pre token generation   define auth challenge   create auth challenge   verify auth challenge response   When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute that provides the data that you assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code in Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see  Customizing user pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:   Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata parameter serves no purpose.   Validate the ClientMetadata value.   Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
  
  /**
    * Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon Cognito advanced security evaluates the risk of an authentication event based on the context that your app generates and passes to Amazon Cognito when it makes API requests.
    */
  var ContextData: js.UndefOr[ContextDataType] = js.undefined
  
  /**
    * The session that should be passed both ways in challenge-response calls to the service. If an InitiateAuth or RespondToAuthChallenge API call determines that the caller must pass another challenge, it returns a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
  
  /**
    * The ID of the Amazon Cognito user pool.
    */
  var UserPoolId: UserPoolIdType
}
object AdminRespondToAuthChallengeRequest {
  
  inline def apply(ChallengeName: ChallengeNameType, ClientId: ClientIdType, UserPoolId: UserPoolIdType): AdminRespondToAuthChallengeRequest = {
    val __obj = js.Dynamic.literal(ChallengeName = ChallengeName.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminRespondToAuthChallengeRequest]
  }
  
  extension [Self <: AdminRespondToAuthChallengeRequest](x: Self) {
    
    inline def setAnalyticsMetadata(value: AnalyticsMetadataType): Self = StObject.set(x, "AnalyticsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsMetadataUndefined: Self = StObject.set(x, "AnalyticsMetadata", js.undefined)
    
    inline def setChallengeName(value: ChallengeNameType): Self = StObject.set(x, "ChallengeName", value.asInstanceOf[js.Any])
    
    inline def setChallengeResponses(value: ChallengeResponsesType): Self = StObject.set(x, "ChallengeResponses", value.asInstanceOf[js.Any])
    
    inline def setChallengeResponsesUndefined: Self = StObject.set(x, "ChallengeResponses", js.undefined)
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientMetadata(value: ClientMetadataType): Self = StObject.set(x, "ClientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "ClientMetadata", js.undefined)
    
    inline def setContextData(value: ContextDataType): Self = StObject.set(x, "ContextData", value.asInstanceOf[js.Any])
    
    inline def setContextDataUndefined: Self = StObject.set(x, "ContextData", js.undefined)
    
    inline def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
