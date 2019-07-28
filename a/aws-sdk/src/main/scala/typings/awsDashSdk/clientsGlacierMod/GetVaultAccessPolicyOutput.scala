package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVaultAccessPolicyOutput extends js.Object {
  /**
    * Contains the returned vault access policy as a JSON string.
    */
  var policy: js.UndefOr[VaultAccessPolicy] = js.undefined
}

object GetVaultAccessPolicyOutput {
  @scala.inline
  def apply(policy: VaultAccessPolicy = null): GetVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[GetVaultAccessPolicyOutput]
  }
}

