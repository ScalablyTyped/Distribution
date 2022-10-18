package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type ActionHistories = js.Array[ActionHistory]

type ActionId = String

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
type ActionStatus = _ActionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STOP_EC2_INSTANCES
  - typings.awsSdk.awsSdkStrings.STOP_RDS_INSTANCES
  - java.lang.String
*/
type ActionSubType = _ActionSubType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPLY_IAM_POLICY
  - typings.awsSdk.awsSdkStrings.APPLY_SCP_POLICY
  - typings.awsSdk.awsSdkStrings.RUN_SSM_DOCUMENTS
  - java.lang.String
*/
type ActionType = _ActionType | String

type Actions = js.Array[Action]

type AdjustmentPeriod = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTOMATIC
  - typings.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
type ApprovalModel = _ApprovalModel | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HISTORICAL
  - typings.awsSdk.awsSdkStrings.FORECAST
  - java.lang.String
*/
type AutoAdjustType = _AutoAdjustType | String

type BudgetName = String

type BudgetNotificationsForAccountList = js.Array[BudgetNotificationsForAccount]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USAGE
  - typings.awsSdk.awsSdkStrings.COST
  - typings.awsSdk.awsSdkStrings.RI_UTILIZATION
  - typings.awsSdk.awsSdkStrings.RI_COVERAGE
  - typings.awsSdk.awsSdkStrings.SAVINGS_PLANS_UTILIZATION
  - typings.awsSdk.awsSdkStrings.SAVINGS_PLANS_COVERAGE
  - java.lang.String
*/
type BudgetType = _BudgetType | String

type BudgetedAndActualAmountsList = js.Array[BudgetedAndActualAmounts]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.EQUAL_TO
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

type CostFilters = StringDictionary[DimensionValues]

type DimensionValue = String

type DimensionValues = js.Array[DimensionValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - typings.awsSdk.awsSdkStrings.CREATE_ACTION
  - typings.awsSdk.awsSdkStrings.DELETE_ACTION
  - typings.awsSdk.awsSdkStrings.UPDATE_ACTION
  - typings.awsSdk.awsSdkStrings.EXECUTE_ACTION
  - java.lang.String
*/
type EventType = _EventType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPROVE_BUDGET_ACTION
  - typings.awsSdk.awsSdkStrings.RETRY_BUDGET_ACTION
  - typings.awsSdk.awsSdkStrings.REVERSE_BUDGET_ACTION
  - typings.awsSdk.awsSdkStrings.RESET_BUDGET_ACTION
  - java.lang.String
*/
type ExecutionType = _ExecutionType | String

type GenericString = String

type GenericTimestamp = js.Date

type Group = String

type Groups = js.Array[Group]

type InstanceId = String

type InstanceIds = js.Array[InstanceId]

type MaxResults = Double

type MaxResultsBudgetNotifications = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OK
  - typings.awsSdk.awsSdkStrings.ALARM
  - java.lang.String
*/
type NotificationState = _NotificationState | String

type NotificationThreshold = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTUAL
  - typings.awsSdk.awsSdkStrings.FORECASTED
  - java.lang.String
*/
type NotificationType = _NotificationType | String

type NotificationWithSubscribersList = js.Array[NotificationWithSubscribers]

type Notifications = js.Array[Notification]

type NullableBoolean = Boolean

type NumericValue = String

type PlannedBudgetLimits = StringDictionary[Spend]

type PolicyArn = String

type PolicyId = String

type Region = String

type Role = String

type RoleArn = String

type Roles = js.Array[Role]

type SubscriberAddress = String

type Subscribers = js.Array[Subscriber]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SNS
  - typings.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type SubscriptionType = _SubscriptionType | String

type TargetId = String

type TargetIds = js.Array[TargetId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERCENTAGE
  - typings.awsSdk.awsSdkStrings.ABSOLUTE_VALUE
  - java.lang.String
*/
type ThresholdType = _ThresholdType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DAILY
  - typings.awsSdk.awsSdkStrings.MONTHLY
  - typings.awsSdk.awsSdkStrings.QUARTERLY
  - typings.awsSdk.awsSdkStrings.ANNUALLY
  - java.lang.String
*/
type TimeUnit = _TimeUnit | String

type UnitValue = String

type User = String

type Users = js.Array[User]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-10-20`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
