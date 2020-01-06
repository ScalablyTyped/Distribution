package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackResourceDrift extends js.Object {
  /**
    * A JSON structure containing the actual property values of the stack resource. For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
    */
  var ActualProperties: js.UndefOr[Properties] = js.native
  /**
    * A JSON structure containing the expected property values of the stack resource, as defined in the stack template and any values specified as template parameters.  For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
    */
  var ExpectedProperties: js.UndefOr[Properties] = js.native
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typings.awsDashSdk.clientsCloudformationMod.LogicalResourceId = js.native
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation. 
    */
  var PhysicalResourceId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.PhysicalResourceId] = js.native
  /**
    * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
    */
  var PhysicalResourceIdContext: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.PhysicalResourceIdContext] = js.native
  /**
    * A collection of the resource properties whose actual values differ from their expected values. These will be present only for resources whose StackResourceDriftStatus is MODIFIED. 
    */
  var PropertyDifferences: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.PropertyDifferences] = js.native
  /**
    * The type of the resource.
    */
  var ResourceType: typings.awsDashSdk.clientsCloudformationMod.ResourceType = js.native
  /**
    * The ID of the stack.
    */
  var StackId: typings.awsDashSdk.clientsCloudformationMod.StackId = js.native
  /**
    * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected template configuration because the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected values (as defined in the stack template and any values specified as template parameters).    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatus: typings.awsDashSdk.clientsCloudformationMod.StackResourceDriftStatus = js.native
  /**
    * Time at which AWS CloudFormation performed drift detection on the stack resource.
    */
  var Timestamp: typings.awsDashSdk.clientsCloudformationMod.Timestamp = js.native
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
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (ActualProperties != null) __obj.updateDynamic("ActualProperties")(ActualProperties.asInstanceOf[js.Any])
    if (ExpectedProperties != null) __obj.updateDynamic("ExpectedProperties")(ExpectedProperties.asInstanceOf[js.Any])
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId.asInstanceOf[js.Any])
    if (PhysicalResourceIdContext != null) __obj.updateDynamic("PhysicalResourceIdContext")(PhysicalResourceIdContext.asInstanceOf[js.Any])
    if (PropertyDifferences != null) __obj.updateDynamic("PropertyDifferences")(PropertyDifferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDrift]
  }
}

