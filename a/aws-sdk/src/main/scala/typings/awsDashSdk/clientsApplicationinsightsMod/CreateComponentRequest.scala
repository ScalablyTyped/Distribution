package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateComponentRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsDashSdk.clientsApplicationinsightsMod.ComponentName
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceList
}

object CreateComponentRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName, ResourceList: ResourceList): CreateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName, ResourceGroupName = ResourceGroupName, ResourceList = ResourceList)
  
    __obj.asInstanceOf[CreateComponentRequest]
  }
}

