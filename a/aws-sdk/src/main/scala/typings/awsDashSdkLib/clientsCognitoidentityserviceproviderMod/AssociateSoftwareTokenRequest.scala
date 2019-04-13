package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateSoftwareTokenRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  /**
    * The session which should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
}

object AssociateSoftwareTokenRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType = null, Session: SessionType = null): AssociateSoftwareTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    __obj.asInstanceOf[AssociateSoftwareTokenRequest]
  }
}

