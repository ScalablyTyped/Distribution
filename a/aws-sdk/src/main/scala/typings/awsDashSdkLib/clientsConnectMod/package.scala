package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsConnectMod {
  type ARN = java.lang.String
  type AfterContactWorkTimeLimit = scala.Double
  type AgentFirstName = java.lang.String
  type AgentLastName = java.lang.String
  type AgentUsername = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[AttributeValue]
  type AutoAccept = scala.Boolean
  type Channel = awsDashSdkLib.awsDashSdkLibStrings.VOICE | java.lang.String
  type Channels = js.Array[Channel]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientToken = java.lang.String
  type Comparison = awsDashSdkLib.awsDashSdkLibStrings.LT | java.lang.String
  type ContactFlowId = java.lang.String
  type ContactId = java.lang.String
  type CurrentMetricDataCollections = js.Array[CurrentMetricData]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AGENTS_ONLINE
    - awsDashSdkLib.awsDashSdkLibStrings.AGENTS_AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.AGENTS_ON_CALL
    - awsDashSdkLib.awsDashSdkLibStrings.AGENTS_NON_PRODUCTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.AGENTS_AFTER_CONTACT_WORK
    - awsDashSdkLib.awsDashSdkLibStrings.AGENTS_ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.AGENTS_STAFFED
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_IN_QUEUE
    - awsDashSdkLib.awsDashSdkLibStrings.OLDEST_CONTACT_AGE
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_SCHEDULED
    - java.lang.String
  */
  type CurrentMetricName = _CurrentMetricName | java.lang.String
  type CurrentMetricResults = js.Array[CurrentMetricResult]
  type CurrentMetrics = js.Array[CurrentMetric]
  type DirectoryUserId = java.lang.String
  type Email = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUE
    - awsDashSdkLib.awsDashSdkLibStrings.CHANNEL
    - java.lang.String
  */
  type Grouping = _Grouping | java.lang.String
  type Groupings = js.Array[Grouping]
  type HierarchyGroupId = java.lang.String
  type HierarchyGroupName = java.lang.String
  type HierarchyGroupSummaryList = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId = java.lang.String
  type HierarchyLevelName = java.lang.String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_QUEUED
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_HANDLED
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_ABANDONED
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_CONSULTED
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_AGENT_HUNG_UP_FIRST
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_HANDLED_INCOMING
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_HANDLED_OUTBOUND
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_HOLD_ABANDONS
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_TRANSFERRED_IN
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_TRANSFERRED_OUT
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACTS_MISSED
    - awsDashSdkLib.awsDashSdkLibStrings.CALLBACK_CONTACTS_HANDLED
    - awsDashSdkLib.awsDashSdkLibStrings.API_CONTACTS_HANDLED
    - awsDashSdkLib.awsDashSdkLibStrings.OCCUPANCY
    - awsDashSdkLib.awsDashSdkLibStrings.HANDLE_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.AFTER_CONTACT_WORK_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUED_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.ABANDON_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUE_ANSWER_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.HOLD_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.INTERACTION_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.INTERACTION_AND_HOLD_TIME
    - awsDashSdkLib.awsDashSdkLibStrings.SERVICE_LEVEL
    - java.lang.String
  */
  type HistoricalMetricName = _HistoricalMetricName | java.lang.String
  type HistoricalMetricResults = js.Array[HistoricalMetricResult]
  type HistoricalMetrics = js.Array[HistoricalMetric]
  type InstanceId = java.lang.String
  type MaxResult100 = scala.Double
  type MaxResult1000 = scala.Double
  type NextToken = java.lang.String
  type Password = java.lang.String
  type PhoneNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SOFT_PHONE
    - awsDashSdkLib.awsDashSdkLibStrings.DESK_PHONE
    - java.lang.String
  */
  type PhoneType = _PhoneType | java.lang.String
  type QueueId = java.lang.String
  type Queues = js.Array[QueueId]
  type RoutingProfileId = java.lang.String
  type RoutingProfileName = java.lang.String
  type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]
  type SecurityProfileId = java.lang.String
  type SecurityProfileIds = js.Array[SecurityProfileId]
  type SecurityProfileName = java.lang.String
  type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]
  type SecurityToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUM
    - awsDashSdkLib.awsDashSdkLibStrings.MAX
    - awsDashSdkLib.awsDashSdkLibStrings.AVG
    - java.lang.String
  */
  type Statistic = _Statistic | java.lang.String
  type ThresholdValue = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SECONDS
    - awsDashSdkLib.awsDashSdkLibStrings.COUNT
    - awsDashSdkLib.awsDashSdkLibStrings.PERCENT
    - java.lang.String
  */
  type Unit = _Unit | java.lang.String
  type UserId = java.lang.String
  type UserSummaryList = js.Array[UserSummary]
  type Value = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-08-08`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type timestamp = stdLib.Date
}
