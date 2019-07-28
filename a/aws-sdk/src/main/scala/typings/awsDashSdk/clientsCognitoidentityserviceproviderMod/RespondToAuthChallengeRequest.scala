package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RespondToAuthChallengeRequest extends js.Object {
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for RespondToAuthChallenge calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
  /**
    * The challenge name. For more information, see .  ADMIN_NO_SRP_AUTH is not a valid value.
    */
  var ChallengeName: ChallengeNameType
  /**
    * The challenge responses. These are inputs corresponding to the value of ChallengeName, for example:    SMS_MFA: SMS_MFA_CODE, USERNAME, SECRET_HASH (if app client is configured with client secret).    PASSWORD_VERIFIER: PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, TIMESTAMP, USERNAME, SECRET_HASH (if app client is configured with client secret).    NEW_PASSWORD_REQUIRED: NEW_PASSWORD, any other required attributes, USERNAME, SECRET_HASH (if app client is configured with client secret).   
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined
  /**
    * The app client ID.
    */
  var ClientId: ClientIdType
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If InitiateAuth or RespondToAuthChallenge API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
}

object RespondToAuthChallengeRequest {
  @scala.inline
  def apply(
    ChallengeName: ChallengeNameType,
    ClientId: ClientIdType,
    AnalyticsMetadata: AnalyticsMetadataType = null,
    ChallengeResponses: ChallengeResponsesType = null,
    Session: SessionType = null,
    UserContextData: UserContextDataType = null
  ): RespondToAuthChallengeRequest = {
    val __obj = js.Dynamic.literal(ChallengeName = ChallengeName.asInstanceOf[js.Any], ClientId = ClientId)
    if (AnalyticsMetadata != null) __obj.updateDynamic("AnalyticsMetadata")(AnalyticsMetadata)
    if (ChallengeResponses != null) __obj.updateDynamic("ChallengeResponses")(ChallengeResponses)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    if (UserContextData != null) __obj.updateDynamic("UserContextData")(UserContextData)
    __obj.asInstanceOf[RespondToAuthChallengeRequest]
  }
}

