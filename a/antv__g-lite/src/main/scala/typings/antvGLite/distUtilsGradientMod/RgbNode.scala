package typings.antvGLite.distUtilsGradientMod

import typings.antvGLite.antvGLiteStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbNode
  extends StObject
     with ColorStop {
  
  var length: js.UndefOr[PxNode | EmNode | PercentNode] = js.undefined
  
  var `type`: rgb
  
  var value: js.Tuple3[String, String, String]
}
object RgbNode {
  
  inline def apply(value: js.Tuple3[String, String, String]): RgbNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgb")
    __obj.asInstanceOf[RgbNode]
  }
  
  extension [Self <: RgbNode](x: Self) {
    
    inline def setLength(value: PxNode | EmNode | PercentNode): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setType(value: rgb): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Tuple3[String, String, String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
