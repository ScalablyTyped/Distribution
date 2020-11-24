package typings.antDesignReactNative.portalManagerMod

import typings.antDesignReactNative.anon.ChildrenReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var portals: js.Array[ChildrenReactNode] = js.native
}
object State {
  
  @scala.inline
  def apply(portals: js.Array[ChildrenReactNode]): State = {
    val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPortalsVarargs(value: ChildrenReactNode*): Self = this.set("portals", js.Array(value :_*))
    
    @scala.inline
    def setPortals(value: js.Array[ChildrenReactNode]): Self = this.set("portals", value.asInstanceOf[js.Any])
  }
}
