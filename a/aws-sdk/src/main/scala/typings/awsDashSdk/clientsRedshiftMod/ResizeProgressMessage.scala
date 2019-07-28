package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeProgressMessage extends js.Object {
  /**
    * The average rate of the resize operation over the last few minutes, measured in megabytes per second. After the resize operation completes, this value shows the average rate of the entire resize operation.
    */
  var AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined
  /**
    * The percent of data transferred from source cluster to target cluster.
    */
  var DataTransferProgressPercent: js.UndefOr[DoubleOptional] = js.undefined
  /**
    * The amount of seconds that have elapsed since the resize operation began. After the resize operation completes, this value shows the total actual time, in seconds, for the resize operation.
    */
  var ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined
  /**
    * The estimated time remaining, in seconds, until the resize operation is complete. This value is calculated based on the average resize rate and the estimated amount of data remaining to be processed. Once the resize operation is complete, this value will be 0.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined
  /**
    * The names of tables that have been completely imported . Valid Values: List of table names.
    */
  var ImportTablesCompleted: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ImportTablesCompleted] = js.undefined
  /**
    * The names of tables that are being currently imported. Valid Values: List of table names.
    */
  var ImportTablesInProgress: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ImportTablesInProgress] = js.undefined
  /**
    * The names of tables that have not been yet imported. Valid Values: List of table names
    */
  var ImportTablesNotStarted: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.ImportTablesNotStarted] = js.undefined
  /**
    * An optional string to provide additional details about the resize action.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * While the resize operation is in progress, this value shows the current amount of data, in megabytes, that has been processed so far. When the resize operation is complete, this value shows the total amount of data, in megabytes, on the cluster, which may be more or less than TotalResizeDataInMegaBytes (the estimated total amount of data before resize).
    */
  var ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined
  /**
    * An enum with possible values of ClassicResize and ElasticResize. These values describe the type of resize operation being performed. 
    */
  var ResizeType: js.UndefOr[String] = js.undefined
  /**
    * The status of the resize operation. Valid Values: NONE | IN_PROGRESS | FAILED | SUCCEEDED | CANCELLING 
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The cluster type after the resize operation is complete. Valid Values: multi-node | single-node 
    */
  var TargetClusterType: js.UndefOr[String] = js.undefined
  /**
    * The type of encryption for the cluster after the resize is complete. Possible values are KMS and None. In the China region possible values are: Legacy and None.
    */
  var TargetEncryptionType: js.UndefOr[String] = js.undefined
  /**
    * The node type that the cluster will have after the resize operation is complete.
    */
  var TargetNodeType: js.UndefOr[String] = js.undefined
  /**
    * The number of nodes that the cluster will have after the resize operation is complete.
    */
  var TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The estimated total amount of data, in megabytes, on the cluster before the resize operation began.
    */
  var TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
}

object ResizeProgressMessage {
  @scala.inline
  def apply(
    AvgResizeRateInMegaBytesPerSecond: js.UndefOr[DoubleOptional] = js.undefined,
    DataTransferProgressPercent: js.UndefOr[DoubleOptional] = js.undefined,
    ElapsedTimeInSeconds: js.UndefOr[LongOptional] = js.undefined,
    EstimatedTimeToCompletionInSeconds: js.UndefOr[LongOptional] = js.undefined,
    ImportTablesCompleted: ImportTablesCompleted = null,
    ImportTablesInProgress: ImportTablesInProgress = null,
    ImportTablesNotStarted: ImportTablesNotStarted = null,
    Message: String = null,
    ProgressInMegaBytes: js.UndefOr[LongOptional] = js.undefined,
    ResizeType: String = null,
    Status: String = null,
    TargetClusterType: String = null,
    TargetEncryptionType: String = null,
    TargetNodeType: String = null,
    TargetNumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined,
    TotalResizeDataInMegaBytes: js.UndefOr[LongOptional] = js.undefined
  ): ResizeProgressMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AvgResizeRateInMegaBytesPerSecond)) __obj.updateDynamic("AvgResizeRateInMegaBytesPerSecond")(AvgResizeRateInMegaBytesPerSecond)
    if (!js.isUndefined(DataTransferProgressPercent)) __obj.updateDynamic("DataTransferProgressPercent")(DataTransferProgressPercent)
    if (!js.isUndefined(ElapsedTimeInSeconds)) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds)
    if (!js.isUndefined(EstimatedTimeToCompletionInSeconds)) __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(EstimatedTimeToCompletionInSeconds)
    if (ImportTablesCompleted != null) __obj.updateDynamic("ImportTablesCompleted")(ImportTablesCompleted)
    if (ImportTablesInProgress != null) __obj.updateDynamic("ImportTablesInProgress")(ImportTablesInProgress)
    if (ImportTablesNotStarted != null) __obj.updateDynamic("ImportTablesNotStarted")(ImportTablesNotStarted)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (!js.isUndefined(ProgressInMegaBytes)) __obj.updateDynamic("ProgressInMegaBytes")(ProgressInMegaBytes)
    if (ResizeType != null) __obj.updateDynamic("ResizeType")(ResizeType)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (TargetClusterType != null) __obj.updateDynamic("TargetClusterType")(TargetClusterType)
    if (TargetEncryptionType != null) __obj.updateDynamic("TargetEncryptionType")(TargetEncryptionType)
    if (TargetNodeType != null) __obj.updateDynamic("TargetNodeType")(TargetNodeType)
    if (!js.isUndefined(TargetNumberOfNodes)) __obj.updateDynamic("TargetNumberOfNodes")(TargetNumberOfNodes)
    if (!js.isUndefined(TotalResizeDataInMegaBytes)) __obj.updateDynamic("TotalResizeDataInMegaBytes")(TotalResizeDataInMegaBytes)
    __obj.asInstanceOf[ResizeProgressMessage]
  }
}

