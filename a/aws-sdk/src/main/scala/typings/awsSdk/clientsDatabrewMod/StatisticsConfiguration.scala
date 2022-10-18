package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatisticsConfiguration extends StObject {
  
  /**
    * List of included evaluations. When the list is undefined, all supported evaluations will be included.
    */
  var IncludedStatistics: js.UndefOr[StatisticList] = js.undefined
  
  /**
    * List of overrides for evaluations.
    */
  var Overrides: js.UndefOr[StatisticOverrideList] = js.undefined
}
object StatisticsConfiguration {
  
  inline def apply(): StatisticsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatisticsConfiguration]
  }
  
  extension [Self <: StatisticsConfiguration](x: Self) {
    
    inline def setIncludedStatistics(value: StatisticList): Self = StObject.set(x, "IncludedStatistics", value.asInstanceOf[js.Any])
    
    inline def setIncludedStatisticsUndefined: Self = StObject.set(x, "IncludedStatistics", js.undefined)
    
    inline def setIncludedStatisticsVarargs(value: Statistic*): Self = StObject.set(x, "IncludedStatistics", js.Array(value*))
    
    inline def setOverrides(value: StatisticOverrideList): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    inline def setOverridesVarargs(value: StatisticOverride*): Self = StObject.set(x, "Overrides", js.Array(value*))
  }
}
