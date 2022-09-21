package typings.antvG2plot

import typings.antvG2plot.tooltipMod.Tooltip
import typings.antvG2plot.tooltipMod.TooltipMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTooltipMod {
  
  @JSImport("@antv/g2plot/lib/utils/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTooltipMapping(tooltip: Tooltip, defaultFields: js.Array[String]): TooltipMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipMapping")(tooltip.asInstanceOf[js.Any], defaultFields.asInstanceOf[js.Any])).asInstanceOf[TooltipMapping]
}
