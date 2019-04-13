package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRouteInput extends js.Object {
  /**
    * The name of the service mesh to delete the route in.
    */
  var meshName: ResourceName
  /**
    * The name of the route to delete.
    */
  var routeName: ResourceName
  /**
    * The name of the virtual router to delete the route in.
    */
  var virtualRouterName: ResourceName
}

object DeleteRouteInput {
  @scala.inline
  def apply(meshName: ResourceName, routeName: ResourceName, virtualRouterName: ResourceName): DeleteRouteInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, routeName = routeName, virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[DeleteRouteInput]
  }
}

