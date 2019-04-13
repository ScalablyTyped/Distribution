package typings
package awsDashSdkLib.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResourcePolicyResponse extends js.Object {
  /**
    * The ARN of the secret that the resource-based policy was deleted for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  /**
    * The friendly name of the secret that the resource-based policy was deleted for.
    */
  var Name: js.UndefOr[NameType] = js.undefined
}

object DeleteResourcePolicyResponse {
  @scala.inline
  def apply(ARN: SecretARNType = null, Name: NameType = null): DeleteResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[DeleteResourcePolicyResponse]
  }
}

