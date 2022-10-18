package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.line
import typings.antvG2plot.libPlotsMixUtilsMod.IPlotTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with IPlotTypes {
  
  /**
    * plot 配置
    */
  val options: PlotOptionsLineOptions
  
  /**
    * plot 类型
    */
  val `type`: line
}
object Options {
  
  inline def apply(options: PlotOptionsLineOptions): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: PlotOptionsLineOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
