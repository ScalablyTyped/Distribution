package typings.antvGLite.utilsGradientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.antvGLite.utilsGradientMod.LiteralNode
  - typings.antvGLite.utilsGradientMod.HexNode
  - typings.antvGLite.utilsGradientMod.RgbNode
  - typings.antvGLite.utilsGradientMod.RgbaNode
*/
trait ColorStop extends StObject
object ColorStop {
  
  inline def HexNode(value: String): typings.antvGLite.utilsGradientMod.HexNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hex")
    __obj.asInstanceOf[typings.antvGLite.utilsGradientMod.HexNode]
  }
  
  inline def LiteralNode(value: String): typings.antvGLite.utilsGradientMod.LiteralNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[typings.antvGLite.utilsGradientMod.LiteralNode]
  }
  
  inline def RgbNode(value: js.Tuple3[String, String, String]): typings.antvGLite.utilsGradientMod.RgbNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgb")
    __obj.asInstanceOf[typings.antvGLite.utilsGradientMod.RgbNode]
  }
  
  inline def RgbaNode(value: js.Tuple4[String, String, String, js.UndefOr[String]]): typings.antvGLite.utilsGradientMod.RgbaNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rgba")
    __obj.asInstanceOf[typings.antvGLite.utilsGradientMod.RgbaNode]
  }
}
