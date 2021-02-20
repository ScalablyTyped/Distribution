package typings.antDesignReactNative.anon

import typings.reactNative.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionTextUnderlayColor extends StObject {
  
  var WrapComponent: View = js.native
  
  var actionTextActiveOpacity: Double = js.native
  
  var actionTextUnderlayColor: String = js.native
  
  var triggerType: String = js.native
}
object ActionTextUnderlayColor {
  
  @scala.inline
  def apply(
    WrapComponent: View,
    actionTextActiveOpacity: Double,
    actionTextUnderlayColor: String,
    triggerType: String
  ): ActionTextUnderlayColor = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTextUnderlayColor]
  }
  
  @scala.inline
  implicit class ActionTextUnderlayColorMutableBuilder[Self <: ActionTextUnderlayColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapComponent(value: View): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
  }
}
