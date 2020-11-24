package typings.angularCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchView extends js.Object {
  
  var _created: js.Any = js.native
  
  var _templateRef: js.Any = js.native
  
  var _viewContainerRef: js.Any = js.native
  
  def create(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def enforceState(created: Boolean): Unit = js.native
}
object SwitchView {
  
  @scala.inline
  def apply(
    _created: js.Any,
    _templateRef: js.Any,
    _viewContainerRef: js.Any,
    create: () => Unit,
    destroy: () => Unit,
    enforceState: Boolean => Unit
  ): SwitchView = {
    val __obj = js.Dynamic.literal(_created = _created.asInstanceOf[js.Any], _templateRef = _templateRef.asInstanceOf[js.Any], _viewContainerRef = _viewContainerRef.asInstanceOf[js.Any], create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction0(destroy), enforceState = js.Any.fromFunction1(enforceState))
    __obj.asInstanceOf[SwitchView]
  }
  
  @scala.inline
  implicit class SwitchViewOps[Self <: SwitchView] (val x: Self) extends AnyVal {
    
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
    def set_created(value: js.Any): Self = this.set("_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_templateRef(value: js.Any): Self = this.set("_templateRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_viewContainerRef(value: js.Any): Self = this.set("_viewContainerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnforceState(value: Boolean => Unit): Self = this.set("enforceState", js.Any.fromFunction1(value))
  }
}
