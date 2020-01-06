package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRouteInput extends js.Object {
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the route to describe.
    */
  var routeName: ResourceName = js.native
  /**
    * The name of the virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName = js.native
}

object DescribeRouteInput {
  @scala.inline
  def apply(meshName: ResourceName, routeName: ResourceName, virtualRouterName: ResourceName): DescribeRouteInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRouteInput]
  }
}

