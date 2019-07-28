package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutResourcePolicyResponse extends js.Object {
  /**
    * The ARN of the secret that the resource-based policy was retrieved for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  /**
    * The friendly name of the secret that the resource-based policy was retrieved for.
    */
  var Name: js.UndefOr[NameType] = js.undefined
}

object PutResourcePolicyResponse {
  @scala.inline
  def apply(ARN: SecretARNType = null, Name: NameType = null): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
}

