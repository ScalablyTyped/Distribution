package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceChange extends js.Object {
  /**
    * The action that AWS CloudFormation takes on the resource, such as Add (adds a new resource), Modify (changes a resource), or Remove (deletes a resource).
    */
  var Action: js.UndefOr[ChangeAction] = js.native
  /**
    * For the Modify action, a list of ResourceChangeDetail structures that describes the changes that AWS CloudFormation will make to the resource. 
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.native
  /**
    * The resource's logical ID, which is defined in the stack's template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.LogicalResourceId] = js.native
  /**
    * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they haven't been created.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.PhysicalResourceId] = js.native
  /**
    * For the Modify action, indicates whether AWS CloudFormation will replace the resource by creating a new one and deleting the old one. This value depends on the value of the RequiresRecreation property in the ResourceTargetDefinition structure. For example, if the RequiresRecreation field is Always and the Evaluation field is Static, Replacement is True. If the RequiresRecreation field is Always and the Evaluation field is Dynamic, Replacement is Conditionally. If you have multiple changes with different RequiresRecreation values, the Replacement value depends on the change with the most impact. A RequiresRecreation value of Always has the most impact, followed by Conditionally, and then Never.
    */
  var Replacement: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Replacement] = js.native
  /**
    * The type of AWS CloudFormation resource, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ResourceType] = js.native
  /**
    * For the Modify action, indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
    */
  var Scope: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Scope] = js.native
}

object ResourceChange {
  @scala.inline
  def apply(
    Action: ChangeAction = null,
    Details: ResourceChangeDetails = null,
    LogicalResourceId: LogicalResourceId = null,
    PhysicalResourceId: PhysicalResourceId = null,
    Replacement: Replacement = null,
    ResourceType: ResourceType = null,
    Scope: Scope = null
  ): ResourceChange = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (LogicalResourceId != null) __obj.updateDynamic("LogicalResourceId")(LogicalResourceId.asInstanceOf[js.Any])
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId.asInstanceOf[js.Any])
    if (Replacement != null) __obj.updateDynamic("Replacement")(Replacement.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceChange]
  }
}

