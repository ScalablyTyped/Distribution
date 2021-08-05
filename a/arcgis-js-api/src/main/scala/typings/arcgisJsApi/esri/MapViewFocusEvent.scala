package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewFocusEvent extends StObject {
  
  var native: js.Any
  
  var target: View
}
object MapViewFocusEvent {
  
  inline def apply(native: js.Any, target: View): MapViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewFocusEvent]
  }
  
  extension [Self <: MapViewFocusEvent](x: Self) {
    
    inline def setNative(value: js.Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: View): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
