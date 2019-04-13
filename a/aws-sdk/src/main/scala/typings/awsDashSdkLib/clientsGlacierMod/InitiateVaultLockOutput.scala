package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateVaultLockOutput extends js.Object {
  /**
    * The lock ID, which is used to complete the vault locking process.
    */
  var lockId: js.UndefOr[java.lang.String] = js.undefined
}

object InitiateVaultLockOutput {
  @scala.inline
  def apply(lockId: java.lang.String = null): InitiateVaultLockOutput = {
    val __obj = js.Dynamic.literal()
    if (lockId != null) __obj.updateDynamic("lockId")(lockId)
    __obj.asInstanceOf[InitiateVaultLockOutput]
  }
}

