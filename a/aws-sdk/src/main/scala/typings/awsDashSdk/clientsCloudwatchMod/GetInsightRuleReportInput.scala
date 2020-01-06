package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightRuleReportInput extends js.Object {
  /**
    * The end time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as yyyy-MM-dd'T'HH:mm:ss. For example, 2019-07-01T23:59:59.
    */
  var EndTime: Timestamp = js.native
  /**
    * The maximum number of contributors to include in the report. The range is 1 to 100. If you omit this, the default of 10 is used.
    */
  var MaxContributorCount: js.UndefOr[InsightRuleUnboundInteger] = js.native
  /**
    * Specifies which metrics to use for aggregation of contributor values for the report. You can specify one or more of the following metrics:    UniqueContributors -- the number of unique contributors for each data point.    MaxContributorValue -- the value of the top contributor for each data point. The identity of the contributor may change for each data point in the graph. If this rule aggregates by COUNT, the top contributor for each data point is the contributor with the most occurrences in that period. If the rule aggregates by SUM, the top contributor is the contributor with the highest sum in the log field specified by the rule's Value, during that period.    SampleCount -- the number of data points matched by the rule.    Sum -- the sum of the values from all contributors during the time period represented by that data point.    Minimum -- the minimum value from a single observation during the time period represented by that data point.    Maximum -- the maximum value from a single observation during the time period represented by that data point.    Average -- the average value from all contributors during the time period represented by that data point.  
    */
  var Metrics: js.UndefOr[InsightRuleMetricList] = js.native
  /**
    * Determines what statistic to use to rank the contributors. Valid values are SUM and MAXIMUM.
    */
  var OrderBy: js.UndefOr[InsightRuleOrderBy] = js.native
  /**
    * The period, in seconds, to use for the statistics in the InsightRuleMetricDatapoint results.
    */
  var Period: typings.awsDashSdk.clientsCloudwatchMod.Period = js.native
  /**
    * The name of the rule that you want to see data from.
    */
  var RuleName: InsightRuleName = js.native
  /**
    * The start time of the data to use in the report. When used in a raw HTTP Query API, it is formatted as yyyy-MM-dd'T'HH:mm:ss. For example, 2019-07-01T23:59:59.
    */
  var StartTime: Timestamp = js.native
}

object GetInsightRuleReportInput {
  @scala.inline
  def apply(
    EndTime: Timestamp,
    Period: Period,
    RuleName: InsightRuleName,
    StartTime: Timestamp,
    MaxContributorCount: Int | Double = null,
    Metrics: InsightRuleMetricList = null,
    OrderBy: InsightRuleOrderBy = null
  ): GetInsightRuleReportInput = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    if (MaxContributorCount != null) __obj.updateDynamic("MaxContributorCount")(MaxContributorCount.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (OrderBy != null) __obj.updateDynamic("OrderBy")(OrderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightRuleReportInput]
  }
}

