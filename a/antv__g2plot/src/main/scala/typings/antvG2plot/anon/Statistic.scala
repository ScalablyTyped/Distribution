package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistic extends StObject {
  
  var statistic: typings.antvG2plot.statisticMod.Statistic
}
object Statistic {
  
  inline def apply(statistic: typings.antvG2plot.statisticMod.Statistic): Statistic = {
    val __obj = js.Dynamic.literal(statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistic]
  }
  
  extension [Self <: Statistic](x: Self) {
    
    inline def setStatistic(value: typings.antvG2plot.statisticMod.Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
  }
}
