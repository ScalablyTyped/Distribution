package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.pie
import typings.antvG2plot.mixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsType
  extends StObject
     with IPlotTypes {
  
  val options: PlotOptionsPieOptions
  
  val `type`: pie
}
object OptionsType {
  
  inline def apply(options: PlotOptionsPieOptions): OptionsType = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pie")
    __obj.asInstanceOf[OptionsType]
  }
  
  extension [Self <: OptionsType](x: Self) {
    
    inline def setOptions(value: PlotOptionsPieOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: pie): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
