package typings.antvG2.anon

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendRatio extends StObject {
  
  var appendRatio: js.UndefOr[Double] = js.undefined
  
  var appendWidth: js.UndefOr[Double] = js.undefined
  
  var style: ShapeAttrs
}
object AppendRatio {
  
  inline def apply(style: ShapeAttrs): AppendRatio = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendRatio]
  }
  
  extension [Self <: AppendRatio](x: Self) {
    
    inline def setAppendRatio(value: Double): Self = StObject.set(x, "appendRatio", value.asInstanceOf[js.Any])
    
    inline def setAppendRatioUndefined: Self = StObject.set(x, "appendRatio", js.undefined)
    
    inline def setAppendWidth(value: Double): Self = StObject.set(x, "appendWidth", value.asInstanceOf[js.Any])
    
    inline def setAppendWidthUndefined: Self = StObject.set(x, "appendWidth", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
