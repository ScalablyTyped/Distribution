package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceProvider extends js.Object {
  /**
    * The virtual node associated with a virtual service.
    */
  var virtualNode: js.UndefOr[VirtualNodeServiceProvider] = js.undefined
  /**
    * The virtual router associated with a virtual service.
    */
  var virtualRouter: js.UndefOr[VirtualRouterServiceProvider] = js.undefined
}

object VirtualServiceProvider {
  @scala.inline
  def apply(virtualNode: VirtualNodeServiceProvider = null, virtualRouter: VirtualRouterServiceProvider = null): VirtualServiceProvider = {
    val __obj = js.Dynamic.literal()
    if (virtualNode != null) __obj.updateDynamic("virtualNode")(virtualNode)
    if (virtualRouter != null) __obj.updateDynamic("virtualRouter")(virtualRouter)
    __obj.asInstanceOf[VirtualServiceProvider]
  }
}

