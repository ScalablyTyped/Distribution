package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRouteInput extends js.Object {
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the route to describe.
    */
  var routeName: ResourceName
  /**
    * The name of the virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName
}

object DescribeRouteInput {
  @scala.inline
  def apply(meshName: ResourceName, routeName: ResourceName, virtualRouterName: ResourceName): DescribeRouteInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, routeName = routeName, virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[DescribeRouteInput]
  }
}

