package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.`tiny-column`
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPlotOptionsTinyColumnOpti
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsTinyColumnOpti
  
  val `type`: `tiny-column`
}
object OptionsPlotOptionsTinyColumnOpti {
  
  inline def apply(options: PlotOptionsTinyColumnOpti): OptionsPlotOptionsTinyColumnOpti = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tiny-column")
    __obj.asInstanceOf[OptionsPlotOptionsTinyColumnOpti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsPlotOptionsTinyColumnOpti] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: PlotOptionsTinyColumnOpti): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: `tiny-column`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
