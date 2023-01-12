package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotType extends StObject {
  
  var plotType: String
  
  var statistic: typings.antvG2plot.libTypesStatisticMod.Statistic
}
object PlotType {
  
  inline def apply(plotType: String, statistic: typings.antvG2plot.libTypesStatisticMod.Statistic): PlotType = {
    val __obj = js.Dynamic.literal(plotType = plotType.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotType] (val x: Self) extends AnyVal {
    
    inline def setPlotType(value: String): Self = StObject.set(x, "plotType", value.asInstanceOf[js.Any])
    
    inline def setStatistic(value: typings.antvG2plot.libTypesStatisticMod.Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
  }
}
