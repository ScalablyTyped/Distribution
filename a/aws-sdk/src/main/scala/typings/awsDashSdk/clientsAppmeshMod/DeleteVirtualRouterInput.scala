package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualRouterInput extends js.Object {
  /**
    * The name of the service mesh to delete the virtual router in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual router to delete.
    */
  var virtualRouterName: ResourceName = js.native
}

object DeleteVirtualRouterInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualRouterName: ResourceName): DeleteVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVirtualRouterInput]
  }
}

