package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignDateRangeKpiRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: __string
  /**
    * The last date to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in ISO 8601 format, for example: 2019-07-19 for July 19, 2019. To define a date range that ends at a specific time, specify the date and time in ISO 8601 format, for example: 2019-07-19T20:00Z for 8:00 PM July 19, 2019.
    */
  var EndTime: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * The name of the metric, also referred to as a key performance indicator (KPI), to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are attempted-deliveries and successful-deliveries. For a list of valid values, see the Amazon Pinpoint Developer Guide.
    */
  var KpiName: __string
  /**
    * The NextToken string that specifies which page of results to return in a paginated response. This parameter is currently not supported by the App Metrics and Campaign Metrics resources.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is currently not supported by the App Metrics and Campaign Metrics resources.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
  /**
    * The first date to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in ISO 8601 format, for example: 2019-07-15 for July 15, 2019. To define a date range that begins at a specific time, specify the date and time in ISO 8601 format, for example: 2019-07-15T16:00Z for 4:00 PM July 15, 2019.
    */
  var StartTime: js.UndefOr[__timestampIso8601] = js.undefined
}

object GetCampaignDateRangeKpiRequest {
  @scala.inline
  def apply(
    ApplicationId: __string,
    CampaignId: __string,
    KpiName: __string,
    EndTime: __timestampIso8601 = null,
    NextToken: __string = null,
    PageSize: __string = null,
    StartTime: __timestampIso8601 = null
  ): GetCampaignDateRangeKpiRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CampaignId = CampaignId, KpiName = KpiName)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[GetCampaignDateRangeKpiRequest]
  }
}

