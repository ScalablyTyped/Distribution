package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the route.
    */
  var arn: Arn
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the route.
    */
  var routeName: ResourceName
  /**
    * The virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName
}

object RouteRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName, routeName: ResourceName, virtualRouterName: ResourceName): RouteRef = {
    val __obj = js.Dynamic.literal(arn = arn, meshName = meshName, routeName = routeName, virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[RouteRef]
  }
}

