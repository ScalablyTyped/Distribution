package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stack extends js.Object {
  /**
    * The capabilities allowed in the stack.
    */
  var Capabilities: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Capabilities] = js.undefined
  /**
    * The unique ID of the change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ChangeSetId] = js.undefined
  /**
    * The time at which the stack was created.
    */
  var CreationTime: typings.awsDashSdk.clientsCloudformationMod.CreationTime
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.DeletionTime] = js.undefined
  /**
    * A user-defined description associated with the stack.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.undefined
  /**
    * Boolean to enable or disable rollback on stack creation failures:    true: disable rollback    false: enable rollback  
    */
  var DisableRollback: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.DisableRollback] = js.undefined
  /**
    * Information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformation] = js.undefined
  /**
    * Whether termination protection is enabled for the stack.  For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide.
    */
  var EnableTerminationProtection: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.EnableTerminationProtection] = js.undefined
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.LastUpdatedTime] = js.undefined
  /**
    * SNS topic ARNs to which stack related events are published.
    */
  var NotificationARNs: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NotificationARNs] = js.undefined
  /**
    * A list of output structures.
    */
  var Outputs: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Outputs] = js.undefined
  /**
    * A list of Parameter structures.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Parameters] = js.undefined
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with the stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your behalf.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.RoleARN] = js.undefined
  /**
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.RollbackConfiguration] = js.undefined
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.undefined
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackId] = js.undefined
  /**
    * The name associated with the stack.
    */
  var StackName: typings.awsDashSdk.clientsCloudformationMod.StackName
  /**
    * Current status of the stack.
    */
  var StackStatus: typings.awsDashSdk.clientsCloudformationMod.StackStatus
  /**
    * Success/failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackStatusReason] = js.undefined
  /**
    * A list of Tags that specify information about the stack.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Tags] = js.undefined
  /**
    * The amount of time within which stack creation should complete.
    */
  var TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined
}

object Stack {
  @scala.inline
  def apply(
    CreationTime: CreationTime,
    StackName: StackName,
    StackStatus: StackStatus,
    Capabilities: Capabilities = null,
    ChangeSetId: ChangeSetId = null,
    DeletionTime: DeletionTime = null,
    Description: Description = null,
    DisableRollback: js.UndefOr[Boolean] = js.undefined,
    DriftInformation: StackDriftInformation = null,
    EnableTerminationProtection: js.UndefOr[Boolean] = js.undefined,
    LastUpdatedTime: LastUpdatedTime = null,
    NotificationARNs: NotificationARNs = null,
    Outputs: Outputs = null,
    Parameters: Parameters = null,
    ParentId: StackId = null,
    RoleARN: RoleARN = null,
    RollbackConfiguration: RollbackConfiguration = null,
    RootId: StackId = null,
    StackId: StackId = null,
    StackStatusReason: StackStatusReason = null,
    Tags: Tags = null,
    TimeoutInMinutes: Int | Double = null
  ): Stack = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, StackName = StackName, StackStatus = StackStatus.asInstanceOf[js.Any])
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities)
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId)
    if (DeletionTime != null) __obj.updateDynamic("DeletionTime")(DeletionTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DisableRollback)) __obj.updateDynamic("DisableRollback")(DisableRollback)
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation)
    if (!js.isUndefined(EnableTerminationProtection)) __obj.updateDynamic("EnableTerminationProtection")(EnableTerminationProtection)
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    if (NotificationARNs != null) __obj.updateDynamic("NotificationARNs")(NotificationARNs)
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (RollbackConfiguration != null) __obj.updateDynamic("RollbackConfiguration")(RollbackConfiguration)
    if (RootId != null) __obj.updateDynamic("RootId")(RootId)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (StackStatusReason != null) __obj.updateDynamic("StackStatusReason")(StackStatusReason)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TimeoutInMinutes != null) __obj.updateDynamic("TimeoutInMinutes")(TimeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
}

