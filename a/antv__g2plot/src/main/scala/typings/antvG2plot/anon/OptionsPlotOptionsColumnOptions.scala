package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.column
import typings.antvG2plot.mixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsColumnOptions
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsColumnOptions
  
  val `type`: column
}
object OptionsPlotOptionsColumnOptions {
  
  inline def apply(options: PlotOptionsColumnOptions): OptionsPlotOptionsColumnOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("column")
    __obj.asInstanceOf[OptionsPlotOptionsColumnOptions]
  }
  
  extension [Self <: OptionsPlotOptionsColumnOptions](x: Self) {
    
    inline def setOptions(value: PlotOptionsColumnOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: column): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
