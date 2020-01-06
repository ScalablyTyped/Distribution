package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyClusterSnapshotMessage extends js.Object {
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints:   Must be the identifier for a valid cluster.  
    */
  var SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The identifier for the source snapshot. Constraints:   Must be the identifier for a valid automated snapshot whose state is available.  
    */
  var SourceSnapshotIdentifier: String = js.native
  /**
    * The identifier given to the new manual snapshot. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for the AWS account that is making the request.  
    */
  var TargetSnapshotIdentifier: String = js.native
}

object CopyClusterSnapshotMessage {
  @scala.inline
  def apply(
    SourceSnapshotIdentifier: String,
    TargetSnapshotIdentifier: String,
    ManualSnapshotRetentionPeriod: Int | scala.Double = null,
    SourceSnapshotClusterIdentifier: String = null
  ): CopyClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceSnapshotIdentifier = SourceSnapshotIdentifier.asInstanceOf[js.Any], TargetSnapshotIdentifier = TargetSnapshotIdentifier.asInstanceOf[js.Any])
    if (ManualSnapshotRetentionPeriod != null) __obj.updateDynamic("ManualSnapshotRetentionPeriod")(ManualSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (SourceSnapshotClusterIdentifier != null) __obj.updateDynamic("SourceSnapshotClusterIdentifier")(SourceSnapshotClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyClusterSnapshotMessage]
  }
}

