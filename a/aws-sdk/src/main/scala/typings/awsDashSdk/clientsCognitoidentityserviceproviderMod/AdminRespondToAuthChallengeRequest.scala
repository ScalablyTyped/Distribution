package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminRespondToAuthChallengeRequest extends js.Object {
  /**
    * The analytics metadata for collecting Amazon Pinpoint metrics for AdminRespondToAuthChallenge calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  /**
    * The challenge name. For more information, see .
    */
  var ChallengeName: ChallengeNameType
  /**
    * The challenge responses. These are inputs corresponding to the value of ChallengeName, for example:    SMS_MFA: SMS_MFA_CODE, USERNAME, SECRET_HASH (if app client is configured with client secret).    PASSWORD_VERIFIER: PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, TIMESTAMP, USERNAME, SECRET_HASH (if app client is configured with client secret).    ADMIN_NO_SRP_AUTH: PASSWORD, USERNAME, SECRET_HASH (if app client is configured with client secret).     NEW_PASSWORD_REQUIRED: NEW_PASSWORD, any other required attributes, USERNAME, SECRET_HASH (if app client is configured with client secret).    The value of the USERNAME attribute must be the user's actual username, not an alias (such as email address or phone number). To make this easier, the AdminInitiateAuth response includes the actual username value in the USERNAMEUSER_ID_FOR_SRP attribute, even if you specified an alias in your call to AdminInitiateAuth.
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined
  /**
    * The app client ID.
    */
  var ClientId: ClientIdType
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var ContextData: js.UndefOr[ContextDataType] = js.undefined
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If InitiateAuth or RespondToAuthChallenge API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
  /**
    * The ID of the Amazon Cognito user pool.
    */
  var UserPoolId: UserPoolIdType
}

object AdminRespondToAuthChallengeRequest {
  @scala.inline
  def apply(
    ChallengeName: ChallengeNameType,
    ClientId: ClientIdType,
    UserPoolId: UserPoolIdType,
    AnalyticsMetadata: AnalyticsMetadataType = null,
    ChallengeResponses: ChallengeResponsesType = null,
    ContextData: ContextDataType = null,
    Session: SessionType = null
  ): AdminRespondToAuthChallengeRequest = {
    val __obj = js.Dynamic.literal(ChallengeName = ChallengeName.asInstanceOf[js.Any], ClientId = ClientId, UserPoolId = UserPoolId)
    if (AnalyticsMetadata != null) __obj.updateDynamic("AnalyticsMetadata")(AnalyticsMetadata)
    if (ChallengeResponses != null) __obj.updateDynamic("ChallengeResponses")(ChallengeResponses)
    if (ContextData != null) __obj.updateDynamic("ContextData")(ContextData)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    __obj.asInstanceOf[AdminRespondToAuthChallengeRequest]
  }
}

