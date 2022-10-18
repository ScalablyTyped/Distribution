package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyGroupStatistics extends StObject {
  
  /**
    * The start of the time range that was searched.
    */
  var EvaluationStartDate: js.UndefOr[TimestampString] = js.undefined
  
  /**
    * Statistics for individual metrics within the group.
    */
  var ItemizedMetricStatsList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.ItemizedMetricStatsList] = js.undefined
  
  /**
    * The number of groups found.
    */
  var TotalCount: js.UndefOr[Integer] = js.undefined
}
object AnomalyGroupStatistics {
  
  inline def apply(): AnomalyGroupStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyGroupStatistics]
  }
  
  extension [Self <: AnomalyGroupStatistics](x: Self) {
    
    inline def setEvaluationStartDate(value: TimestampString): Self = StObject.set(x, "EvaluationStartDate", value.asInstanceOf[js.Any])
    
    inline def setEvaluationStartDateUndefined: Self = StObject.set(x, "EvaluationStartDate", js.undefined)
    
    inline def setItemizedMetricStatsList(value: ItemizedMetricStatsList): Self = StObject.set(x, "ItemizedMetricStatsList", value.asInstanceOf[js.Any])
    
    inline def setItemizedMetricStatsListUndefined: Self = StObject.set(x, "ItemizedMetricStatsList", js.undefined)
    
    inline def setItemizedMetricStatsListVarargs(value: ItemizedMetricStats*): Self = StObject.set(x, "ItemizedMetricStatsList", js.Array(value*))
    
    inline def setTotalCount(value: Integer): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
