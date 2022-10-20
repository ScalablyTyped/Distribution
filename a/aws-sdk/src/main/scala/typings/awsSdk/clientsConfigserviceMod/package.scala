package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.RESOURCE_ID
import typings.awsSdk.awsSdkStrings.SCORE
import typings.awsSdk.awsSdkStrings.SSM_DOCUMENT
import typings.awsSdk.awsSdkStrings.awsDotconfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AccountAggregationSourceAccountList = js.Array[AccountId]

type AccountAggregationSourceList = js.Array[AccountAggregationSource]

type AccountId = java.lang.String

type AggregateComplianceByConfigRuleList = js.Array[AggregateComplianceByConfigRule]

type AggregateComplianceByConformancePackList = js.Array[AggregateComplianceByConformancePack]

type AggregateComplianceCountList = js.Array[AggregateComplianceCount]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.AWS_REGION
  - java.lang.String
*/
type AggregateConformancePackComplianceSummaryGroupKey = _AggregateConformancePackComplianceSummaryGroupKey | java.lang.String

type AggregateConformancePackComplianceSummaryList = js.Array[AggregateConformancePackComplianceSummary]

type AggregateEvaluationResultList = js.Array[AggregateEvaluationResult]

type AggregatedSourceStatusList = js.Array[AggregatedSourceStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.OUTDATED
  - java.lang.String
*/
type AggregatedSourceStatusType = _AggregatedSourceStatusType | java.lang.String

type AggregatedSourceStatusTypeList = js.Array[AggregatedSourceStatusType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCOUNT
  - typings.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
type AggregatedSourceType = _AggregatedSourceType | java.lang.String

type AggregationAuthorizationList = js.Array[AggregationAuthorization]

type AggregatorRegionList = js.Array[String]

type AllSupported = scala.Boolean

type AmazonResourceName = java.lang.String

type Annotation = java.lang.String

type AutoRemediationAttemptSeconds = Double

type AutoRemediationAttempts = Double

type AvailabilityZone = java.lang.String

type AwsRegion = java.lang.String

type BaseConfigurationItems = js.Array[BaseConfigurationItem]

type BaseResourceId = java.lang.String

type Boolean = scala.Boolean

type ChannelName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Reverse
  - typings.awsSdk.awsSdkStrings.Forward_
  - java.lang.String
*/
type ChronologicalOrder = _ChronologicalOrder | java.lang.String

type ComplianceByConfigRules = js.Array[ComplianceByConfigRule]

type ComplianceByResources = js.Array[ComplianceByResource]

type ComplianceResourceTypes = js.Array[StringWithCharLimit256]

type ComplianceScore = java.lang.String

type ComplianceSummariesByResourceType = js.Array[ComplianceSummaryByResourceType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLIANT
  - typings.awsSdk.awsSdkStrings.NON_COMPLIANT
  - typings.awsSdk.awsSdkStrings.NOT_APPLICABLE
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
type ComplianceType = _ComplianceType | java.lang.String

type ComplianceTypes = js.Array[ComplianceType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.AWS_REGION
  - java.lang.String
*/
type ConfigRuleComplianceSummaryGroupKey = _ConfigRuleComplianceSummaryGroupKey | java.lang.String

type ConfigRuleEvaluationStatusList = js.Array[ConfigRuleEvaluationStatus]

type ConfigRuleName = java.lang.String

type ConfigRuleNames = js.Array[ConfigRuleName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETING_RESULTS
  - typings.awsSdk.awsSdkStrings.EVALUATING
  - java.lang.String
*/
type ConfigRuleState = _ConfigRuleState | java.lang.String

type ConfigRules = js.Array[ConfigRule]

type Configuration = java.lang.String

type ConfigurationAggregatorArn = java.lang.String

type ConfigurationAggregatorList = js.Array[ConfigurationAggregator]

type ConfigurationAggregatorName = java.lang.String

type ConfigurationAggregatorNameList = js.Array[ConfigurationAggregatorName]

type ConfigurationItemCaptureTime = js.Date

type ConfigurationItemList = js.Array[ConfigurationItem]

type ConfigurationItemMD5Hash = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OK
  - typings.awsSdk.awsSdkStrings.ResourceDiscovered
  - typings.awsSdk.awsSdkStrings.ResourceNotRecorded
  - typings.awsSdk.awsSdkStrings.ResourceDeleted
  - typings.awsSdk.awsSdkStrings.ResourceDeletedNotRecorded
  - java.lang.String
*/
type ConfigurationItemStatus = _ConfigurationItemStatus | java.lang.String

type ConfigurationRecorderList = js.Array[ConfigurationRecorder]

type ConfigurationRecorderNameList = js.Array[RecorderName]

type ConfigurationRecorderStatusList = js.Array[ConfigurationRecorderStatus]

type ConfigurationStateId = java.lang.String

type ConformancePackArn = java.lang.String

type ConformancePackComplianceResourceIds = js.Array[StringWithCharLimit256]

type ConformancePackComplianceScores = js.Array[ConformancePackComplianceScore]

type ConformancePackComplianceSummaryList = js.Array[ConformancePackComplianceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLIANT
  - typings.awsSdk.awsSdkStrings.NON_COMPLIANT
  - typings.awsSdk.awsSdkStrings.INSUFFICIENT_DATA
  - java.lang.String
*/
type ConformancePackComplianceType = _ConformancePackComplianceType | java.lang.String

type ConformancePackConfigRuleNames = js.Array[StringWithCharLimit64]

type ConformancePackDetailList = js.Array[ConformancePackDetail]

type ConformancePackId = java.lang.String

type ConformancePackInputParameters = js.Array[ConformancePackInputParameter]

type ConformancePackName = java.lang.String

type ConformancePackNameFilter = js.Array[ConformancePackName]

type ConformancePackNamesList = js.Array[ConformancePackName]

type ConformancePackNamesToSummarizeList = js.Array[ConformancePackName]

type ConformancePackRuleComplianceList = js.Array[ConformancePackRuleCompliance]

type ConformancePackRuleEvaluationResultsList = js.Array[ConformancePackEvaluationResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type ConformancePackState = _ConformancePackState | java.lang.String

type ConformancePackStatusDetailsList = js.Array[ConformancePackStatusDetail]

type ConformancePackStatusReason = java.lang.String

type ControlsList = js.Array[StringWithCharLimit128]

type CosmosPageLimit = Double

type Date = js.Date

type DebugLogDeliveryAccounts = js.Array[AccountId]

type DeliveryChannelList = js.Array[DeliveryChannel]

type DeliveryChannelNameList = js.Array[ChannelName]

type DeliveryChannelStatusList = js.Array[DeliveryChannelStatus]

type DeliveryS3Bucket = java.lang.String

type DeliveryS3KeyPrefix = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Success_
  - typings.awsSdk.awsSdkStrings.Failure_
  - typings.awsSdk.awsSdkStrings.Not_Applicable_
  - java.lang.String
*/
type DeliveryStatus = _DeliveryStatus | java.lang.String

type DescribeConformancePackComplianceLimit = Double

type DescribePendingAggregationRequestsLimit = Double

type DiscoveredResourceIdentifierList = js.Array[AggregateResourceIdentifier]

type EarlierTime = js.Date

type EmptiableStringWithCharLimit256 = java.lang.String

type EvaluationResults = js.Array[EvaluationResult]

type Evaluations = js.Array[Evaluation]

type EventSource = awsDotconfig | java.lang.String

type ExcludedAccounts = js.Array[AccountId]

type Expression = java.lang.String

type FailedDeleteRemediationExceptionsBatches = js.Array[FailedDeleteRemediationExceptionsBatch]

type FailedRemediationBatches = js.Array[FailedRemediationBatch]

type FailedRemediationExceptionBatches = js.Array[FailedRemediationExceptionBatch]

type FieldInfoList = js.Array[FieldInfo]

type FieldName = java.lang.String

type GetConformancePackComplianceDetailsLimit = Double

type GroupByAPILimit = Double

type GroupedResourceCountList = js.Array[GroupedResourceCount]

type IncludeGlobalResourceTypes = scala.Boolean

type Integer = Double

type LastUpdatedTime = js.Date

type LaterTime = js.Date

type Limit = Double

type Long = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.One_Hour_
  - typings.awsSdk.awsSdkStrings.Three_Hours
  - typings.awsSdk.awsSdkStrings.Six_Hours_
  - typings.awsSdk.awsSdkStrings.Twelve_Hours
  - typings.awsSdk.awsSdkStrings.TwentyFour_Hours
  - java.lang.String
*/
type MaximumExecutionFrequency = _MaximumExecutionFrequency | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type MemberAccountRuleStatus = _MemberAccountRuleStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
  - typings.awsSdk.awsSdkStrings.ConfigurationSnapshotDeliveryCompleted
  - typings.awsSdk.awsSdkStrings.ScheduledNotification
  - typings.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
  - java.lang.String
*/
type MessageType = _MessageType | java.lang.String

type Name = java.lang.String

type NextToken = java.lang.String

type OrderingTimestamp = js.Date

type OrganizationConfigRuleDetailedStatus = js.Array[MemberAccountStatus]

type OrganizationConfigRuleName = java.lang.String

type OrganizationConfigRuleNames = js.Array[StringWithCharLimit64]

type OrganizationConfigRuleStatuses = js.Array[OrganizationConfigRuleStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
  - typings.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
  - typings.awsSdk.awsSdkStrings.ScheduledNotification
  - java.lang.String
*/
type OrganizationConfigRuleTriggerType = _OrganizationConfigRuleTriggerType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ConfigurationItemChangeNotification
  - typings.awsSdk.awsSdkStrings.OversizedConfigurationItemChangeNotification
  - java.lang.String
*/
type OrganizationConfigRuleTriggerTypeNoSN = _OrganizationConfigRuleTriggerTypeNoSN | java.lang.String

type OrganizationConfigRuleTriggerTypeNoSNs = js.Array[OrganizationConfigRuleTriggerTypeNoSN]

type OrganizationConfigRuleTriggerTypes = js.Array[OrganizationConfigRuleTriggerType]

type OrganizationConfigRules = js.Array[OrganizationConfigRule]

type OrganizationConformancePackDetailedStatuses = js.Array[OrganizationConformancePackDetailedStatus]

type OrganizationConformancePackName = java.lang.String

type OrganizationConformancePackNames = js.Array[OrganizationConformancePackName]

type OrganizationConformancePackStatuses = js.Array[OrganizationConformancePackStatus]

type OrganizationConformancePacks = js.Array[OrganizationConformancePack]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type OrganizationResourceDetailedStatus = _OrganizationResourceDetailedStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type OrganizationResourceStatus = _OrganizationResourceStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type OrganizationRuleStatus = _OrganizationRuleStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOM_LAMBDA
  - typings.awsSdk.awsSdkStrings.AWS
  - typings.awsSdk.awsSdkStrings.CUSTOM_POLICY
  - java.lang.String
*/
type Owner = _Owner | java.lang.String

type PageSizeLimit = Double

type ParameterName = java.lang.String

type ParameterValue = java.lang.String

type PendingAggregationRequestList = js.Array[PendingAggregationRequest]

type Percentage = Double

type PolicyRuntime = java.lang.String

type PolicyText = java.lang.String

type QueryArn = java.lang.String

type QueryDescription = java.lang.String

type QueryExpression = java.lang.String

type QueryId = java.lang.String

type QueryName = java.lang.String

type RecorderName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Success_
  - typings.awsSdk.awsSdkStrings.Failure_
  - java.lang.String
*/
type RecorderStatus = _RecorderStatus | java.lang.String

type ReevaluateConfigRuleNames = js.Array[ConfigRuleName]

type RelatedEvent = java.lang.String

type RelatedEventList = js.Array[RelatedEvent]

type RelationshipList = js.Array[Relationship]

type RelationshipName = java.lang.String

type RemediationConfigurations = js.Array[RemediationConfiguration]

type RemediationExceptionResourceKeys = js.Array[RemediationExceptionResourceKey]

type RemediationExceptions = js.Array[RemediationException]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RemediationExecutionState = _RemediationExecutionState | java.lang.String

type RemediationExecutionStatuses = js.Array[RemediationExecutionStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RemediationExecutionStepState = _RemediationExecutionStepState | java.lang.String

type RemediationExecutionSteps = js.Array[RemediationExecutionStep]

type RemediationParameters = StringDictionary[RemediationParameterValue]

type RemediationTargetType = SSM_DOCUMENT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESOURCE_TYPE
  - typings.awsSdk.awsSdkStrings.ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.AWS_REGION
  - java.lang.String
*/
type ResourceCountGroupKey = _ResourceCountGroupKey | java.lang.String

type ResourceCounts = js.Array[ResourceCount]

type ResourceCreationTime = js.Date

type ResourceDeletionTime = js.Date

type ResourceId = java.lang.String

type ResourceIdList = js.Array[ResourceId]

type ResourceIdentifierList = js.Array[ResourceIdentifier]

type ResourceIdentifiersList = js.Array[AggregateResourceIdentifier]

type ResourceKeys = js.Array[ResourceKey]

type ResourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonCustomerGateway
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonEIP
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonHost
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInstance
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonInternetGateway
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkAcl
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkInterface
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonRouteTable
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonSecurityGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonSubnet
  - typings.awsSdk.awsSdkStrings.AWSColonColonCloudTrailColonColonTrail
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVolume
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPC
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPNConnection
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPNGateway
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonRegisteredHAInstance
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNatGateway
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonEgressOnlyInternetGateway
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCEndpoint
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCEndpointService
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonFlowLog
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonVPCPeeringConnection
  - typings.awsSdk.awsSdkStrings.AWSColonColonElasticsearchColonColonDomain
  - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonPolicy
  - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonRole
  - typings.awsSdk.awsSdkStrings.AWSColonColonIAMColonColonUser
  - typings.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingV2ColonColonLoadBalancer
  - typings.awsSdk.awsSdkStrings.AWSColonColonACMColonColonCertificate
  - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBInstance
  - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSubnetGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSecurityGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBSnapshot
  - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBCluster
  - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonDBClusterSnapshot
  - typings.awsSdk.awsSdkStrings.AWSColonColonRDSColonColonEventSubscription
  - typings.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonBucket
  - typings.awsSdk.awsSdkStrings.AWSColonColonS3ColonColonAccountPublicAccessBlock
  - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonCluster
  - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSnapshot
  - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterParameterGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSecurityGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonClusterSubnetGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonRedshiftColonColonEventSubscription
  - typings.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonManagedInstanceInventory
  - typings.awsSdk.awsSdkStrings.AWSColonColonCloudWatchColonColonAlarm
  - typings.awsSdk.awsSdkStrings.AWSColonColonCloudFormationColonColonStack
  - typings.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingColonColonLoadBalancer
  - typings.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonAutoScalingGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonLaunchConfiguration
  - typings.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonScalingPolicy
  - typings.awsSdk.awsSdkStrings.AWSColonColonAutoScalingColonColonScheduledAction
  - typings.awsSdk.awsSdkStrings.AWSColonColonDynamoDBColonColonTable
  - typings.awsSdk.awsSdkStrings.AWSColonColonCodeBuildColonColonProject
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRateBasedRule
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRule
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonRuleGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFColonColonWebACL
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRateBasedRule
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRule
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonRuleGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFRegionalColonColonWebACL
  - typings.awsSdk.awsSdkStrings.AWSColonColonCloudFrontColonColonDistribution
  - typings.awsSdk.awsSdkStrings.AWSColonColonCloudFrontColonColonStreamingDistribution
  - typings.awsSdk.awsSdkStrings.AWSColonColonLambdaColonColonFunction
  - typings.awsSdk.awsSdkStrings.AWSColonColonNetworkFirewallColonColonFirewall
  - typings.awsSdk.awsSdkStrings.AWSColonColonNetworkFirewallColonColonFirewallPolicy
  - typings.awsSdk.awsSdkStrings.AWSColonColonNetworkFirewallColonColonRuleGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplication
  - typings.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonApplicationVersion
  - typings.awsSdk.awsSdkStrings.AWSColonColonElasticBeanstalkColonColonEnvironment
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonWebACL
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonRuleGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonIPSet
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonRegexPatternSet
  - typings.awsSdk.awsSdkStrings.AWSColonColonWAFv2ColonColonManagedRuleSet
  - typings.awsSdk.awsSdkStrings.AWSColonColonXRayColonColonEncryptionConfig
  - typings.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonAssociationCompliance
  - typings.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonPatchCompliance
  - typings.awsSdk.awsSdkStrings.AWSColonColonShieldColonColonProtection
  - typings.awsSdk.awsSdkStrings.AWSColonColonShieldRegionalColonColonProtection
  - typings.awsSdk.awsSdkStrings.AWSColonColonConfigColonColonConformancePackCompliance
  - typings.awsSdk.awsSdkStrings.AWSColonColonConfigColonColonResourceCompliance
  - typings.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonStage
  - typings.awsSdk.awsSdkStrings.AWSColonColonApiGatewayColonColonRestApi
  - typings.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonStage
  - typings.awsSdk.awsSdkStrings.AWSColonColonApiGatewayV2ColonColonApi
  - typings.awsSdk.awsSdkStrings.AWSColonColonCodePipelineColonColonPipeline
  - typings.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProvisionedProduct
  - typings.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProduct
  - typings.awsSdk.awsSdkStrings.AWSColonColonServiceCatalogColonColonPortfolio
  - typings.awsSdk.awsSdkStrings.AWSColonColonSQSColonColonQueue
  - typings.awsSdk.awsSdkStrings.AWSColonColonKMSColonColonKey
  - typings.awsSdk.awsSdkStrings.AWSColonColonQLDBColonColonLedger
  - typings.awsSdk.awsSdkStrings.AWSColonColonSecretsManagerColonColonSecret
  - typings.awsSdk.awsSdkStrings.AWSColonColonSNSColonColonTopic
  - typings.awsSdk.awsSdkStrings.AWSColonColonSSMColonColonFileData
  - typings.awsSdk.awsSdkStrings.AWSColonColonBackupColonColonBackupPlan
  - typings.awsSdk.awsSdkStrings.AWSColonColonBackupColonColonBackupSelection
  - typings.awsSdk.awsSdkStrings.AWSColonColonBackupColonColonBackupVault
  - typings.awsSdk.awsSdkStrings.AWSColonColonBackupColonColonRecoveryPoint
  - typings.awsSdk.awsSdkStrings.AWSColonColonECRColonColonRepository
  - typings.awsSdk.awsSdkStrings.AWSColonColonECSColonColonCluster
  - typings.awsSdk.awsSdkStrings.AWSColonColonECSColonColonService
  - typings.awsSdk.awsSdkStrings.AWSColonColonECSColonColonTaskDefinition
  - typings.awsSdk.awsSdkStrings.AWSColonColonEFSColonColonAccessPoint
  - typings.awsSdk.awsSdkStrings.AWSColonColonEFSColonColonFileSystem
  - typings.awsSdk.awsSdkStrings.AWSColonColonEKSColonColonCluster
  - typings.awsSdk.awsSdkStrings.AWSColonColonOpenSearchColonColonDomain
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonTransitGateway
  - typings.awsSdk.awsSdkStrings.AWSColonColonKinesisColonColonStream
  - typings.awsSdk.awsSdkStrings.AWSColonColonKinesisColonColonStreamConsumer
  - typings.awsSdk.awsSdkStrings.AWSColonColonCodeDeployColonColonApplication
  - typings.awsSdk.awsSdkStrings.AWSColonColonCodeDeployColonColonDeploymentConfig
  - typings.awsSdk.awsSdkStrings.AWSColonColonCodeDeployColonColonDeploymentGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonLaunchTemplate
  - typings.awsSdk.awsSdkStrings.AWSColonColonECRColonColonPublicRepository
  - typings.awsSdk.awsSdkStrings.AWSColonColonGuardDutyColonColonDetector
  - typings.awsSdk.awsSdkStrings.AWSColonColonEMRColonColonSecurityConfiguration
  - typings.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonCodeRepository
  - typings.awsSdk.awsSdkStrings.AWSColonColonRoute53ResolverColonColonResolverEndpoint
  - typings.awsSdk.awsSdkStrings.AWSColonColonRoute53ResolverColonColonResolverRule
  - typings.awsSdk.awsSdkStrings.AWSColonColonRoute53ResolverColonColonResolverRuleAssociation
  - typings.awsSdk.awsSdkStrings.AWSColonColonDMSColonColonReplicationSubnetGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonDMSColonColonEventSubscription
  - typings.awsSdk.awsSdkStrings.AWSColonColonMSKColonColonCluster
  - typings.awsSdk.awsSdkStrings.AWSColonColonStepFunctionsColonColonActivity
  - typings.awsSdk.awsSdkStrings.AWSColonColonWorkSpacesColonColonWorkspace
  - typings.awsSdk.awsSdkStrings.AWSColonColonWorkSpacesColonColonConnectionAlias
  - typings.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonModel
  - typings.awsSdk.awsSdkStrings.AWSColonColonElasticLoadBalancingV2ColonColonListener
  - typings.awsSdk.awsSdkStrings.AWSColonColonStepFunctionsColonColonStateMachine
  - typings.awsSdk.awsSdkStrings.AWSColonColonBatchColonColonJobQueue
  - typings.awsSdk.awsSdkStrings.AWSColonColonBatchColonColonComputeEnvironment
  - typings.awsSdk.awsSdkStrings.AWSColonColonAccessAnalyzerColonColonAnalyzer
  - typings.awsSdk.awsSdkStrings.AWSColonColonAthenaColonColonWorkGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonAthenaColonColonDataCatalog
  - typings.awsSdk.awsSdkStrings.AWSColonColonDetectiveColonColonGraph
  - typings.awsSdk.awsSdkStrings.AWSColonColonGlobalAcceleratorColonColonAccelerator
  - typings.awsSdk.awsSdkStrings.AWSColonColonGlobalAcceleratorColonColonEndpointGroup
  - typings.awsSdk.awsSdkStrings.AWSColonColonGlobalAcceleratorColonColonListener
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonTransitGatewayAttachment
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonTransitGatewayRouteTable
  - typings.awsSdk.awsSdkStrings.AWSColonColonDMSColonColonCertificate
  - typings.awsSdk.awsSdkStrings.AWSColonColonAppConfigColonColonApplication
  - typings.awsSdk.awsSdkStrings.AWSColonColonAppSyncColonColonGraphQLApi
  - typings.awsSdk.awsSdkStrings.AWSColonColonDataSyncColonColonLocationSMB
  - typings.awsSdk.awsSdkStrings.AWSColonColonDataSyncColonColonLocationFSxLustre
  - typings.awsSdk.awsSdkStrings.AWSColonColonDataSyncColonColonLocationS3
  - typings.awsSdk.awsSdkStrings.AWSColonColonDataSyncColonColonLocationEFS
  - typings.awsSdk.awsSdkStrings.AWSColonColonDataSyncColonColonTask
  - typings.awsSdk.awsSdkStrings.AWSColonColonDataSyncColonColonLocationNFS
  - typings.awsSdk.awsSdkStrings.AWSColonColonEC2ColonColonNetworkInsightsAccessScopeAnalysis
  - typings.awsSdk.awsSdkStrings.AWSColonColonEKSColonColonFargateProfile
  - typings.awsSdk.awsSdkStrings.AWSColonColonGlueColonColonJob
  - typings.awsSdk.awsSdkStrings.AWSColonColonGuardDutyColonColonThreatIntelSet
  - typings.awsSdk.awsSdkStrings.AWSColonColonGuardDutyColonColonIPSet
  - typings.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonWorkteam
  - typings.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonNotebookInstanceLifecycleConfig
  - typings.awsSdk.awsSdkStrings.AWSColonColonServiceDiscoveryColonColonService
  - typings.awsSdk.awsSdkStrings.AWSColonColonServiceDiscoveryColonColonPublicDnsNamespace
  - typings.awsSdk.awsSdkStrings.AWSColonColonSESColonColonContactList
  - typings.awsSdk.awsSdkStrings.AWSColonColonSESColonColonConfigurationSet
  - typings.awsSdk.awsSdkStrings.AWSColonColonRoute53ColonColonHostedZone
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type ResourceTypeList = js.Array[ResourceType]

type ResourceTypeString = java.lang.String

type ResourceTypes = js.Array[StringWithCharLimit256]

type ResourceTypesScope = js.Array[StringWithCharLimit256]

type ResourceValueType = RESOURCE_ID | java.lang.String

type Results = js.Array[String]

type RetentionConfigurationList = js.Array[RetentionConfiguration]

type RetentionConfigurationName = java.lang.String

type RetentionConfigurationNameList = js.Array[RetentionConfigurationName]

type RetentionPeriodInDays = Double

type RuleLimit = Double

type SSMDocumentName = java.lang.String

type SSMDocumentVersion = java.lang.String

type SchemaVersionId = java.lang.String

type SortBy = SCORE | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SourceDetails = js.Array[SourceDetail]

type StackArn = java.lang.String

type StaticParameterValues = js.Array[StringWithCharLimit256]

type StoredQueryMetadataList = js.Array[StoredQueryMetadata]

type String = java.lang.String

type StringWithCharLimit1024 = java.lang.String

type StringWithCharLimit128 = java.lang.String

type StringWithCharLimit2048 = java.lang.String

type StringWithCharLimit256 = java.lang.String

type StringWithCharLimit256Min0 = java.lang.String

type StringWithCharLimit64 = java.lang.String

type StringWithCharLimit768 = java.lang.String

type SupplementaryConfiguration = StringDictionary[SupplementaryConfigurationValue]

type SupplementaryConfigurationName = java.lang.String

type SupplementaryConfigurationValue = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Tags = StringDictionary[Value]

type TagsList = js.Array[Tag]

type TemplateBody = java.lang.String

type TemplateS3Uri = java.lang.String

type UnprocessedResourceIdentifierList = js.Array[AggregateResourceIdentifier]

type Value = java.lang.String

type Version = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-11-12`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
