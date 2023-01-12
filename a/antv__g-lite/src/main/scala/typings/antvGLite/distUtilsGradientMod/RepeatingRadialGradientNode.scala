package typings.antvGLite.distUtilsGradientMod

import typings.antvGLite.antvGLiteStrings.`repeating-radial-gradient`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatingRadialGradientNode
  extends StObject
     with GradientNode {
  
  var colorStops: js.Array[ColorStop]
  
  var orientation: js.UndefOr[js.Array[ShapeNode | DefaultRadialNode | ExtentKeywordNode]] = js.undefined
  
  var `type`: `repeating-radial-gradient`
}
object RepeatingRadialGradientNode {
  
  inline def apply(colorStops: js.Array[ColorStop]): RepeatingRadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-radial-gradient")
    __obj.asInstanceOf[RepeatingRadialGradientNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepeatingRadialGradientNode] (val x: Self) extends AnyVal {
    
    inline def setColorStops(value: js.Array[ColorStop]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setColorStopsVarargs(value: ColorStop*): Self = StObject.set(x, "colorStops", js.Array(value*))
    
    inline def setOrientation(value: js.Array[ShapeNode | DefaultRadialNode | ExtentKeywordNode]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOrientationVarargs(value: (ShapeNode | DefaultRadialNode | ExtentKeywordNode)*): Self = StObject.set(x, "orientation", js.Array(value*))
    
    inline def setType(value: `repeating-radial-gradient`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
