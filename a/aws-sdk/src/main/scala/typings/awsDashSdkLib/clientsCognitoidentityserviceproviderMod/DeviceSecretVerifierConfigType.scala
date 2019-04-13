package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceSecretVerifierConfigType extends js.Object {
  /**
    * The password verifier.
    */
  var PasswordVerifier: js.UndefOr[StringType] = js.undefined
  /**
    * The salt.
    */
  var Salt: js.UndefOr[StringType] = js.undefined
}

object DeviceSecretVerifierConfigType {
  @scala.inline
  def apply(PasswordVerifier: StringType = null, Salt: StringType = null): DeviceSecretVerifierConfigType = {
    val __obj = js.Dynamic.literal()
    if (PasswordVerifier != null) __obj.updateDynamic("PasswordVerifier")(PasswordVerifier)
    if (Salt != null) __obj.updateDynamic("Salt")(Salt)
    __obj.asInstanceOf[DeviceSecretVerifierConfigType]
  }
}

