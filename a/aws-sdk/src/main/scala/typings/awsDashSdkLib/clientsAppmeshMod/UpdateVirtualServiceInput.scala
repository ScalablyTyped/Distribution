package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVirtualServiceInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName
  /**
    * The new virtual service specification to apply. This overwrites the existing
    data.
    */
  var spec: VirtualServiceSpec
  /**
    * The name of the virtual service to update.
    */
  var virtualServiceName: ServiceName
}

object UpdateVirtualServiceInput {
  @scala.inline
  def apply(
    meshName: ResourceName,
    spec: VirtualServiceSpec,
    virtualServiceName: ServiceName,
    clientToken: String = null
  ): UpdateVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, spec = spec, virtualServiceName = virtualServiceName)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    __obj.asInstanceOf[UpdateVirtualServiceInput]
  }
}

