package typings.antvG2plot

import typings.antvG2.mod.TooltipController
import typings.antvG2plot.libTypesCommonMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRadarInteractionsRadarTooltipActionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action * / any */ @JSImport("@antv/g2plot/lib/plots/radar/interactions/radar-tooltip-action", "RadarTooltipAction")
  @js.native
  open class RadarTooltipAction () extends StObject {
    
    /* private */ var getTooltipController: Any = js.native
    
    def hide(): Unit = js.native
    
    def init(): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @JSImport("@antv/g2plot/lib/plots/radar/interactions/radar-tooltip-action", "RadarTooltipController")
  @js.native
  open class RadarTooltipController () extends TooltipController {
    
    def getTooltipItems(point: Point): js.Array[Any] = js.native
  }
}
