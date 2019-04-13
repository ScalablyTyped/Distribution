package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCostexplorerMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PAYER
    - awsDashSdkLib.awsDashSdkLibStrings.LINKED
    - java.lang.String
  */
  type AccountScope = _AccountScope | java.lang.String
  type AmortizedRecurringFee = java.lang.String
  type AmortizedUpfrontFee = java.lang.String
  type AttributeType = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COST_AND_USAGE
    - awsDashSdkLib.awsDashSdkLibStrings.RESERVATIONS
    - java.lang.String
  */
  type Context = _Context | java.lang.String
  type CoverageHoursPercentage = java.lang.String
  type CoverageNormalizedUnitsPercentage = java.lang.String
  type CoveragesByTime = js.Array[CoverageByTime]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AZ
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.LINKED_ACCOUNT
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATION
    - awsDashSdkLib.awsDashSdkLibStrings.PURCHASE_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.REGION
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE
    - awsDashSdkLib.awsDashSdkLibStrings.USAGE_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.USAGE_TYPE_GROUP
    - awsDashSdkLib.awsDashSdkLibStrings.RECORD_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.OPERATING_SYSTEM
    - awsDashSdkLib.awsDashSdkLibStrings.TENANCY
    - awsDashSdkLib.awsDashSdkLibStrings.SCOPE
    - awsDashSdkLib.awsDashSdkLibStrings.PLATFORM
    - awsDashSdkLib.awsDashSdkLibStrings.SUBSCRIPTION_ID
    - awsDashSdkLib.awsDashSdkLibStrings.LEGAL_ENTITY_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.DEPLOYMENT_OPTION
    - awsDashSdkLib.awsDashSdkLibStrings.DATABASE_ENGINE
    - awsDashSdkLib.awsDashSdkLibStrings.CACHE_ENGINE
    - awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_TYPE_FAMILY
    - awsDashSdkLib.awsDashSdkLibStrings.BILLING_ENTITY
    - awsDashSdkLib.awsDashSdkLibStrings.RESERVATION_ID
    - java.lang.String
  */
  type Dimension = _Dimension | java.lang.String
  type DimensionValuesWithAttributesList = js.Array[DimensionValuesWithAttributes]
  type Entity = java.lang.String
  type Estimated = scala.Boolean
  type Expressions = js.Array[Expression]
  type ForecastResultsByTime = js.Array[ForecastResult]
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DAILY
    - awsDashSdkLib.awsDashSdkLibStrings.MONTHLY
    - awsDashSdkLib.awsDashSdkLibStrings.HOURLY
    - java.lang.String
  */
  type Granularity = _Granularity | java.lang.String
  type GroupDefinitionKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DIMENSION
    - awsDashSdkLib.awsDashSdkLibStrings.TAG
    - java.lang.String
  */
  type GroupDefinitionType = _GroupDefinitionType | java.lang.String
  type GroupDefinitions = js.Array[GroupDefinition]
  type Groups = js.Array[Group]
  type Key = java.lang.String
  type Keys = js.Array[Key]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SEVEN_DAYS
    - awsDashSdkLib.awsDashSdkLibStrings.THIRTY_DAYS
    - awsDashSdkLib.awsDashSdkLibStrings.SIXTY_DAYS
    - java.lang.String
  */
  type LookbackPeriodInDays = _LookbackPeriodInDays | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BLENDED_COST
    - awsDashSdkLib.awsDashSdkLibStrings.UNBLENDED_COST
    - awsDashSdkLib.awsDashSdkLibStrings.AMORTIZED_COST
    - awsDashSdkLib.awsDashSdkLibStrings.NET_UNBLENDED_COST
    - awsDashSdkLib.awsDashSdkLibStrings.NET_AMORTIZED_COST
    - awsDashSdkLib.awsDashSdkLibStrings.USAGE_QUANTITY
    - awsDashSdkLib.awsDashSdkLibStrings.NORMALIZED_USAGE_AMOUNT
    - java.lang.String
  */
  type Metric = _Metric | java.lang.String
  type MetricAmount = java.lang.String
  type MetricName = java.lang.String
  type MetricNames = js.Array[MetricName]
  type MetricUnit = java.lang.String
  type Metrics = org.scalablytyped.runtime.StringDictionary[MetricValue]
  type NetRISavings = java.lang.String
  type NextPageToken = java.lang.String
  type NonNegativeInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.CONVERTIBLE
    - java.lang.String
  */
  type OfferingClass = _OfferingClass | java.lang.String
  type OnDemandCost = java.lang.String
  type OnDemandCostOfRIHoursUsed = java.lang.String
  type OnDemandHours = java.lang.String
  type OnDemandNormalizedUnits = java.lang.String
  type PageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NO_UPFRONT
    - awsDashSdkLib.awsDashSdkLibStrings.PARTIAL_UPFRONT
    - awsDashSdkLib.awsDashSdkLibStrings.ALL_UPFRONT
    - awsDashSdkLib.awsDashSdkLibStrings.LIGHT_UTILIZATION
    - awsDashSdkLib.awsDashSdkLibStrings.MEDIUM_UTILIZATION
    - awsDashSdkLib.awsDashSdkLibStrings.HEAVY_UTILIZATION
    - java.lang.String
  */
  type PaymentOption = _PaymentOption | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ONE_YEAR
    - awsDashSdkLib.awsDashSdkLibStrings.THREE_YEARS
    - java.lang.String
  */
  type TermInYears = _TermInYears | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-10-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
