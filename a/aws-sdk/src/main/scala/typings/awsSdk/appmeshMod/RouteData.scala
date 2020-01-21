package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteData extends js.Object {
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The associated metadata for the route.
    */
  var metadata: ResourceMetadata = js.native
  /**
    * The name of the route.
    */
  var routeName: ResourceName = js.native
  /**
    * The specifications of the route.
    */
  var spec: RouteSpec = js.native
  /**
    * The status of the route.
    */
  var status: RouteStatus = js.native
  /**
    * The virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName = js.native
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
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteData]
  }
}

