package typings.antvGLite.distUtilsGradientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.antvGLite.distUtilsGradientMod.LinearGradientNode
  - typings.antvGLite.distUtilsGradientMod.RepeatingLinearGradientNode
  - typings.antvGLite.distUtilsGradientMod.RadialGradientNode
  - typings.antvGLite.distUtilsGradientMod.RepeatingRadialGradientNode
*/
trait GradientNode extends StObject
object GradientNode {
  
  inline def LinearGradientNode(colorStops: js.Array[ColorStop]): typings.antvGLite.distUtilsGradientMod.LinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[typings.antvGLite.distUtilsGradientMod.LinearGradientNode]
  }
  
  inline def RadialGradientNode(colorStops: js.Array[ColorStop]): typings.antvGLite.distUtilsGradientMod.RadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[typings.antvGLite.distUtilsGradientMod.RadialGradientNode]
  }
  
  inline def RepeatingLinearGradientNode(colorStops: js.Array[ColorStop]): typings.antvGLite.distUtilsGradientMod.RepeatingLinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-linear-gradient")
    __obj.asInstanceOf[typings.antvGLite.distUtilsGradientMod.RepeatingLinearGradientNode]
  }
  
  inline def RepeatingRadialGradientNode(colorStops: js.Array[ColorStop]): typings.antvGLite.distUtilsGradientMod.RepeatingRadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-radial-gradient")
    __obj.asInstanceOf[typings.antvGLite.distUtilsGradientMod.RepeatingRadialGradientNode]
  }
}
