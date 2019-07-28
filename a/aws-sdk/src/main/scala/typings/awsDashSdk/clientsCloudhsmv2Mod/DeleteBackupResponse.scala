package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupResponse extends js.Object {
  /**
    * Information on the Backup object deleted.
    */
  var Backup: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.Backup] = js.undefined
}

object DeleteBackupResponse {
  @scala.inline
  def apply(Backup: Backup = null): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    if (Backup != null) __obj.updateDynamic("Backup")(Backup)
    __obj.asInstanceOf[DeleteBackupResponse]
  }
}

