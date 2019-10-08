package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignDateRangeKpiResponse extends js.Object {
  /**
    * The unique identifier for the application that the metric applies to.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the campaign that the metric applies to.
    */
  var CampaignId: __string
  /**
    * The last date and time of the date range that was used to filter the query results, in extended ISO 8601 format. The date range is inclusive.
    */
  var EndTime: __timestampIso8601
  /**
    * The name of the metric, also referred to as a key performance indicator (KPI), that the data was retrieved for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. For a list of valid values, see the Amazon Pinpoint Developer Guide.
    */
  var KpiName: __string
  /**
    * An array of objects that contains the results of the query. Each object contains the value for the metric and metadata about that value.
    */
  var KpiResult: BaseKpiResult
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null for the Campaign Metrics resource. The Campaign Metrics resource returns all results in a single page.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The first date and time of the date range that was used to filter the query results, in extended ISO 8601 format. The date range is inclusive.
    */
  var StartTime: __timestampIso8601
}

object CampaignDateRangeKpiResponse {
  @scala.inline
  def apply(
    ApplicationId: __string,
    CampaignId: __string,
    EndTime: __timestampIso8601,
    KpiName: __string,
    KpiResult: BaseKpiResult,
    StartTime: __timestampIso8601,
    NextToken: __string = null
  ): CampaignDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CampaignId = CampaignId, EndTime = EndTime, KpiName = KpiName, KpiResult = KpiResult, StartTime = StartTime)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[CampaignDateRangeKpiResponse]
  }
}

