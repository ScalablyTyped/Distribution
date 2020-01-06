package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVirtualRouterInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The new virtual router specification to apply. This overwrites the existing data.
    */
  var spec: VirtualRouterSpec = js.native
  /**
    * The name of the virtual router to update.
    */
  var virtualRouterName: ResourceName = js.native
}

object UpdateVirtualRouterInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    spec: VirtualRouterSpec,
    virtualRouterName: ResourceName,
    clientToken: String = null
  ): UpdateVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualRouterInput]
  }
}

