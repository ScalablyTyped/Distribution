package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBInstanceAutomatedBackupResult extends js.Object {
  var DBInstanceAutomatedBackup: js.UndefOr[DBInstanceAutomatedBackup] = js.undefined
}

object DeleteDBInstanceAutomatedBackupResult {
  @scala.inline
  def apply(DBInstanceAutomatedBackup: DBInstanceAutomatedBackup = null): DeleteDBInstanceAutomatedBackupResult = {
    val __obj = js.Dynamic.literal()
    if (DBInstanceAutomatedBackup != null) __obj.updateDynamic("DBInstanceAutomatedBackup")(DBInstanceAutomatedBackup)
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupResult]
  }
}

