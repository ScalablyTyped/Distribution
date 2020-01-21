package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the route.
    */
  var arn: Arn = js.native
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the route.
    */
  var routeName: ResourceName = js.native
  /**
    * The virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName = js.native
}

object RouteRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName, routeName: ResourceName, virtualRouterName: ResourceName): RouteRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteRef]
  }
}

