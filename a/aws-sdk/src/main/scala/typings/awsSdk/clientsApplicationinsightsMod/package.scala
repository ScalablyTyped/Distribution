package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ACCOUNT_BASED
import typings.awsSdk.awsSdkStrings.INSIGHTS_FEEDBACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AffectedResource = String

type AmazonResourceName = String

type ApplicationComponentList = js.Array[ApplicationComponent]

type ApplicationInfoList = js.Array[ApplicationInfo]

type AutoConfigEnabled = Boolean

type AutoCreate = Boolean

type CWEMonitorEnabled = Boolean

type CloudWatchEventDetailType = String

type CloudWatchEventId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.CODE_DEPLOY
  - typings.awsSdk.awsSdkStrings.HEALTH
  - typings.awsSdk.awsSdkStrings.RDS
  - java.lang.String
*/
type CloudWatchEventSource = _CloudWatchEventSource | String

type CodeDeployApplication = String

type CodeDeployDeploymentGroup = String

type CodeDeployDeploymentId = String

type CodeDeployInstanceGroupId = String

type CodeDeployState = String

type ComponentConfiguration = String

type ComponentName = String

type ConfigurationEventDetail = String

type ConfigurationEventList = js.Array[ConfigurationEvent]

type ConfigurationEventMonitoredResourceARN = String

type ConfigurationEventResourceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM
  - typings.awsSdk.awsSdkStrings.CLOUDWATCH_LOG
  - typings.awsSdk.awsSdkStrings.CLOUDFORMATION
  - typings.awsSdk.awsSdkStrings.SSM_ASSOCIATION
  - java.lang.String
*/
type ConfigurationEventResourceType = _ConfigurationEventResourceType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.WARN
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type ConfigurationEventStatus = _ConfigurationEventStatus | String

type ConfigurationEventTime = js.Date

type CustomComponentName = String

type DetectedWorkload = StringDictionary[WorkloadMetaData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESOURCE_GROUP_BASED
  - typings.awsSdk.awsSdkStrings.ACCOUNT_BASED
  - java.lang.String
*/
type DiscoveryType = _DiscoveryType | String

type EbsCause = String

type EbsEvent = String

type EbsRequestId = String

type EbsResult = String

type Ec2State = String

type EndTime = js.Date

type Feedback = StringDictionary[FeedbackValue]

type FeedbackKey = INSIGHTS_FEEDBACK | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_SPECIFIED
  - typings.awsSdk.awsSdkStrings.USEFUL
  - typings.awsSdk.awsSdkStrings.NOT_USEFUL
  - java.lang.String
*/
type FeedbackValue = _FeedbackValue | String

type GroupingType = ACCOUNT_BASED | String

type HealthEventArn = String

type HealthEventDescription = String

type HealthEventTypeCategory = String

type HealthEventTypeCode = String

type HealthService = String

type Insights = String

type LastRecurrenceTime = js.Date

type LifeCycle = String

type LineTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.WARN
  - typings.awsSdk.awsSdkStrings.INFO
  - java.lang.String
*/
type LogFilter = _LogFilter | String

type LogGroup = String

type LogPatternList = js.Array[LogPattern]

type LogPatternName = String

type LogPatternRank = Double

type LogPatternRegex = String

type LogPatternSetList = js.Array[LogPatternSetName]

type LogPatternSetName = String

type LogText = String

type MaxEntities = Double

type MetaDataKey = String

type MetaDataValue = String

type MetricName = String

type MetricNamespace = String

type Monitor = Boolean

type ObservationId = String

type ObservationList = js.Array[Observation]

type OpsCenterEnabled = Boolean

type OpsItemSNSTopicArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WINDOWS
  - typings.awsSdk.awsSdkStrings.LINUX
  - java.lang.String
*/
type OsType = _OsType | String

type PaginationToken = String

type ProblemId = String

type ProblemList = js.Array[Problem]

type RdsEventCategories = String

type RdsEventMessage = String

type RecurringCount = Double

type Remarks = String

type RemoveSNSTopic = Boolean

type ResourceARN = String

type ResourceGroupName = String

type ResourceList = js.Array[ResourceARN]

type ResourceType = String

type S3EventName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Informative
  - typings.awsSdk.awsSdkStrings.Low_
  - typings.awsSdk.awsSdkStrings.Medium_
  - typings.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type SeverityLevel = _SeverityLevel | String

type SourceARN = String

type SourceType = String

type StartTime = js.Date

type StatesArn = String

type StatesExecutionArn = String

type StatesInput = String

type StatesStatus = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IGNORE
  - typings.awsSdk.awsSdkStrings.RESOLVED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RECURRING
  - java.lang.String
*/
type Status = _Status | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.DEFAULT
  - typings.awsSdk.awsSdkStrings.DOT_NET_CORE
  - typings.awsSdk.awsSdkStrings.DOT_NET_WORKER
  - typings.awsSdk.awsSdkStrings.DOT_NET_WEB_TIER
  - typings.awsSdk.awsSdkStrings.DOT_NET_WEB
  - typings.awsSdk.awsSdkStrings.SQL_SERVER
  - typings.awsSdk.awsSdkStrings.SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP
  - typings.awsSdk.awsSdkStrings.MYSQL
  - typings.awsSdk.awsSdkStrings.POSTGRESQL
  - typings.awsSdk.awsSdkStrings.JAVA_JMX
  - typings.awsSdk.awsSdkStrings.ORACLE
  - typings.awsSdk.awsSdkStrings.SAP_HANA_MULTI_NODE
  - typings.awsSdk.awsSdkStrings.SAP_HANA_SINGLE_NODE
  - typings.awsSdk.awsSdkStrings.SAP_HANA_HIGH_AVAILABILITY
  - typings.awsSdk.awsSdkStrings.SQL_SERVER_FAILOVER_CLUSTER_INSTANCE
  - typings.awsSdk.awsSdkStrings.SHAREPOINT
  - typings.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY
  - java.lang.String
*/
type Tier = _Tier | String

type Title = String

type Unit = String

type Value = Double

type WorkloadMetaData = StringDictionary[MetaDataValue]

type XRayErrorPercent = Double

type XRayFaultPercent = Double

type XRayNodeName = String

type XRayNodeType = String

type XRayRequestAverageLatency = Double

type XRayRequestCount = Double

type XRayThrottlePercent = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-11-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
