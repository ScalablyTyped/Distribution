package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminRespondToAuthChallengeResponse extends js.Object {
  /**
    * The result returned by the server in response to the authentication request.
    */
  var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.native
  /**
    * The name of the challenge. For more information, see .
    */
  var ChallengeName: js.UndefOr[ChallengeNameType] = js.native
  /**
    * The challenge parameters. For more information, see .
    */
  var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.native
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If the or API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.native
}

object AdminRespondToAuthChallengeResponse {
  @scala.inline
  def apply(
    AuthenticationResult: AuthenticationResultType = null,
    ChallengeName: ChallengeNameType = null,
    ChallengeParameters: ChallengeParametersType = null,
    Session: SessionType = null
  ): AdminRespondToAuthChallengeResponse = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationResult != null) __obj.updateDynamic("AuthenticationResult")(AuthenticationResult.asInstanceOf[js.Any])
    if (ChallengeName != null) __obj.updateDynamic("ChallengeName")(ChallengeName.asInstanceOf[js.Any])
    if (ChallengeParameters != null) __obj.updateDynamic("ChallengeParameters")(ChallengeParameters.asInstanceOf[js.Any])
    if (Session != null) __obj.updateDynamic("Session")(Session.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminRespondToAuthChallengeResponse]
  }
}

