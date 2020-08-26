package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVirtualServiceOutput extends js.Object {
  /**
    * A full description of the virtual service that was updated.
    */
  var virtualService: VirtualServiceData = js.native
}

object UpdateVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): UpdateVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualServiceOutput]
  }
  @scala.inline
  implicit class UpdateVirtualServiceOutputOps[Self <: UpdateVirtualServiceOutput] (val x: Self) extends AnyVal {
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
    def setVirtualService(value: VirtualServiceData): Self = this.set("virtualService", value.asInstanceOf[js.Any])
  }
  
}

