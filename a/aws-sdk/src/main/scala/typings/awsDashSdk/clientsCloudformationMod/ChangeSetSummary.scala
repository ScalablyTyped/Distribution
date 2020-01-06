package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeSetSummary extends js.Object {
  /**
    * The ID of the change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ChangeSetId] = js.native
  /**
    * The name of the change set.
    */
  var ChangeSetName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ChangeSetName] = js.native
  /**
    * The start time when the change set was created, in UTC.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.CreationTime] = js.native
  /**
    * Descriptive information about the change set.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.native
  /**
    * If the change set execution status is AVAILABLE, you can execute the change set. If you can’t execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because AWS CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
    */
  var ExecutionStatus: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ExecutionStatus] = js.native
  /**
    * The ID of the stack with which the change set is associated.
    */
  var StackId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackId] = js.native
  /**
    * The name of the stack with which the change set is associated.
    */
  var StackName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackName] = js.native
  /**
    * The state of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
    */
  var Status: js.UndefOr[ChangeSetStatus] = js.native
  /**
    * A description of the change set's status. For example, if your change set is in the FAILED state, AWS CloudFormation shows the error message.
    */
  var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.native
}

object ChangeSetSummary {
  @scala.inline
  def apply(
    ChangeSetId: ChangeSetId = null,
    ChangeSetName: ChangeSetName = null,
    CreationTime: CreationTime = null,
    Description: Description = null,
    ExecutionStatus: ExecutionStatus = null,
    StackId: StackId = null,
    StackName: StackName = null,
    Status: ChangeSetStatus = null,
    StatusReason: ChangeSetStatusReason = null
  ): ChangeSetSummary = {
    val __obj = js.Dynamic.literal()
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId.asInstanceOf[js.Any])
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExecutionStatus != null) __obj.updateDynamic("ExecutionStatus")(ExecutionStatus.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (StackName != null) __obj.updateDynamic("StackName")(StackName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeSetSummary]
  }
}

