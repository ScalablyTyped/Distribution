package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackDriftDetectionStatusOutput extends js.Object {
  /**
    * The status of the stack drift detection operation.    DETECTION_COMPLETE: The stack drift detection operation has successfully completed for all resources in the stack that support drift detection. (Resources that do not currently support stack detection remain unchecked.) If you specified logical resource IDs for AWS CloudFormation to use as a filter for the stack drift detection operation, only the resources with those logical IDs are checked for drift.    DETECTION_FAILED: The stack drift detection operation has failed for at least one resource in the stack. Results will be available for resources on which AWS CloudFormation successfully completed drift detection.    DETECTION_IN_PROGRESS: The stack drift detection operation is currently in progress.  
    */
  var DetectionStatus: StackDriftDetectionStatus
  /**
    * The reason the stack drift detection operation has its current status.
    */
  var DetectionStatusReason: js.UndefOr[StackDriftDetectionStatusReason] = js.undefined
  /**
    * Total number of stack resources that have drifted. This is NULL until the drift detection operation reaches a status of DETECTION_COMPLETE. This value will be 0 for stacks whose drift status is IN_SYNC.
    */
  var DriftedStackResourceCount: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of reports AWS CloudFormation retains for any given stack, and for how long, may vary.
    */
  var StackDriftDetectionId: awsDashSdkLib.clientsCloudformationMod.StackDriftDetectionId
  /**
    * Status of the stack's actual configuration compared to its expected configuration.     DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var StackDriftStatus: js.UndefOr[StackDriftStatus] = js.undefined
  /**
    * The ID of the stack.
    */
  var StackId: awsDashSdkLib.clientsCloudformationMod.StackId
  /**
    * Time at which the stack drift detection operation was initiated.
    */
  var Timestamp: awsDashSdkLib.clientsCloudformationMod.Timestamp
}

object DescribeStackDriftDetectionStatusOutput {
  @scala.inline
  def apply(
    DetectionStatus: StackDriftDetectionStatus,
    StackDriftDetectionId: StackDriftDetectionId,
    StackId: StackId,
    Timestamp: Timestamp,
    DetectionStatusReason: StackDriftDetectionStatusReason = null,
    DriftedStackResourceCount: js.UndefOr[BoxedInteger] = js.undefined,
    StackDriftStatus: StackDriftStatus = null
  ): DescribeStackDriftDetectionStatusOutput = {
    val __obj = js.Dynamic.literal(DetectionStatus = DetectionStatus.asInstanceOf[js.Any], StackDriftDetectionId = StackDriftDetectionId, StackId = StackId, Timestamp = Timestamp)
    if (DetectionStatusReason != null) __obj.updateDynamic("DetectionStatusReason")(DetectionStatusReason)
    if (!js.isUndefined(DriftedStackResourceCount)) __obj.updateDynamic("DriftedStackResourceCount")(DriftedStackResourceCount)
    if (StackDriftStatus != null) __obj.updateDynamic("StackDriftStatus")(StackDriftStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackDriftDetectionStatusOutput]
  }
}

