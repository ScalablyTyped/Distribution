package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChangeSetOutput extends js.Object {
  /**
    * If you execute the change set, the list of capabilities that were explicitly acknowledged when the change set was created.
    */
  var Capabilities: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Capabilities] = js.native
  /**
    * The ARN of the change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ChangeSetId] = js.native
  /**
    * The name of the change set.
    */
  var ChangeSetName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ChangeSetName] = js.native
  /**
    * A list of Change structures that describes the resources AWS CloudFormation changes if you execute the change set.
    */
  var Changes: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Changes] = js.native
  /**
    * The start time when the change set was created, in UTC.
    */
  var CreationTime: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.CreationTime] = js.native
  /**
    * Information about the change set.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.native
  /**
    * If the change set execution status is AVAILABLE, you can execute the change set. If you can’t execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because AWS CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
    */
  var ExecutionStatus: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ExecutionStatus] = js.native
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of changes. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.native
  /**
    * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics that will be associated with the stack if you execute the change set.
    */
  var NotificationARNs: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NotificationARNs] = js.native
  /**
    * A list of Parameter structures that describes the input parameters and their values used to create the change set. For more information, see the Parameter data type.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Parameters] = js.native
  /**
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.RollbackConfiguration] = js.native
  /**
    * The ARN of the stack that is associated with the change set.
    */
  var StackId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackId] = js.native
  /**
    * The name of the stack that is associated with the change set.
    */
  var StackName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackName] = js.native
  /**
    * The current status of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
    */
  var Status: js.UndefOr[ChangeSetStatus] = js.native
  /**
    * A description of the change set's status. For example, if your attempt to create a change set failed, AWS CloudFormation shows the error message.
    */
  var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.native
  /**
    * If you execute the change set, the tags that will be associated with the stack.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Tags] = js.native
}

object DescribeChangeSetOutput {
  @scala.inline
  def apply(
    Capabilities: Capabilities = null,
    ChangeSetId: ChangeSetId = null,
    ChangeSetName: ChangeSetName = null,
    Changes: Changes = null,
    CreationTime: CreationTime = null,
    Description: Description = null,
    ExecutionStatus: ExecutionStatus = null,
    NextToken: NextToken = null,
    NotificationARNs: NotificationARNs = null,
    Parameters: Parameters = null,
    RollbackConfiguration: RollbackConfiguration = null,
    StackId: StackId = null,
    StackName: StackName = null,
    Status: ChangeSetStatus = null,
    StatusReason: ChangeSetStatusReason = null,
    Tags: Tags = null
  ): DescribeChangeSetOutput = {
    val __obj = js.Dynamic.literal()
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId.asInstanceOf[js.Any])
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName.asInstanceOf[js.Any])
    if (Changes != null) __obj.updateDynamic("Changes")(Changes.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExecutionStatus != null) __obj.updateDynamic("ExecutionStatus")(ExecutionStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NotificationARNs != null) __obj.updateDynamic("NotificationARNs")(NotificationARNs.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (RollbackConfiguration != null) __obj.updateDynamic("RollbackConfiguration")(RollbackConfiguration.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (StackName != null) __obj.updateDynamic("StackName")(StackName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChangeSetOutput]
  }
}

