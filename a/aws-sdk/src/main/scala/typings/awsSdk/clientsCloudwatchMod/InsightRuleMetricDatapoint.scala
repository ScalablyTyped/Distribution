package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightRuleMetricDatapoint extends StObject {
  
  /**
    * The average value from all contributors during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Average: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
  
  /**
    * The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated separately, so the identity of the max contributor could be different for each timestamp. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var MaxContributorValue: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
  
  /**
    * The maximum value from a single occurence from a single contributor during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Maximum: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
  
  /**
    * The minimum value from a single contributor during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Minimum: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
  
  /**
    * The number of occurrences that matched the rule during this data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var SampleCount: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
  
  /**
    * The sum of the values from all contributors during the time period represented by that data point. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var Sum: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
  
  /**
    * The timestamp of the data point.
    */
  var Timestamp: js.Date
  
  /**
    * The number of unique contributors who published data during this timestamp. This statistic is returned only if you included it in the Metrics array in your request.
    */
  var UniqueContributors: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
}
object InsightRuleMetricDatapoint {
  
  inline def apply(Timestamp: js.Date): InsightRuleMetricDatapoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRuleMetricDatapoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightRuleMetricDatapoint] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: InsightRuleUnboundDouble): Self = StObject.set(x, "Average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "Average", js.undefined)
    
    inline def setMaxContributorValue(value: InsightRuleUnboundDouble): Self = StObject.set(x, "MaxContributorValue", value.asInstanceOf[js.Any])
    
    inline def setMaxContributorValueUndefined: Self = StObject.set(x, "MaxContributorValue", js.undefined)
    
    inline def setMaximum(value: InsightRuleUnboundDouble): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
    
    inline def setMinimum(value: InsightRuleUnboundDouble): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "Minimum", js.undefined)
    
    inline def setSampleCount(value: InsightRuleUnboundDouble): Self = StObject.set(x, "SampleCount", value.asInstanceOf[js.Any])
    
    inline def setSampleCountUndefined: Self = StObject.set(x, "SampleCount", js.undefined)
    
    inline def setSum(value: InsightRuleUnboundDouble): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "Sum", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setUniqueContributors(value: InsightRuleUnboundDouble): Self = StObject.set(x, "UniqueContributors", value.asInstanceOf[js.Any])
    
    inline def setUniqueContributorsUndefined: Self = StObject.set(x, "UniqueContributors", js.undefined)
  }
}
