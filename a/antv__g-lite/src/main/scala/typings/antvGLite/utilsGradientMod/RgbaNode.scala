package typings.antvGLite.utilsGradientMod

import typings.antvGLite.antvGLiteStrings.rgba
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbaNode
  extends StObject
     with ColorStop {
  
  var length: js.UndefOr[PxNode | EmNode | PercentNode] = js.undefined
  
  var `type`: rgba
  
  var value: js.Tuple4[String, String, String, js.UndefOr[String]]
}
object RgbaNode {
  
  inline def apply(value: js.Tuple4[String, String, String, js.UndefOr[String]]): RgbaNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgba")
    __obj.asInstanceOf[RgbaNode]
  }
  
  extension [Self <: RgbaNode](x: Self) {
    
    inline def setLength(value: PxNode | EmNode | PercentNode): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setType(value: rgba): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Tuple4[String, String, String, js.UndefOr[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
