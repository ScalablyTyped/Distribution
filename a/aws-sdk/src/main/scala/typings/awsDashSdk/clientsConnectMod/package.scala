package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsConnectMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.LT
  import typings.awsDashSdk.awsDashSdkStrings.VOICE
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ARN = String
  type AfterContactWorkTimeLimit = Double
  type AgentFirstName = String
  type AgentLastName = String
  type AgentUsername = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = StringDictionary[AttributeValue]
  type AutoAccept = Boolean
  type Channel = VOICE | String
  type Channels = js.Array[Channel]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = String
  type Comparison = LT | String
  type ContactFlowId = String
  type ContactId = String
  type CurrentMetricDataCollections = js.Array[CurrentMetricData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_ONLINE
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_ON_CALL
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_NON_PRODUCTIVE
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_AFTER_CONTACT_WORK
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_ERROR
    - typings.awsDashSdk.awsDashSdkStrings.AGENTS_STAFFED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_IN_QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.OLDEST_CONTACT_AGE
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_SCHEDULED
    - java.lang.String
  */
  type CurrentMetricName = _CurrentMetricName | String
  type CurrentMetricResults = js.Array[CurrentMetricResult]
  type CurrentMetrics = js.Array[CurrentMetric]
  type DirectoryUserId = String
  type Email = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.CHANNEL
    - java.lang.String
  */
  type Grouping = _Grouping | String
  type Groupings = js.Array[Grouping]
  type HierarchyGroupId = String
  type HierarchyGroupName = String
  type HierarchyGroupSummaryList = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId = String
  type HierarchyLevelName = String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_HANDLED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_ABANDONED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_CONSULTED
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_AGENT_HUNG_UP_FIRST
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_HANDLED_INCOMING
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_HANDLED_OUTBOUND
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_HOLD_ABANDONS
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_TRANSFERRED_IN
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_TRANSFERRED_OUT
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE
    - typings.awsDashSdk.awsDashSdkStrings.CONTACTS_MISSED
    - typings.awsDashSdk.awsDashSdkStrings.CALLBACK_CONTACTS_HANDLED
    - typings.awsDashSdk.awsDashSdkStrings.API_CONTACTS_HANDLED
    - typings.awsDashSdk.awsDashSdkStrings.OCCUPANCY
    - typings.awsDashSdk.awsDashSdkStrings.HANDLE_TIME
    - typings.awsDashSdk.awsDashSdkStrings.AFTER_CONTACT_WORK_TIME
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED_TIME
    - typings.awsDashSdk.awsDashSdkStrings.ABANDON_TIME
    - typings.awsDashSdk.awsDashSdkStrings.QUEUE_ANSWER_TIME
    - typings.awsDashSdk.awsDashSdkStrings.HOLD_TIME
    - typings.awsDashSdk.awsDashSdkStrings.INTERACTION_TIME
    - typings.awsDashSdk.awsDashSdkStrings.INTERACTION_AND_HOLD_TIME
    - typings.awsDashSdk.awsDashSdkStrings.SERVICE_LEVEL
    - java.lang.String
  */
  type HistoricalMetricName = _HistoricalMetricName | String
  type HistoricalMetricResults = js.Array[HistoricalMetricResult]
  type HistoricalMetrics = js.Array[HistoricalMetric]
  type InstanceId = String
  type MaxResult100 = Double
  type MaxResult1000 = Double
  type NextToken = String
  type Password = String
  type PhoneNumber = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SOFT_PHONE
    - typings.awsDashSdk.awsDashSdkStrings.DESK_PHONE
    - java.lang.String
  */
  type PhoneType = _PhoneType | String
  type QueueId = String
  type Queues = js.Array[QueueId]
  type RoutingProfileId = String
  type RoutingProfileName = String
  type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]
  type SecurityProfileId = String
  type SecurityProfileIds = js.Array[SecurityProfileId]
  type SecurityProfileName = String
  type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]
  type SecurityToken = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUM
    - typings.awsDashSdk.awsDashSdkStrings.MAX
    - typings.awsDashSdk.awsDashSdkStrings.AVG
    - java.lang.String
  */
  type Statistic = _Statistic | String
  type ThresholdValue = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SECONDS
    - typings.awsDashSdk.awsDashSdkStrings.COUNT
    - typings.awsDashSdk.awsDashSdkStrings.PERCENT
    - java.lang.String
  */
  type Unit = _Unit | String
  type UserId = String
  type UserSummaryList = js.Array[UserSummary]
  type Value = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-08-08`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type timestamp = Date
}
