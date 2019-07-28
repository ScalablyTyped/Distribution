package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateSoftwareTokenResponse extends js.Object {
  /**
    * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
    */
  var SecretCode: js.UndefOr[SecretCodeType] = js.undefined
  /**
    * The session which should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
}

object AssociateSoftwareTokenResponse {
  @scala.inline
  def apply(SecretCode: SecretCodeType = null, Session: SessionType = null): AssociateSoftwareTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (SecretCode != null) __obj.updateDynamic("SecretCode")(SecretCode)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    __obj.asInstanceOf[AssociateSoftwareTokenResponse]
  }
}

