package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVirtualRouterOutput extends js.Object {
  /**
    * The full description of your virtual router following the create call.
    */
  var virtualRouter: VirtualRouterData = js.native
}

object CreateVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): CreateVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualRouterOutput]
  }
}

