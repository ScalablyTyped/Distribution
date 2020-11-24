package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeStatus extends js.Object {
  
  /**
    * The current status of the virtual node.
    */
  var status: VirtualNodeStatusCode = js.native
}
object VirtualNodeStatus {
  
  @scala.inline
  def apply(status: VirtualNodeStatusCode): VirtualNodeStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeStatus]
  }
  
  @scala.inline
  implicit class VirtualNodeStatusOps[Self <: VirtualNodeStatus] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: VirtualNodeStatusCode): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
