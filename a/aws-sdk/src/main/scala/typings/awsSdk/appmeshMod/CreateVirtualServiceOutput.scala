package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVirtualServiceOutput extends js.Object {
  /**
    * The full description of your virtual service following the create call.
    */
  var virtualService: VirtualServiceData = js.native
}

object CreateVirtualServiceOutput {
  @scala.inline
  def apply(virtualService: VirtualServiceData): CreateVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualServiceOutput]
  }
  @scala.inline
  implicit class CreateVirtualServiceOutputOps[Self <: CreateVirtualServiceOutput] (val x: Self) extends AnyVal {
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

