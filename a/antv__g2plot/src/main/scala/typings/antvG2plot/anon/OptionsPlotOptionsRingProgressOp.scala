package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.`ring-progress`
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsRingProgressOp
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsRingProgressOp
  
  val `type`: `ring-progress`
}
object OptionsPlotOptionsRingProgressOp {
  
  inline def apply(options: PlotOptionsRingProgressOp): OptionsPlotOptionsRingProgressOp = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ring-progress")
    __obj.asInstanceOf[OptionsPlotOptionsRingProgressOp]
  }
  
  extension [Self <: OptionsPlotOptionsRingProgressOp](x: Self) {
    
    inline def setOptions(value: PlotOptionsRingProgressOp): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: `ring-progress`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
