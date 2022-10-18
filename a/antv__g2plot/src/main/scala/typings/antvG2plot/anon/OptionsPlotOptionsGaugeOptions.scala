package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.gauge
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsGaugeOptions
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsGaugeOptions
  
  val `type`: gauge
}
object OptionsPlotOptionsGaugeOptions {
  
  inline def apply(options: PlotOptionsGaugeOptions): OptionsPlotOptionsGaugeOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gauge")
    __obj.asInstanceOf[OptionsPlotOptionsGaugeOptions]
  }
  
  extension [Self <: OptionsPlotOptionsGaugeOptions](x: Self) {
    
    inline def setOptions(value: PlotOptionsGaugeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: gauge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
