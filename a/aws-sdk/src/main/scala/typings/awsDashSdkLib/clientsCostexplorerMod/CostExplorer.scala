package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostExplorer
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CostExplorer: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.ClientConfiguration = js.native
  /**
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
     */
  def getCostAndUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostAndUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
     */
  def getCostAndUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostAndUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostAndUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
     */
  def getCostAndUsage(params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostAndUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostAndUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Master accounts in an organization in AWS Organizations have access to all member accounts.
     */
  def getCostAndUsage(
    params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostAndUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostAndUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostAndUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
     */
  def getCostForecast(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostForecastResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
     */
  def getCostForecast(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostForecastResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostForecastResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
     */
  def getCostForecast(params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostForecastRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostForecastResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
     */
  def getCostForecast(
    params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostForecastRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostForecastResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetCostForecastResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
     */
  def getDimensionValues(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetDimensionValuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
     */
  def getDimensionValues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetDimensionValuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetDimensionValuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
     */
  def getDimensionValues(params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetDimensionValuesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetDimensionValuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
     */
  def getDimensionValues(
    params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetDimensionValuesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetDimensionValuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetDimensionValuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
     */
  def getReservationCoverage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationCoverageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
     */
  def getReservationCoverage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationCoverageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationCoverageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
     */
  def getReservationCoverage(params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationCoverageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationCoverageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's master account can see the coverage of the associated member accounts. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
     */
  def getReservationCoverage(
    params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationCoverageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationCoverageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationCoverageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
     */
  def getReservationPurchaseRecommendation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationPurchaseRecommendationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
     */
  def getReservationPurchaseRecommendation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationPurchaseRecommendationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationPurchaseRecommendationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
     */
  def getReservationPurchaseRecommendation(
    params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationPurchaseRecommendationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationPurchaseRecommendationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. AWS generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of RI to purchase to maximize your estimated savings.  For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size that you want. For this example, your RI recommendation would be for c4.large because that is the smallest size instance in the c4 instance family.
     */
  def getReservationPurchaseRecommendation(
    params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationPurchaseRecommendationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationPurchaseRecommendationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationPurchaseRecommendationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
     */
  def getReservationUtilization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationUtilizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
     */
  def getReservationUtilization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationUtilizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationUtilizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
     */
  def getReservationUtilization(params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationUtilizationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationUtilizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
     */
  def getReservationUtilization(
    params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationUtilizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationUtilizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetReservationUtilizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
     */
  def getTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
     */
  def getTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
     */
  def getTags(params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
     */
  def getTags(
    params: awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCostexplorerMod.CostExplorerNs.GetTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

