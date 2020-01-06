package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeProgressMessage extends js.Object {
  /**
    * The average rate of the resize operation over the last few minutes, measured in megabytes per second. After the resize operation completes, this value shows the average rate of the entire resize operation.
    */
  var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.native
  /**
    * The percent of data transferred from source cluster to target cluster.
    */
  var DataTransferProgressPercent: js.UndefOr[DoubleOptional] = js.native
  /**
    * The amount of seconds that have elapsed since the resize operation began. After the resize operation completes, this value shows the total actual time, in seconds, for the resize operation.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * The estimated time remaining, in seconds, until the resize operation is complete. This value is calculated based on the average resize rate and the estimated amount of data remaining to be processed. Once the resize operation is complete, this value will be 0.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.native
  /**
    * The names of tables that have been completely imported . Valid Values: List of table names.
    */
  var ImportTablesCompleted: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ImportTablesCompleted] = js.native
  /**
    * The names of tables that are being currently imported. Valid Values: List of table names.
    */
  var ImportTablesInProgress: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ImportTablesInProgress] = js.native
  /**
    * The names of tables that have not been yet imported. Valid Values: List of table names
    */
  var ImportTablesNotStarted: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ImportTablesNotStarted] = js.native
  /**
    * An optional string to provide additional details about the resize action.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * While the resize operation is in progress, this value shows the current amount of data, in megabytes, that has been processed so far. When the resize operation is complete, this value shows the total amount of data, in megabytes, on the cluster, which may be more or less than TotalResizeDataInMegaBytes (the estimated total amount of data before resize).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.native
  /**
    * An enum with possible values of ClassicResize and ElasticResize. These values describe the type of resize operation being performed. 
    */
  var ResizeType: js.UndefOr[String] = js.native
  /**
    * The status of the resize operation. Valid Values: NONE | IN_PROGRESS | FAILED | SUCCEEDED | CANCELLING 
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The cluster type after the resize operation is complete. Valid Values: multi-node | single-node 
    */
  var TargetClusterType: js.UndefOr[String] = js.native
  /**
    * The type of encryption for the cluster after the resize is complete. Possible values are KMS and None. In the China region possible values are: Legacy and None.
    */
  var TargetEncryptionType: js.UndefOr[String] = js.native
  /**
    * The node type that the cluster will have after the resize operation is complete.
    */
  var TargetNodeType: js.UndefOr[String] = js.native
  /**
    * The number of nodes that the cluster will have after the resize operation is complete.
    */
  var TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.native
  /**
    * The estimated total amount of data, in megabytes, on the cluster before the resize operation began.
    */
  var TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.native
}

object ResizeProgressMessage {
  @scala.inline
  def apply(
    AvgResizeRateInMegaBytesPerSecond: Int | scala.Double = null,
    DataTransferProgressPercent: Int | scala.Double = null,
    ElapsedTimeInSeconds: Int | scala.Double = null,
    EstimatedTimeToCompletionInSeconds: Int | scala.Double = null,
    ImportTablesCompleted: ImportTablesCompleted = null,
    ImportTablesInProgress: ImportTablesInProgress = null,
    ImportTablesNotStarted: ImportTablesNotStarted = null,
    Message: String = null,
    ProgressInMegaBytes: Int | scala.Double = null,
    ResizeType: String = null,
    Status: String = null,
    TargetClusterType: String = null,
    TargetEncryptionType: String = null,
    TargetNodeType: String = null,
    TargetNumberOfNodes: Int | scala.Double = null,
    TotalResizeDataInMegaBytes: Int | scala.Double = null
  ): ResizeProgressMessage = {
    val __obj = js.Dynamic.literal()
    if (AvgResizeRateInMegaBytesPerSecond != null) __obj.updateDynamic("AvgResizeRateInMegaBytesPerSecond")(AvgResizeRateInMegaBytesPerSecond.asInstanceOf[js.Any])
    if (DataTransferProgressPercent != null) __obj.updateDynamic("DataTransferProgressPercent")(DataTransferProgressPercent.asInstanceOf[js.Any])
    if (ElapsedTimeInSeconds != null) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds.asInstanceOf[js.Any])
    if (EstimatedTimeToCompletionInSeconds != null) __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(EstimatedTimeToCompletionInSeconds.asInstanceOf[js.Any])
    if (ImportTablesCompleted != null) __obj.updateDynamic("ImportTablesCompleted")(ImportTablesCompleted.asInstanceOf[js.Any])
    if (ImportTablesInProgress != null) __obj.updateDynamic("ImportTablesInProgress")(ImportTablesInProgress.asInstanceOf[js.Any])
    if (ImportTablesNotStarted != null) __obj.updateDynamic("ImportTablesNotStarted")(ImportTablesNotStarted.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (ProgressInMegaBytes != null) __obj.updateDynamic("ProgressInMegaBytes")(ProgressInMegaBytes.asInstanceOf[js.Any])
    if (ResizeType != null) __obj.updateDynamic("ResizeType")(ResizeType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TargetClusterType != null) __obj.updateDynamic("TargetClusterType")(TargetClusterType.asInstanceOf[js.Any])
    if (TargetEncryptionType != null) __obj.updateDynamic("TargetEncryptionType")(TargetEncryptionType.asInstanceOf[js.Any])
    if (TargetNodeType != null) __obj.updateDynamic("TargetNodeType")(TargetNodeType.asInstanceOf[js.Any])
    if (TargetNumberOfNodes != null) __obj.updateDynamic("TargetNumberOfNodes")(TargetNumberOfNodes.asInstanceOf[js.Any])
    if (TotalResizeDataInMegaBytes != null) __obj.updateDynamic("TotalResizeDataInMegaBytes")(TotalResizeDataInMegaBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeProgressMessage]
  }
}

