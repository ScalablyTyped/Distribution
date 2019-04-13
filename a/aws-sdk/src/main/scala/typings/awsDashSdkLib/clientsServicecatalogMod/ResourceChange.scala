package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceChange extends js.Object {
  /**
    * The change action.
    */
  var Action: js.UndefOr[ChangeAction] = js.undefined
  /**
    * Information about the resource changes.
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.undefined
  /**
    * The ID of the resource, as defined in the CloudFormation template.
    */
  var LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
  /**
    * The ID of the resource, if it was already created.
    */
  var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
  /**
    * If the change type is Modify, indicates whether the existing resource is deleted and replaced with a new one.
    */
  var Replacement: js.UndefOr[Replacement] = js.undefined
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[PlanResourceType] = js.undefined
  /**
    * The change scope.
    */
  var Scope: js.UndefOr[Scope] = js.undefined
}

object ResourceChange {
  @scala.inline
  def apply(
    Action: ChangeAction = null,
    Details: ResourceChangeDetails = null,
    LogicalResourceId: LogicalResourceId = null,
    PhysicalResourceId: PhysicalResourceId = null,
    Replacement: Replacement = null,
    ResourceType: PlanResourceType = null,
    Scope: Scope = null
  ): ResourceChange = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details)
    if (LogicalResourceId != null) __obj.updateDynamic("LogicalResourceId")(LogicalResourceId)
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId)
    if (Replacement != null) __obj.updateDynamic("Replacement")(Replacement.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (Scope != null) __obj.updateDynamic("Scope")(Scope)
    __obj.asInstanceOf[ResourceChange]
  }
}

