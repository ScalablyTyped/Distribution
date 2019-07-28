package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupResponse extends js.Object {
  /**
    * A description of the backup.
    */
  var Backup: js.UndefOr[typings.awsDashSdk.clientsFsxMod.Backup] = js.undefined
}

object CreateBackupResponse {
  @scala.inline
  def apply(Backup: Backup = null): CreateBackupResponse = {
    val __obj = js.Dynamic.literal()
    if (Backup != null) __obj.updateDynamic("Backup")(Backup)
    __obj.asInstanceOf[CreateBackupResponse]
  }
}

