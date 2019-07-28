package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBClusterMessage extends js.Object {
  /**
    * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive. Constraints:   Must match an existing DBClusterIdentifier.  
    */
  var DBClusterIdentifier: String
  /**
    *  The DB cluster snapshot identifier of the new DB cluster snapshot created when SkipFinalSnapshot is set to false.   Specifying this parameter and also setting the SkipFinalShapshot parameter to true results in an error.  Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
    */
  var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  Determines whether a final DB cluster snapshot is created before the DB cluster is deleted. If true is specified, no DB cluster snapshot is created. If false is specified, a DB cluster snapshot is created before the DB cluster is deleted.  You must specify a FinalDBSnapshotIdentifier parameter if SkipFinalSnapshot is false.  Default: false 
    */
  var SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
}

object DeleteDBClusterMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    FinalDBSnapshotIdentifier: String = null,
    SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
  ): DeleteDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
    if (FinalDBSnapshotIdentifier != null) __obj.updateDynamic("FinalDBSnapshotIdentifier")(FinalDBSnapshotIdentifier)
    if (!js.isUndefined(SkipFinalSnapshot)) __obj.updateDynamic("SkipFinalSnapshot")(SkipFinalSnapshot)
    __obj.asInstanceOf[DeleteDBClusterMessage]
  }
}

