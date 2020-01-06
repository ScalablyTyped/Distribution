package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceSecretVerifierConfigType extends js.Object {
  /**
    * The password verifier.
    */
  var PasswordVerifier: js.UndefOr[StringType] = js.native
  /**
    * The salt.
    */
  var Salt: js.UndefOr[StringType] = js.native
}

object DeviceSecretVerifierConfigType {
  @scala.inline
  def apply(PasswordVerifier: StringType = null, Salt: StringType = null): DeviceSecretVerifierConfigType = {
    val __obj = js.Dynamic.literal()
    if (PasswordVerifier != null) __obj.updateDynamic("PasswordVerifier")(PasswordVerifier.asInstanceOf[js.Any])
    if (Salt != null) __obj.updateDynamic("Salt")(Salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSecretVerifierConfigType]
  }
}

