package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVirtualRouterOutput extends js.Object {
  /**
    * A full description of the virtual router that was updated.
    */
  var virtualRouter: VirtualRouterData = js.native
}

object UpdateVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): UpdateVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateVirtualRouterOutput]
  }
}

