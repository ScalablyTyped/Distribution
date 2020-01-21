package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualRouterOutput extends js.Object {
  /**
    * The virtual router that was deleted.
    */
  var virtualRouter: VirtualRouterData = js.native
}

object DeleteVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): DeleteVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVirtualRouterOutput]
  }
}

