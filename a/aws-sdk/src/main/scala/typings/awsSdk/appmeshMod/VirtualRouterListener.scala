package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterListener extends js.Object {
  var portMapping: PortMapping = js.native
}

object VirtualRouterListener {
  @scala.inline
  def apply(portMapping: PortMapping): VirtualRouterListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterListener]
  }
  @scala.inline
  implicit class VirtualRouterListenerOps[Self <: VirtualRouterListener] (val x: Self) extends AnyVal {
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
    def setPortMapping(value: PortMapping): Self = this.set("portMapping", value.asInstanceOf[js.Any])
  }
  
}

