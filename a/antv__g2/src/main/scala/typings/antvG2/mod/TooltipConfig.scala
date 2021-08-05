package typings.antvG2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.antvG2.mod.HtmlTooltipConfig
  - typings.antvG2.mod.CanvasTooltipConfig
  - typings.antvG2.mod.MiniTooltipConfig
*/
trait TooltipConfig extends StObject
object TooltipConfig {
  
  inline def CanvasTooltipConfig(): typings.antvG2.mod.CanvasTooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = false)
    __obj.asInstanceOf[typings.antvG2.mod.CanvasTooltipConfig]
  }
  
  inline def HtmlTooltipConfig(): typings.antvG2.mod.HtmlTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.antvG2.mod.HtmlTooltipConfig]
  }
  
  inline def MiniTooltipConfig(): typings.antvG2.mod.MiniTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("mini")
    __obj.asInstanceOf[typings.antvG2.mod.MiniTooltipConfig]
  }
}
