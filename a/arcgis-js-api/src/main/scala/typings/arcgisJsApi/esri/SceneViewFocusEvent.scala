package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewFocusEvent extends StObject {
  
  var native: js.Any
  
  var target: View
}
object SceneViewFocusEvent {
  
  inline def apply(native: js.Any, target: View): SceneViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewFocusEvent]
  }
  
  extension [Self <: SceneViewFocusEvent](x: Self) {
    
    inline def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: View): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
