package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.stock
import typings.antvG2plot.mixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsStockOptions
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsStockOptions
  
  val `type`: stock
}
object OptionsPlotOptionsStockOptions {
  
  inline def apply(options: PlotOptionsStockOptions): OptionsPlotOptionsStockOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("stock")
    __obj.asInstanceOf[OptionsPlotOptionsStockOptions]
  }
  
  extension [Self <: OptionsPlotOptionsStockOptions](x: Self) {
    
    inline def setOptions(value: PlotOptionsStockOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: stock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
