package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RespondToAuthChallengeResponse extends js.Object {
  /**
    * The result returned by the server in response to the request to respond to the authentication challenge.
    */
  var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined
  /**
    * The challenge name. For more information, see .
    */
  var ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined
  /**
    * The challenge parameters. For more information, see .
    */
  var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If the or API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
}

object RespondToAuthChallengeResponse {
  @scala.inline
  def apply(
    AuthenticationResult: AuthenticationResultType = null,
    ChallengeName: ChallengeNameType = null,
    ChallengeParameters: ChallengeParametersType = null,
    Session: SessionType = null
  ): RespondToAuthChallengeResponse = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationResult != null) __obj.updateDynamic("AuthenticationResult")(AuthenticationResult)
    if (ChallengeName != null) __obj.updateDynamic("ChallengeName")(ChallengeName.asInstanceOf[js.Any])
    if (ChallengeParameters != null) __obj.updateDynamic("ChallengeParameters")(ChallengeParameters)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    __obj.asInstanceOf[RespondToAuthChallengeResponse]
  }
}

