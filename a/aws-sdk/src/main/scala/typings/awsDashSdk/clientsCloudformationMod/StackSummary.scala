package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackSummary extends js.Object {
  /**
    * The time the stack was created.
    */
  var CreationTime: typings.awsDashSdk.clientsCloudformationMod.CreationTime
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.DeletionTime] = js.undefined
  /**
    * Summarizes information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformationSummary] = js.undefined
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.LastUpdatedTime] = js.undefined
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.undefined
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.undefined
  /**
    * Unique stack identifier.
    */
  var StackId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackId] = js.undefined
  /**
    * The name associated with the stack.
    */
  var StackName: typings.awsDashSdk.clientsCloudformationMod.StackName
  /**
    * The current status of the stack.
    */
  var StackStatus: typings.awsDashSdk.clientsCloudformationMod.StackStatus
  /**
    * Success/Failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackStatusReason] = js.undefined
  /**
    * The template description of the template used to create the stack.
    */
  var TemplateDescription: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TemplateDescription] = js.undefined
}

object StackSummary {
  @scala.inline
  def apply(
    CreationTime: CreationTime,
    StackName: StackName,
    StackStatus: StackStatus,
    DeletionTime: DeletionTime = null,
    DriftInformation: StackDriftInformationSummary = null,
    LastUpdatedTime: LastUpdatedTime = null,
    ParentId: StackId = null,
    RootId: StackId = null,
    StackId: StackId = null,
    StackStatusReason: StackStatusReason = null,
    TemplateDescription: TemplateDescription = null
  ): StackSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, StackName = StackName, StackStatus = StackStatus.asInstanceOf[js.Any])
    if (DeletionTime != null) __obj.updateDynamic("DeletionTime")(DeletionTime)
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation)
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId)
    if (RootId != null) __obj.updateDynamic("RootId")(RootId)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (StackStatusReason != null) __obj.updateDynamic("StackStatusReason")(StackStatusReason)
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription)
    __obj.asInstanceOf[StackSummary]
  }
}

