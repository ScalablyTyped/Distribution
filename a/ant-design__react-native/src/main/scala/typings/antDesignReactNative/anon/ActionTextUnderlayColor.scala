package typings.antDesignReactNative.anon

import typings.reactNative.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTextUnderlayColor extends StObject {
  
  var WrapComponent: View
  
  var actionTextActiveOpacity: Double
  
  var actionTextUnderlayColor: String
  
  var triggerType: String
}
object ActionTextUnderlayColor {
  
  inline def apply(
    WrapComponent: View,
    actionTextActiveOpacity: Double,
    actionTextUnderlayColor: String,
    triggerType: String
  ): ActionTextUnderlayColor = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTextUnderlayColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionTextUnderlayColor] (val x: Self) extends AnyVal {
    
    inline def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
    
    inline def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
    
    inline def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def setWrapComponent(value: View): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
  }
}
