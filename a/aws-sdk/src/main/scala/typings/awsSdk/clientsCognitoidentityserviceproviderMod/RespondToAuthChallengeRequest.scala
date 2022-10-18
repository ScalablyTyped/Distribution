package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RespondToAuthChallengeRequest extends StObject {
  
  /**
    * The Amazon Pinpoint analytics metadata that contributes to your metrics for RespondToAuthChallenge calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  
  /**
    * The challenge name. For more information, see InitiateAuth.  ADMIN_NO_SRP_AUTH isn't a valid value.
    */
  var ChallengeName: ChallengeNameType
  
  /**
    * The challenge responses. These are inputs corresponding to the value of ChallengeName, for example:   SECRET_HASH (if app client is configured with client secret) applies to all of the inputs that follow (including SOFTWARE_TOKEN_MFA).     SMS_MFA: SMS_MFA_CODE, USERNAME.    PASSWORD_VERIFIER: PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, TIMESTAMP, USERNAME.   PASSWORD_VERIFIER requires DEVICE_KEY when you sign in with a remembered device.     NEW_PASSWORD_REQUIRED: NEW_PASSWORD, USERNAME, SECRET_HASH (if app client is configured with client secret). To set any required attributes that Amazon Cognito returned as requiredAttributes in the InitiateAuth response, add a userAttributes.attributename  parameter. This parameter can also set values for writable attributes that aren't required by your user pool.  In a NEW_PASSWORD_REQUIRED challenge response, you can't modify a required attribute that already has a value. In RespondToAuthChallenge, set a value for any keys that Amazon Cognito returned in the requiredAttributes parameter, then use the UpdateUserAttributes API operation to modify the value of any additional attributes.     SOFTWARE_TOKEN_MFA: USERNAME and SOFTWARE_TOKEN_MFA_CODE are required attributes.    DEVICE_SRP_AUTH requires USERNAME, DEVICE_KEY, SRP_A (and SECRET_HASH).    DEVICE_PASSWORD_VERIFIER requires everything that PASSWORD_VERIFIER requires, plus DEVICE_KEY.    MFA_SETUP requires USERNAME, plus you must use the session value returned by VerifySoftwareToken in the Session parameter.  
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined
  
  /**
    * The app client ID.
    */
  var ClientId: ClientIdType
  
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers. You create custom workflows by assigning Lambda functions to user pool triggers. When you use the RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following triggers: post authentication, pre token generation, define auth challenge, create auth challenge, and verify auth challenge. When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your RespondToAuthChallenge request. In your function code in Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see  Customizing user pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  When you use the ClientMetadata parameter, remember that Amazon Cognito won't do the following:   Store the ClientMetadata value. This data is available only to Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration doesn't include triggers, the ClientMetadata parameter serves no purpose.   Validate the ClientMetadata value.   Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
  
  /**
    * The session that should be passed both ways in challenge-response calls to the service. If InitiateAuth or RespondToAuthChallenge API call determines that the caller must pass another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
  
  /**
    * Contextual data about your user session, such as the device fingerprint, IP address, or location. Amazon Cognito advanced security evaluates the risk of an authentication event based on the context that your app generates and passes to Amazon Cognito when it makes API requests.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
}
object RespondToAuthChallengeRequest {
  
  inline def apply(ChallengeName: ChallengeNameType, ClientId: ClientIdType): RespondToAuthChallengeRequest = {
    val __obj = js.Dynamic.literal(ChallengeName = ChallengeName.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RespondToAuthChallengeRequest]
  }
  
  extension [Self <: RespondToAuthChallengeRequest](x: Self) {
    
    inline def setAnalyticsMetadata(value: AnalyticsMetadataType): Self = StObject.set(x, "AnalyticsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsMetadataUndefined: Self = StObject.set(x, "AnalyticsMetadata", js.undefined)
    
    inline def setChallengeName(value: ChallengeNameType): Self = StObject.set(x, "ChallengeName", value.asInstanceOf[js.Any])
    
    inline def setChallengeResponses(value: ChallengeResponsesType): Self = StObject.set(x, "ChallengeResponses", value.asInstanceOf[js.Any])
    
    inline def setChallengeResponsesUndefined: Self = StObject.set(x, "ChallengeResponses", js.undefined)
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientMetadata(value: ClientMetadataType): Self = StObject.set(x, "ClientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "ClientMetadata", js.undefined)
    
    inline def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
    
    inline def setUserContextData(value: UserContextDataType): Self = StObject.set(x, "UserContextData", value.asInstanceOf[js.Any])
    
    inline def setUserContextDataUndefined: Self = StObject.set(x, "UserContextData", js.undefined)
  }
}
