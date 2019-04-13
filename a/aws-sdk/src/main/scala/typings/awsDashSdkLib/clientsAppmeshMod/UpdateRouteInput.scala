package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRouteInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the route to update.
    */
  var routeName: ResourceName
  /**
    * The new route specification to apply. This overwrites the existing data.
    */
  var spec: RouteSpec
  /**
    * The name of the virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName
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
    val __obj = js.Dynamic.literal(meshName = meshName, routeName = routeName, spec = spec, virtualRouterName = virtualRouterName)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    __obj.asInstanceOf[UpdateRouteInput]
  }
}

