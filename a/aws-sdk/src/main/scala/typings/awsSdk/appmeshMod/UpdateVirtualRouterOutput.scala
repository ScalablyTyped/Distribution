package typings.awsSdk.appmeshMod

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
  @scala.inline
  implicit class UpdateVirtualRouterOutputOps[Self <: UpdateVirtualRouterOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVirtualRouter(value: VirtualRouterData): Self = this.set("virtualRouter", value.asInstanceOf[js.Any])
  }
  
}

