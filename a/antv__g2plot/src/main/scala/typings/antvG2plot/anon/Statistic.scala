package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistic extends StObject {
  
  var statistic: typings.antvG2plot.libTypesStatisticMod.Statistic
}
object Statistic {
  
  inline def apply(statistic: typings.antvG2plot.libTypesStatisticMod.Statistic): Statistic = {
    val __obj = js.Dynamic.literal(statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statistic] (val x: Self) extends AnyVal {
    
    inline def setStatistic(value: typings.antvG2plot.libTypesStatisticMod.Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
  }
}
