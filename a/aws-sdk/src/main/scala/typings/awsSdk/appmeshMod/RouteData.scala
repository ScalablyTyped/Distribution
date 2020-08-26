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
  @scala.inline
  implicit class RouteDataOps[Self <: RouteData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeshName(value: ResourceName): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteName(value: ResourceName): Self = this.set("routeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: RouteSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: RouteStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualRouterName(value: ResourceName): Self = this.set("virtualRouterName", value.asInstanceOf[js.Any])
  }
  
}

