package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBInstanceAutomatedBackupResult extends js.Object {
  var DBInstanceAutomatedBackup: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBInstanceAutomatedBackup] = js.native
}

object DeleteDBInstanceAutomatedBackupResult {
  @scala.inline
  def apply(DBInstanceAutomatedBackup: DBInstanceAutomatedBackup = null): DeleteDBInstanceAutomatedBackupResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstanceAutomatedBackup != null) __obj.updateDynamic("DBInstanceAutomatedBackup")(DBInstanceAutomatedBackup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupResult]
  }
}

