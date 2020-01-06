package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateVaultLockOutput extends js.Object {
  /**
    * The lock ID, which is used to complete the vault locking process.
    */
  var lockId: js.UndefOr[String] = js.native
}

object InitiateVaultLockOutput {
  @scala.inline
  def apply(lockId: String = null): InitiateVaultLockOutput = {
    val __obj = js.Dynamic.literal()
    if (lockId != null) __obj.updateDynamic("lockId")(lockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateVaultLockOutput]
  }
}

