package typings
package awsDashSdkLib.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteComponentRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: awsDashSdkLib.clientsApplicationinsightsMod.ComponentName
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: awsDashSdkLib.clientsApplicationinsightsMod.ResourceGroupName
}

object DeleteComponentRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): DeleteComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName, ResourceGroupName = ResourceGroupName)
  
    __obj.asInstanceOf[DeleteComponentRequest]
  }
}

