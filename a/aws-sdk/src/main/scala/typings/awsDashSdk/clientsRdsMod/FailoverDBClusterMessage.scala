package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailoverDBClusterMessage extends js.Object {
  /**
    * A DB cluster identifier to force a failover for. This parameter is not case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: String
  /**
    * The name of the instance to promote to the primary instance. You must specify the instance identifier for an Aurora Replica in the DB cluster. For example, mydbcluster-replica1.
    */
  var TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
}

object FailoverDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, TargetDBInstanceIdentifier: String = null): FailoverDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
    if (TargetDBInstanceIdentifier != null) __obj.updateDynamic("TargetDBInstanceIdentifier")(TargetDBInstanceIdentifier)
    __obj.asInstanceOf[FailoverDBClusterMessage]
  }
}

