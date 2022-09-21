package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.progress
import typings.antvG2plot.mixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsProgressOption
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsProgressOption
  
  val `type`: progress
}
object OptionsPlotOptionsProgressOption {
  
  inline def apply(options: PlotOptionsProgressOption): OptionsPlotOptionsProgressOption = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("progress")
    __obj.asInstanceOf[OptionsPlotOptionsProgressOption]
  }
  
  extension [Self <: OptionsPlotOptionsProgressOption](x: Self) {
    
    inline def setOptions(value: PlotOptionsProgressOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: progress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
