package typings
package awsDashSdkLib.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/pi", "PI")
@js.native
object PINs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DataPoint extends js.Object {
    /**
         * The time, in epoch format, associated with a particular Value.
         */
    var Timestamp: ISOTimestamp
    /**
         * The actual value associated with a particular Timestamp.
         */
    var Value: Double
  }
  
  
  trait DescribeDimensionKeysRequest extends js.Object {
    /**
         * The date and time specifying the end of the requested time series data. The value specified is exclusive - data points less than (but not equal to) EndTime will be returned. The value for EndTime must be later than the value for StartTime.
         */
    var EndTime: ISOTimestamp
    /**
         * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy or Partition parameters.   A single filter for any other dimension in this dimension group.  
         */
    var Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined
    /**
         * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights will return all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
         */
    var GroupBy: DimensionGroup
    /**
         * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
         */
    var Identifier: String
    /**
         * The maximum number of items to return in the response. If more items exist than the specified MaxRecords value, a pagination token is included in the response so that the remaining results can be retrieved. 
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
         */
    var Metric: String
    /**
         * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * For each dimension specified in GroupBy, specify a secondary dimension to further subdivide the partition keys in the response.
         */
    var PartitionBy: js.UndefOr[DimensionGroup] = js.undefined
    /**
         * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as one second, or as long as one day (86400 seconds). Valid values are:    1 (one second)    60 (one minute)    300 (five minutes)    3600 (one hour)    86400 (twenty-four hours)   If you don't specify PeriodInSeconds, then Performance Insights will choose a value for you, with a goal of returning roughly 100-200 data points in the response.
         */
    var PeriodInSeconds: js.UndefOr[Integer] = js.undefined
    /**
         * The AWS service for which Performance Insights will return metrics. The only valid value for ServiceType is: RDS 
         */
    var ServiceType: ServiceType
    /**
         * The date and time specifying the beginning of the requested time series data. You can't specify a StartTime that's earlier than 7 days ago. The value specified is inclusive - data points equal to or greater than StartTime will be returned. The value for StartTime must be earlier than the value for EndTime.
         */
    var StartTime: ISOTimestamp
  }
  
  
  trait DescribeDimensionKeysResponse extends js.Object {
    /**
         * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
         */
    var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined
    /**
         * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
         */
    var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined
    /**
         * The dimension keys that were requested.
         */
    var Keys: js.UndefOr[DimensionKeyDescriptionList] = js.undefined
    /**
         * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * If PartitionBy was present in the request, PartitionKeys contains the breakdown of dimension keys by the specified partitions.
         */
    var PartitionKeys: js.UndefOr[ResponsePartitionKeyList] = js.undefined
  }
  
  
  trait DimensionGroup extends js.Object {
    /**
         * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that all of the dimensions in the group were requested, or are present in the response. Valid values for elements in the Dimensions array are:   db.user.id   db.user.name   db.host.id   db.host.name   db.sql.id   db.sql.db_id   db.sql.statement   db.sql.tokenized_id   db.sql_tokenized.id   db.sql_tokenized.db_id   db.sql_tokenized.statement   db.wait_event.name   db.wait_event.type   db.wait_event_type.name  
         */
    var Dimensions: js.UndefOr[StringList] = js.undefined
    /**
         * The name of the dimension group. Valid values are:    db.user     db.host     db.sql     db.sql_tokenized     db.wait_event     db.wait_event_type   
         */
    var Group: String
    /**
         * The maximum number of items to fetch for this dimension group.
         */
    var Limit: js.UndefOr[Limit] = js.undefined
  }
  
  
  trait DimensionKeyDescription extends js.Object {
    /**
         * A map of name-value pairs for the dimensions in the group.
         */
    var Dimensions: js.UndefOr[DimensionMap] = js.undefined
    /**
         * If PartitionBy was specified, PartitionKeys contains the dimensions that were.
         */
    var Partitions: js.UndefOr[MetricValuesList] = js.undefined
    /**
         * The aggregated metric value for the dimension(s), over the requested time range.
         */
    var Total: js.UndefOr[Double] = js.undefined
  }
  
  
  trait DimensionMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[String]
  
  
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
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
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
    var ServiceType: ServiceType
    /**
         * The date and time specifying the beginning of the requested time series data. You can't specify a StartTime that's earlier than 7 days ago. The value specified is inclusive - data points equal to or greater than StartTime will be returned. The value for StartTime must be earlier than the value for EndTime.
         */
    var StartTime: ISOTimestamp
  }
  
  
  trait GetResourceMetricsResponse extends js.Object {
    /**
         * The end time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
         */
    var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.undefined
    /**
         * The start time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
         */
    var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.undefined
    /**
         * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
         */
    var Identifier: js.UndefOr[String] = js.undefined
    /**
         * An array of metric results,, where each array element contains all of the data points for a particular dimension.
         */
    var MetricList: js.UndefOr[MetricKeyDataPointsList] = js.undefined
    /**
         * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait MetricKeyDataPoints extends js.Object {
    /**
         * An array of timestamp-value pairs, representing measurements over a period of time.
         */
    var DataPoints: js.UndefOr[DataPointsList] = js.undefined
    /**
         * The dimension(s) to which the data points apply.
         */
    var Key: js.UndefOr[ResponseResourceMetricKey] = js.undefined
  }
  
  
  trait MetricQuery extends js.Object {
    /**
         * One or more filters to apply in the request. Restrictions:   Any number of filters by the same dimension, as specified in the GroupBy parameter.   A single filter for any other dimension in this dimension group.  
         */
    var Filter: js.UndefOr[MetricQueryFilterMap] = js.undefined
    /**
         * A specification for how to aggregate the data points from a query result. You must specify a valid dimension group. Performance Insights will return all of the dimensions within that group, unless you provide the names of specific dimensions within that group. You can also request that Performance Insights return a limited number of values for a dimension.
         */
    var GroupBy: js.UndefOr[DimensionGroup] = js.undefined
    /**
         * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
         */
    var Metric: String
  }
  
  
  trait MetricQueryFilterMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[String]
  
  
  trait ResponsePartitionKey extends js.Object {
    /**
         * A dimension map that contains the dimension(s) for this partition.
         */
    var Dimensions: DimensionMap
  }
  
  
  trait ResponseResourceMetricKey extends js.Object {
    /**
         * The valid dimensions for the metric.
         */
    var Dimensions: js.UndefOr[DimensionMap] = js.undefined
    /**
         * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
         */
    var Metric: String
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * For a specific time period, retrieve the top N dimension keys for a metric.
       */
    def describeDimensionKeys(): awsDashSdkLib.libRequestMod.Request[DescribeDimensionKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For a specific time period, retrieve the top N dimension keys for a metric.
       */
    def describeDimensionKeys(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDimensionKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDimensionKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For a specific time period, retrieve the top N dimension keys for a metric.
       */
    def describeDimensionKeys(params: DescribeDimensionKeysRequest): awsDashSdkLib.libRequestMod.Request[DescribeDimensionKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For a specific time period, retrieve the top N dimension keys for a metric.
       */
    def describeDimensionKeys(
      params: DescribeDimensionKeysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDimensionKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDimensionKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
       */
    def getResourceMetrics(): awsDashSdkLib.libRequestMod.Request[GetResourceMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
       */
    def getResourceMetrics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourceMetricsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourceMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
       */
    def getResourceMetrics(params: GetResourceMetricsRequest): awsDashSdkLib.libRequestMod.Request[GetResourceMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
       */
    def getResourceMetrics(
      params: GetResourceMetricsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourceMetricsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourceMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DataPointsList = js.Array[DataPoint]
  type DimensionKeyDescriptionList = js.Array[DimensionKeyDescription]
  type Double = scala.Double
  type ISOTimestamp = stdLib.Date
  type Integer = scala.Double
  type Limit = scala.Double
  type MaxResults = scala.Double
  type MetricKeyDataPointsList = js.Array[MetricKeyDataPoints]
  type MetricQueryList = js.Array[MetricQuery]
  type MetricValuesList = js.Array[Double]
  type ResponsePartitionKeyList = js.Array[ResponsePartitionKey]
  type ServiceType = awsDashSdkLib.awsDashSdkLibStrings.RDS | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-02-27` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

