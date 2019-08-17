package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCostexplorerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PAYER
    - typings.awsDashSdk.awsDashSdkStrings.LINKED
    - java.lang.String
  */
  type AccountScope = _AccountScope | String
  type AmortizedRecurringFee = String
  type AmortizedUpfrontFee = String
  type AttributeType = String
  type AttributeValue = String
  type Attributes = StringDictionary[AttributeValue]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COST_AND_USAGE
    - typings.awsDashSdk.awsDashSdkStrings.RESERVATIONS
    - java.lang.String
  */
  type Context = _Context | String
  type CoverageHoursPercentage = String
  type CoverageNormalizedUnitsPercentage = String
  type CoveragesByTime = js.Array[CoverageByTime]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AZ
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.LINKED_ACCOUNT
    - typings.awsDashSdk.awsDashSdkStrings.OPERATION
    - typings.awsDashSdk.awsDashSdkStrings.PURCHASE_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.REGION
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE
    - typings.awsDashSdk.awsDashSdkStrings.USAGE_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.USAGE_TYPE_GROUP
    - typings.awsDashSdk.awsDashSdkStrings.RECORD_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.OPERATING_SYSTEM
    - typings.awsDashSdk.awsDashSdkStrings.TENANCY
    - typings.awsDashSdk.awsDashSdkStrings.SCOPE
    - typings.awsDashSdk.awsDashSdkStrings.PLATFORM
    - typings.awsDashSdk.awsDashSdkStrings.SUBSCRIPTION_ID
    - typings.awsDashSdk.awsDashSdkStrings.LEGAL_ENTITY_NAME
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYMENT_OPTION
    - typings.awsDashSdk.awsDashSdkStrings.DATABASE_ENGINE
    - typings.awsDashSdk.awsDashSdkStrings.CACHE_ENGINE
    - typings.awsDashSdk.awsDashSdkStrings.INSTANCE_TYPE_FAMILY
    - typings.awsDashSdk.awsDashSdkStrings.BILLING_ENTITY
    - typings.awsDashSdk.awsDashSdkStrings.RESERVATION_ID
    - typings.awsDashSdk.awsDashSdkStrings.RIGHTSIZING_TYPE
    - java.lang.String
  */
  type Dimension = _Dimension | String
  type DimensionValuesWithAttributesList = js.Array[DimensionValuesWithAttributes]
  type Entity = String
  type Estimated = Boolean
  type Expressions = js.Array[Expression]
  type ForecastResultsByTime = js.Array[ForecastResult]
  type GenericBoolean = Boolean
  type GenericString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DAILY
    - typings.awsDashSdk.awsDashSdkStrings.MONTHLY
    - typings.awsDashSdk.awsDashSdkStrings.HOURLY
    - java.lang.String
  */
  type Granularity = _Granularity | String
  type GroupDefinitionKey = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DIMENSION
    - typings.awsDashSdk.awsDashSdkStrings.TAG
    - java.lang.String
  */
  type GroupDefinitionType = _GroupDefinitionType | String
  type GroupDefinitions = js.Array[GroupDefinition]
  type Groups = js.Array[Group]
  type Key = String
  type Keys = js.Array[Key]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SEVEN_DAYS
    - typings.awsDashSdk.awsDashSdkStrings.THIRTY_DAYS
    - typings.awsDashSdk.awsDashSdkStrings.SIXTY_DAYS
    - java.lang.String
  */
  type LookbackPeriodInDays = _LookbackPeriodInDays | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLENDED_COST
    - typings.awsDashSdk.awsDashSdkStrings.UNBLENDED_COST
    - typings.awsDashSdk.awsDashSdkStrings.AMORTIZED_COST
    - typings.awsDashSdk.awsDashSdkStrings.NET_UNBLENDED_COST
    - typings.awsDashSdk.awsDashSdkStrings.NET_AMORTIZED_COST
    - typings.awsDashSdk.awsDashSdkStrings.USAGE_QUANTITY
    - typings.awsDashSdk.awsDashSdkStrings.NORMALIZED_USAGE_AMOUNT
    - java.lang.String
  */
  type Metric = _Metric | String
  type MetricAmount = String
  type MetricName = String
  type MetricNames = js.Array[MetricName]
  type MetricUnit = String
  type Metrics = StringDictionary[MetricValue]
  type NetRISavings = String
  type NextPageToken = String
  type NonNegativeInteger = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.CONVERTIBLE
    - java.lang.String
  */
  type OfferingClass = _OfferingClass | String
  type OnDemandCost = String
  type OnDemandCostOfRIHoursUsed = String
  type OnDemandHours = String
  type OnDemandNormalizedUnits = String
  type PageSize = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NO_UPFRONT
    - typings.awsDashSdk.awsDashSdkStrings.PARTIAL_UPFRONT
    - typings.awsDashSdk.awsDashSdkStrings.ALL_UPFRONT
    - typings.awsDashSdk.awsDashSdkStrings.LIGHT_UTILIZATION
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM_UTILIZATION
    - typings.awsDashSdk.awsDashSdkStrings.HEAVY_UTILIZATION
    - java.lang.String
  */
  type PaymentOption = _PaymentOption | String
  type PredictionIntervalLevel = Double
  type PurchasedHours = String
  type PurchasedUnits = String
  type ReservationCoverageGroups = js.Array[ReservationCoverageGroup]
  type ReservationGroupKey = String
  type ReservationGroupValue = String
  type ReservationPurchaseRecommendationDetails = js.Array[ReservationPurchaseRecommendationDetail]
  type ReservationPurchaseRecommendations = js.Array[ReservationPurchaseRecommendation]
  type ReservationUtilizationGroups = js.Array[ReservationUtilizationGroup]
  type ReservedHours = String
  type ReservedNormalizedUnits = String
  type ResultsByTime = js.Array[ResultByTime]
  type RightsizingRecommendationList = js.Array[RightsizingRecommendation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TERMINATE
    - typings.awsDashSdk.awsDashSdkStrings.MODIFY
    - java.lang.String
  */
  type RightsizingType = _RightsizingType | String
  type SearchString = String
  type TagKey = String
  type TagList = js.Array[Entity]
  type TagValuesList = js.Array[TagValues]
  type TargetInstancesList = js.Array[TargetInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ONE_YEAR
    - typings.awsDashSdk.awsDashSdkStrings.THREE_YEARS
    - java.lang.String
  */
  type TermInYears = _TermInYears | String
  type TotalActualHours = String
  type TotalActualUnits = String
  type TotalAmortizedFee = String
  type TotalPotentialRISavings = String
  type TotalRunningHours = String
  type TotalRunningNormalizedUnits = String
  type UnusedHours = String
  type UnusedUnits = String
  type UtilizationPercentage = String
  type UtilizationPercentageInUnits = String
  type UtilizationsByTime = js.Array[UtilizationByTime]
  type Value = String
  type Values = js.Array[Value]
  type YearMonthDay = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
