package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationDateRangeKpiRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The last date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format, for example: 2019-07-19T00:00:00Z for July 19, 2019 and 2019-07-19T20:00:00Z for 8:00 PM July 19, 2019.
    */
  var EndTime: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * The name of the metric, also referred to as a key performance indicator (KPI), to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are email-open-rate and successful-delivery-rate. For a list of valid values, see the Amazon Pinpoint Developer Guide.
    */
  var KpiName: __string
  /**
    * The NextToken string that specifies which page of results to return in a paginated response. This parameter is currently not supported by the Application Metrics and Campaign Metrics resources.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is currently not supported by the Application Metrics and Campaign Metrics resources.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
  /**
    * The first date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format, for example: 2019-07-15T00:00:00Z for July 15, 2019 and 2019-07-15T16:00:00Z for 4:00 PM July 15, 2019.
    */
  var StartTime: js.UndefOr[__timestampIso8601] = js.undefined
}

object GetApplicationDateRangeKpiRequest {
  @scala.inline
  def apply(
    ApplicationId: __string,
    KpiName: __string,
    EndTime: __timestampIso8601 = null,
    NextToken: __string = null,
    PageSize: __string = null,
    StartTime: __timestampIso8601 = null
  ): GetApplicationDateRangeKpiRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, KpiName = KpiName)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[GetApplicationDateRangeKpiRequest]
  }
}

