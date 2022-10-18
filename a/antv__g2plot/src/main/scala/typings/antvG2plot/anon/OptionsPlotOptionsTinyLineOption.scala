package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.`tiny-line`
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsTinyLineOption
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsTinyLineOption
  
  val `type`: `tiny-line`
}
object OptionsPlotOptionsTinyLineOption {
  
  inline def apply(options: PlotOptionsTinyLineOption): OptionsPlotOptionsTinyLineOption = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tiny-line")
    __obj.asInstanceOf[OptionsPlotOptionsTinyLineOption]
  }
  
  extension [Self <: OptionsPlotOptionsTinyLineOption](x: Self) {
    
    inline def setOptions(value: PlotOptionsTinyLineOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: `tiny-line`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
