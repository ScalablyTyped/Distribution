package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.funnel
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsFunnelOptions
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsFunnelOptions
  
  val `type`: funnel
}
object OptionsPlotOptionsFunnelOptions {
  
  inline def apply(options: PlotOptionsFunnelOptions): OptionsPlotOptionsFunnelOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("funnel")
    __obj.asInstanceOf[OptionsPlotOptionsFunnelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsPlotOptionsFunnelOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: PlotOptionsFunnelOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: funnel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
