package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchView extends StObject {
  
  var _created: js.Any
  
  var _templateRef: js.Any
  
  var _viewContainerRef: js.Any
  
  def create(): Unit
  
  def destroy(): Unit
  
  def enforceState(created: Boolean): Unit
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
  implicit class SwitchViewMutableBuilder[Self <: SwitchView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnforceState(value: Boolean => Unit): Self = StObject.set(x, "enforceState", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_created(value: js.Any): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_templateRef(value: js.Any): Self = StObject.set(x, "_templateRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_viewContainerRef(value: js.Any): Self = StObject.set(x, "_viewContainerRef", value.asInstanceOf[js.Any])
  }
}
