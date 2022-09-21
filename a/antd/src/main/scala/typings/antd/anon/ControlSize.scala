package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlSize extends StObject {
  
  var controlSize: Double
  
  var dotSize: Double
  
  var handleSize: Double
  
  var lineHandleWidth: Double
  
  var railSize: Double
}
object ControlSize {
  
  inline def apply(
    controlSize: Double,
    dotSize: Double,
    handleSize: Double,
    lineHandleWidth: Double,
    railSize: Double
  ): ControlSize = {
    val __obj = js.Dynamic.literal(controlSize = controlSize.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], handleSize = handleSize.asInstanceOf[js.Any], lineHandleWidth = lineHandleWidth.asInstanceOf[js.Any], railSize = railSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlSize]
  }
  
  extension [Self <: ControlSize](x: Self) {
    
    inline def setControlSize(value: Double): Self = StObject.set(x, "controlSize", value.asInstanceOf[js.Any])
    
    inline def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
    
    inline def setHandleSize(value: Double): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
    
    inline def setLineHandleWidth(value: Double): Self = StObject.set(x, "lineHandleWidth", value.asInstanceOf[js.Any])
    
    inline def setRailSize(value: Double): Self = StObject.set(x, "railSize", value.asInstanceOf[js.Any])
  }
}
