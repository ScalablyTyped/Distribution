package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultLockPolicy extends js.Object {
  /**
    * The vault lock policy.
    */
  var Policy: js.UndefOr[java.lang.String] = js.undefined
}

object VaultLockPolicy {
  @scala.inline
  def apply(Policy: java.lang.String = null): VaultLockPolicy = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[VaultLockPolicy]
  }
}

