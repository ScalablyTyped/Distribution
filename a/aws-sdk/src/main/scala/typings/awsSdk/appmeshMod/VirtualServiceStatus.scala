package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceStatus extends js.Object {
  /**
    * The current status of the virtual service.
    */
  var status: VirtualServiceStatusCode = js.native
}

object VirtualServiceStatus {
  @scala.inline
  def apply(status: VirtualServiceStatusCode): VirtualServiceStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceStatus]
  }
  @scala.inline
  implicit class VirtualServiceStatusOps[Self <: VirtualServiceStatus] (val x: Self) extends AnyVal {
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
    def setStatus(value: VirtualServiceStatusCode): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

