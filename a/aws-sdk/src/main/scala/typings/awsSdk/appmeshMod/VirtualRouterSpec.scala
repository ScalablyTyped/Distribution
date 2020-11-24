package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRouterSpec extends js.Object {
  
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from. You can specify one listener.
    */
  var listeners: js.UndefOr[VirtualRouterListeners] = js.native
}
object VirtualRouterSpec {
  
  @scala.inline
  def apply(): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualRouterSpec]
  }
  
  @scala.inline
  implicit class VirtualRouterSpecOps[Self <: VirtualRouterSpec] (val x: Self) extends AnyVal {
    
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
    def setListenersVarargs(value: VirtualRouterListener*): Self = this.set("listeners", js.Array(value :_*))
    
    @scala.inline
    def setListeners(value: VirtualRouterListeners): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
  }
}
