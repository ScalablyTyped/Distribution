package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteInput extends js.Object {
  /**
    * The name of the service mesh to delete the route in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the route to delete.
    */
  var routeName: ResourceName = js.native
  /**
    * The name of the virtual router to delete the route in.
    */
  var virtualRouterName: ResourceName = js.native
}

object DeleteRouteInput {
  @scala.inline
  def apply(meshName: ResourceName, routeName: ResourceName, virtualRouterName: ResourceName): DeleteRouteInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRouteInput]
  }
}

