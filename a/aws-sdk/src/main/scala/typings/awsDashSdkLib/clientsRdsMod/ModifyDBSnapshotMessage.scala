package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBSnapshotMessage extends js.Object {
  /**
    * The identifier of the DB snapshot to modify.
    */
  var DBSnapshotIdentifier: String
  /**
    * The engine version to upgrade the DB snapshot to.  The following are the database engines and engine versions that are available when you upgrade a DB snapshot.   MySQL     5.5.46 (supported for 5.1 DB snapshots)    Oracle     12.1.0.2.v8 (supported for 12.1.0.1 DB snapshots)    11.2.0.4.v12 (supported for 11.2.0.2 DB snapshots)    11.2.0.4.v11 (supported for 11.2.0.3 DB snapshots)  
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The option group to identify with the upgraded DB snapshot.  You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply when upgrading a DB snapshot as when upgrading a DB instance. For more information, see Option Group Considerations in the Amazon RDS User Guide. 
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
}

object ModifyDBSnapshotMessage {
  @scala.inline
  def apply(DBSnapshotIdentifier: String, EngineVersion: String = null, OptionGroupName: String = null): ModifyDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    __obj.asInstanceOf[ModifyDBSnapshotMessage]
  }
}

