package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVirtualRouterInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName
  /**
    * The new virtual router specification to apply. This overwrites the existing data.
    */
  var spec: VirtualRouterSpec
  /**
    * The name of the virtual router to update.
    */
  var virtualRouterName: ResourceName
}

object UpdateVirtualRouterInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    spec: VirtualRouterSpec,
    virtualRouterName: ResourceName,
    clientToken: String = null
  ): UpdateVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, spec = spec, virtualRouterName = virtualRouterName)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    __obj.asInstanceOf[UpdateVirtualRouterInput]
  }
}

