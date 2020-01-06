package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCodestarnotificationsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = String
  type CreatedTimestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BASIC
    - typings.awsDashSdk.awsDashSdkStrings.FULL
    - java.lang.String
  */
  type DetailType = _DetailType | String
  type EventTypeBatch = js.Array[EventTypeSummary]
  type EventTypeId = String
  type EventTypeIds = js.Array[EventTypeId]
  type EventTypeName = String
  type ForceUnsubscribeAll = Boolean
  type LastModifiedTimestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_NAME
    - java.lang.String
  */
  type ListEventTypesFilterName = _ListEventTypesFilterName | String
  type ListEventTypesFilterValue = String
  type ListEventTypesFilters = js.Array[ListEventTypesFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EVENT_TYPE_ID
    - typings.awsDashSdk.awsDashSdkStrings.CREATED_BY
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE
    - typings.awsDashSdk.awsDashSdkStrings.TARGET_ADDRESS
    - java.lang.String
  */
  type ListNotificationRulesFilterName = _ListNotificationRulesFilterName | String
  type ListNotificationRulesFilterValue = String
  type ListNotificationRulesFilters = js.Array[ListNotificationRulesFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TARGET_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.TARGET_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.TARGET_STATUS
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
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
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
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.UNREACHABLE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DEACTIVATED
    - java.lang.String
  */
  type TargetStatus = _TargetStatus | String
  type TargetType = String
  type Targets = js.Array[Target]
  type TargetsBatch = js.Array[TargetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-10-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
