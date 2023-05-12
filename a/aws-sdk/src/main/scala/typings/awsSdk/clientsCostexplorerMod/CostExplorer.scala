package typings.awsSdk.clientsCostexplorerMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CostExplorer extends Service {
  
  @JSName("config")
  var config_CostExplorer: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new cost anomaly detection monitor with the requested type and monitor specification. 
    */
  def createAnomalyMonitor(): Request[CreateAnomalyMonitorResponse, AWSError] = js.native
  def createAnomalyMonitor(callback: js.Function2[/* err */ AWSError, /* data */ CreateAnomalyMonitorResponse, Unit]): Request[CreateAnomalyMonitorResponse, AWSError] = js.native
  /**
    * Creates a new cost anomaly detection monitor with the requested type and monitor specification. 
    */
  def createAnomalyMonitor(params: CreateAnomalyMonitorRequest): Request[CreateAnomalyMonitorResponse, AWSError] = js.native
  def createAnomalyMonitor(
    params: CreateAnomalyMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAnomalyMonitorResponse, Unit]
  ): Request[CreateAnomalyMonitorResponse, AWSError] = js.native
  
  /**
    * Adds an alert subscription to a cost anomaly detection monitor. You can use each subscription to define subscribers with email or SNS notifications. Email subscribers can set an absolute or percentage threshold and a time frequency for receiving notifications. 
    */
  def createAnomalySubscription(): Request[CreateAnomalySubscriptionResponse, AWSError] = js.native
  def createAnomalySubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateAnomalySubscriptionResponse, Unit]): Request[CreateAnomalySubscriptionResponse, AWSError] = js.native
  /**
    * Adds an alert subscription to a cost anomaly detection monitor. You can use each subscription to define subscribers with email or SNS notifications. Email subscribers can set an absolute or percentage threshold and a time frequency for receiving notifications. 
    */
  def createAnomalySubscription(params: CreateAnomalySubscriptionRequest): Request[CreateAnomalySubscriptionResponse, AWSError] = js.native
  def createAnomalySubscription(
    params: CreateAnomalySubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAnomalySubscriptionResponse, Unit]
  ): Request[CreateAnomalySubscriptionResponse, AWSError] = js.native
  
  /**
    * Creates a new Cost Category with the requested name and rules.
    */
  def createCostCategoryDefinition(): Request[CreateCostCategoryDefinitionResponse, AWSError] = js.native
  def createCostCategoryDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateCostCategoryDefinitionResponse, Unit]): Request[CreateCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Creates a new Cost Category with the requested name and rules.
    */
  def createCostCategoryDefinition(params: CreateCostCategoryDefinitionRequest): Request[CreateCostCategoryDefinitionResponse, AWSError] = js.native
  def createCostCategoryDefinition(
    params: CreateCostCategoryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCostCategoryDefinitionResponse, Unit]
  ): Request[CreateCostCategoryDefinitionResponse, AWSError] = js.native
  
  /**
    * Deletes a cost anomaly monitor. 
    */
  def deleteAnomalyMonitor(): Request[DeleteAnomalyMonitorResponse, AWSError] = js.native
  def deleteAnomalyMonitor(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnomalyMonitorResponse, Unit]): Request[DeleteAnomalyMonitorResponse, AWSError] = js.native
  /**
    * Deletes a cost anomaly monitor. 
    */
  def deleteAnomalyMonitor(params: DeleteAnomalyMonitorRequest): Request[DeleteAnomalyMonitorResponse, AWSError] = js.native
  def deleteAnomalyMonitor(
    params: DeleteAnomalyMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnomalyMonitorResponse, Unit]
  ): Request[DeleteAnomalyMonitorResponse, AWSError] = js.native
  
  /**
    * Deletes a cost anomaly subscription. 
    */
  def deleteAnomalySubscription(): Request[DeleteAnomalySubscriptionResponse, AWSError] = js.native
  def deleteAnomalySubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnomalySubscriptionResponse, Unit]): Request[DeleteAnomalySubscriptionResponse, AWSError] = js.native
  /**
    * Deletes a cost anomaly subscription. 
    */
  def deleteAnomalySubscription(params: DeleteAnomalySubscriptionRequest): Request[DeleteAnomalySubscriptionResponse, AWSError] = js.native
  def deleteAnomalySubscription(
    params: DeleteAnomalySubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnomalySubscriptionResponse, Unit]
  ): Request[DeleteAnomalySubscriptionResponse, AWSError] = js.native
  
  /**
    * Deletes a Cost Category. Expenses from this month going forward will no longer be categorized with this Cost Category.
    */
  def deleteCostCategoryDefinition(): Request[DeleteCostCategoryDefinitionResponse, AWSError] = js.native
  def deleteCostCategoryDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCostCategoryDefinitionResponse, Unit]): Request[DeleteCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Deletes a Cost Category. Expenses from this month going forward will no longer be categorized with this Cost Category.
    */
  def deleteCostCategoryDefinition(params: DeleteCostCategoryDefinitionRequest): Request[DeleteCostCategoryDefinitionResponse, AWSError] = js.native
  def deleteCostCategoryDefinition(
    params: DeleteCostCategoryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCostCategoryDefinitionResponse, Unit]
  ): Request[DeleteCostCategoryDefinitionResponse, AWSError] = js.native
  
  /**
    * Returns the name, Amazon Resource Name (ARN), rules, definition, and effective dates of a Cost Category that's defined in the account. You have the option to use EffectiveOn to return a Cost Category that's active on a specific date. If there's no EffectiveOn specified, you see a Cost Category that's effective on the current date. If Cost Category is still effective, EffectiveEnd is omitted in the response. 
    */
  def describeCostCategoryDefinition(): Request[DescribeCostCategoryDefinitionResponse, AWSError] = js.native
  def describeCostCategoryDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCostCategoryDefinitionResponse, Unit]
  ): Request[DescribeCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Returns the name, Amazon Resource Name (ARN), rules, definition, and effective dates of a Cost Category that's defined in the account. You have the option to use EffectiveOn to return a Cost Category that's active on a specific date. If there's no EffectiveOn specified, you see a Cost Category that's effective on the current date. If Cost Category is still effective, EffectiveEnd is omitted in the response. 
    */
  def describeCostCategoryDefinition(params: DescribeCostCategoryDefinitionRequest): Request[DescribeCostCategoryDefinitionResponse, AWSError] = js.native
  def describeCostCategoryDefinition(
    params: DescribeCostCategoryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCostCategoryDefinitionResponse, Unit]
  ): Request[DescribeCostCategoryDefinitionResponse, AWSError] = js.native
  
  /**
    * Retrieves all of the cost anomalies detected on your account during the time period that's specified by the DateInterval object. Anomalies are available for up to 90 days.
    */
  def getAnomalies(): Request[GetAnomaliesResponse, AWSError] = js.native
  def getAnomalies(callback: js.Function2[/* err */ AWSError, /* data */ GetAnomaliesResponse, Unit]): Request[GetAnomaliesResponse, AWSError] = js.native
  /**
    * Retrieves all of the cost anomalies detected on your account during the time period that's specified by the DateInterval object. Anomalies are available for up to 90 days.
    */
  def getAnomalies(params: GetAnomaliesRequest): Request[GetAnomaliesResponse, AWSError] = js.native
  def getAnomalies(
    params: GetAnomaliesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnomaliesResponse, Unit]
  ): Request[GetAnomaliesResponse, AWSError] = js.native
  
  /**
    * Retrieves the cost anomaly monitor definitions for your account. You can filter using a list of cost anomaly monitor Amazon Resource Names (ARNs). 
    */
  def getAnomalyMonitors(): Request[GetAnomalyMonitorsResponse, AWSError] = js.native
  def getAnomalyMonitors(callback: js.Function2[/* err */ AWSError, /* data */ GetAnomalyMonitorsResponse, Unit]): Request[GetAnomalyMonitorsResponse, AWSError] = js.native
  /**
    * Retrieves the cost anomaly monitor definitions for your account. You can filter using a list of cost anomaly monitor Amazon Resource Names (ARNs). 
    */
  def getAnomalyMonitors(params: GetAnomalyMonitorsRequest): Request[GetAnomalyMonitorsResponse, AWSError] = js.native
  def getAnomalyMonitors(
    params: GetAnomalyMonitorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnomalyMonitorsResponse, Unit]
  ): Request[GetAnomalyMonitorsResponse, AWSError] = js.native
  
  /**
    * Retrieves the cost anomaly subscription objects for your account. You can filter using a list of cost anomaly monitor Amazon Resource Names (ARNs). 
    */
  def getAnomalySubscriptions(): Request[GetAnomalySubscriptionsResponse, AWSError] = js.native
  def getAnomalySubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ GetAnomalySubscriptionsResponse, Unit]): Request[GetAnomalySubscriptionsResponse, AWSError] = js.native
  /**
    * Retrieves the cost anomaly subscription objects for your account. You can filter using a list of cost anomaly monitor Amazon Resource Names (ARNs). 
    */
  def getAnomalySubscriptions(params: GetAnomalySubscriptionsRequest): Request[GetAnomalySubscriptionsResponse, AWSError] = js.native
  def getAnomalySubscriptions(
    params: GetAnomalySubscriptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnomalySubscriptionsResponse, Unit]
  ): Request[GetAnomalySubscriptionsResponse, AWSError] = js.native
  
  /**
    * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric that you want the request to return. For example, you can specify BlendedCosts or UsageQuantity. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Management account in an organization in Organizations have access to all member accounts. For information about filter limitations, see Quotas and restrictions in the Billing and Cost Management User Guide.
    */
  def getCostAndUsage(): Request[GetCostAndUsageResponse, AWSError] = js.native
  def getCostAndUsage(callback: js.Function2[/* err */ AWSError, /* data */ GetCostAndUsageResponse, Unit]): Request[GetCostAndUsageResponse, AWSError] = js.native
  /**
    * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric that you want the request to return. For example, you can specify BlendedCosts or UsageQuantity. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Management account in an organization in Organizations have access to all member accounts. For information about filter limitations, see Quotas and restrictions in the Billing and Cost Management User Guide.
    */
  def getCostAndUsage(params: GetCostAndUsageRequest): Request[GetCostAndUsageResponse, AWSError] = js.native
  def getCostAndUsage(
    params: GetCostAndUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCostAndUsageResponse, Unit]
  ): Request[GetCostAndUsageResponse, AWSError] = js.native
  
  /**
    * Retrieves cost and usage metrics with resources for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Management account in an organization in Organizations have access to all member accounts. This API is currently available for the Amazon Elastic Compute Cloud – Compute service only.  This is an opt-in only feature. You can enable this feature from the Cost Explorer Settings page. For information about how to access the Settings page, see Controlling Access for Cost Explorer in the Billing and Cost Management User Guide. 
    */
  def getCostAndUsageWithResources(): Request[GetCostAndUsageWithResourcesResponse, AWSError] = js.native
  def getCostAndUsageWithResources(callback: js.Function2[/* err */ AWSError, /* data */ GetCostAndUsageWithResourcesResponse, Unit]): Request[GetCostAndUsageWithResourcesResponse, AWSError] = js.native
  /**
    * Retrieves cost and usage metrics with resources for your account. You can specify which cost and usage-related metric, such as BlendedCosts or UsageQuantity, that you want the request to return. You can also filter and group your data by various dimensions, such as SERVICE or AZ, in a specific time range. For a complete list of valid dimensions, see the GetDimensionValues operation. Management account in an organization in Organizations have access to all member accounts. This API is currently available for the Amazon Elastic Compute Cloud – Compute service only.  This is an opt-in only feature. You can enable this feature from the Cost Explorer Settings page. For information about how to access the Settings page, see Controlling Access for Cost Explorer in the Billing and Cost Management User Guide. 
    */
  def getCostAndUsageWithResources(params: GetCostAndUsageWithResourcesRequest): Request[GetCostAndUsageWithResourcesResponse, AWSError] = js.native
  def getCostAndUsageWithResources(
    params: GetCostAndUsageWithResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCostAndUsageWithResourcesResponse, Unit]
  ): Request[GetCostAndUsageWithResourcesResponse, AWSError] = js.native
  
  /**
    * Retrieves an array of Cost Category names and values incurred cost.  If some Cost Category names and values are not associated with any cost, they will not be returned by this API. 
    */
  def getCostCategories(): Request[GetCostCategoriesResponse, AWSError] = js.native
  def getCostCategories(callback: js.Function2[/* err */ AWSError, /* data */ GetCostCategoriesResponse, Unit]): Request[GetCostCategoriesResponse, AWSError] = js.native
  /**
    * Retrieves an array of Cost Category names and values incurred cost.  If some Cost Category names and values are not associated with any cost, they will not be returned by this API. 
    */
  def getCostCategories(params: GetCostCategoriesRequest): Request[GetCostCategoriesResponse, AWSError] = js.native
  def getCostCategories(
    params: GetCostCategoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCostCategoriesResponse, Unit]
  ): Request[GetCostCategoriesResponse, AWSError] = js.native
  
  /**
    * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
    */
  def getCostForecast(): Request[GetCostForecastResponse, AWSError] = js.native
  def getCostForecast(callback: js.Function2[/* err */ AWSError, /* data */ GetCostForecastResponse, Unit]): Request[GetCostForecastResponse, AWSError] = js.native
  /**
    * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period that you select, based on your past costs. 
    */
  def getCostForecast(params: GetCostForecastRequest): Request[GetCostForecastResponse, AWSError] = js.native
  def getCostForecast(
    params: GetCostForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCostForecastResponse, Unit]
  ): Request[GetCostForecastResponse, AWSError] = js.native
  
  /**
    * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
    */
  def getDimensionValues(): Request[GetDimensionValuesResponse, AWSError] = js.native
  def getDimensionValues(callback: js.Function2[/* err */ AWSError, /* data */ GetDimensionValuesResponse, Unit]): Request[GetDimensionValuesResponse, AWSError] = js.native
  /**
    * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension values for an arbitrary string. 
    */
  def getDimensionValues(params: GetDimensionValuesRequest): Request[GetDimensionValuesResponse, AWSError] = js.native
  def getDimensionValues(
    params: GetDimensionValuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDimensionValuesResponse, Unit]
  ): Request[GetDimensionValuesResponse, AWSError] = js.native
  
  /**
    * Retrieves the reservation coverage for your account, which you can use to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's management account can see the coverage of the associated member accounts. This supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
    */
  def getReservationCoverage(): Request[GetReservationCoverageResponse, AWSError] = js.native
  def getReservationCoverage(callback: js.Function2[/* err */ AWSError, /* data */ GetReservationCoverageResponse, Unit]): Request[GetReservationCoverageResponse, AWSError] = js.native
  /**
    * Retrieves the reservation coverage for your account, which you can use to see how much of your Amazon Elastic Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a reservation. An organization's management account can see the coverage of the associated member accounts. This supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data about reservation usage by the following dimensions:   AZ   CACHE_ENGINE   DATABASE_ENGINE   DEPLOYMENT_OPTION   INSTANCE_TYPE   LINKED_ACCOUNT   OPERATING_SYSTEM   PLATFORM   REGION   SERVICE   TAG   TENANCY   To determine valid values for a dimension, use the GetDimensionValues operation. 
    */
  def getReservationCoverage(params: GetReservationCoverageRequest): Request[GetReservationCoverageResponse, AWSError] = js.native
  def getReservationCoverage(
    params: GetReservationCoverageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservationCoverageResponse, Unit]
  ): Request[GetReservationCoverageResponse, AWSError] = js.native
  
  /**
    * Gets recommendations for reservation purchases. These recommendations might help you to reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. Amazon Web Services generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After Amazon Web Services has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of Reserved Instance (RI) to purchase to maximize your estimated savings.  For example, Amazon Web Services automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. Amazon Web Services recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible Reserved Instance (RI). Amazon Web Services also shows the equal number of normalized units. This way, you can purchase any instance size that you want. For this example, your RI recommendation is for c4.large because that is the smallest size instance in the c4 instance family.
    */
  def getReservationPurchaseRecommendation(): Request[GetReservationPurchaseRecommendationResponse, AWSError] = js.native
  def getReservationPurchaseRecommendation(
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservationPurchaseRecommendationResponse, Unit]
  ): Request[GetReservationPurchaseRecommendationResponse, AWSError] = js.native
  /**
    * Gets recommendations for reservation purchases. These recommendations might help you to reduce your costs. Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing. Amazon Web Services generates your recommendations by identifying your On-Demand usage during a specific time period and collecting your usage into categories that are eligible for a reservation. After Amazon Web Services has these categories, it simulates every combination of reservations in each category of usage to identify the best number of each type of Reserved Instance (RI) to purchase to maximize your estimated savings.  For example, Amazon Web Services automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family usage. Amazon Web Services recommends the smallest size instance in an instance family. This makes it easier to purchase a size-flexible Reserved Instance (RI). Amazon Web Services also shows the equal number of normalized units. This way, you can purchase any instance size that you want. For this example, your RI recommendation is for c4.large because that is the smallest size instance in the c4 instance family.
    */
  def getReservationPurchaseRecommendation(params: GetReservationPurchaseRecommendationRequest): Request[GetReservationPurchaseRecommendationResponse, AWSError] = js.native
  def getReservationPurchaseRecommendation(
    params: GetReservationPurchaseRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservationPurchaseRecommendationResponse, Unit]
  ): Request[GetReservationPurchaseRecommendationResponse, AWSError] = js.native
  
  /**
    * Retrieves the reservation utilization for your account. Management account in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
    */
  def getReservationUtilization(): Request[GetReservationUtilizationResponse, AWSError] = js.native
  def getReservationUtilization(callback: js.Function2[/* err */ AWSError, /* data */ GetReservationUtilizationResponse, Unit]): Request[GetReservationUtilizationResponse, AWSError] = js.native
  /**
    * Retrieves the reservation utilization for your account. Management account in an organization have access to member accounts. You can filter data by dimensions in a time period. You can use GetDimensionValues to determine the possible dimension values. Currently, you can group only by SUBSCRIPTION_ID. 
    */
  def getReservationUtilization(params: GetReservationUtilizationRequest): Request[GetReservationUtilizationResponse, AWSError] = js.native
  def getReservationUtilization(
    params: GetReservationUtilizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReservationUtilizationResponse, Unit]
  ): Request[GetReservationUtilizationResponse, AWSError] = js.native
  
  /**
    * Creates recommendations that help you save cost by identifying idle and underutilized Amazon EC2 instances. Recommendations are generated to either downsize or terminate instances, along with providing savings detail and metrics. For more information about calculation and function, see Optimizing Your Cost with Rightsizing Recommendations in the Billing and Cost Management User Guide.
    */
  def getRightsizingRecommendation(): Request[GetRightsizingRecommendationResponse, AWSError] = js.native
  def getRightsizingRecommendation(callback: js.Function2[/* err */ AWSError, /* data */ GetRightsizingRecommendationResponse, Unit]): Request[GetRightsizingRecommendationResponse, AWSError] = js.native
  /**
    * Creates recommendations that help you save cost by identifying idle and underutilized Amazon EC2 instances. Recommendations are generated to either downsize or terminate instances, along with providing savings detail and metrics. For more information about calculation and function, see Optimizing Your Cost with Rightsizing Recommendations in the Billing and Cost Management User Guide.
    */
  def getRightsizingRecommendation(params: GetRightsizingRecommendationRequest): Request[GetRightsizingRecommendationResponse, AWSError] = js.native
  def getRightsizingRecommendation(
    params: GetRightsizingRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRightsizingRecommendationResponse, Unit]
  ): Request[GetRightsizingRecommendationResponse, AWSError] = js.native
  
  /**
    * Retrieves the Savings Plans covered for your account. This enables you to see how much of your cost is covered by a Savings Plan. An organization’s management account can see the coverage of the associated member accounts. This supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data for Savings Plans usage with the following dimensions:    LINKED_ACCOUNT     REGION     SERVICE     INSTANCE_FAMILY    To determine valid values for a dimension, use the GetDimensionValues operation.
    */
  def getSavingsPlansCoverage(): Request[GetSavingsPlansCoverageResponse, AWSError] = js.native
  def getSavingsPlansCoverage(callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansCoverageResponse, Unit]): Request[GetSavingsPlansCoverageResponse, AWSError] = js.native
  /**
    * Retrieves the Savings Plans covered for your account. This enables you to see how much of your cost is covered by a Savings Plan. An organization’s management account can see the coverage of the associated member accounts. This supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data for Savings Plans usage with the following dimensions:    LINKED_ACCOUNT     REGION     SERVICE     INSTANCE_FAMILY    To determine valid values for a dimension, use the GetDimensionValues operation.
    */
  def getSavingsPlansCoverage(params: GetSavingsPlansCoverageRequest): Request[GetSavingsPlansCoverageResponse, AWSError] = js.native
  def getSavingsPlansCoverage(
    params: GetSavingsPlansCoverageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansCoverageResponse, Unit]
  ): Request[GetSavingsPlansCoverageResponse, AWSError] = js.native
  
  /**
    * Retrieves the Savings Plans recommendations for your account. First use StartSavingsPlansPurchaseRecommendationGeneration to generate a new set of recommendations, and then use GetSavingsPlansPurchaseRecommendation to retrieve them.
    */
  def getSavingsPlansPurchaseRecommendation(): Request[GetSavingsPlansPurchaseRecommendationResponse, AWSError] = js.native
  def getSavingsPlansPurchaseRecommendation(
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansPurchaseRecommendationResponse, Unit]
  ): Request[GetSavingsPlansPurchaseRecommendationResponse, AWSError] = js.native
  /**
    * Retrieves the Savings Plans recommendations for your account. First use StartSavingsPlansPurchaseRecommendationGeneration to generate a new set of recommendations, and then use GetSavingsPlansPurchaseRecommendation to retrieve them.
    */
  def getSavingsPlansPurchaseRecommendation(params: GetSavingsPlansPurchaseRecommendationRequest): Request[GetSavingsPlansPurchaseRecommendationResponse, AWSError] = js.native
  def getSavingsPlansPurchaseRecommendation(
    params: GetSavingsPlansPurchaseRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansPurchaseRecommendationResponse, Unit]
  ): Request[GetSavingsPlansPurchaseRecommendationResponse, AWSError] = js.native
  
  /**
    * Retrieves the Savings Plans utilization for your account across date ranges with daily or monthly granularity. Management account in an organization have access to member accounts. You can use GetDimensionValues in SAVINGS_PLANS to determine the possible dimension values.  You can't group by any dimension values for GetSavingsPlansUtilization. 
    */
  def getSavingsPlansUtilization(): Request[GetSavingsPlansUtilizationResponse, AWSError] = js.native
  def getSavingsPlansUtilization(callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansUtilizationResponse, Unit]): Request[GetSavingsPlansUtilizationResponse, AWSError] = js.native
  /**
    * Retrieves the Savings Plans utilization for your account across date ranges with daily or monthly granularity. Management account in an organization have access to member accounts. You can use GetDimensionValues in SAVINGS_PLANS to determine the possible dimension values.  You can't group by any dimension values for GetSavingsPlansUtilization. 
    */
  def getSavingsPlansUtilization(params: GetSavingsPlansUtilizationRequest): Request[GetSavingsPlansUtilizationResponse, AWSError] = js.native
  def getSavingsPlansUtilization(
    params: GetSavingsPlansUtilizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansUtilizationResponse, Unit]
  ): Request[GetSavingsPlansUtilizationResponse, AWSError] = js.native
  
  /**
    * Retrieves attribute data along with aggregate utilization and savings data for a given time period. This doesn't support granular or grouped data (daily/monthly) in response. You can't retrieve data by dates in a single response similar to GetSavingsPlanUtilization, but you have the option to make multiple calls to GetSavingsPlanUtilizationDetails by providing individual dates. You can use GetDimensionValues in SAVINGS_PLANS to determine the possible dimension values.   GetSavingsPlanUtilizationDetails internally groups data by SavingsPlansArn. 
    */
  def getSavingsPlansUtilizationDetails(): Request[GetSavingsPlansUtilizationDetailsResponse, AWSError] = js.native
  def getSavingsPlansUtilizationDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansUtilizationDetailsResponse, Unit]
  ): Request[GetSavingsPlansUtilizationDetailsResponse, AWSError] = js.native
  /**
    * Retrieves attribute data along with aggregate utilization and savings data for a given time period. This doesn't support granular or grouped data (daily/monthly) in response. You can't retrieve data by dates in a single response similar to GetSavingsPlanUtilization, but you have the option to make multiple calls to GetSavingsPlanUtilizationDetails by providing individual dates. You can use GetDimensionValues in SAVINGS_PLANS to determine the possible dimension values.   GetSavingsPlanUtilizationDetails internally groups data by SavingsPlansArn. 
    */
  def getSavingsPlansUtilizationDetails(params: GetSavingsPlansUtilizationDetailsRequest): Request[GetSavingsPlansUtilizationDetailsResponse, AWSError] = js.native
  def getSavingsPlansUtilizationDetails(
    params: GetSavingsPlansUtilizationDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSavingsPlansUtilizationDetailsResponse, Unit]
  ): Request[GetSavingsPlansUtilizationDetailsResponse, AWSError] = js.native
  
  /**
    * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
    */
  def getTags(): Request[GetTagsResponse, AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ AWSError, /* data */ GetTagsResponse, Unit]): Request[GetTagsResponse, AWSError] = js.native
  /**
    * Queries for available tag keys and tag values for a specified period. You can search the tag values for an arbitrary string. 
    */
  def getTags(params: GetTagsRequest): Request[GetTagsResponse, AWSError] = js.native
  def getTags(
    params: GetTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTagsResponse, Unit]
  ): Request[GetTagsResponse, AWSError] = js.native
  
  /**
    * Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period that you select, based on your past usage. 
    */
  def getUsageForecast(): Request[GetUsageForecastResponse, AWSError] = js.native
  def getUsageForecast(callback: js.Function2[/* err */ AWSError, /* data */ GetUsageForecastResponse, Unit]): Request[GetUsageForecastResponse, AWSError] = js.native
  /**
    * Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period that you select, based on your past usage. 
    */
  def getUsageForecast(params: GetUsageForecastRequest): Request[GetUsageForecastResponse, AWSError] = js.native
  def getUsageForecast(
    params: GetUsageForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUsageForecastResponse, Unit]
  ): Request[GetUsageForecastResponse, AWSError] = js.native
  
  /**
    * Get a list of cost allocation tags. All inputs in the API are optional and serve as filters. By default, all cost allocation tags are returned. 
    */
  def listCostAllocationTags(): Request[ListCostAllocationTagsResponse, AWSError] = js.native
  def listCostAllocationTags(callback: js.Function2[/* err */ AWSError, /* data */ ListCostAllocationTagsResponse, Unit]): Request[ListCostAllocationTagsResponse, AWSError] = js.native
  /**
    * Get a list of cost allocation tags. All inputs in the API are optional and serve as filters. By default, all cost allocation tags are returned. 
    */
  def listCostAllocationTags(params: ListCostAllocationTagsRequest): Request[ListCostAllocationTagsResponse, AWSError] = js.native
  def listCostAllocationTags(
    params: ListCostAllocationTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCostAllocationTagsResponse, Unit]
  ): Request[ListCostAllocationTagsResponse, AWSError] = js.native
  
  /**
    * Returns the name, Amazon Resource Name (ARN), NumberOfRules and effective dates of all Cost Categories defined in the account. You have the option to use EffectiveOn to return a list of Cost Categories that were active on a specific date. If there is no EffectiveOn specified, you’ll see Cost Categories that are effective on the current date. If Cost Category is still effective, EffectiveEnd is omitted in the response. ListCostCategoryDefinitions supports pagination. The request can have a MaxResults range up to 100.
    */
  def listCostCategoryDefinitions(): Request[ListCostCategoryDefinitionsResponse, AWSError] = js.native
  def listCostCategoryDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListCostCategoryDefinitionsResponse, Unit]): Request[ListCostCategoryDefinitionsResponse, AWSError] = js.native
  /**
    * Returns the name, Amazon Resource Name (ARN), NumberOfRules and effective dates of all Cost Categories defined in the account. You have the option to use EffectiveOn to return a list of Cost Categories that were active on a specific date. If there is no EffectiveOn specified, you’ll see Cost Categories that are effective on the current date. If Cost Category is still effective, EffectiveEnd is omitted in the response. ListCostCategoryDefinitions supports pagination. The request can have a MaxResults range up to 100.
    */
  def listCostCategoryDefinitions(params: ListCostCategoryDefinitionsRequest): Request[ListCostCategoryDefinitionsResponse, AWSError] = js.native
  def listCostCategoryDefinitions(
    params: ListCostCategoryDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCostCategoryDefinitionsResponse, Unit]
  ): Request[ListCostCategoryDefinitionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of your historical recommendation generations within the past 30 days.
    */
  def listSavingsPlansPurchaseRecommendationGeneration(): Request[ListSavingsPlansPurchaseRecommendationGenerationResponse, AWSError] = js.native
  def listSavingsPlansPurchaseRecommendationGeneration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListSavingsPlansPurchaseRecommendationGenerationResponse, 
      Unit
    ]
  ): Request[ListSavingsPlansPurchaseRecommendationGenerationResponse, AWSError] = js.native
  /**
    * Retrieves a list of your historical recommendation generations within the past 30 days.
    */
  def listSavingsPlansPurchaseRecommendationGeneration(params: ListSavingsPlansPurchaseRecommendationGenerationRequest): Request[ListSavingsPlansPurchaseRecommendationGenerationResponse, AWSError] = js.native
  def listSavingsPlansPurchaseRecommendationGeneration(
    params: ListSavingsPlansPurchaseRecommendationGenerationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListSavingsPlansPurchaseRecommendationGenerationResponse, 
      Unit
    ]
  ): Request[ListSavingsPlansPurchaseRecommendationGenerationResponse, AWSError] = js.native
  
  /**
    * Returns a list of resource tags associated with the resource specified by the Amazon Resource Name (ARN). 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of resource tags associated with the resource specified by the Amazon Resource Name (ARN). 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Modifies the feedback property of a given cost anomaly. 
    */
  def provideAnomalyFeedback(): Request[ProvideAnomalyFeedbackResponse, AWSError] = js.native
  def provideAnomalyFeedback(callback: js.Function2[/* err */ AWSError, /* data */ ProvideAnomalyFeedbackResponse, Unit]): Request[ProvideAnomalyFeedbackResponse, AWSError] = js.native
  /**
    * Modifies the feedback property of a given cost anomaly. 
    */
  def provideAnomalyFeedback(params: ProvideAnomalyFeedbackRequest): Request[ProvideAnomalyFeedbackResponse, AWSError] = js.native
  def provideAnomalyFeedback(
    params: ProvideAnomalyFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ProvideAnomalyFeedbackResponse, Unit]
  ): Request[ProvideAnomalyFeedbackResponse, AWSError] = js.native
  
  /**
    * Requests a Savings Plans recommendation generation. This enables you to calculate a fresh set of Savings Plans recommendations that takes your latest usage data and current Savings Plans inventory into account. You can refresh Savings Plans recommendations up to three times daily for a consolidated billing family.   StartSavingsPlansPurchaseRecommendationGeneration has no request syntax because no input parameters are needed to support this operation. 
    */
  def startSavingsPlansPurchaseRecommendationGeneration(): Request[StartSavingsPlansPurchaseRecommendationGenerationResponse, AWSError] = js.native
  def startSavingsPlansPurchaseRecommendationGeneration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ StartSavingsPlansPurchaseRecommendationGenerationResponse, 
      Unit
    ]
  ): Request[StartSavingsPlansPurchaseRecommendationGenerationResponse, AWSError] = js.native
  /**
    * Requests a Savings Plans recommendation generation. This enables you to calculate a fresh set of Savings Plans recommendations that takes your latest usage data and current Savings Plans inventory into account. You can refresh Savings Plans recommendations up to three times daily for a consolidated billing family.   StartSavingsPlansPurchaseRecommendationGeneration has no request syntax because no input parameters are needed to support this operation. 
    */
  def startSavingsPlansPurchaseRecommendationGeneration(params: StartSavingsPlansPurchaseRecommendationGenerationRequest): Request[StartSavingsPlansPurchaseRecommendationGenerationResponse, AWSError] = js.native
  def startSavingsPlansPurchaseRecommendationGeneration(
    params: StartSavingsPlansPurchaseRecommendationGenerationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ StartSavingsPlansPurchaseRecommendationGenerationResponse, 
      Unit
    ]
  ): Request[StartSavingsPlansPurchaseRecommendationGenerationResponse, AWSError] = js.native
  
  /**
    * An API operation for adding one or more tags (key-value pairs) to a resource. You can use the TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value you specify replaces the previous value for that tag. Although the maximum number of array members is 200, user-tag maximum is 50. The remaining are reserved for Amazon Web Services use.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * An API operation for adding one or more tags (key-value pairs) to a resource. You can use the TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value you specify replaces the previous value for that tag. Although the maximum number of array members is 200, user-tag maximum is 50. The remaining are reserved for Amazon Web Services use.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from a resource. Specify only tag keys in your request. Don't specify the value. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a resource. Specify only tag keys in your request. Don't specify the value. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an existing cost anomaly monitor. The changes made are applied going forward, and doesn't change anomalies detected in the past. 
    */
  def updateAnomalyMonitor(): Request[UpdateAnomalyMonitorResponse, AWSError] = js.native
  def updateAnomalyMonitor(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnomalyMonitorResponse, Unit]): Request[UpdateAnomalyMonitorResponse, AWSError] = js.native
  /**
    * Updates an existing cost anomaly monitor. The changes made are applied going forward, and doesn't change anomalies detected in the past. 
    */
  def updateAnomalyMonitor(params: UpdateAnomalyMonitorRequest): Request[UpdateAnomalyMonitorResponse, AWSError] = js.native
  def updateAnomalyMonitor(
    params: UpdateAnomalyMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnomalyMonitorResponse, Unit]
  ): Request[UpdateAnomalyMonitorResponse, AWSError] = js.native
  
  /**
    * Updates an existing cost anomaly monitor subscription. 
    */
  def updateAnomalySubscription(): Request[UpdateAnomalySubscriptionResponse, AWSError] = js.native
  def updateAnomalySubscription(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnomalySubscriptionResponse, Unit]): Request[UpdateAnomalySubscriptionResponse, AWSError] = js.native
  /**
    * Updates an existing cost anomaly monitor subscription. 
    */
  def updateAnomalySubscription(params: UpdateAnomalySubscriptionRequest): Request[UpdateAnomalySubscriptionResponse, AWSError] = js.native
  def updateAnomalySubscription(
    params: UpdateAnomalySubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnomalySubscriptionResponse, Unit]
  ): Request[UpdateAnomalySubscriptionResponse, AWSError] = js.native
  
  /**
    * Updates status for cost allocation tags in bulk, with maximum batch size of 20. If the tag status that's updated is the same as the existing tag status, the request doesn't fail. Instead, it doesn't have any effect on the tag status (for example, activating the active tag). 
    */
  def updateCostAllocationTagsStatus(): Request[UpdateCostAllocationTagsStatusResponse, AWSError] = js.native
  def updateCostAllocationTagsStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCostAllocationTagsStatusResponse, Unit]
  ): Request[UpdateCostAllocationTagsStatusResponse, AWSError] = js.native
  /**
    * Updates status for cost allocation tags in bulk, with maximum batch size of 20. If the tag status that's updated is the same as the existing tag status, the request doesn't fail. Instead, it doesn't have any effect on the tag status (for example, activating the active tag). 
    */
  def updateCostAllocationTagsStatus(params: UpdateCostAllocationTagsStatusRequest): Request[UpdateCostAllocationTagsStatusResponse, AWSError] = js.native
  def updateCostAllocationTagsStatus(
    params: UpdateCostAllocationTagsStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCostAllocationTagsStatusResponse, Unit]
  ): Request[UpdateCostAllocationTagsStatusResponse, AWSError] = js.native
  
  /**
    * Updates an existing Cost Category. Changes made to the Cost Category rules will be used to categorize the current month’s expenses and future expenses. This won’t change categorization for the previous months.
    */
  def updateCostCategoryDefinition(): Request[UpdateCostCategoryDefinitionResponse, AWSError] = js.native
  def updateCostCategoryDefinition(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCostCategoryDefinitionResponse, Unit]): Request[UpdateCostCategoryDefinitionResponse, AWSError] = js.native
  /**
    * Updates an existing Cost Category. Changes made to the Cost Category rules will be used to categorize the current month’s expenses and future expenses. This won’t change categorization for the previous months.
    */
  def updateCostCategoryDefinition(params: UpdateCostCategoryDefinitionRequest): Request[UpdateCostCategoryDefinitionResponse, AWSError] = js.native
  def updateCostCategoryDefinition(
    params: UpdateCostCategoryDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCostCategoryDefinitionResponse, Unit]
  ): Request[UpdateCostCategoryDefinitionResponse, AWSError] = js.native
}
