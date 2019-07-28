package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultAccessPolicy extends js.Object {
  /**
    * The vault access policy.
    */
  var Policy: js.UndefOr[String] = js.undefined
}

object VaultAccessPolicy {
  @scala.inline
  def apply(Policy: String = null): VaultAccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[VaultAccessPolicy]
  }
}

