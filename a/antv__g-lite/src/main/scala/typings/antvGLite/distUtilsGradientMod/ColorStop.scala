package typings.antvGLite.distUtilsGradientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.antvGLite.distUtilsGradientMod.LiteralNode
  - typings.antvGLite.distUtilsGradientMod.HexNode
  - typings.antvGLite.distUtilsGradientMod.RgbNode
  - typings.antvGLite.distUtilsGradientMod.RgbaNode
*/
trait ColorStop extends StObject
object ColorStop {
  
  inline def HexNode(value: String): typings.antvGLite.distUtilsGradientMod.HexNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hex")
    __obj.asInstanceOf[typings.antvGLite.distUtilsGradientMod.HexNode]
  }
  
  inline def LiteralNode(value: String): typings.antvGLite.distUtilsGradientMod.LiteralNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typings.antvGLite.distUtilsGradientMod.LiteralNode]
  }
  
  inline def RgbNode(value: js.Tuple3[String, String, String]): typings.antvGLite.distUtilsGradientMod.RgbNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgb")
    __obj.asInstanceOf[typings.antvGLite.distUtilsGradientMod.RgbNode]
  }
  
  inline def RgbaNode(value: js.Tuple4[String, String, String, js.UndefOr[String]]): typings.antvGLite.distUtilsGradientMod.RgbaNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgba")
    __obj.asInstanceOf[typings.antvGLite.distUtilsGradientMod.RgbaNode]
  }
}
