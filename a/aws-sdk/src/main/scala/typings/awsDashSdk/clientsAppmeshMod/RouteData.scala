package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteData extends js.Object {
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName
  /**
    * The associated metadata for the route.
    */
  var metadata: ResourceMetadata
  /**
    * The name of the route.
    */
  var routeName: ResourceName
  /**
    * The specifications of the route.
    */
  var spec: RouteSpec
  /**
    * The status of the route.
    */
  var status: RouteStatus
  /**
    * The virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName
}

object RouteData {
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    routeName: ResourceName,
    spec: RouteSpec,
    status: RouteStatus,
    virtualRouterName: ResourceName
  ): RouteData = {
    val __obj = js.Dynamic.literal(meshName = meshName, metadata = metadata, routeName = routeName, spec = spec, status = status, virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[RouteData]
  }
}

