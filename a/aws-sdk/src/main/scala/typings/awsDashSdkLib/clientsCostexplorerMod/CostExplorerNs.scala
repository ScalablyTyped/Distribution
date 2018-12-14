package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/costexplorer", "CostExplorer")
@js.native
object CostExplorerNs extends js.Object {
  
  trait Attributes
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Coverage extends js.Object {
    /**
         * The amount of cost that the reservation covered.
         */
    var CoverageCost: js.UndefOr[CoverageCost] = js.undefined
    /**
         * The amount of instance usage that the reservation covered, in hours.
         */
    var CoverageHours: js.UndefOr[CoverageHours] = js.undefined
    /**
         * The amount of instance usage that the reservation covered, in normalized units.
         */
    var CoverageNormalizedUnits: js.UndefOr[CoverageNormalizedUnits] = js.undefined
  }
  
  
  trait CoverageByTime extends js.Object {
    /**
         * The groups of instances that the reservation covered.
         */
    var Groups: js.UndefOr[ReservationCoverageGroups] = js.undefined
    /**
         * The period that this coverage was used over.
         */
    var TimePeriod: js.UndefOr[DateInterval] = js.undefined
    /**
         * The total reservation coverage, in hours.
         */
    var Total: js.UndefOr[Coverage] = js.undefined
  }
  
  
  trait CoverageCost extends js.Object {
    /**
         * How much an On-Demand instance cost.
         */
    var OnDemandCost: js.UndefOr[OnDemandCost] = js.undefined
  }
  
  
  trait CoverageHours extends js.Object {
    /**
         * The percentage of instance hours that a reservation covered.
         */
    var CoverageHoursPercentage: js.UndefOr[CoverageHoursPercentage] = js.undefined
    /**
         * The number of instance running hours that On-Demand Instances covered.
         */
    var OnDemandHours: js.UndefOr[OnDemandHours] = js.undefined
    /**
         * The number of instance running hours that reservations covered.
         */
    var ReservedHours: js.UndefOr[ReservedHours] = js.undefined
    /**
         * The total instance usage, in hours.
         */
    var TotalRunningHours: js.UndefOr[TotalRunningHours] = js.undefined
  }
  
  
  trait CoverageNormalizedUnits extends js.Object {
    /**
         * The percentage of your used instance normalized units that a reservation covers.
         */
    var CoverageNormalizedUnitsPercentage: js.UndefOr[CoverageNormalizedUnitsPercentage] = js.undefined
    /**
         * The number of normalized units that are covered by On-Demand Instances instead of a reservation.
         */
    var OnDemandNormalizedUnits: js.UndefOr[OnDemandNormalizedUnits] = js.undefined
    /**
         * The number of normalized units that a reservation covers.
         */
    var ReservedNormalizedUnits: js.UndefOr[ReservedNormalizedUnits] = js.undefined
    /**
         * The total number of normalized units that you used.
         */
    var TotalRunningNormalizedUnits: js.UndefOr[TotalRunningNormalizedUnits] = js.undefined
  }
  
  
  trait DateInterval extends js.Object {
    /**
         * The end of the time period that you want the usage and costs for. The end date is exclusive. For example, if end is 2017-05-01, AWS retrieves cost and usage data from the start date up to, but not including, 2017-05-01.
         */
    var End: YearMonthDay
    /**
         * The beginning of the time period that you want the usage and costs for. The start date is inclusive. For example, if start is 2017-01-01, AWS retrieves cost and usage data starting at 2017-01-01 up to the end date.
         */
    var Start: YearMonthDay
  }
  
  
  trait DimensionValues extends js.Object {
    /**
         * The names of the metadata types that you can use to filter and group your results. For example, AZ returns a list of Availability Zones.
         */
    var Key: js.UndefOr[Dimension] = js.undefined
    /**
         * The metadata values that you can use to filter and group your results. You can use GetDimensionValues to find specific values. Valid values for the SERVICE dimension are Amazon Elastic Compute Cloud - Compute, Amazon Elasticsearch Service, Amazon ElastiCache, Amazon Redshift, and Amazon Relational Database Service.
         */
    var Values: js.UndefOr[Values] = js.undefined
  }
  
  
  trait DimensionValuesWithAttributes extends js.Object {
    /**
         * The attribute that applies to a specific Dimension.
         */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
         * The value of a dimension with a specific attribute.
         */
    var Value: js.UndefOr[Value] = js.undefined
  }
  
  
  trait EC2InstanceDetails extends js.Object {
    /**
         * The Availability Zone of the recommended reservation.
         */
    var AvailabilityZone: js.UndefOr[GenericString] = js.undefined
    /**
         * Whether the recommendation is for a current-generation instance. 
         */
    var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The instance family of the recommended reservation.
         */
    var Family: js.UndefOr[GenericString] = js.undefined
    /**
         * The type of instance that AWS recommends.
         */
    var InstanceType: js.UndefOr[GenericString] = js.undefined
    /**
         * The platform of the recommended reservation. The platform is the specific combination of operating system, license model, and software on an instance.
         */
    var Platform: js.UndefOr[GenericString] = js.undefined
    /**
         * The AWS Region of the recommended reservation.
         */
    var Region: js.UndefOr[GenericString] = js.undefined
    /**
         * Whether the recommended reservation is size flexible.
         */
    var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * Whether the recommended reservation is dedicated or shared.
         */
    var Tenancy: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait EC2Specification extends js.Object {
    /**
         * Whether you want a recommendation for standard or convertible reservations.
         */
    var OfferingClass: js.UndefOr[OfferingClass] = js.undefined
  }
  
  
  trait ESInstanceDetails extends js.Object {
    /**
         * Whether the recommendation is for a current-generation instance.
         */
    var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The class of instance that AWS recommends.
         */
    var InstanceClass: js.UndefOr[GenericString] = js.undefined
    /**
         * The size of instance that AWS recommends.
         */
    var InstanceSize: js.UndefOr[GenericString] = js.undefined
    /**
         * The AWS Region of the recommended reservation.
         */
    var Region: js.UndefOr[GenericString] = js.undefined
    /**
         * Whether the recommended reservation is size flexible.
         */
    var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  }
  
  
  trait ElastiCacheInstanceDetails extends js.Object {
    /**
         * Whether the recommendation is for a current generation instance.
         */
    var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The instance family of the recommended reservation.
         */
    var Family: js.UndefOr[GenericString] = js.undefined
    /**
         * The type of node that AWS recommends.
         */
    var NodeType: js.UndefOr[GenericString] = js.undefined
    /**
         * The description of the recommended reservation.
         */
    var ProductDescription: js.UndefOr[GenericString] = js.undefined
    /**
         * The AWS Region of the recommended reservation.
         */
    var Region: js.UndefOr[GenericString] = js.undefined
    /**
         * Whether the recommended reservation is size flexible.
         */
    var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  }
  
  
  trait Expression extends js.Object {
    /**
         * Return results that match both Dimension objects.
         */
    var And: js.UndefOr[Expressions] = js.undefined
    /**
         * The specific Dimension to use for Expression.
         */
    var Dimensions: js.UndefOr[DimensionValues] = js.undefined
    /**
         * Return results that don't match a Dimension object.
         */
    var Not: js.UndefOr[Expression] = js.undefined
    /**
         * Return results that match either Dimension object.
         */
    var Or: js.UndefOr[Expressions] = js.undefined
    /**
         * The specific Tag to use for Expression.
         */
    var Tags: js.UndefOr[TagValues] = js.undefined
  }
  
  
  trait ForecastResult extends js.Object {
    /**
         * The mean value of the forecast.
         */
    var MeanValue: js.UndefOr[GenericString] = js.undefined
    /**
         * The lower limit for the prediction interval. 
         */
    var PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.undefined
    /**
         * The upper limit for the prediction interval. 
         */
    var PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.undefined
    /**
         * The period of time that the forecast covers.
         */
    var TimePeriod: js.UndefOr[DateInterval] = js.undefined
  }
  
  
  trait GetCostAndUsageRequest extends js.Object {
    /**
         * Filters AWS costs by different dimensions. For example, you can specify SERVICE and LINKED_ACCOUNT and get the costs that are associated with that account's usage of that service. You can nest Expression objects to define any combination of dimension filters. For more information, see Expression. 
         */
    var Filter: js.UndefOr[Expression] = js.undefined
    /**
         * Sets the AWS cost granularity to MONTHLY or DAILY. If Granularity isn't set, the response object doesn't include the Granularity, either MONTHLY or DAILY.  The GetCostAndUsageRequest operation supports only DAILY and MONTHLY granularities.
         */
    var Granularity: js.UndefOr[Granularity] = js.undefined
    /**
         * You can group AWS costs using up to two different groups, either dimensions, tag keys, or both. When you group by tag key, you get all tag values, including empty strings. Valid values are AZ, INSTANCE_TYPE, LEGAL_ENTITY_NAME, LINKED_ACCOUNT, OPERATION, PLATFORM, PURCHASE_TYPE, SERVICE, TAGS, TENANCY, and USAGE_TYPE.
         */
    var GroupBy: js.UndefOr[GroupDefinitions] = js.undefined
    /**
         * Which metrics are returned in the query. For more information about blended and unblended rates, see Why does the "blended" annotation appear on some line items in my bill?.  Valid values are AmortizedCost, BlendedCost, NetAmortizedCost, NetUnblendedCost, NormalizedUsageAmount, UnblendedCost, and UsageQuantity.   If you return the UsageQuantity metric, the service aggregates all usage numbers without taking into account the units. For example, if you aggregate usageQuantity across all of Amazon EC2, the results aren't meaningful because Amazon EC2 compute hours and data transfer are measured in different units (for example, hours vs. GB). To get more meaningful UsageQuantity metrics, filter by UsageType or UsageTypeGroups.    Metrics is required for GetCostAndUsage requests.
         */
    var Metrics: js.UndefOr[MetricNames] = js.undefined
    /**
         * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * Sets the start and end dates for retrieving AWS costs. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
         */
    var TimePeriod: js.UndefOr[DateInterval] = js.undefined
  }
  
  
  trait GetCostAndUsageResponse extends js.Object {
    /**
         * The groups that are specified by the Filter or GroupBy parameters in the request.
         */
    var GroupDefinitions: js.UndefOr[GroupDefinitions] = js.undefined
    /**
         * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The time period that is covered by the results in the response.
         */
    var ResultsByTime: js.UndefOr[ResultsByTime] = js.undefined
  }
  
  
  trait GetCostForecastRequest extends js.Object {
    /**
         * The filters that you want to use to filter your forecast. Cost Explorer API supports all of the Cost Explorer filters.
         */
    var Filter: js.UndefOr[Expression] = js.undefined
    /**
         * How granular you want the forecast to be. You can get 3 months of DAILY forecasts or 12 months of MONTHLY forecasts. The GetCostForecast operation supports only DAILY and MONTHLY granularities.
         */
    var Granularity: Granularity
    /**
         * Which metric Cost Explorer uses to create your forecast. For more information about blended and unblended rates, see Why does the "blended" annotation appear on some line items in my bill?.  Valid values for a GetCostForecast call are the following:   AmortizedCost   BlendedCost   NetAmortizedCost   NetUnblendedCost   UnblendedCost  
         */
    var Metric: Metric
    /**
         * Cost Explorer always returns the mean forecast as a single point. You can request a prediction interval around the mean by specifying a confidence level. The higher the confidence level, the more confident Cost Explorer is about the actual value falling in the prediction interval. Higher confidence levels result in wider prediction intervals.
         */
    var PredictionIntervalLevel: js.UndefOr[PredictionIntervalLevel] = js.undefined
    /**
         * The period of time that you want the forecast to cover.
         */
    var TimePeriod: DateInterval
  }
  
  
  trait GetCostForecastResponse extends js.Object {
    /**
         * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
         */
    var ForecastResultsByTime: js.UndefOr[ForecastResultsByTime] = js.undefined
    /**
         * How much you are forecasted to spend over the forecast period, in USD.
         */
    var Total: js.UndefOr[MetricValue] = js.undefined
  }
  
  
  trait GetDimensionValuesRequest extends js.Object {
    /**
         * The context for the call to GetDimensionValues. This can be RESERVATIONS or COST_AND_USAGE. The default value is COST_AND_USAGE. If the context is set to RESERVATIONS, the resulting dimension values can be used in the GetReservationUtilization operation. If the context is set to COST_AND_USAGE, the resulting dimension values can be used in the GetCostAndUsage operation. If you set the context to COST_AND_USAGE, you can use the following dimensions for searching:   AZ - The Availability Zone. An example is us-east-1a.   DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.   INSTANCE_TYPE - The type of Amazon EC2 instance. An example is m4.xlarge.   LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the AWS ID of the member account.   OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.   OPERATION - The action performed. Examples include RunInstance and CreateBucket.   PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.   PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include On-Demand Instances and Standard Reserved Instances.   SERVICE - The AWS service such as Amazon DynamoDB.   USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the GetDimensionValues operation includes a unit attribute. Examples include GB and Hrs.   USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The response for this operation includes a unit attribute.   RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.   If you set the context to RESERVATIONS, you can use the following dimensions for searching:   AZ - The Availability Zone. An example is us-east-1a.   CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.   DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are SingleAZ and MultiAZ.   INSTANCE_TYPE - The type of Amazon EC2 instance. An example is m4.xlarge.   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the AWS ID of the member account.   PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.   REGION - The AWS Region.   SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability Zone.   TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).   TENANCY - The tenancy of a resource. Examples are shared or dedicated.  
         */
    var Context: js.UndefOr[Context] = js.undefined
    /**
         * The name of the dimension. Each Dimension is available for a different Context. For more information, see Context.
         */
    var Dimension: Dimension
    /**
         * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The value that you want to search the filter values for.
         */
    var SearchString: js.UndefOr[SearchString] = js.undefined
    /**
         * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
         */
    var TimePeriod: DateInterval
  }
  
  
  trait GetDimensionValuesResponse extends js.Object {
    /**
         * The filters that you used to filter your request. Some dimensions are available only for a specific context. If you set the context to COST_AND_USAGE, you can use the following dimensions for searching:   AZ - The Availability Zone. An example is us-east-1a.   DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.   INSTANCE_TYPE - The type of Amazon EC2 instance. An example is m4.xlarge.   LEGAL_ENTITY_NAME - The name of the organization that sells you AWS services, such as Amazon Web Services.   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the AWS ID of the member account.   OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.   OPERATION - The action performed. Examples include RunInstance and CreateBucket.   PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.   PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include On-Demand Instances and Standard Reserved Instances.   SERVICE - The AWS service such as Amazon DynamoDB.   USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the GetDimensionValues operation includes a unit attribute. Examples include GB and Hrs.   USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The response for this operation includes a unit attribute.   RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.   If you set the context to RESERVATIONS, you can use the following dimensions for searching:   AZ - The Availability Zone. An example is us-east-1a.   CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.   DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are SingleAZ and MultiAZ.   INSTANCE_TYPE - The type of Amazon EC2 instance. An example is m4.xlarge.   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the AWS ID of the member account.   PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.   REGION - The AWS Region.   SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability Zone.   TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).   TENANCY - The tenancy of a resource. Examples are shared or dedicated.  
         */
    var DimensionValues: DimensionValuesWithAttributesList
    /**
         * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The number of results that AWS returned at one time.
         */
    var ReturnSize: PageSize
    /**
         * The total number of search results.
         */
    var TotalSize: PageSize
  }
  
  
  trait GetReservationCoverageRequest extends js.Object {
    /**
         * Filters utilization data by dimensions. You can filter by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY    GetReservationCoverage uses the same Expression object as the other operations, but only AND is supported among each dimension. You can nest only one level deep. If there are multiple values for a dimension, they are OR'd together. If you don't provide a SERVICE filter, Cost Explorer defaults to EC2.
         */
    var Filter: js.UndefOr[Expression] = js.undefined
    /**
         * The granularity of the AWS cost data for the reservation. Valid values are MONTHLY and DAILY. If GroupBy is set, Granularity can't be set. If Granularity isn't set, the response object doesn't include Granularity, either MONTHLY or DAILY. The GetReservationCoverage operation supports only DAILY and MONTHLY granularities.
         */
    var Granularity: js.UndefOr[Granularity] = js.undefined
    /**
         * You can group the data by the following attributes:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   TAG   TENANCY  
         */
    var GroupBy: js.UndefOr[GroupDefinitions] = js.undefined
    var Metrics: js.UndefOr[MetricNames] = js.undefined
    /**
         * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The start and end dates of the period that you want to retrieve data about reservation coverage for. You can retrieve data for a maximum of 13 months: the last 12 months and the current month. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01. 
         */
    var TimePeriod: DateInterval
  }
  
  
  trait GetReservationCoverageResponse extends js.Object {
    /**
         * The amount of time that your reservations covered.
         */
    var CoveragesByTime: CoveragesByTime
    /**
         * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The total amount of instance usage that a reservation covered.
         */
    var Total: js.UndefOr[Coverage] = js.undefined
  }
  
  
  trait GetReservationPurchaseRecommendationRequest extends js.Object {
    /**
         * The account ID that is associated with the recommendation. 
         */
    var AccountId: js.UndefOr[GenericString] = js.undefined
    /**
         * The account scope that you want recommendations for. PAYER means that AWS includes the master account and any member accounts when it calculates its recommendations. LINKED means that AWS includes only member accounts when it calculates its recommendations. Valid values are PAYER and LINKED.
         */
    var AccountScope: js.UndefOr[AccountScope] = js.undefined
    /**
         * The number of previous days that you want AWS to consider when it calculates your recommendations.
         */
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined
    /**
         * The pagination token that indicates the next set of results that you want to retrieve.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The number of recommendations that you want returned in a single response object.
         */
    var PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
    /**
         * The reservation purchase option that you want recommendations for.
         */
    var PaymentOption: js.UndefOr[PaymentOption] = js.undefined
    /**
         * The specific service that you want recommendations for.
         */
    var Service: GenericString
    /**
         * The hardware specifications for the service instances that you want recommendations for, such as standard or convertible Amazon EC2 instances.
         */
    var ServiceSpecification: js.UndefOr[ServiceSpecification] = js.undefined
    /**
         * The reservation term that you want recommendations for.
         */
    var TermInYears: js.UndefOr[TermInYears] = js.undefined
  }
  
  
  trait GetReservationPurchaseRecommendationResponse extends js.Object {
    /**
         * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this recommendation.
         */
    var Metadata: js.UndefOr[ReservationPurchaseRecommendationMetadata] = js.undefined
    /**
         * The pagination token for the next set of retrievable results.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * Recommendations for reservations to purchase.
         */
    var Recommendations: js.UndefOr[ReservationPurchaseRecommendations] = js.undefined
  }
  
  
  trait GetReservationUtilizationRequest extends js.Object {
    /**
         * Filters utilization data by dimensions. You can filter by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   SCOPE   TENANCY    GetReservationUtilization uses the same Expression object as the other operations, but only AND is supported among each dimension, and nesting is supported up to only one level deep. If there are multiple values for a dimension, they are OR'd together.
         */
    var Filter: js.UndefOr[Expression] = js.undefined
    /**
         * If GroupBy is set, Granularity can't be set. If Granularity isn't set, the response object doesn't include Granularity, either MONTHLY or DAILY. If both GroupBy and Granularity aren't set, GetReservationUtilization defaults to DAILY. The GetReservationUtilization operation supports only DAILY and MONTHLY granularities.
         */
    var Granularity: js.UndefOr[Granularity] = js.undefined
    /**
         * Groups only by SUBSCRIPTION_ID. Metadata is included.
         */
    var GroupBy: js.UndefOr[GroupDefinitions] = js.undefined
    /**
         * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * Sets the start and end dates for retrieving RI utilization. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01. 
         */
    var TimePeriod: DateInterval
  }
  
  
  trait GetReservationUtilizationResponse extends js.Object {
    /**
         * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The total amount of time that you used your RIs.
         */
    var Total: js.UndefOr[ReservationAggregates] = js.undefined
    /**
         * The amount of time that you used your RIs.
         */
    var UtilizationsByTime: UtilizationsByTime
  }
  
  
  trait GetTagsRequest extends js.Object {
    /**
         * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The value that you want to search for.
         */
    var SearchString: js.UndefOr[SearchString] = js.undefined
    /**
         * The key of the tag that you want to return values for.
         */
    var TagKey: js.UndefOr[TagKey] = js.undefined
    /**
         * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
         */
    var TimePeriod: DateInterval
  }
  
  
  trait GetTagsResponse extends js.Object {
    /**
         * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
         */
    var NextPageToken: js.UndefOr[NextPageToken] = js.undefined
    /**
         * The number of query results that AWS returns at a time.
         */
    var ReturnSize: PageSize
    /**
         * The tags that match your request.
         */
    var Tags: TagList
    /**
         * The total number of query results.
         */
    var TotalSize: PageSize
  }
  
  
  trait Group extends js.Object {
    /**
         * The keys that are included in this group.
         */
    var Keys: js.UndefOr[Keys] = js.undefined
    /**
         * The metrics that are included in this group.
         */
    var Metrics: js.UndefOr[Metrics] = js.undefined
  }
  
  
  trait GroupDefinition extends js.Object {
    /**
         * The string that represents a key for a specified group.
         */
    var Key: js.UndefOr[GroupDefinitionKey] = js.undefined
    /**
         * The string that represents the type of group.
         */
    var Type: js.UndefOr[GroupDefinitionType] = js.undefined
  }
  
  
  trait InstanceDetails extends js.Object {
    /**
         * The Amazon EC2 instances that AWS recommends that you purchase.
         */
    var EC2InstanceDetails: js.UndefOr[EC2InstanceDetails] = js.undefined
    /**
         * The Amazon ES instances that AWS recommends that you purchase.
         */
    var ESInstanceDetails: js.UndefOr[ESInstanceDetails] = js.undefined
    /**
         * The ElastiCache instances that AWS recommends that you purchase.
         */
    var ElastiCacheInstanceDetails: js.UndefOr[ElastiCacheInstanceDetails] = js.undefined
    /**
         * The Amazon RDS instances that AWS recommends that you purchase.
         */
    var RDSInstanceDetails: js.UndefOr[RDSInstanceDetails] = js.undefined
    /**
         * The Amazon Redshift instances that AWS recommends that you purchase.
         */
    var RedshiftInstanceDetails: js.UndefOr[RedshiftInstanceDetails] = js.undefined
  }
  
  
  trait MetricValue extends js.Object {
    /**
         * The actual number that represents the metric.
         */
    var Amount: js.UndefOr[MetricAmount] = js.undefined
    /**
         * The unit that the metric is given in.
         */
    var Unit: js.UndefOr[MetricUnit] = js.undefined
  }
  
  
  trait Metrics
    extends /* key */ org.scalablytyped.runtime.StringDictionary[MetricValue]
  
  
  trait RDSInstanceDetails extends js.Object {
    /**
         * Whether the recommendation is for a current-generation instance. 
         */
    var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The database edition that the recommended reservation supports.
         */
    var DatabaseEdition: js.UndefOr[GenericString] = js.undefined
    /**
         * The database engine that the recommended reservation supports.
         */
    var DatabaseEngine: js.UndefOr[GenericString] = js.undefined
    /**
         * Whether the recommendation is for a reservation in a single Availability Zone or a reservation with a backup in a second Availability Zone.
         */
    var DeploymentOption: js.UndefOr[GenericString] = js.undefined
    /**
         * The instance family of the recommended reservation.
         */
    var Family: js.UndefOr[GenericString] = js.undefined
    /**
         * The type of instance that AWS recommends.
         */
    var InstanceType: js.UndefOr[GenericString] = js.undefined
    /**
         * The license model that the recommended reservation supports.
         */
    var LicenseModel: js.UndefOr[GenericString] = js.undefined
    /**
         * The AWS Region of the recommended reservation.
         */
    var Region: js.UndefOr[GenericString] = js.undefined
    /**
         * Whether the recommended reservation is size flexible.
         */
    var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  }
  
  
  trait RedshiftInstanceDetails extends js.Object {
    /**
         * Whether the recommendation is for a current-generation instance.
         */
    var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
    /**
         * The instance family of the recommended reservation.
         */
    var Family: js.UndefOr[GenericString] = js.undefined
    /**
         * The type of node that AWS recommends.
         */
    var NodeType: js.UndefOr[GenericString] = js.undefined
    /**
         * The AWS Region of the recommended reservation.
         */
    var Region: js.UndefOr[GenericString] = js.undefined
    /**
         * Whether the recommended reservation is size flexible.
         */
    var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  }
  
  
  trait ReservationAggregates extends js.Object {
    /**
         * The monthly cost of your reservation, amortized over the reservation period.
         */
    var AmortizedRecurringFee: js.UndefOr[AmortizedRecurringFee] = js.undefined
    /**
         * The upfront cost of your reservation, amortized over the reservation period.
         */
    var AmortizedUpfrontFee: js.UndefOr[AmortizedUpfrontFee] = js.undefined
    /**
         * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting TotalAmortizedFee from OnDemandCostOfRIHoursUsed.
         */
    var NetRISavings: js.UndefOr[NetRISavings] = js.undefined
    /**
         * How much your reservation would cost if charged On-Demand rates.
         */
    var OnDemandCostOfRIHoursUsed: js.UndefOr[OnDemandCostOfRIHoursUsed] = js.undefined
    /**
         * How many reservation hours that you purchased.
         */
    var PurchasedHours: js.UndefOr[PurchasedHours] = js.undefined
    /**
         * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
         */
    var PurchasedUnits: js.UndefOr[PurchasedUnits] = js.undefined
    /**
         * The total number of reservation hours that you used.
         */
    var TotalActualHours: js.UndefOr[TotalActualHours] = js.undefined
    /**
         * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
         */
    var TotalActualUnits: js.UndefOr[TotalActualUnits] = js.undefined
    /**
         * The total cost of your reservation, amortized over the reservation period.
         */
    var TotalAmortizedFee: js.UndefOr[TotalAmortizedFee] = js.undefined
    /**
         * How much you could save if you use your entire reservation.
         */
    var TotalPotentialRISavings: js.UndefOr[TotalPotentialRISavings] = js.undefined
    /**
         * The number of reservation hours that you didn't use.
         */
    var UnusedHours: js.UndefOr[UnusedHours] = js.undefined
    /**
         * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
         */
    var UnusedUnits: js.UndefOr[UnusedUnits] = js.undefined
    /**
         * The percentage of reservation time that you used.
         */
    var UtilizationPercentage: js.UndefOr[UtilizationPercentage] = js.undefined
    /**
         * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
         */
    var UtilizationPercentageInUnits: js.UndefOr[UtilizationPercentageInUnits] = js.undefined
  }
  
  
  trait ReservationCoverageGroup extends js.Object {
    /**
         * The attributes for this group of reservations.
         */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
         * How much instance usage this group of reservations covered.
         */
    var Coverage: js.UndefOr[Coverage] = js.undefined
  }
  
  
  trait ReservationPurchaseRecommendation extends js.Object {
    /**
         * The account scope that AWS recommends that you purchase this instance for. For example, you can purchase this reservation for an entire organization in AWS Organizations.
         */
    var AccountScope: js.UndefOr[AccountScope] = js.undefined
    /**
         * How many days of previous usage that AWS considers when making this recommendation.
         */
    var LookbackPeriodInDays: js.UndefOr[LookbackPeriodInDays] = js.undefined
    /**
         * The payment option for the reservation. For example, AllUpfront or NoUpfront.
         */
    var PaymentOption: js.UndefOr[PaymentOption] = js.undefined
    /**
         * Details about the recommended purchases.
         */
    var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails] = js.undefined
    /**
         * A summary about the recommended purchase.
         */
    var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary] = js.undefined
    /**
         * Hardware specifications for the service that you want recommendations for.
         */
    var ServiceSpecification: js.UndefOr[ServiceSpecification] = js.undefined
    /**
         * The term of the reservation that you want recommendations for, in years.
         */
    var TermInYears: js.UndefOr[TermInYears] = js.undefined
  }
  
  
  trait ReservationPurchaseRecommendationDetail extends js.Object {
    var AccountId: js.UndefOr[GenericString] = js.undefined
    /**
         * The average number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
         */
    var AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
    /**
         * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
         */
    var AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
    /**
         * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
         */
    var AverageUtilization: js.UndefOr[GenericString] = js.undefined
    /**
         * The currency code that AWS used to calculate the costs for this instance.
         */
    var CurrencyCode: js.UndefOr[GenericString] = js.undefined
    /**
         * How long AWS estimates that it takes for this instance to start saving you money, in months.
         */
    var EstimatedBreakEvenInMonths: js.UndefOr[GenericString] = js.undefined
    /**
         * How much AWS estimates that you spend on On-Demand Instances in a month.
         */
    var EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString] = js.undefined
    /**
         * How much AWS estimates that this specific recommendation could save you in a month.
         */
    var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
    /**
         * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your overall costs.
         */
    var EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined
    /**
         * How much AWS estimates that you would have spent for all usage during the specified historical period if you had had a reservation.
         */
    var EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString] = js.undefined
    /**
         * Details about the instances that AWS recommends that you purchase.
         */
    var InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined
    /**
         * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
         */
    var MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
    /**
         * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
         */
    var MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
    /**
         * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
         */
    var MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.undefined
    /**
         * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
         */
    var MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.undefined
    /**
         * The number of normalized units that AWS recommends that you purchase.
         */
    var RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString] = js.undefined
    /**
         * The number of instances that AWS recommends that you purchase.
         */
    var RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString] = js.undefined
    /**
         * How much purchasing this instance costs you on a monthly basis.
         */
    var RecurringStandardMonthlyCost: js.UndefOr[GenericString] = js.undefined
    /**
         * How much purchasing this instance costs you upfront.
         */
    var UpfrontCost: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ReservationPurchaseRecommendationMetadata extends js.Object {
    /**
         * The time stamp for when AWS made this recommendation.
         */
    var GenerationTimestamp: js.UndefOr[GenericString] = js.undefined
    /**
         * The ID for this specific recommendation.
         */
    var RecommendationId: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ReservationPurchaseRecommendationSummary extends js.Object {
    /**
         * The currency code used for this recommendation.
         */
    var CurrencyCode: js.UndefOr[GenericString] = js.undefined
    /**
         * The total amount that AWS estimates that this recommendation could save you in a month.
         */
    var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.undefined
    /**
         * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your costs.
         */
    var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.undefined
  }
  
  
  trait ReservationUtilizationGroup extends js.Object {
    /**
         * The attributes for this group of reservations.
         */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
         * The key for a specific reservation attribute.
         */
    var Key: js.UndefOr[ReservationGroupKey] = js.undefined
    /**
         * How much you used this group of reservations.
         */
    var Utilization: js.UndefOr[ReservationAggregates] = js.undefined
    /**
         * The value of a specific reservation attribute.
         */
    var Value: js.UndefOr[ReservationGroupValue] = js.undefined
  }
  
  
  trait ResultByTime extends js.Object {
    /**
         * Whether the result is estimated.
         */
    var Estimated: js.UndefOr[Estimated] = js.undefined
    /**
         * The groups that this time period includes.
         */
    var Groups: js.UndefOr[Groups] = js.undefined
    /**
         * The time period that the result covers.
         */
    var TimePeriod: js.UndefOr[DateInterval] = js.undefined
    /**
         * The total amount of cost or usage accrued during the time period.
         */
    var Total: js.UndefOr[Metrics] = js.undefined
  }
  
  
  trait ServiceSpecification extends js.Object {
    /**
         * The Amazon EC2 hardware specifications that you want AWS to provide recommendations for.
         */
    var EC2Specification: js.UndefOr[EC2Specification] = js.undefined
  }
  
  
  trait TagValues extends js.Object {
    /**
         * The key for the tag.
         */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
         * The specific value of the tag.
         */
    var Values: js.UndefOr[Values] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
       */
    def getCostAndUsage(): awsDashSdkLib.libRequestMod.Request[GetCostAndUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
       */
    def getCostAndUsage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCostAndUsageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCostAndUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
       */
    def getCostAndUsage(params: GetCostAndUsageRequest): awsDashSdkLib.libRequestMod.Request[GetCostAndUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
       */
    def getCostAndUsage(
      params: GetCostAndUsageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCostAndUsageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCostAndUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
       */
    def getCostForecast(): awsDashSdkLib.libRequestMod.Request[GetCostForecastResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
       */
    def getCostForecast(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCostForecastResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCostForecastResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
       */
    def getCostForecast(params: GetCostForecastRequest): awsDashSdkLib.libRequestMod.Request[GetCostForecastResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
       */
    def getCostForecast(
      params: GetCostForecastRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCostForecastResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCostForecastResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
       */
    def getDimensionValues(): awsDashSdkLib.libRequestMod.Request[GetDimensionValuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
       */
    def getDimensionValues(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDimensionValuesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDimensionValuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
       */
    def getDimensionValues(params: GetDimensionValuesRequest): awsDashSdkLib.libRequestMod.Request[GetDimensionValuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
       */
    def getDimensionValues(
      params: GetDimensionValuesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDimensionValuesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDimensionValuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
       */
    def getReservationCoverage(): awsDashSdkLib.libRequestMod.Request[GetReservationCoverageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
       */
    def getReservationCoverage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReservationCoverageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReservationCoverageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
       */
    def getReservationCoverage(params: GetReservationCoverageRequest): awsDashSdkLib.libRequestMod.Request[GetReservationCoverageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
       */
    def getReservationCoverage(
      params: GetReservationCoverageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReservationCoverageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReservationCoverageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
       */
    def getReservationPurchaseRecommendation(): awsDashSdkLib.libRequestMod.Request[GetReservationPurchaseRecommendationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
       */
    def getReservationPurchaseRecommendation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReservationPurchaseRecommendationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReservationPurchaseRecommendationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
       */
    def getReservationPurchaseRecommendation(params: GetReservationPurchaseRecommendationRequest): awsDashSdkLib.libRequestMod.Request[GetReservationPurchaseRecommendationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
       */
    def getReservationPurchaseRecommendation(
      params: GetReservationPurchaseRecommendationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReservationPurchaseRecommendationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReservationPurchaseRecommendationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
       */
    def getReservationUtilization(): awsDashSdkLib.libRequestMod.Request[GetReservationUtilizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
       */
    def getReservationUtilization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReservationUtilizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReservationUtilizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
       */
    def getReservationUtilization(params: GetReservationUtilizationRequest): awsDashSdkLib.libRequestMod.Request[GetReservationUtilizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
       */
    def getReservationUtilization(
      params: GetReservationUtilizationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetReservationUtilizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetReservationUtilizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
       */
    def getTags(): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
       */
    def getTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
       */
    def getTags(params: GetTagsRequest): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
       */
    def getTags(
      params: GetTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UtilizationByTime extends js.Object {
    /**
         * The groups that this utilization result uses.
         */
    var Groups: js.UndefOr[ReservationUtilizationGroups] = js.undefined
    /**
         * The period of time that this utilization was used for.
         */
    var TimePeriod: js.UndefOr[DateInterval] = js.undefined
    /**
         * The total number of reservation hours that were used.
         */
    var Total: js.UndefOr[ReservationAggregates] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AccountScope = awsDashSdkLib.awsDashSdkLibStrings.PAYER | awsDashSdkLib.awsDashSdkLibStrings.LINKED | java.lang.String
  type AmortizedRecurringFee = java.lang.String
  type AmortizedUpfrontFee = java.lang.String
  type AttributeType = java.lang.String
  type AttributeValue = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Context = awsDashSdkLib.awsDashSdkLibStrings.COST_AND_USAGE | awsDashSdkLib.awsDashSdkLibStrings.RESERVATIONS | java.lang.String
  type CoverageHoursPercentage = java.lang.String
  type CoverageNormalizedUnitsPercentage = java.lang.String
  type CoveragesByTime = js.Array[CoverageByTime]
  type Dimension = awsDashSdkLib.awsDashSdkLibStrings.AZ | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_TYPE | awsDashSdkLib.awsDashSdkLibStrings.LINKED_ACCOUNT | awsDashSdkLib.awsDashSdkLibStrings.OPERATION | awsDashSdkLib.awsDashSdkLibStrings.PURCHASE_TYPE | awsDashSdkLib.awsDashSdkLibStrings.REGION | awsDashSdkLib.awsDashSdkLibStrings.SERVICE | awsDashSdkLib.awsDashSdkLibStrings.USAGE_TYPE | awsDashSdkLib.awsDashSdkLibStrings.USAGE_TYPE_GROUP | awsDashSdkLib.awsDashSdkLibStrings.RECORD_TYPE | awsDashSdkLib.awsDashSdkLibStrings.OPERATING_SYSTEM | awsDashSdkLib.awsDashSdkLibStrings.TENANCY | awsDashSdkLib.awsDashSdkLibStrings.SCOPE | awsDashSdkLib.awsDashSdkLibStrings.PLATFORM | awsDashSdkLib.awsDashSdkLibStrings.SUBSCRIPTION_ID | awsDashSdkLib.awsDashSdkLibStrings.LEGAL_ENTITY_NAME | awsDashSdkLib.awsDashSdkLibStrings.DEPLOYMENT_OPTION | awsDashSdkLib.awsDashSdkLibStrings.DATABASE_ENGINE | awsDashSdkLib.awsDashSdkLibStrings.CACHE_ENGINE | awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_TYPE_FAMILY | awsDashSdkLib.awsDashSdkLibStrings.BILLING_ENTITY | awsDashSdkLib.awsDashSdkLibStrings.RESERVATION_ID | java.lang.String
  type DimensionValuesWithAttributesList = js.Array[DimensionValuesWithAttributes]
  type Entity = java.lang.String
  type Estimated = scala.Boolean
  type Expressions = js.Array[Expression]
  type ForecastResultsByTime = js.Array[ForecastResult]
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  type Granularity = awsDashSdkLib.awsDashSdkLibStrings.DAILY | awsDashSdkLib.awsDashSdkLibStrings.MONTHLY | awsDashSdkLib.awsDashSdkLibStrings.HOURLY | java.lang.String
  type GroupDefinitionKey = java.lang.String
  type GroupDefinitionType = awsDashSdkLib.awsDashSdkLibStrings.DIMENSION | awsDashSdkLib.awsDashSdkLibStrings.TAG | java.lang.String
  type GroupDefinitions = js.Array[GroupDefinition]
  type Groups = js.Array[Group]
  type Key = java.lang.String
  type Keys = js.Array[Key]
  type LookbackPeriodInDays = awsDashSdkLib.awsDashSdkLibStrings.SEVEN_DAYS | awsDashSdkLib.awsDashSdkLibStrings.THIRTY_DAYS | awsDashSdkLib.awsDashSdkLibStrings.SIXTY_DAYS | java.lang.String
  type Metric = awsDashSdkLib.awsDashSdkLibStrings.BLENDED_COST | awsDashSdkLib.awsDashSdkLibStrings.UNBLENDED_COST | awsDashSdkLib.awsDashSdkLibStrings.AMORTIZED_COST | awsDashSdkLib.awsDashSdkLibStrings.NET_UNBLENDED_COST | awsDashSdkLib.awsDashSdkLibStrings.NET_AMORTIZED_COST | awsDashSdkLib.awsDashSdkLibStrings.USAGE_QUANTITY | awsDashSdkLib.awsDashSdkLibStrings.NORMALIZED_USAGE_AMOUNT | java.lang.String
  type MetricAmount = java.lang.String
  type MetricName = java.lang.String
  type MetricNames = js.Array[MetricName]
  type MetricUnit = java.lang.String
  type NetRISavings = java.lang.String
  type NextPageToken = java.lang.String
  type NonNegativeInteger = scala.Double
  type OfferingClass = awsDashSdkLib.awsDashSdkLibStrings.STANDARD | awsDashSdkLib.awsDashSdkLibStrings.CONVERTIBLE | java.lang.String
  type OnDemandCost = java.lang.String
  type OnDemandCostOfRIHoursUsed = java.lang.String
  type OnDemandHours = java.lang.String
  type OnDemandNormalizedUnits = java.lang.String
  type PageSize = scala.Double
  type PaymentOption = awsDashSdkLib.awsDashSdkLibStrings.NO_UPFRONT | awsDashSdkLib.awsDashSdkLibStrings.PARTIAL_UPFRONT | awsDashSdkLib.awsDashSdkLibStrings.ALL_UPFRONT | awsDashSdkLib.awsDashSdkLibStrings.LIGHT_UTILIZATION | awsDashSdkLib.awsDashSdkLibStrings.MEDIUM_UTILIZATION | awsDashSdkLib.awsDashSdkLibStrings.HEAVY_UTILIZATION | java.lang.String
  type PredictionIntervalLevel = scala.Double
  type PurchasedHours = java.lang.String
  type PurchasedUnits = java.lang.String
  type ReservationCoverageGroups = js.Array[ReservationCoverageGroup]
  type ReservationGroupKey = java.lang.String
  type ReservationGroupValue = java.lang.String
  type ReservationPurchaseRecommendationDetails = js.Array[ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations = js.Array[ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups = js.Array[ReservationUtilizationGroup]
  type ReservedHours = java.lang.String
  type ReservedNormalizedUnits = java.lang.String
  type ResultsByTime = js.Array[ResultByTime]
  type SearchString = java.lang.String
  type TagKey = java.lang.String
  type TagList = js.Array[Entity]
  type TermInYears = awsDashSdkLib.awsDashSdkLibStrings.ONE_YEAR | awsDashSdkLib.awsDashSdkLibStrings.THREE_YEARS | java.lang.String
  type TotalActualHours = java.lang.String
  type TotalActualUnits = java.lang.String
  type TotalAmortizedFee = java.lang.String
  type TotalPotentialRISavings = java.lang.String
  type TotalRunningHours = java.lang.String
  type TotalRunningNormalizedUnits = java.lang.String
  type UnusedHours = java.lang.String
  type UnusedUnits = java.lang.String
  type UtilizationPercentage = java.lang.String
  type UtilizationPercentageInUnits = java.lang.String
  type UtilizationsByTime = js.Array[UtilizationByTime]
  type Value = java.lang.String
  type Values = js.Array[Value]
  type YearMonthDay = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-10-25` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

