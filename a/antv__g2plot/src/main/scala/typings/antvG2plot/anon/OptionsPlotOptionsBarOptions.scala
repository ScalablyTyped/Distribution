package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.bar
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsBarOptions
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsBarOptions
  
  val `type`: bar
}
object OptionsPlotOptionsBarOptions {
  
  inline def apply(options: PlotOptionsBarOptions): OptionsPlotOptionsBarOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bar")
    __obj.asInstanceOf[OptionsPlotOptionsBarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsPlotOptionsBarOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: PlotOptionsBarOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: bar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
