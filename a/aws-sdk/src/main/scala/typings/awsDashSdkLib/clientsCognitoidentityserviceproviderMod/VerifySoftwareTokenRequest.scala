package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifySoftwareTokenRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.undefined
  /**
    * The friendly device name.
    */
  var FriendlyDeviceName: js.UndefOr[StringType] = js.undefined
  /**
    * The session which should be passed both ways in challenge-response calls to the service.
    */
  var Session: js.UndefOr[SessionType] = js.undefined
  /**
    * The one time password computed using the secret code returned by 
    */
  var UserCode: SoftwareTokenMFAUserCodeType
}

object VerifySoftwareTokenRequest {
  @scala.inline
  def apply(
    UserCode: SoftwareTokenMFAUserCodeType,
    AccessToken: TokenModelType = null,
    FriendlyDeviceName: StringType = null,
    Session: SessionType = null
  ): VerifySoftwareTokenRequest = {
    val __obj = js.Dynamic.literal(UserCode = UserCode)
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken)
    if (FriendlyDeviceName != null) __obj.updateDynamic("FriendlyDeviceName")(FriendlyDeviceName)
    if (Session != null) __obj.updateDynamic("Session")(Session)
    __obj.asInstanceOf[VerifySoftwareTokenRequest]
  }
}

