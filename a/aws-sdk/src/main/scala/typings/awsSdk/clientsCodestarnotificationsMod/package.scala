package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ClientRequestToken = String

type CreatedTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BASIC
  - typings.awsSdk.awsSdkStrings.FULL
  - java.lang.String
*/
type DetailType = _DetailType | String

type EventTypeBatch = js.Array[EventTypeSummary]

type EventTypeId = String

type EventTypeIds = js.Array[EventTypeId]

type EventTypeName = String

type ForceUnsubscribeAll = Boolean

type LastModifiedTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - typings.awsSdk.awsSdkStrings.SERVICE_NAME
  - java.lang.String
*/
type ListEventTypesFilterName = _ListEventTypesFilterName | String

type ListEventTypesFilterValue = String

type ListEventTypesFilters = js.Array[ListEventTypesFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EVENT_TYPE_ID
  - typings.awsSdk.awsSdkStrings.CREATED_BY
  - typings.awsSdk.awsSdkStrings.RESOURCE
  - typings.awsSdk.awsSdkStrings.TARGET_ADDRESS
  - java.lang.String
*/
type ListNotificationRulesFilterName = _ListNotificationRulesFilterName | String

type ListNotificationRulesFilterValue = String

type ListNotificationRulesFilters = js.Array[ListNotificationRulesFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TARGET_TYPE
  - typings.awsSdk.awsSdkStrings.TARGET_ADDRESS
  - typings.awsSdk.awsSdkStrings.TARGET_STATUS
  - java.lang.String
*/
type ListTargetsFilterName = _ListTargetsFilterName | String

type ListTargetsFilterValue = String

type ListTargetsFilters = js.Array[ListTargetsFilter]

type MaxResults = Double

type NextToken = String

type NotificationRuleArn = String

type NotificationRuleBatch = js.Array[NotificationRuleSummary]

type NotificationRuleCreatedBy = String

type NotificationRuleId = String

type NotificationRuleName = String

type NotificationRuleResource = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type NotificationRuleStatus = _NotificationRuleStatus | String

type ResourceType = String

type ServiceName = String

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = StringDictionary[TagValue]

type TargetAddress = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UNREACHABLE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.DEACTIVATED
  - java.lang.String
*/
type TargetStatus = _TargetStatus | String

type TargetType = String

type Targets = js.Array[Target]

type TargetsBatch = js.Array[TargetSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-10-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
