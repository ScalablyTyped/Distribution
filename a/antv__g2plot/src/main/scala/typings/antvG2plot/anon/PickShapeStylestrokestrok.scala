package typings.antvG2plot.anon

import typings.antvGBase.typesMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.ShapeStyle, 'stroke' | 'strokeOpacity'> */
trait PickShapeStylestrokestrok extends StObject {
  
  var stroke: js.UndefOr[ColorType] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
}
object PickShapeStylestrokestrok {
  
  inline def apply(): PickShapeStylestrokestrok = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickShapeStylestrokestrok]
  }
  
  extension [Self <: PickShapeStylestrokestrok](x: Self) {
    
    inline def setStroke(value: ColorType): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeNull: Self = StObject.set(x, "stroke", null)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
