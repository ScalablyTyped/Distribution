package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateComponentRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsDashSdk.clientsApplicationinsightsMod.ComponentName
  /**
    * The new name of the component.
    */
  var NewComponentName: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.NewComponentName] = js.undefined
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ResourceList] = js.undefined
}

object UpdateComponentRequest {
  @scala.inline
  def apply(
    ComponentName: ComponentName,
    ResourceGroupName: ResourceGroupName,
    NewComponentName: NewComponentName = null,
    ResourceList: ResourceList = null
  ): UpdateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName, ResourceGroupName = ResourceGroupName)
    if (NewComponentName != null) __obj.updateDynamic("NewComponentName")(NewComponentName)
    if (ResourceList != null) __obj.updateDynamic("ResourceList")(ResourceList)
    __obj.asInstanceOf[UpdateComponentRequest]
  }
}

