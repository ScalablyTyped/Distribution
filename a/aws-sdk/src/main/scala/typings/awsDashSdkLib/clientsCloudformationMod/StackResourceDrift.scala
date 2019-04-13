package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackResourceDrift extends js.Object {
  /**
    * A JSON structure containing the actual property values of the stack resource. For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
    */
  var ActualProperties: js.UndefOr[Properties] = js.undefined
  /**
    * A JSON structure containing the expected property values of the stack resource, as defined in the stack template and any values specified as template parameters.  For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
    */
  var ExpectedProperties: js.UndefOr[Properties] = js.undefined
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: awsDashSdkLib.clientsCloudformationMod.LogicalResourceId
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation. 
    */
  var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
  /**
    * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
    */
  var PhysicalResourceIdContext: js.UndefOr[PhysicalResourceIdContext] = js.undefined
  /**
    * A collection of the resource properties whose actual values differ from their expected values. These will be present only for resources whose StackResourceDriftStatus is MODIFIED. 
    */
  var PropertyDifferences: js.UndefOr[PropertyDifferences] = js.undefined
  /**
    * The type of the resource.
    */
  var ResourceType: awsDashSdkLib.clientsCloudformationMod.ResourceType
  /**
    * The ID of the stack.
    */
  var StackId: awsDashSdkLib.clientsCloudformationMod.StackId
  /**
    * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected template configuration because the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected values (as defined in the stack template and any values specified as template parameters).    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatus: awsDashSdkLib.clientsCloudformationMod.StackResourceDriftStatus
  /**
    * Time at which AWS CloudFormation performed drift detection on the stack resource.
    */
  var Timestamp: awsDashSdkLib.clientsCloudformationMod.Timestamp
}

object StackResourceDrift {
  @scala.inline
  def apply(
    LogicalResourceId: LogicalResourceId,
    ResourceType: ResourceType,
    StackId: StackId,
    StackResourceDriftStatus: StackResourceDriftStatus,
    Timestamp: Timestamp,
    ActualProperties: Properties = null,
    ExpectedProperties: Properties = null,
    PhysicalResourceId: PhysicalResourceId = null,
    PhysicalResourceIdContext: PhysicalResourceIdContext = null,
    PropertyDifferences: PropertyDifferences = null
  ): StackResourceDrift = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, ResourceType = ResourceType, StackId = StackId, StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any], Timestamp = Timestamp)
    if (ActualProperties != null) __obj.updateDynamic("ActualProperties")(ActualProperties)
    if (ExpectedProperties != null) __obj.updateDynamic("ExpectedProperties")(ExpectedProperties)
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId)
    if (PhysicalResourceIdContext != null) __obj.updateDynamic("PhysicalResourceIdContext")(PhysicalResourceIdContext)
    if (PropertyDifferences != null) __obj.updateDynamic("PropertyDifferences")(PropertyDifferences)
    __obj.asInstanceOf[StackResourceDrift]
  }
}

