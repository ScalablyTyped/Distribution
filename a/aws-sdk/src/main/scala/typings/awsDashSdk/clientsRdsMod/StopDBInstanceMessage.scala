package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDBInstanceMessage extends js.Object {
  /**
    *  The user-supplied instance identifier. 
    */
  var DBInstanceIdentifier: String
  /**
    *  The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped. 
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
}

object StopDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, DBSnapshotIdentifier: String = null): StopDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier)
    if (DBSnapshotIdentifier != null) __obj.updateDynamic("DBSnapshotIdentifier")(DBSnapshotIdentifier)
    __obj.asInstanceOf[StopDBInstanceMessage]
  }
}

