package typings.antvGLite.utilsGradientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.antvGLite.utilsGradientMod.LinearGradientNode
  - typings.antvGLite.utilsGradientMod.RepeatingLinearGradientNode
  - typings.antvGLite.utilsGradientMod.RadialGradientNode
  - typings.antvGLite.utilsGradientMod.RepeatingRadialGradientNode
*/
trait GradientNode extends StObject
object GradientNode {
  
  inline def LinearGradientNode(colorStops: js.Array[ColorStop]): typings.antvGLite.utilsGradientMod.LinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[typings.antvGLite.utilsGradientMod.LinearGradientNode]
  }
  
  inline def RadialGradientNode(colorStops: js.Array[ColorStop]): typings.antvGLite.utilsGradientMod.RadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[typings.antvGLite.utilsGradientMod.RadialGradientNode]
  }
  
  inline def RepeatingLinearGradientNode(colorStops: js.Array[ColorStop]): typings.antvGLite.utilsGradientMod.RepeatingLinearGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-linear-gradient")
    __obj.asInstanceOf[typings.antvGLite.utilsGradientMod.RepeatingLinearGradientNode]
  }
  
  inline def RepeatingRadialGradientNode(colorStops: js.Array[ColorStop]): typings.antvGLite.utilsGradientMod.RepeatingRadialGradientNode = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repeating-radial-gradient")
    __obj.asInstanceOf[typings.antvGLite.utilsGradientMod.RepeatingRadialGradientNode]
  }
}
