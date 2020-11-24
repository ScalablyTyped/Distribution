package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object budgetsMod {
  
  type AccountId = java.lang.String
  
  type ActionHistories = js.Array[typings.awsSdk.budgetsMod.ActionHistory]
  
  type ActionId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDBY
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.EXECUTION_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.EXECUTION_SUCCESS
    - typings.awsSdk.awsSdkStrings.EXECUTION_FAILURE
    - typings.awsSdk.awsSdkStrings.REVERSE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.REVERSE_SUCCESS
    - typings.awsSdk.awsSdkStrings.REVERSE_FAILURE
    - typings.awsSdk.awsSdkStrings.RESET_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.RESET_FAILURE
    - java.lang.String
  */
  type ActionStatus = typings.awsSdk.budgetsMod._ActionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STOP_EC2_INSTANCES
    - typings.awsSdk.awsSdkStrings.STOP_RDS_INSTANCES
    - java.lang.String
  */
  type ActionSubType = typings.awsSdk.budgetsMod._ActionSubType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APPLY_IAM_POLICY
    - typings.awsSdk.awsSdkStrings.APPLY_SCP_POLICY
    - typings.awsSdk.awsSdkStrings.RUN_SSM_DOCUMENTS
    - java.lang.String
  */
  type ActionType = typings.awsSdk.budgetsMod._ActionType | java.lang.String
  
  type Actions = js.Array[typings.awsSdk.budgetsMod.Action]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTOMATIC
    - typings.awsSdk.awsSdkStrings.MANUAL
    - java.lang.String
  */
  type ApprovalModel = typings.awsSdk.budgetsMod._ApprovalModel | java.lang.String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SYSTEM
    - typings.awsSdk.awsSdkStrings.CREATE_ACTION
    - typings.awsSdk.awsSdkStrings.DELETE_ACTION
    - typings.awsSdk.awsSdkStrings.UPDATE_ACTION
    - typings.awsSdk.awsSdkStrings.EXECUTE_ACTION
    - java.lang.String
  */
  type EventType = typings.awsSdk.budgetsMod._EventType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APPROVE_BUDGET_ACTION
    - typings.awsSdk.awsSdkStrings.RETRY_BUDGET_ACTION
    - typings.awsSdk.awsSdkStrings.REVERSE_BUDGET_ACTION
    - typings.awsSdk.awsSdkStrings.RESET_BUDGET_ACTION
    - java.lang.String
  */
  type ExecutionType = typings.awsSdk.budgetsMod._ExecutionType | java.lang.String
  
  type GenericString = java.lang.String
  
  type GenericTimestamp = typings.std.Date
  
  type Group = java.lang.String
  
  type Groups = js.Array[typings.awsSdk.budgetsMod.Group]
  
  type InstanceId = java.lang.String
  
  type InstanceIds = js.Array[typings.awsSdk.budgetsMod.InstanceId]
  
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
  
  type PolicyArn = java.lang.String
  
  type PolicyId = java.lang.String
  
  type Region = java.lang.String
  
  type Role = java.lang.String
  
  type RoleArn = java.lang.String
  
  type Roles = js.Array[typings.awsSdk.budgetsMod.Role]
  
  type SubscriberAddress = java.lang.String
  
  type Subscribers = js.Array[typings.awsSdk.budgetsMod.Subscriber]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SNS
    - typings.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type SubscriptionType = typings.awsSdk.budgetsMod._SubscriptionType | java.lang.String
  
  type TargetId = java.lang.String
  
  type TargetIds = js.Array[typings.awsSdk.budgetsMod.TargetId]
  
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
  
  type User = java.lang.String
  
  type Users = js.Array[typings.awsSdk.budgetsMod.User]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-10-20`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.budgetsMod._apiVersion | java.lang.String
}
