package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeSetSummary extends js.Object {
  /**
    * The ID of the change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ChangeSetId] = js.undefined
  /**
    * The name of the change set.
    */
  var ChangeSetName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ChangeSetName] = js.undefined
  /**
    * The start time when the change set was created, in UTC.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.CreationTime] = js.undefined
  /**
    * Descriptive information about the change set.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.undefined
  /**
    * If the change set execution status is AVAILABLE, you can execute the change set. If you can’t execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because AWS CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
    */
  var ExecutionStatus: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ExecutionStatus] = js.undefined
  /**
    * The ID of the stack with which the change set is associated.
    */
  var StackId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackId] = js.undefined
  /**
    * The name of the stack with which the change set is associated.
    */
  var StackName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackName] = js.undefined
  /**
    * The state of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
    */
  var Status: js.UndefOr[ChangeSetStatus] = js.undefined
  /**
    * A description of the change set's status. For example, if your change set is in the FAILED state, AWS CloudFormation shows the error message.
    */
  var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.undefined
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
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId)
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExecutionStatus != null) __obj.updateDynamic("ExecutionStatus")(ExecutionStatus.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason)
    __obj.asInstanceOf[ChangeSetSummary]
  }
}

