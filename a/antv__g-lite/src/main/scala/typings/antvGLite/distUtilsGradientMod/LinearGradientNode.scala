package typings.antvGLite.distUtilsGradientMod

import typings.antvGLite.antvGLiteStrings.`linear-gradient`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradientNode
  extends StObject
     with GradientNode {
  
  var colorStops: js.Array[ColorStop]
  
  var orientation: js.UndefOr[DirectionalNode | AngularNode] = js.undefined
  
  var `type`: `linear-gradient`
}
object LinearGradientNode {
  
  inline def apply(colorStops: js.Array[ColorStop]): LinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[LinearGradientNode]
  }
  
  extension [Self <: LinearGradientNode](x: Self) {
    
    inline def setColorStops(value: js.Array[ColorStop]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setColorStopsVarargs(value: ColorStop*): Self = StObject.set(x, "colorStops", js.Array(value*))
    
    inline def setOrientation(value: DirectionalNode | AngularNode): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setType(value: `linear-gradient`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
