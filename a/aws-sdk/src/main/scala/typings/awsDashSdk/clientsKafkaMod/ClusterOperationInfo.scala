package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOperationInfo extends js.Object {
  /**
    * 
    The ID of the API request that triggered this operation.
    
    */
  var ClientRequestId: js.UndefOr[__string] = js.native
  /**
    * 
    ARN of the cluster.
    
    */
  var ClusterArn: js.UndefOr[__string] = js.native
  /**
    * 
    The time that the operation was created.
    
    */
  var CreationTime: js.UndefOr[__timestampIso8601] = js.native
  /**
    * 
    The time at which the operation finished.
    
    */
  var EndTime: js.UndefOr[__timestampIso8601] = js.native
  /**
    * 
    Describes the error if the operation fails.
    
    */
  var ErrorInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ErrorInfo] = js.native
  /**
    * 
    ARN of the cluster operation.
    
    */
  var OperationArn: js.UndefOr[__string] = js.native
  /**
    * 
    State of the cluster operation.
    
    */
  var OperationState: js.UndefOr[__string] = js.native
  /**
    * 
    Type of the cluster operation.
    
    */
  var OperationType: js.UndefOr[__string] = js.native
  /**
    * 
    Information about cluster attributes before a cluster is updated.
    
    */
  var SourceClusterInfo: js.UndefOr[MutableClusterInfo] = js.native
  /**
    * 
    Information about cluster attributes after a cluster is updated.
    
    */
  var TargetClusterInfo: js.UndefOr[MutableClusterInfo] = js.native
}

object ClusterOperationInfo {
  @scala.inline
  def apply(
    ClientRequestId: __string = null,
    ClusterArn: __string = null,
    CreationTime: __timestampIso8601 = null,
    EndTime: __timestampIso8601 = null,
    ErrorInfo: ErrorInfo = null,
    OperationArn: __string = null,
    OperationState: __string = null,
    OperationType: __string = null,
    SourceClusterInfo: MutableClusterInfo = null,
    TargetClusterInfo: MutableClusterInfo = null
  ): ClusterOperationInfo = {
    val __obj = js.Dynamic.literal()
    if (ClientRequestId != null) __obj.updateDynamic("ClientRequestId")(ClientRequestId.asInstanceOf[js.Any])
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ErrorInfo != null) __obj.updateDynamic("ErrorInfo")(ErrorInfo.asInstanceOf[js.Any])
    if (OperationArn != null) __obj.updateDynamic("OperationArn")(OperationArn.asInstanceOf[js.Any])
    if (OperationState != null) __obj.updateDynamic("OperationState")(OperationState.asInstanceOf[js.Any])
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType.asInstanceOf[js.Any])
    if (SourceClusterInfo != null) __obj.updateDynamic("SourceClusterInfo")(SourceClusterInfo.asInstanceOf[js.Any])
    if (TargetClusterInfo != null) __obj.updateDynamic("TargetClusterInfo")(TargetClusterInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOperationInfo]
  }
}

