package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReservationCoverageRequest extends js.Object {
  /**
    * Filters utilization data by dimensions. You can filter by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY    GetReservationCoverage uses the same Expression object as the other operations, but only AND is supported among each dimension. You can nest only one level deep. If there are multiple values for a dimension, they are OR'd together. If you don't provide a SERVICE filter, Cost Explorer defaults to EC2.
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  /**
    * The granularity of the AWS cost data for the reservation. Valid values are MONTHLY and DAILY. If GroupBy is set, Granularity can't be set. If Granularity isn't set, the response object doesn't include Granularity, either MONTHLY or DAILY. The GetReservationCoverage operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Granularity] = js.undefined
  /**
    * You can group the data by the following attributes:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   TENANCY  
    */
  var GroupBy: js.UndefOr[GroupDefinitions] = js.undefined
  /**
    * The measurement that you want your reservation coverage reported in. Valid values are Hour, Unit, and Cost. You can use multiple values in a request.
    */
  var Metrics: js.UndefOr[MetricNames] = js.undefined
  /**
    * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  /**
    * The start and end dates of the period that you want to retrieve data about reservation coverage for. You can retrieve data for a maximum of 13 months: the last 12 months and the current month. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01. 
    */
  var TimePeriod: DateInterval
}

object GetReservationCoverageRequest {
  @scala.inline
  def apply(
    TimePeriod: DateInterval,
    Filter: Expression = null,
    Granularity: Granularity = null,
    GroupBy: GroupDefinitions = null,
    Metrics: MetricNames = null,
    NextPageToken: NextPageToken = null
  ): GetReservationCoverageRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (Granularity != null) __obj.updateDynamic("Granularity")(Granularity.asInstanceOf[js.Any])
    if (GroupBy != null) __obj.updateDynamic("GroupBy")(GroupBy)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    __obj.asInstanceOf[GetReservationCoverageRequest]
  }
}

