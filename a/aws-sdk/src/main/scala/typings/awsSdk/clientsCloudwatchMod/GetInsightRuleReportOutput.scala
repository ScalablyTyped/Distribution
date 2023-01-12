package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightRuleReportOutput extends StObject {
  
  /**
    * The sum of the values from all individual contributors that match the rule.
    */
  var AggregateValue: js.UndefOr[InsightRuleUnboundDouble] = js.undefined
  
  /**
    * Specifies whether this rule aggregates contributor data by COUNT or SUM.
    */
  var AggregationStatistic: js.UndefOr[InsightRuleAggregationStatistic] = js.undefined
  
  /**
    * An approximate count of the unique contributors found by this rule in this time period.
    */
  var ApproximateUniqueCount: js.UndefOr[InsightRuleUnboundLong] = js.undefined
  
  /**
    * An array of the unique contributors found by this rule in this time period. If the rule contains multiple keys, each combination of values for the keys counts as a unique contributor.
    */
  var Contributors: js.UndefOr[InsightRuleContributors] = js.undefined
  
  /**
    * An array of the strings used as the keys for this rule. The keys are the dimensions used to classify contributors. If the rule contains more than one key, then each unique combination of values for the keys is counted as a unique contributor.
    */
  var KeyLabels: js.UndefOr[InsightRuleContributorKeyLabels] = js.undefined
  
  /**
    * A time series of metric data points that matches the time period in the rule request.
    */
  var MetricDatapoints: js.UndefOr[InsightRuleMetricDatapoints] = js.undefined
}
object GetInsightRuleReportOutput {
  
  inline def apply(): GetInsightRuleReportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightRuleReportOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightRuleReportOutput] (val x: Self) extends AnyVal {
    
    inline def setAggregateValue(value: InsightRuleUnboundDouble): Self = StObject.set(x, "AggregateValue", value.asInstanceOf[js.Any])
    
    inline def setAggregateValueUndefined: Self = StObject.set(x, "AggregateValue", js.undefined)
    
    inline def setAggregationStatistic(value: InsightRuleAggregationStatistic): Self = StObject.set(x, "AggregationStatistic", value.asInstanceOf[js.Any])
    
    inline def setAggregationStatisticUndefined: Self = StObject.set(x, "AggregationStatistic", js.undefined)
    
    inline def setApproximateUniqueCount(value: InsightRuleUnboundLong): Self = StObject.set(x, "ApproximateUniqueCount", value.asInstanceOf[js.Any])
    
    inline def setApproximateUniqueCountUndefined: Self = StObject.set(x, "ApproximateUniqueCount", js.undefined)
    
    inline def setContributors(value: InsightRuleContributors): Self = StObject.set(x, "Contributors", value.asInstanceOf[js.Any])
    
    inline def setContributorsUndefined: Self = StObject.set(x, "Contributors", js.undefined)
    
    inline def setContributorsVarargs(value: InsightRuleContributor*): Self = StObject.set(x, "Contributors", js.Array(value*))
    
    inline def setKeyLabels(value: InsightRuleContributorKeyLabels): Self = StObject.set(x, "KeyLabels", value.asInstanceOf[js.Any])
    
    inline def setKeyLabelsUndefined: Self = StObject.set(x, "KeyLabels", js.undefined)
    
    inline def setKeyLabelsVarargs(value: InsightRuleContributorKeyLabel*): Self = StObject.set(x, "KeyLabels", js.Array(value*))
    
    inline def setMetricDatapoints(value: InsightRuleMetricDatapoints): Self = StObject.set(x, "MetricDatapoints", value.asInstanceOf[js.Any])
    
    inline def setMetricDatapointsUndefined: Self = StObject.set(x, "MetricDatapoints", js.undefined)
    
    inline def setMetricDatapointsVarargs(value: InsightRuleMetricDatapoint*): Self = StObject.set(x, "MetricDatapoints", js.Array(value*))
  }
}
