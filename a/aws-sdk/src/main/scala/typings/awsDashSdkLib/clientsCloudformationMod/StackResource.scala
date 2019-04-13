package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackResource extends js.Object {
  /**
    * User defined description associated with the resource.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.undefined
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: awsDashSdkLib.clientsCloudformationMod.LogicalResourceId
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation.
    */
  var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
  /**
    * Current status of the resource.
    */
  var ResourceStatus: awsDashSdkLib.clientsCloudformationMod.ResourceStatus
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined
  /**
    * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: awsDashSdkLib.clientsCloudformationMod.ResourceType
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[StackId] = js.undefined
  /**
    * The name associated with the stack.
    */
  var StackName: js.UndefOr[StackName] = js.undefined
  /**
    * Time the status was updated.
    */
  var Timestamp: awsDashSdkLib.clientsCloudformationMod.Timestamp
}

object StackResource {
  @scala.inline
  def apply(
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType,
    Timestamp: Timestamp,
    Description: Description = null,
    DriftInformation: StackResourceDriftInformation = null,
    PhysicalResourceId: PhysicalResourceId = null,
    ResourceStatusReason: ResourceStatusReason = null,
    StackId: StackId = null,
    StackName: StackName = null
  ): StackResource = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType, Timestamp = Timestamp)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation)
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId)
    if (ResourceStatusReason != null) __obj.updateDynamic("ResourceStatusReason")(ResourceStatusReason)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    __obj.asInstanceOf[StackResource]
  }
}

