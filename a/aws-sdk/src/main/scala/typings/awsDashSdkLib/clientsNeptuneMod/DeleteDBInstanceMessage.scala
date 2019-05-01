package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBInstanceMessage extends js.Object {
  /**
    * The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive. Constraints:   Must match the name of an existing DB instance.  
    */
  var DBInstanceIdentifier: String
  /**
    *  The DBSnapshotIdentifier of the new DBSnapshot created when SkipFinalSnapshot is set to false.  Specifying this parameter and also setting the SkipFinalShapshot parameter to true results in an error.  Constraints:   Must be 1 to 255 letters or numbers.   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Cannot be specified when deleting a Read Replica.  
    */
  var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  Determines whether a final DB snapshot is created before the DB instance is deleted. If true is specified, no DBSnapshot is created. If false is specified, a DB snapshot is created before the DB instance is deleted. Note that when a DB instance is in a failure state and has a status of 'failed', 'incompatible-restore', or 'incompatible-network', it can only be deleted when the SkipFinalSnapshot parameter is set to "true". Specify true when deleting a Read Replica.  The FinalDBSnapshotIdentifier parameter must be specified if SkipFinalSnapshot is false.  Default: false 
    */
  var SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
}

object DeleteDBInstanceMessage {
  @scala.inline
  def apply(
    DBInstanceIdentifier: String,
    FinalDBSnapshotIdentifier: String = null,
    SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
  ): DeleteDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier)
    if (FinalDBSnapshotIdentifier != null) __obj.updateDynamic("FinalDBSnapshotIdentifier")(FinalDBSnapshotIdentifier)
    if (!js.isUndefined(SkipFinalSnapshot)) __obj.updateDynamic("SkipFinalSnapshot")(SkipFinalSnapshot)
    __obj.asInstanceOf[DeleteDBInstanceMessage]
  }
}

