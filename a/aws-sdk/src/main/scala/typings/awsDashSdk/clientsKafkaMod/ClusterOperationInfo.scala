package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOperationInfo extends js.Object {
  /**
    * 
    The ID of the API request that triggered this operation.
    
    */
  var ClientRequestId: js.UndefOr[__string] = js.undefined
  /**
    * 
    ARN of the cluster.
    
    */
  var ClusterArn: js.UndefOr[__string] = js.undefined
  /**
    * 
    The time that the operation was created.
    
    */
  var CreationTime: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * 
    The time at which the operation finished.
    
    */
  var EndTime: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * 
    Describes the error if the operation fails.
    
    */
  var ErrorInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ErrorInfo] = js.undefined
  /**
    * 
    ARN of the cluster operation.
    
    */
  var OperationArn: js.UndefOr[__string] = js.undefined
  /**
    * 
    State of the cluster operation.
    
    */
  var OperationState: js.UndefOr[__string] = js.undefined
  /**
    * 
    Type of the cluster operation.
    
    */
  var OperationType: js.UndefOr[__string] = js.undefined
  /**
    * 
    Information about cluster attributes before a cluster is updated.
    
    */
  var SourceClusterInfo: js.UndefOr[MutableClusterInfo] = js.undefined
  /**
    * 
    Information about cluster attributes after a cluster is updated.
    
    */
  var TargetClusterInfo: js.UndefOr[MutableClusterInfo] = js.undefined
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
    if (ClientRequestId != null) __obj.updateDynamic("ClientRequestId")(ClientRequestId)
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (ErrorInfo != null) __obj.updateDynamic("ErrorInfo")(ErrorInfo)
    if (OperationArn != null) __obj.updateDynamic("OperationArn")(OperationArn)
    if (OperationState != null) __obj.updateDynamic("OperationState")(OperationState)
    if (OperationType != null) __obj.updateDynamic("OperationType")(OperationType)
    if (SourceClusterInfo != null) __obj.updateDynamic("SourceClusterInfo")(SourceClusterInfo)
    if (TargetClusterInfo != null) __obj.updateDynamic("TargetClusterInfo")(TargetClusterInfo)
    __obj.asInstanceOf[ClusterOperationInfo]
  }
}

