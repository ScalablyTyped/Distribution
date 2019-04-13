package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVirtualNodeInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName
  /**
    * The new virtual node specification to apply. This overwrites the existing data.
    */
  var spec: VirtualNodeSpec
  /**
    * The name of the virtual node to update.
    */
  var virtualNodeName: ResourceName
}

object UpdateVirtualNodeInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    spec: VirtualNodeSpec,
    virtualNodeName: ResourceName,
    clientToken: String = null
  ): UpdateVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, spec = spec, virtualNodeName = virtualNodeName)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    __obj.asInstanceOf[UpdateVirtualNodeInput]
  }
}

