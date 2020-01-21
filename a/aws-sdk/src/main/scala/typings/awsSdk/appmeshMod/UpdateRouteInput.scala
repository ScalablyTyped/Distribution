package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRouteInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the route to update.
    */
  var routeName: ResourceName = js.native
  /**
    * The new route specification to apply. This overwrites the existing data.
    */
  var spec: RouteSpec = js.native
  /**
    * The name of the virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName = js.native
}

object UpdateRouteInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    routeName: ResourceName,
    spec: RouteSpec,
    virtualRouterName: ResourceName,
    clientToken: String = null
  ): UpdateRouteInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteInput]
  }
}

