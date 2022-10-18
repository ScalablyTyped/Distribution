package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.area
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsAreaOptions
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsAreaOptions
  
  val `type`: area
}
object OptionsPlotOptionsAreaOptions {
  
  inline def apply(options: PlotOptionsAreaOptions): OptionsPlotOptionsAreaOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("area")
    __obj.asInstanceOf[OptionsPlotOptionsAreaOptions]
  }
  
  extension [Self <: OptionsPlotOptionsAreaOptions](x: Self) {
    
    inline def setOptions(value: PlotOptionsAreaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: area): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
