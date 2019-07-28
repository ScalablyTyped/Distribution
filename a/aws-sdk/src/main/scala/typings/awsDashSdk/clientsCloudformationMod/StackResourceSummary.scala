package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackResourceSummary extends js.Object {
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformationSummary] = js.undefined
  /**
    * Time the status was updated.
    */
  var LastUpdatedTimestamp: Timestamp
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typings.awsDashSdk.clientsCloudformationMod.LogicalResourceId
  /**
    * The name or unique identifier that corresponds to a physical instance ID of the resource.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.PhysicalResourceId] = js.undefined
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typings.awsDashSdk.clientsCloudformationMod.ResourceStatus
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ResourceStatusReason] = js.undefined
  /**
    * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: typings.awsDashSdk.clientsCloudformationMod.ResourceType
}

object StackResourceSummary {
  @scala.inline
  def apply(
    LastUpdatedTimestamp: Timestamp,
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType,
    DriftInformation: StackResourceDriftInformationSummary = null,
    PhysicalResourceId: PhysicalResourceId = null,
    ResourceStatusReason: ResourceStatusReason = null
  ): StackResourceSummary = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp, LogicalResourceId = LogicalResourceId, ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType)
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation)
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId)
    if (ResourceStatusReason != null) __obj.updateDynamic("ResourceStatusReason")(ResourceStatusReason)
    __obj.asInstanceOf[StackResourceSummary]
  }
}

