package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyAction extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup. For example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var DestinationBackupVaultArn: ARN = js.native
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.native
}

object CopyAction {
  @scala.inline
  def apply(DestinationBackupVaultArn: ARN, Lifecycle: Lifecycle = null): CopyAction = {
    val __obj = js.Dynamic.literal(DestinationBackupVaultArn = DestinationBackupVaultArn.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyAction]
  }
}

