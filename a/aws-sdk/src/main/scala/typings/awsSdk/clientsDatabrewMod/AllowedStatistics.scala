package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedStatistics extends StObject {
  
  /**
    * One or more column statistics to allow for columns that contain detected entities.
    */
  var Statistics: StatisticList
}
object AllowedStatistics {
  
  inline def apply(Statistics: StatisticList): AllowedStatistics = {
    val __obj = js.Dynamic.literal(Statistics = Statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedStatistics]
  }
  
  extension [Self <: AllowedStatistics](x: Self) {
    
    inline def setStatistics(value: StatisticList): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsVarargs(value: Statistic*): Self = StObject.set(x, "Statistics", js.Array(value*))
  }
}
