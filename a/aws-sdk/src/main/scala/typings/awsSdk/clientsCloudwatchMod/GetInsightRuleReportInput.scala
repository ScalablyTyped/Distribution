package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightRuleReportInput extends StObject {
  
  /**
    * The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as yyyy-MM-dd'T'HH:mm:ss. For example, 2019-07-01T23:59:59.
    */
  var EndTime: js.Date
  
  /**
    * The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the default of 10 is used.
    */
  var MaxContributorCount: js.UndefOr[InsightRuleUnboundInteger] = js.undefined
  
  /**
    * Specifies which metrics to use for aggregation of contributor values for the report. You can specify one or more of the following metrics:    UniqueContributors -- the number of unique contributors for each data point.    MaxContributorValue -- the value of the top contributor for each data point. The identity of the contributor might change for each data point in the graph. If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the highest sum in the log field specified by the rule's Value, during that period.    SampleCount -- the number of data points matched by the rule.    Sum -- the sum of the values from all contributors during the time period represented by that data point.    Minimum -- the minimum value from a single observation during the time period represented by that data point.    Maximum -- the maximum value from a single observation during the time period represented by that data point.    Average -- the average value from all contributors during the time period represented by that data point.  
    */
  var Metrics: js.UndefOr[InsightRuleMetricList] = js.undefined
  
  /**
    * Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
    */
  var OrderBy: js.UndefOr[InsightRuleOrderBy] = js.undefined
  
  /**
    * The period, in seconds, to use for the statistics in the InsightRuleMetricDatapoint results.
    */
  var Period: typings.awsSdk.clientsCloudwatchMod.Period
  
  /**
    * The name of the rule that you want to see data from.
    */
  var RuleName: InsightRuleName
  
  /**
    * The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as yyyy-MM-dd'T'HH:mm:ss. For example, 2019-07-01T23:59:59.
    */
  var StartTime: js.Date
}
object GetInsightRuleReportInput {
  
  inline def apply(EndTime: js.Date, Period: Period, RuleName: InsightRuleName, StartTime: js.Date): GetInsightRuleReportInput = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightRuleReportInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightRuleReportInput] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setMaxContributorCount(value: InsightRuleUnboundInteger): Self = StObject.set(x, "MaxContributorCount", value.asInstanceOf[js.Any])
    
    inline def setMaxContributorCountUndefined: Self = StObject.set(x, "MaxContributorCount", js.undefined)
    
    inline def setMetrics(value: InsightRuleMetricList): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: InsightRuleMetricName*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setOrderBy(value: InsightRuleOrderBy): Self = StObject.set(x, "OrderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "OrderBy", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: InsightRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
