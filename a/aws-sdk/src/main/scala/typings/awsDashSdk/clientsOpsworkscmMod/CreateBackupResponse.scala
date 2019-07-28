package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupResponse extends js.Object {
  /**
    * Backup created by request.
    */
  var Backup: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.Backup] = js.undefined
}

object CreateBackupResponse {
  @scala.inline
  def apply(Backup: Backup = null): CreateBackupResponse = {
    val __obj = js.Dynamic.literal()
    if (Backup != null) __obj.updateDynamic("Backup")(Backup)
    __obj.asInstanceOf[CreateBackupResponse]
  }
}

