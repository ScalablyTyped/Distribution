package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstanceAutomatedBackupMessage extends js.Object {
  /**
    *  A list of DBInstanceAutomatedBackup instances. 
    */
  var DBInstanceAutomatedBackups: js.UndefOr[DBInstanceAutomatedBackupList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords . 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBInstanceAutomatedBackupMessage {
  @scala.inline
  def apply(DBInstanceAutomatedBackups: DBInstanceAutomatedBackupList = null, Marker: String = null): DBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal()
    if (DBInstanceAutomatedBackups != null) __obj.updateDynamic("DBInstanceAutomatedBackups")(DBInstanceAutomatedBackups.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBInstanceAutomatedBackupMessage]
  }
}

