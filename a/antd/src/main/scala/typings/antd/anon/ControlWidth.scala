package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlWidth extends StObject {
  
  var controlWidth: Double
  
  var handleFontSize: Double
  
  var handleWidth: Double
}
object ControlWidth {
  
  inline def apply(controlWidth: Double, handleFontSize: Double, handleWidth: Double): ControlWidth = {
    val __obj = js.Dynamic.literal(controlWidth = controlWidth.asInstanceOf[js.Any], handleFontSize = handleFontSize.asInstanceOf[js.Any], handleWidth = handleWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlWidth]
  }
  
  extension [Self <: ControlWidth](x: Self) {
    
    inline def setControlWidth(value: Double): Self = StObject.set(x, "controlWidth", value.asInstanceOf[js.Any])
    
    inline def setHandleFontSize(value: Double): Self = StObject.set(x, "handleFontSize", value.asInstanceOf[js.Any])
    
    inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
  }
}
