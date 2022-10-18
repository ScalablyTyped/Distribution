package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.histogram
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsHistogramOptio
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsHistogramOptio
  
  val `type`: histogram
}
object OptionsPlotOptionsHistogramOptio {
  
  inline def apply(options: PlotOptionsHistogramOptio): OptionsPlotOptionsHistogramOptio = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("histogram")
    __obj.asInstanceOf[OptionsPlotOptionsHistogramOptio]
  }
  
  extension [Self <: OptionsPlotOptionsHistogramOptio](x: Self) {
    
    inline def setOptions(value: PlotOptionsHistogramOptio): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: histogram): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
