package typings.antDesignReactNative.anon

import typings.reactNative.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionTextActiveOpacity extends StObject {
  
  var WrapComponent: View = js.native
  
  var actionTextActiveOpacity: Double = js.native
  
  var actionTextUnderlayColor: String = js.native
  
  var dismissText: String = js.native
  
  var okText: String = js.native
  
  def onDismiss(): Unit = js.native
  
  def onOk(_underscore: js.Any): Unit = js.native
  
  def onVisibleChange(_underscore: js.Any): Unit = js.native
  
  var title: String = js.native
  
  var triggerType: String = js.native
}
object ActionTextActiveOpacity {
  
  @scala.inline
  def apply(
    WrapComponent: View,
    actionTextActiveOpacity: Double,
    actionTextUnderlayColor: String,
    dismissText: String,
    okText: String,
    onDismiss: () => Unit,
    onOk: js.Any => Unit,
    onVisibleChange: js.Any => Unit,
    title: String,
    triggerType: String
  ): ActionTextActiveOpacity = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss), onOk = js.Any.fromFunction1(onOk), onVisibleChange = js.Any.fromFunction1(onVisibleChange), title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTextActiveOpacity]
  }
  
  @scala.inline
  implicit class ActionTextActiveOpacityMutableBuilder[Self <: ActionTextActiveOpacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissText(value: String): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOk(value: js.Any => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVisibleChange(value: js.Any => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapComponent(value: View): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
  }
}
