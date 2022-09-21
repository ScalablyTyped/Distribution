package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.scatter
import typings.antvG2plot.mixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsScatterOptions
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsScatterOptions
  
  val `type`: scatter
}
object OptionsPlotOptionsScatterOptions {
  
  inline def apply(options: PlotOptionsScatterOptions): OptionsPlotOptionsScatterOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("scatter")
    __obj.asInstanceOf[OptionsPlotOptionsScatterOptions]
  }
  
  extension [Self <: OptionsPlotOptionsScatterOptions](x: Self) {
    
    inline def setOptions(value: PlotOptionsScatterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: scatter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
