package typings.awsDashSdk.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceMetricsRequest extends js.Object {
  /**
    * The date and time specifiying the end of the requested time series data. The value specified is exclusive - data points less than (but not equal to) EndTime will be returned. The value for EndTime must be later than the value for StartTime.
    */
  var EndTime: ISOTimestamp
  /**
    * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
    */
  var Identifier: String
  /**
    * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsPiMod.MaxResults] = js.undefined
  /**
    * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can optionally specify aggregation and filtering criteria.
    */
  var MetricQueries: MetricQueryList
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:    1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights will choose a value for you, with a goal of returning roughly 100-200 data points in the response.
    */
  var PeriodInSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The AWS service for which Performance Insights will return metrics. The only valid value for ServiceType is: RDS 
    */
  var ServiceType: typings.awsDashSdk.clientsPiMod.ServiceType
  /**
    * The date and time specifying the beginning of the requested time series data. You can't specify a StartTime that's earlier than 7 days ago. The value specified is inclusive - data points equal to or greater than StartTime will be returned. The value for StartTime must be earlier than the value for EndTime.
    */
  var StartTime: ISOTimestamp
}

object GetResourceMetricsRequest {
  @scala.inline
  def apply(
    EndTime: ISOTimestamp,
    Identifier: String,
    MetricQueries: MetricQueryList,
    ServiceType: ServiceType,
    StartTime: ISOTimestamp,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null,
    PeriodInSeconds: js.UndefOr[Integer] = js.undefined
  ): GetResourceMetricsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime, Identifier = Identifier, MetricQueries = MetricQueries, ServiceType = ServiceType.asInstanceOf[js.Any], StartTime = StartTime)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(PeriodInSeconds)) __obj.updateDynamic("PeriodInSeconds")(PeriodInSeconds)
    __obj.asInstanceOf[GetResourceMetricsRequest]
  }
}

