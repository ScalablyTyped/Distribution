package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVirtualRouterInput extends js.Object {
  /**
    * The name of the service mesh to delete the virtual router in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual router to delete.
    */
  var virtualRouterName: ResourceName
}

object DeleteVirtualRouterInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualRouterName: ResourceName): DeleteVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[DeleteVirtualRouterInput]
  }
}

