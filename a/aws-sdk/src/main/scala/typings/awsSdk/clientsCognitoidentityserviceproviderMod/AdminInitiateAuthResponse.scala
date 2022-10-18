package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminInitiateAuthResponse extends StObject {
  
  /**
    * The result of the authentication response. This is only returned if the caller doesn't need to pass another challenge. If the caller does need to pass another challenge before it gets tokens, ChallengeName, ChallengeParameters, and Session are returned.
    */
  var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined
  
  /**
    * The name of the challenge that you're responding to with this call. This is returned in the AdminInitiateAuth response if you must pass another challenge.    MFA_SETUP: If MFA is required, users who don't have at least one of the MFA methods set up are presented with an MFA_SETUP challenge. The user must set up at least one MFA type to continue to authenticate.    SELECT_MFA_TYPE: Selects the MFA type. Valid MFA options are SMS_MFA for text SMS MFA, and SOFTWARE_TOKEN_MFA for time-based one-time password (TOTP) software token MFA.    SMS_MFA: Next challenge is to supply an SMS_MFA_CODE, delivered via SMS.    PASSWORD_VERIFIER: Next challenge is to supply PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, and TIMESTAMP after the client-side SRP calculations.    CUSTOM_CHALLENGE: This is returned if your custom authentication flow determines that the user should pass another challenge before tokens are issued.    DEVICE_SRP_AUTH: If device tracking was activated in your user pool and the previous challenges were passed, this challenge is returned so that Amazon Cognito can start tracking this device.    DEVICE_PASSWORD_VERIFIER: Similar to PASSWORD_VERIFIER, but for devices only.    ADMIN_NO_SRP_AUTH: This is returned if you must authenticate with USERNAME and PASSWORD directly. An app client must be enabled to use this flow.    NEW_PASSWORD_REQUIRED: For users who are required to change their passwords after successful first login. Respond to this challenge with NEW_PASSWORD and any required attributes that Amazon Cognito returned in the requiredAttributes parameter. You can also set values for attributes that aren't required by your user pool and that your app client can write. For more information, see AdminRespondToAuthChallenge.  In a NEW_PASSWORD_REQUIRED challenge response, you can't modify a required attribute that already has a value. In AdminRespondToAuthChallenge, set a value for any keys that Amazon Cognito returned in the requiredAttributes parameter, then use the AdminUpdateUserAttributes API operation to modify the value of any additional attributes.     MFA_SETUP: For users who are required to set up an MFA factor before they can sign in. The MFA types activated for the user pool will be listed in the challenge parameters MFA_CAN_SETUP value.   To set up software token MFA, use the session returned here from InitiateAuth as an input to AssociateSoftwareToken, and use the session returned by VerifySoftwareToken as an input to RespondToAuthChallenge with challenge name MFA_SETUP to complete sign-in. To set up SMS MFA, users will need help from an administrator to add a phone number to their account and then call InitiateAuth again to restart sign-in.  
    */
  var ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined
  
  /**
    * The challenge parameters. These are returned to you in the AdminInitiateAuth response if you must pass another challenge. The responses in this parameter should be used to compute inputs to the next call (AdminRespondToAuthChallenge). All challenges require USERNAME and SECRET_HASH (if applicable). The value of the USER_ID_FOR_SRP attribute is the user's actual username, not an alias (such as email address or phone number), even if you specified an alias in your call to AdminInitiateAuth. This happens because, in the AdminRespondToAuthChallenge API ChallengeResponses, the USERNAME attribute can't be an alias.
    */
  var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined
  
  /**
    * The session that should be passed both ways in challenge-response calls to the service. If AdminInitiateAuth or AdminRespondToAuthChallenge API call determines that the caller must pass another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next AdminRespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
}
object AdminInitiateAuthResponse {
  
  inline def apply(): AdminInitiateAuthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminInitiateAuthResponse]
  }
  
  extension [Self <: AdminInitiateAuthResponse](x: Self) {
    
    inline def setAuthenticationResult(value: AuthenticationResultType): Self = StObject.set(x, "AuthenticationResult", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationResultUndefined: Self = StObject.set(x, "AuthenticationResult", js.undefined)
    
    inline def setChallengeName(value: ChallengeNameType): Self = StObject.set(x, "ChallengeName", value.asInstanceOf[js.Any])
    
    inline def setChallengeNameUndefined: Self = StObject.set(x, "ChallengeName", js.undefined)
    
    inline def setChallengeParameters(value: ChallengeParametersType): Self = StObject.set(x, "ChallengeParameters", value.asInstanceOf[js.Any])
    
    inline def setChallengeParametersUndefined: Self = StObject.set(x, "ChallengeParameters", js.undefined)
    
    inline def setSession(value: SessionType): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
