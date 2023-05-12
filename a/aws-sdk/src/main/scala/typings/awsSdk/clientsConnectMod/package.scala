package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EMAIL
import typings.awsSdk.awsSdkStrings.KMS
import typings.awsSdk.awsSdkStrings.LT
import typings.awsSdk.awsSdkStrings.PLAIN_TEXT
import typings.awsSdk.awsSdkStrings.STANDARD
import typings.awsSdk.awsSdkStrings.Unset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type ActionSummaries = js.Array[ActionSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_TASK
  - typings.awsSdk.awsSdkStrings.ASSIGN_CONTACT_CATEGORY
  - typings.awsSdk.awsSdkStrings.GENERATE_EVENTBRIDGE_EVENT
  - typings.awsSdk.awsSdkStrings.SEND_NOTIFICATION
  - java.lang.String
*/
type ActionType = _ActionType | java.lang.String

type AfterContactWorkTimeLimit = Double

type AgentContactReferenceList = js.Array[AgentContactReference]

type AgentFirstName = java.lang.String

type AgentLastName = java.lang.String

type AgentResourceId = java.lang.String

type AgentStatusDescription = java.lang.String

type AgentStatusId = java.lang.String

type AgentStatusName = java.lang.String

type AgentStatusOrderNumber = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AgentStatusState = _AgentStatusState | java.lang.String

type AgentStatusSummaryList = js.Array[AgentStatusSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROUTABLE
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.OFFLINE
  - java.lang.String
*/
type AgentStatusType = _AgentStatusType | java.lang.String

type AgentStatusTypes = js.Array[AgentStatusType]

type AgentUsername = java.lang.String

type AgentsMinOneMaxHundred = js.Array[UserId]

type AliasArn = java.lang.String

type AllowedAccessControlTags = StringDictionary[SecurityProfilePolicyValue]

type AllowedMonitorCapabilities = js.Array[MonitorCapability]

type ApproximateTotalCount = Double

type AssociationId = java.lang.String

type AttributeName = java.lang.String

type AttributeValue = java.lang.String

type Attributes = StringDictionary[AttributeValue]

type AttributesList = js.Array[Attribute]

type AutoAccept = scala.Boolean

type AvailableNumbersList = js.Array[AvailableNumberSummary]

type AwsRegion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROUTE_CURRENT_CHANNEL_ONLY
  - typings.awsSdk.awsSdkStrings.ROUTE_ANY_CHANNEL
  - java.lang.String
*/
type BehaviorType = _BehaviorType | java.lang.String

type Boolean = scala.Boolean

type BotName = java.lang.String

type BoxedBoolean = scala.Boolean

type BucketName = java.lang.String

type CampaignId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VOICE
  - typings.awsSdk.awsSdkStrings.CHAT
  - typings.awsSdk.awsSdkStrings.TASK
  - java.lang.String
*/
type Channel = _Channel | java.lang.String

type ChannelToCountMap = StringDictionary[IntegerCount]

type Channels = js.Array[Channel]

type ChatContent = java.lang.String

type ChatContentType = java.lang.String

type ChatDurationInMinutes = Double

type ChatStreamingEndpointARN = java.lang.String

type ClientToken = java.lang.String

type CommonNameLength127 = java.lang.String

type Comparison = LT | java.lang.String

type Concurrency = Double

type ContactFlowContent = java.lang.String

type ContactFlowDescription = java.lang.String

type ContactFlowId = java.lang.String

type ContactFlowModuleContent = java.lang.String

type ContactFlowModuleDescription = java.lang.String

type ContactFlowModuleId = java.lang.String

type ContactFlowModuleName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ARCHIVED
  - java.lang.String
*/
type ContactFlowModuleState = _ContactFlowModuleState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLISHED
  - typings.awsSdk.awsSdkStrings.SAVED
  - java.lang.String
*/
type ContactFlowModuleStatus = _ContactFlowModuleStatus | java.lang.String

type ContactFlowModulesSummaryList = js.Array[ContactFlowModuleSummary]

type ContactFlowName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ARCHIVED
  - java.lang.String
*/
type ContactFlowState = _ContactFlowState | java.lang.String

type ContactFlowSummaryList = js.Array[ContactFlowSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONTACT_FLOW
  - typings.awsSdk.awsSdkStrings.CUSTOMER_QUEUE
  - typings.awsSdk.awsSdkStrings.CUSTOMER_HOLD
  - typings.awsSdk.awsSdkStrings.CUSTOMER_WHISPER
  - typings.awsSdk.awsSdkStrings.AGENT_HOLD
  - typings.awsSdk.awsSdkStrings.AGENT_WHISPER
  - typings.awsSdk.awsSdkStrings.OUTBOUND_WHISPER
  - typings.awsSdk.awsSdkStrings.AGENT_TRANSFER
  - typings.awsSdk.awsSdkStrings.QUEUE_TRANSFER
  - java.lang.String
*/
type ContactFlowType = _ContactFlowType | java.lang.String

type ContactFlowTypes = js.Array[ContactFlowType]

type ContactId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INBOUND
  - typings.awsSdk.awsSdkStrings.OUTBOUND
  - typings.awsSdk.awsSdkStrings.TRANSFER
  - typings.awsSdk.awsSdkStrings.QUEUE_TRANSFER
  - typings.awsSdk.awsSdkStrings.CALLBACK
  - typings.awsSdk.awsSdkStrings.API
  - typings.awsSdk.awsSdkStrings.DISCONNECT
  - typings.awsSdk.awsSdkStrings.MONITOR
  - java.lang.String
*/
type ContactInitiationMethod = _ContactInitiationMethod | java.lang.String

type ContactReferences = StringDictionary[Reference]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCOMING
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.CONNECTING
  - typings.awsSdk.awsSdkStrings.CONNECTED
  - typings.awsSdk.awsSdkStrings.CONNECTED_ONHOLD
  - typings.awsSdk.awsSdkStrings.MISSED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.ENDED
  - typings.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type ContactState = _ContactState | java.lang.String

type ContactStates = js.Array[ContactState]

type Content = java.lang.String

type CreateSecurityProfileName = java.lang.String

type CurrentMetricDataCollections = js.Array[CurrentMetricData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENTS_ONLINE
  - typings.awsSdk.awsSdkStrings.AGENTS_AVAILABLE
  - typings.awsSdk.awsSdkStrings.AGENTS_ON_CALL
  - typings.awsSdk.awsSdkStrings.AGENTS_NON_PRODUCTIVE
  - typings.awsSdk.awsSdkStrings.AGENTS_AFTER_CONTACT_WORK
  - typings.awsSdk.awsSdkStrings.AGENTS_ERROR
  - typings.awsSdk.awsSdkStrings.AGENTS_STAFFED
  - typings.awsSdk.awsSdkStrings.CONTACTS_IN_QUEUE
  - typings.awsSdk.awsSdkStrings.OLDEST_CONTACT_AGE
  - typings.awsSdk.awsSdkStrings.CONTACTS_SCHEDULED
  - typings.awsSdk.awsSdkStrings.AGENTS_ON_CONTACT
  - typings.awsSdk.awsSdkStrings.SLOTS_ACTIVE
  - typings.awsSdk.awsSdkStrings.SLOTS_AVAILABLE
  - java.lang.String
*/
type CurrentMetricName = _CurrentMetricName | java.lang.String

type CurrentMetricResults = js.Array[CurrentMetricResult]

type CurrentMetricSortCriteriaMaxOne = js.Array[CurrentMetricSortCriteria]

type CurrentMetrics = js.Array[CurrentMetric]

type DefaultVocabularyList = js.Array[DefaultVocabulary]

type Delay = Double

type Description = java.lang.String

type Description250 = java.lang.String

type DimensionsV2Key = java.lang.String

type DimensionsV2Map = StringDictionary[DimensionsV2Value]

type DimensionsV2Value = java.lang.String

type DirectoryAlias = java.lang.String

type DirectoryId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SAML
  - typings.awsSdk.awsSdkStrings.CONNECT_MANAGED
  - typings.awsSdk.awsSdkStrings.EXISTING_DIRECTORY
  - java.lang.String
*/
type DirectoryType = _DirectoryType | java.lang.String

type DirectoryUserId = java.lang.String

type DisplayName = java.lang.String

type DistributionList = js.Array[Distribution]

type Email = java.lang.String

type EncryptionType = KMS | java.lang.String

type EvaluationAnswerDataNumericValue = Double

type EvaluationAnswerDataStringValue = java.lang.String

type EvaluationAnswersInputMap = StringDictionary[EvaluationAnswerInput]

type EvaluationAnswersOutputMap = StringDictionary[EvaluationAnswerOutput]

type EvaluationFormDescription = java.lang.String

type EvaluationFormItemWeight = Double

type EvaluationFormItemsList = js.Array[EvaluationFormItem]

type EvaluationFormNumericQuestionOptionList = js.Array[EvaluationFormNumericQuestionOption]

type EvaluationFormQuestionAnswerScore = Double

type EvaluationFormQuestionInstructions = java.lang.String

type EvaluationFormQuestionTitle = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEXT
  - typings.awsSdk.awsSdkStrings.SINGLESELECT
  - typings.awsSdk.awsSdkStrings.NUMERIC
  - java.lang.String
*/
type EvaluationFormQuestionType = _EvaluationFormQuestionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUESTION_ONLY
  - typings.awsSdk.awsSdkStrings.SECTION_ONLY
  - java.lang.String
*/
type EvaluationFormScoringMode = _EvaluationFormScoringMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type EvaluationFormScoringStatus = _EvaluationFormScoringStatus | java.lang.String

type EvaluationFormSectionTitle = java.lang.String

type EvaluationFormSingleSelectQuestionAutomationOptionList = js.Array[EvaluationFormSingleSelectQuestionAutomationOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DROPDOWN
  - typings.awsSdk.awsSdkStrings.RADIO
  - java.lang.String
*/
type EvaluationFormSingleSelectQuestionDisplayMode = _EvaluationFormSingleSelectQuestionDisplayMode | java.lang.String

type EvaluationFormSingleSelectQuestionOptionList = js.Array[EvaluationFormSingleSelectQuestionOption]

type EvaluationFormSingleSelectQuestionOptionText = java.lang.String

type EvaluationFormSummaryList = js.Array[EvaluationFormSummary]

type EvaluationFormTitle = java.lang.String

type EvaluationFormVersionIsLocked = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DRAFT
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type EvaluationFormVersionStatus = _EvaluationFormVersionStatus | java.lang.String

type EvaluationFormVersionSummaryList = js.Array[EvaluationFormVersionSummary]

type EvaluationNoteString = java.lang.String

type EvaluationNotesMap = StringDictionary[EvaluationNote]

type EvaluationScorePercentage = Double

type EvaluationScoresMap = StringDictionary[EvaluationScore]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DRAFT
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - java.lang.String
*/
type EvaluationStatus = _EvaluationStatus | java.lang.String

type EvaluationSummaryList = js.Array[EvaluationSummary]

type EventBridgeActionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OnPostCallAnalysisAvailable
  - typings.awsSdk.awsSdkStrings.OnRealTimeCallAnalysisAvailable
  - typings.awsSdk.awsSdkStrings.OnPostChatAnalysisAvailable
  - typings.awsSdk.awsSdkStrings.OnZendeskTicketCreate
  - typings.awsSdk.awsSdkStrings.OnZendeskTicketStatusUpdate
  - typings.awsSdk.awsSdkStrings.OnSalesforceCaseCreate
  - typings.awsSdk.awsSdkStrings.OnContactEvaluationSubmit
  - java.lang.String
*/
type EventSourceName = _EventSourceName | java.lang.String

type FilterValueList = js.Array[ResourceArnOrId]

type FiltersV2List = js.Array[FilterV2]

type FunctionArn = java.lang.String

type FunctionArnsList = js.Array[FunctionArn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUE
  - typings.awsSdk.awsSdkStrings.CHANNEL
  - typings.awsSdk.awsSdkStrings.ROUTING_PROFILE
  - java.lang.String
*/
type Grouping = _Grouping | java.lang.String

type GroupingV2 = java.lang.String

type Groupings = js.Array[Grouping]

type GroupingsV2 = js.Array[GroupingV2]

type HierarchyGroupId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXACT
  - typings.awsSdk.awsSdkStrings.WITH_CHILD_GROUPS
  - java.lang.String
*/
type HierarchyGroupMatchType = _HierarchyGroupMatchType | java.lang.String

type HierarchyGroupName = java.lang.String

type HierarchyGroupSummaryList = js.Array[HierarchyGroupSummary]

type HierarchyLevelId = java.lang.String

type HierarchyLevelName = java.lang.String

type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONTACTS_QUEUED
  - typings.awsSdk.awsSdkStrings.CONTACTS_HANDLED
  - typings.awsSdk.awsSdkStrings.CONTACTS_ABANDONED
  - typings.awsSdk.awsSdkStrings.CONTACTS_CONSULTED
  - typings.awsSdk.awsSdkStrings.CONTACTS_AGENT_HUNG_UP_FIRST
  - typings.awsSdk.awsSdkStrings.CONTACTS_HANDLED_INCOMING
  - typings.awsSdk.awsSdkStrings.CONTACTS_HANDLED_OUTBOUND
  - typings.awsSdk.awsSdkStrings.CONTACTS_HOLD_ABANDONS
  - typings.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN
  - typings.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT
  - typings.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE
  - typings.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE
  - typings.awsSdk.awsSdkStrings.CONTACTS_MISSED
  - typings.awsSdk.awsSdkStrings.CALLBACK_CONTACTS_HANDLED
  - typings.awsSdk.awsSdkStrings.API_CONTACTS_HANDLED
  - typings.awsSdk.awsSdkStrings.OCCUPANCY
  - typings.awsSdk.awsSdkStrings.HANDLE_TIME
  - typings.awsSdk.awsSdkStrings.AFTER_CONTACT_WORK_TIME
  - typings.awsSdk.awsSdkStrings.QUEUED_TIME
  - typings.awsSdk.awsSdkStrings.ABANDON_TIME
  - typings.awsSdk.awsSdkStrings.QUEUE_ANSWER_TIME
  - typings.awsSdk.awsSdkStrings.HOLD_TIME
  - typings.awsSdk.awsSdkStrings.INTERACTION_TIME
  - typings.awsSdk.awsSdkStrings.INTERACTION_AND_HOLD_TIME
  - typings.awsSdk.awsSdkStrings.SERVICE_LEVEL
  - java.lang.String
*/
type HistoricalMetricName = _HistoricalMetricName | java.lang.String

type HistoricalMetricResults = js.Array[HistoricalMetricResult]

type HistoricalMetrics = js.Array[HistoricalMetric]

type Hours = Double

type Hours24Format = Double

type HoursOfOperationConfigList = js.Array[HoursOfOperationConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUNDAY
  - typings.awsSdk.awsSdkStrings.MONDAY
  - typings.awsSdk.awsSdkStrings.TUESDAY
  - typings.awsSdk.awsSdkStrings.WEDNESDAY
  - typings.awsSdk.awsSdkStrings.THURSDAY
  - typings.awsSdk.awsSdkStrings.FRIDAY
  - typings.awsSdk.awsSdkStrings.SATURDAY
  - java.lang.String
*/
type HoursOfOperationDays = _HoursOfOperationDays | java.lang.String

type HoursOfOperationDescription = java.lang.String

type HoursOfOperationId = java.lang.String

type HoursOfOperationName = java.lang.String

type HoursOfOperationSummaryList = js.Array[HoursOfOperationSummary]

type ISO8601Datetime = java.lang.String

type InboundCallsEnabled = scala.Boolean

type InstanceArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INBOUND_CALLS
  - typings.awsSdk.awsSdkStrings.OUTBOUND_CALLS
  - typings.awsSdk.awsSdkStrings.CONTACTFLOW_LOGS
  - typings.awsSdk.awsSdkStrings.CONTACT_LENS
  - typings.awsSdk.awsSdkStrings.AUTO_RESOLVE_BEST_VOICES
  - typings.awsSdk.awsSdkStrings.USE_CUSTOM_TTS_VOICES
  - typings.awsSdk.awsSdkStrings.EARLY_MEDIA
  - typings.awsSdk.awsSdkStrings.MULTI_PARTY_CONFERENCE
  - typings.awsSdk.awsSdkStrings.HIGH_VOLUME_OUTBOUND
  - typings.awsSdk.awsSdkStrings.ENHANCED_CONTACT_MONITORING
  - java.lang.String
*/
type InstanceAttributeType = _InstanceAttributeType | java.lang.String

type InstanceAttributeValue = java.lang.String

type InstanceId = java.lang.String

type InstanceIdOrArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - java.lang.String
*/
type InstanceStatus = _InstanceStatus | java.lang.String

type InstanceStorageConfigs = js.Array[InstanceStorageConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CHAT_TRANSCRIPTS
  - typings.awsSdk.awsSdkStrings.CALL_RECORDINGS
  - typings.awsSdk.awsSdkStrings.SCHEDULED_REPORTS
  - typings.awsSdk.awsSdkStrings.MEDIA_STREAMS
  - typings.awsSdk.awsSdkStrings.CONTACT_TRACE_RECORDS
  - typings.awsSdk.awsSdkStrings.AGENT_EVENTS
  - typings.awsSdk.awsSdkStrings.REAL_TIME_CONTACT_ANALYSIS_SEGMENTS
  - typings.awsSdk.awsSdkStrings.ATTACHMENTS
  - typings.awsSdk.awsSdkStrings.CONTACT_EVALUATIONS
  - java.lang.String
*/
type InstanceStorageResourceType = _InstanceStorageResourceType | java.lang.String

type InstanceSummaryList = js.Array[InstanceSummary]

type Integer = Double

type IntegerCount = Double

type IntegrationAssociationId = java.lang.String

type IntegrationAssociationSummaryList = js.Array[IntegrationAssociationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.VOICE_ID
  - typings.awsSdk.awsSdkStrings.PINPOINT_APP
  - typings.awsSdk.awsSdkStrings.WISDOM_ASSISTANT
  - typings.awsSdk.awsSdkStrings.WISDOM_KNOWLEDGE_BASE
  - typings.awsSdk.awsSdkStrings.CASES_DOMAIN
  - java.lang.String
*/
type IntegrationType = _IntegrationType | java.lang.String

type InvisibleTaskTemplateFields = js.Array[InvisibleFieldInfo]

type KeyId = java.lang.String

type LargeNextToken = java.lang.String

type LexBotConfigList = js.Array[LexBotConfig]

type LexBotsList = js.Array[LexBot]

type LexRegion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.V1
  - typings.awsSdk.awsSdkStrings.V2
  - java.lang.String
*/
type LexVersion = _LexVersion | java.lang.String

type ListPhoneNumbersSummaryList = js.Array[ListPhoneNumbersSummary]

type Long = Double

type MaxResult10 = Double

type MaxResult100 = Double

type MaxResult1000 = Double

type MaxResult2 = Double

type MaxResult200 = Double

type MaxResult25 = Double

type MaxResult7 = Double

type MediaConcurrencies = js.Array[MediaConcurrency]

type MetricDataCollectionsV2 = js.Array[MetricDataV2]

type MetricFilterValueList = js.Array[String]

type MetricFiltersV2List = js.Array[MetricFilterV2]

type MetricNameV2 = java.lang.String

type MetricResultsV2 = js.Array[MetricResultV2]

type MetricsV2 = js.Array[MetricV2]

type MinutesLimit60 = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SILENT_MONITOR
  - typings.awsSdk.awsSdkStrings.BARGE
  - java.lang.String
*/
type MonitorCapability = _MonitorCapability | java.lang.String

type Name = java.lang.String

type Name128 = java.lang.String

type NextToken = java.lang.String

type NextToken2500 = java.lang.String

type NotificationContentType = PLAIN_TEXT | java.lang.String

type NotificationDeliveryType = EMAIL | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OVERALL_CUSTOMER_SENTIMENT_SCORE
  - typings.awsSdk.awsSdkStrings.OVERALL_AGENT_SENTIMENT_SCORE
  - typings.awsSdk.awsSdkStrings.NON_TALK_TIME
  - typings.awsSdk.awsSdkStrings.NON_TALK_TIME_PERCENTAGE
  - typings.awsSdk.awsSdkStrings.NUMBER_OF_INTERRUPTIONS
  - typings.awsSdk.awsSdkStrings.CONTACT_DURATION
  - typings.awsSdk.awsSdkStrings.AGENT_INTERACTION_DURATION
  - typings.awsSdk.awsSdkStrings.CUSTOMER_HOLD_TIME
  - java.lang.String
*/
type NumericQuestionPropertyAutomationLabel = _NumericQuestionPropertyAutomationLabel | java.lang.String

type Origin = java.lang.String

type OriginsList = js.Array[Origin]

type OutboundCallerIdName = java.lang.String

type OutboundCallsEnabled = scala.Boolean

type PEM = java.lang.String

type ParticipantId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENT
  - typings.awsSdk.awsSdkStrings.CUSTOMER
  - typings.awsSdk.awsSdkStrings.SYSTEM
  - typings.awsSdk.awsSdkStrings.CUSTOM_BOT
  - java.lang.String
*/
type ParticipantRole = _ParticipantRole | java.lang.String

type ParticipantTimerAction = Unset | java.lang.String

type ParticipantTimerConfigList = js.Array[ParticipantTimerConfiguration]

type ParticipantTimerDurationInMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IDLE
  - typings.awsSdk.awsSdkStrings.DISCONNECT_NONCUSTOMER
  - java.lang.String
*/
type ParticipantTimerType = _ParticipantTimerType | java.lang.String

type ParticipantToken = java.lang.String

type Password = java.lang.String

type Percentage = Double

type PermissionsList = js.Array[SecurityProfilePermission]

type PhoneNumber = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AF
  - typings.awsSdk.awsSdkStrings.AL
  - typings.awsSdk.awsSdkStrings.DZ
  - typings.awsSdk.awsSdkStrings.AS
  - typings.awsSdk.awsSdkStrings.AD
  - typings.awsSdk.awsSdkStrings.AO
  - typings.awsSdk.awsSdkStrings.AI
  - typings.awsSdk.awsSdkStrings.AQ
  - typings.awsSdk.awsSdkStrings.AG
  - typings.awsSdk.awsSdkStrings.AR
  - typings.awsSdk.awsSdkStrings.AM
  - typings.awsSdk.awsSdkStrings.AW
  - typings.awsSdk.awsSdkStrings.AU
  - typings.awsSdk.awsSdkStrings.AT
  - typings.awsSdk.awsSdkStrings.AZ
  - typings.awsSdk.awsSdkStrings.BS
  - typings.awsSdk.awsSdkStrings.BH
  - typings.awsSdk.awsSdkStrings.BD
  - typings.awsSdk.awsSdkStrings.BB
  - typings.awsSdk.awsSdkStrings.BY
  - typings.awsSdk.awsSdkStrings.BE
  - typings.awsSdk.awsSdkStrings.BZ
  - typings.awsSdk.awsSdkStrings.BJ
  - typings.awsSdk.awsSdkStrings.BM
  - typings.awsSdk.awsSdkStrings.BT
  - typings.awsSdk.awsSdkStrings.BO
  - typings.awsSdk.awsSdkStrings.BA
  - typings.awsSdk.awsSdkStrings.BW
  - typings.awsSdk.awsSdkStrings.BR
  - typings.awsSdk.awsSdkStrings.IO
  - typings.awsSdk.awsSdkStrings.VG
  - typings.awsSdk.awsSdkStrings.BN
  - typings.awsSdk.awsSdkStrings.BG
  - typings.awsSdk.awsSdkStrings.BF
  - typings.awsSdk.awsSdkStrings.BI
  - typings.awsSdk.awsSdkStrings.KH
  - typings.awsSdk.awsSdkStrings.CM
  - typings.awsSdk.awsSdkStrings.CA
  - typings.awsSdk.awsSdkStrings.CV
  - typings.awsSdk.awsSdkStrings.KY
  - typings.awsSdk.awsSdkStrings.CF
  - typings.awsSdk.awsSdkStrings.TD
  - typings.awsSdk.awsSdkStrings.CL
  - typings.awsSdk.awsSdkStrings.CN
  - typings.awsSdk.awsSdkStrings.CX
  - typings.awsSdk.awsSdkStrings.CC
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.KM
  - typings.awsSdk.awsSdkStrings.CK
  - typings.awsSdk.awsSdkStrings.CR
  - typings.awsSdk.awsSdkStrings.HR
  - typings.awsSdk.awsSdkStrings.CU
  - typings.awsSdk.awsSdkStrings.CW
  - typings.awsSdk.awsSdkStrings.CY
  - typings.awsSdk.awsSdkStrings.CZ
  - typings.awsSdk.awsSdkStrings.CD
  - typings.awsSdk.awsSdkStrings.DK
  - typings.awsSdk.awsSdkStrings.DJ
  - typings.awsSdk.awsSdkStrings.DM
  - typings.awsSdk.awsSdkStrings.DO
  - typings.awsSdk.awsSdkStrings.TL
  - typings.awsSdk.awsSdkStrings.EC
  - typings.awsSdk.awsSdkStrings.EG
  - typings.awsSdk.awsSdkStrings.SV
  - typings.awsSdk.awsSdkStrings.GQ
  - typings.awsSdk.awsSdkStrings.ER
  - typings.awsSdk.awsSdkStrings.EE
  - typings.awsSdk.awsSdkStrings.ET
  - typings.awsSdk.awsSdkStrings.FK
  - typings.awsSdk.awsSdkStrings.FO
  - typings.awsSdk.awsSdkStrings.FJ
  - typings.awsSdk.awsSdkStrings.FI
  - typings.awsSdk.awsSdkStrings.FR
  - typings.awsSdk.awsSdkStrings.PF
  - typings.awsSdk.awsSdkStrings.GA
  - typings.awsSdk.awsSdkStrings.GM
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.DE
  - typings.awsSdk.awsSdkStrings.GH
  - typings.awsSdk.awsSdkStrings.GI
  - typings.awsSdk.awsSdkStrings.GR
  - typings.awsSdk.awsSdkStrings.GL
  - typings.awsSdk.awsSdkStrings.GD
  - typings.awsSdk.awsSdkStrings.GU
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GG
  - typings.awsSdk.awsSdkStrings.GN
  - typings.awsSdk.awsSdkStrings.GW
  - typings.awsSdk.awsSdkStrings.GY
  - typings.awsSdk.awsSdkStrings.HT
  - typings.awsSdk.awsSdkStrings.HN
  - typings.awsSdk.awsSdkStrings.HK
  - typings.awsSdk.awsSdkStrings.HU
  - typings.awsSdk.awsSdkStrings.IS
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.ID
  - typings.awsSdk.awsSdkStrings.IR
  - typings.awsSdk.awsSdkStrings.IQ
  - typings.awsSdk.awsSdkStrings.IE
  - typings.awsSdk.awsSdkStrings.IM
  - typings.awsSdk.awsSdkStrings.IL
  - typings.awsSdk.awsSdkStrings.IT
  - typings.awsSdk.awsSdkStrings.CI
  - typings.awsSdk.awsSdkStrings.JM
  - typings.awsSdk.awsSdkStrings.JP
  - typings.awsSdk.awsSdkStrings.JE
  - typings.awsSdk.awsSdkStrings.JO
  - typings.awsSdk.awsSdkStrings.KZ
  - typings.awsSdk.awsSdkStrings.KE
  - typings.awsSdk.awsSdkStrings.KI
  - typings.awsSdk.awsSdkStrings.KW
  - typings.awsSdk.awsSdkStrings.KG
  - typings.awsSdk.awsSdkStrings.LA
  - typings.awsSdk.awsSdkStrings.LV
  - typings.awsSdk.awsSdkStrings.LB
  - typings.awsSdk.awsSdkStrings.LS
  - typings.awsSdk.awsSdkStrings.LR
  - typings.awsSdk.awsSdkStrings.LY
  - typings.awsSdk.awsSdkStrings.LI
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LU
  - typings.awsSdk.awsSdkStrings.MO
  - typings.awsSdk.awsSdkStrings.MK
  - typings.awsSdk.awsSdkStrings.MG
  - typings.awsSdk.awsSdkStrings.MW
  - typings.awsSdk.awsSdkStrings.MY
  - typings.awsSdk.awsSdkStrings.MV
  - typings.awsSdk.awsSdkStrings.ML
  - typings.awsSdk.awsSdkStrings.MT
  - typings.awsSdk.awsSdkStrings.MH
  - typings.awsSdk.awsSdkStrings.MR
  - typings.awsSdk.awsSdkStrings.MU
  - typings.awsSdk.awsSdkStrings.YT
  - typings.awsSdk.awsSdkStrings.MX
  - typings.awsSdk.awsSdkStrings.FM
  - typings.awsSdk.awsSdkStrings.MD
  - typings.awsSdk.awsSdkStrings.MC
  - typings.awsSdk.awsSdkStrings.MN
  - typings.awsSdk.awsSdkStrings.ME
  - typings.awsSdk.awsSdkStrings.MS
  - typings.awsSdk.awsSdkStrings.MA
  - typings.awsSdk.awsSdkStrings.MZ
  - typings.awsSdk.awsSdkStrings.MM
  - typings.awsSdk.awsSdkStrings.NA
  - typings.awsSdk.awsSdkStrings.NR
  - typings.awsSdk.awsSdkStrings.NP
  - typings.awsSdk.awsSdkStrings.NL
  - typings.awsSdk.awsSdkStrings.AN
  - typings.awsSdk.awsSdkStrings.NC
  - typings.awsSdk.awsSdkStrings.NZ
  - typings.awsSdk.awsSdkStrings.NI
  - typings.awsSdk.awsSdkStrings.NE
  - typings.awsSdk.awsSdkStrings.NG
  - typings.awsSdk.awsSdkStrings.NU
  - typings.awsSdk.awsSdkStrings.KP
  - typings.awsSdk.awsSdkStrings.MP
  - typings.awsSdk.awsSdkStrings.NO
  - typings.awsSdk.awsSdkStrings.OM
  - typings.awsSdk.awsSdkStrings.PK
  - typings.awsSdk.awsSdkStrings.PW
  - typings.awsSdk.awsSdkStrings.PA
  - typings.awsSdk.awsSdkStrings.PG
  - typings.awsSdk.awsSdkStrings.PY
  - typings.awsSdk.awsSdkStrings.PE
  - typings.awsSdk.awsSdkStrings.PH
  - typings.awsSdk.awsSdkStrings.PN
  - typings.awsSdk.awsSdkStrings.PL
  - typings.awsSdk.awsSdkStrings.PT
  - typings.awsSdk.awsSdkStrings.PR
  - typings.awsSdk.awsSdkStrings.QA
  - typings.awsSdk.awsSdkStrings.CG
  - typings.awsSdk.awsSdkStrings.RE
  - typings.awsSdk.awsSdkStrings.RO
  - typings.awsSdk.awsSdkStrings.RU
  - typings.awsSdk.awsSdkStrings.RW
  - typings.awsSdk.awsSdkStrings.BL
  - typings.awsSdk.awsSdkStrings.SH
  - typings.awsSdk.awsSdkStrings.KN
  - typings.awsSdk.awsSdkStrings.LC
  - typings.awsSdk.awsSdkStrings.MF
  - typings.awsSdk.awsSdkStrings.PM
  - typings.awsSdk.awsSdkStrings.VC
  - typings.awsSdk.awsSdkStrings.WS
  - typings.awsSdk.awsSdkStrings.SM
  - typings.awsSdk.awsSdkStrings.ST
  - typings.awsSdk.awsSdkStrings.SA
  - typings.awsSdk.awsSdkStrings.SN
  - typings.awsSdk.awsSdkStrings.RS
  - typings.awsSdk.awsSdkStrings.SC
  - typings.awsSdk.awsSdkStrings.SL
  - typings.awsSdk.awsSdkStrings.SG
  - typings.awsSdk.awsSdkStrings.SX
  - typings.awsSdk.awsSdkStrings.SK
  - typings.awsSdk.awsSdkStrings.SI
  - typings.awsSdk.awsSdkStrings.SB
  - typings.awsSdk.awsSdkStrings.SO
  - typings.awsSdk.awsSdkStrings.ZA
  - typings.awsSdk.awsSdkStrings.KR
  - typings.awsSdk.awsSdkStrings.ES
  - typings.awsSdk.awsSdkStrings.LK
  - typings.awsSdk.awsSdkStrings.SD
  - typings.awsSdk.awsSdkStrings.SR
  - typings.awsSdk.awsSdkStrings.SJ
  - typings.awsSdk.awsSdkStrings.SZ
  - typings.awsSdk.awsSdkStrings.SE
  - typings.awsSdk.awsSdkStrings.CH
  - typings.awsSdk.awsSdkStrings.SY
  - typings.awsSdk.awsSdkStrings.TW
  - typings.awsSdk.awsSdkStrings.TJ
  - typings.awsSdk.awsSdkStrings.TZ
  - typings.awsSdk.awsSdkStrings.TH
  - typings.awsSdk.awsSdkStrings.TG
  - typings.awsSdk.awsSdkStrings.TK
  - typings.awsSdk.awsSdkStrings.TO
  - typings.awsSdk.awsSdkStrings.TT
  - typings.awsSdk.awsSdkStrings.TN
  - typings.awsSdk.awsSdkStrings.TR
  - typings.awsSdk.awsSdkStrings.TM
  - typings.awsSdk.awsSdkStrings.TC
  - typings.awsSdk.awsSdkStrings.TV
  - typings.awsSdk.awsSdkStrings.VI
  - typings.awsSdk.awsSdkStrings.UG
  - typings.awsSdk.awsSdkStrings.UA
  - typings.awsSdk.awsSdkStrings.AE
  - typings.awsSdk.awsSdkStrings.GB
  - typings.awsSdk.awsSdkStrings.US
  - typings.awsSdk.awsSdkStrings.UY
  - typings.awsSdk.awsSdkStrings.UZ
  - typings.awsSdk.awsSdkStrings.VU
  - typings.awsSdk.awsSdkStrings.VA
  - typings.awsSdk.awsSdkStrings.VE
  - typings.awsSdk.awsSdkStrings.VN
  - typings.awsSdk.awsSdkStrings.WF
  - typings.awsSdk.awsSdkStrings.EH
  - typings.awsSdk.awsSdkStrings.YE
  - typings.awsSdk.awsSdkStrings.ZM
  - typings.awsSdk.awsSdkStrings.ZW
  - java.lang.String
*/
type PhoneNumberCountryCode = _PhoneNumberCountryCode | java.lang.String

type PhoneNumberCountryCodes = js.Array[PhoneNumberCountryCode]

type PhoneNumberDescription = java.lang.String

type PhoneNumberId = java.lang.String

type PhoneNumberPrefix = java.lang.String

type PhoneNumberSummaryList = js.Array[PhoneNumberSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TOLL_FREE
  - typings.awsSdk.awsSdkStrings.DID
  - java.lang.String
*/
type PhoneNumberType = _PhoneNumberType | java.lang.String

type PhoneNumberTypes = js.Array[PhoneNumberType]

type PhoneNumberWorkflowMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CLAIMED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PhoneNumberWorkflowStatus = _PhoneNumberWorkflowStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOFT_PHONE
  - typings.awsSdk.awsSdkStrings.DESK_PHONE
  - java.lang.String
*/
type PhoneType = _PhoneType | java.lang.String

type Prefix = java.lang.String

type Priority = Double

type PromptId = java.lang.String

type PromptName = java.lang.String

type PromptSummaryList = js.Array[PromptSummary]

type QueueDescription = java.lang.String

type QueueId = java.lang.String

type QueueMaxContacts = Double

type QueueName = java.lang.String

type QueueSearchConditionList = js.Array[QueueSearchCriteria]

type QueueSearchSummaryList = js.Array[Queue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type QueueStatus = _QueueStatus | java.lang.String

type QueueSummaryList = js.Array[QueueSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.AGENT
  - java.lang.String
*/
type QueueType = _QueueType | java.lang.String

type QueueTypes = js.Array[QueueType]

type Queues = js.Array[QueueId]

type QuickConnectDescription = java.lang.String

type QuickConnectId = java.lang.String

type QuickConnectName = java.lang.String

type QuickConnectSummaryList = js.Array[QuickConnectSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.QUEUE
  - typings.awsSdk.awsSdkStrings.PHONE_NUMBER
  - java.lang.String
*/
type QuickConnectType = _QuickConnectType | java.lang.String

type QuickConnectTypes = js.Array[QuickConnectType]

type QuickConnectsList = js.Array[QuickConnectId]

type ReadOnlyTaskTemplateFields = js.Array[ReadOnlyFieldInfo]

type ReferenceId = java.lang.String

type ReferenceKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.APPROVED
  - typings.awsSdk.awsSdkStrings.REJECTED
  - java.lang.String
*/
type ReferenceStatus = _ReferenceStatus | java.lang.String

type ReferenceSummaryList = js.Array[ReferenceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.ATTACHMENT
  - typings.awsSdk.awsSdkStrings.NUMBER
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type ReferenceType = _ReferenceType | java.lang.String

type ReferenceTypes = js.Array[ReferenceType]

type ReferenceValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENTIRE_PAST_SESSION
  - typings.awsSdk.awsSdkStrings.FROM_SEGMENT
  - java.lang.String
*/
type RehydrationType = _RehydrationType | java.lang.String

type RequiredTaskTemplateFields = js.Array[RequiredFieldInfo]

type ResourceArnOrId = java.lang.String

type ResourceId = java.lang.String

type RoutingProfileDescription = java.lang.String

type RoutingProfileId = java.lang.String

type RoutingProfileList = js.Array[RoutingProfile]

type RoutingProfileName = java.lang.String

type RoutingProfileQueueConfigList = js.Array[RoutingProfileQueueConfig]

type RoutingProfileQueueConfigSummaryList = js.Array[RoutingProfileQueueConfigSummary]

type RoutingProfileQueueReferenceList = js.Array[RoutingProfileQueueReference]

type RoutingProfileSearchConditionList = js.Array[RoutingProfileSearchCriteria]

type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]

type RoutingProfiles = js.Array[RoutingProfileId]

type RuleActions = js.Array[RuleAction]

type RuleFunction = java.lang.String

type RuleId = java.lang.String

type RuleName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DRAFT
  - typings.awsSdk.awsSdkStrings.PUBLISHED
  - java.lang.String
*/
type RulePublishStatus = _RulePublishStatus | java.lang.String

type RuleSummaryList = js.Array[RuleSummary]

type SearchableQueueType = STANDARD | java.lang.String

type SecurityKeysList = js.Array[SecurityKey]

type SecurityProfileDescription = java.lang.String

type SecurityProfileId = java.lang.String

type SecurityProfileIds = js.Array[SecurityProfileId]

type SecurityProfileName = java.lang.String

type SecurityProfilePermission = java.lang.String

type SecurityProfilePolicyKey = java.lang.String

type SecurityProfilePolicyValue = java.lang.String

type SecurityProfileSearchConditionList = js.Array[SecurityProfileSearchCriteria]

type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]

type SecurityProfilesSearchSummaryList = js.Array[SecurityProfileSearchSummary]

type SecurityToken = java.lang.String

type SingleSelectOptions = js.Array[TaskTemplateSingleSelectOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRESENT
  - typings.awsSdk.awsSdkStrings.NOT_PRESENT
  - java.lang.String
*/
type SingleSelectQuestionRuleCategoryAutomationCondition = _SingleSelectQuestionRuleCategoryAutomationCondition | java.lang.String

type SingleSelectQuestionRuleCategoryAutomationLabel = java.lang.String

type SnapshotVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SourceApplicationName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SALESFORCE
  - typings.awsSdk.awsSdkStrings.ZENDESK
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.MAX
  - typings.awsSdk.awsSdkStrings.AVG
  - java.lang.String
*/
type Statistic = _Statistic | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.KINESIS_VIDEO_STREAM
  - typings.awsSdk.awsSdkStrings.KINESIS_STREAM
  - typings.awsSdk.awsSdkStrings.KINESIS_FIREHOSE
  - java.lang.String
*/
type StorageType = _StorageType | java.lang.String

type StreamingId = java.lang.String

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTS_WITH
  - typings.awsSdk.awsSdkStrings.CONTAINS
  - typings.awsSdk.awsSdkStrings.EXACT
  - java.lang.String
*/
type StringComparisonType = _StringComparisonType | java.lang.String

type Subject = java.lang.String

type SupportedMessagingContentType = java.lang.String

type SupportedMessagingContentTypes = js.Array[SupportedMessagingContentType]

type TagAndConditionList = js.Array[TagCondition]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagOrConditionList = js.Array[TagAndConditionList]

type TagRestrictedResourceList = js.Array[TagRestrictedResourceName]

type TagRestrictedResourceName = java.lang.String

type TagValue = java.lang.String

type TaskDescriptionExpression = java.lang.String

type TaskNameExpression = java.lang.String

type TaskTemplateArn = java.lang.String

type TaskTemplateDefaultFieldValueList = js.Array[TaskTemplateDefaultFieldValue]

type TaskTemplateDescription = java.lang.String

type TaskTemplateFieldDescription = java.lang.String

type TaskTemplateFieldName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.DESCRIPTION
  - typings.awsSdk.awsSdkStrings.SCHEDULED_TIME
  - typings.awsSdk.awsSdkStrings.QUICK_CONNECT
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.NUMBER
  - typings.awsSdk.awsSdkStrings.TEXT
  - typings.awsSdk.awsSdkStrings.TEXT_AREA
  - typings.awsSdk.awsSdkStrings.DATE_TIME
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.SINGLE_SELECT
  - typings.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type TaskTemplateFieldType = _TaskTemplateFieldType | java.lang.String

type TaskTemplateFieldValue = java.lang.String

type TaskTemplateFields = js.Array[TaskTemplateField]

type TaskTemplateId = java.lang.String

type TaskTemplateList = js.Array[TaskTemplateMetadata]

type TaskTemplateName = java.lang.String

type TaskTemplateSingleSelectOption = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type TaskTemplateStatus = _TaskTemplateStatus | java.lang.String

type ThresholdCollections = js.Array[ThresholdV2]

type ThresholdValue = Double

type TimeZone = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOMER
  - typings.awsSdk.awsSdkStrings.AGENT
  - java.lang.String
*/
type TimerEligibleParticipantRoles = _TimerEligibleParticipantRoles | java.lang.String

type Timestamp_ = js.Date

type TrafficDistributionGroupArn = java.lang.String

type TrafficDistributionGroupId = java.lang.String

type TrafficDistributionGroupIdOrArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.PENDING_DELETION
  - typings.awsSdk.awsSdkStrings.DELETION_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - java.lang.String
*/
type TrafficDistributionGroupStatus = _TrafficDistributionGroupStatus | java.lang.String

type TrafficDistributionGroupSummaryList = js.Array[TrafficDistributionGroupSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GENERAL
  - typings.awsSdk.awsSdkStrings.CAMPAIGN
  - java.lang.String
*/
type TrafficType = _TrafficType | java.lang.String

type URI = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SECONDS
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.PERCENT
  - java.lang.String
*/
type Unit = _Unit | java.lang.String

type UpdateAgentStatusDescription = java.lang.String

type UpdateHoursOfOperationDescription = java.lang.String

type UpdateQuickConnectDescription = java.lang.String

type Url = java.lang.String

type UseCaseId = java.lang.String

type UseCaseSummaryList = js.Array[UseCase]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RULES_EVALUATION
  - typings.awsSdk.awsSdkStrings.CONNECT_CAMPAIGNS
  - java.lang.String
*/
type UseCaseType = _UseCaseType | java.lang.String

type UserDataHierarchyGroups = js.Array[HierarchyGroupId]

type UserDataList = js.Array[UserData]

type UserId = java.lang.String

type UserIdList = js.Array[UserId]

type UserSearchConditionList = js.Array[UserSearchCriteria]

type UserSearchSummaryList = js.Array[UserSearchSummary]

type UserSummaryList = js.Array[UserSummary]

type UserTagMap = StringDictionary[String]

type Value = Double

type VersionNumber = Double

type VocabularyContent = java.lang.String

type VocabularyFailureReason = java.lang.String

type VocabularyId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`ar-AE`
  - typings.awsSdk.awsSdkStrings.`de-CH`
  - typings.awsSdk.awsSdkStrings.`de-DE`
  - typings.awsSdk.awsSdkStrings.`en-AB`
  - typings.awsSdk.awsSdkStrings.`en-AU`
  - typings.awsSdk.awsSdkStrings.`en-GB`
  - typings.awsSdk.awsSdkStrings.`en-IE`
  - typings.awsSdk.awsSdkStrings.`en-IN`
  - typings.awsSdk.awsSdkStrings.`en-US`
  - typings.awsSdk.awsSdkStrings.`en-WL`
  - typings.awsSdk.awsSdkStrings.`es-ES`
  - typings.awsSdk.awsSdkStrings.`es-US`
  - typings.awsSdk.awsSdkStrings.`fr-CA`
  - typings.awsSdk.awsSdkStrings.`fr-FR`
  - typings.awsSdk.awsSdkStrings.`hi-IN`
  - typings.awsSdk.awsSdkStrings.`it-IT`
  - typings.awsSdk.awsSdkStrings.`ja-JP`
  - typings.awsSdk.awsSdkStrings.`ko-KR`
  - typings.awsSdk.awsSdkStrings.`pt-BR`
  - typings.awsSdk.awsSdkStrings.`pt-PT`
  - typings.awsSdk.awsSdkStrings.`zh-CN`
  - typings.awsSdk.awsSdkStrings.`en-NZ`
  - typings.awsSdk.awsSdkStrings.`en-ZA`
  - java.lang.String
*/
type VocabularyLanguageCode = _VocabularyLanguageCode | java.lang.String

type VocabularyLastModifiedTime = js.Date

type VocabularyName = java.lang.String

type VocabularyNextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - java.lang.String
*/
type VocabularyState = _VocabularyState | java.lang.String

type VocabularySummaryList = js.Array[VocabularySummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FROM_AGENT
  - typings.awsSdk.awsSdkStrings.TO_AGENT
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type VoiceRecordingTrack = _VoiceRecordingTrack | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-08-08`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type timestamp = js.Date
