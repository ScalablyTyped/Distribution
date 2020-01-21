package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object budgetsMod {
  type AccountId = java.lang.String
  type BudgetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USAGE
    - typings.awsSdk.awsSdkStrings.COST
    - typings.awsSdk.awsSdkStrings.RI_UTILIZATION
    - typings.awsSdk.awsSdkStrings.RI_COVERAGE
    - typings.awsSdk.awsSdkStrings.SAVINGS_PLANS_UTILIZATION
    - typings.awsSdk.awsSdkStrings.SAVINGS_PLANS_COVERAGE
    - java.lang.String
  */
  type BudgetType = typings.awsSdk.budgetsMod._BudgetType | java.lang.String
  type BudgetedAndActualAmountsList = js.Array[typings.awsSdk.budgetsMod.BudgetedAndActualAmounts]
  type Budgets = js.Array[typings.awsSdk.budgetsMod.Budget]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.budgetsMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GREATER_THAN
    - typings.awsSdk.awsSdkStrings.LESS_THAN
    - typings.awsSdk.awsSdkStrings.EQUAL_TO
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.budgetsMod._ComparisonOperator | java.lang.String
  type CostFilters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.budgetsMod.DimensionValues]
  type DimensionValues = js.Array[typings.awsSdk.budgetsMod.GenericString]
  type GenericString = java.lang.String
  type GenericTimestamp = typings.std.Date
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OK
    - typings.awsSdk.awsSdkStrings.ALARM
    - java.lang.String
  */
  type NotificationState = typings.awsSdk.budgetsMod._NotificationState | java.lang.String
  type NotificationThreshold = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTUAL
    - typings.awsSdk.awsSdkStrings.FORECASTED
    - java.lang.String
  */
  type NotificationType = typings.awsSdk.budgetsMod._NotificationType | java.lang.String
  type NotificationWithSubscribersList = js.Array[typings.awsSdk.budgetsMod.NotificationWithSubscribers]
  type Notifications = js.Array[typings.awsSdk.budgetsMod.Notification]
  type NullableBoolean = scala.Boolean
  type NumericValue = java.lang.String
  type PlannedBudgetLimits = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.budgetsMod.Spend]
  type SubscriberAddress = java.lang.String
  type Subscribers = js.Array[typings.awsSdk.budgetsMod.Subscriber]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SNS
    - typings.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type SubscriptionType = typings.awsSdk.budgetsMod._SubscriptionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PERCENTAGE
    - typings.awsSdk.awsSdkStrings.ABSOLUTE_VALUE
    - java.lang.String
  */
  type ThresholdType = typings.awsSdk.budgetsMod._ThresholdType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DAILY
    - typings.awsSdk.awsSdkStrings.MONTHLY
    - typings.awsSdk.awsSdkStrings.QUARTERLY
    - typings.awsSdk.awsSdkStrings.ANNUALLY
    - java.lang.String
  */
  type TimeUnit = typings.awsSdk.budgetsMod._TimeUnit | java.lang.String
  type UnitValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-10-20`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.budgetsMod._apiVersion | java.lang.String
}
