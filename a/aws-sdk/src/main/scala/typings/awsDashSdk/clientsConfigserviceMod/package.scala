package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsConfigserviceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.RESOURCE_ID
  import typings.awsDashSdk.awsDashSdkStrings.SSM_DOCUMENT
  import typings.awsDashSdk.awsDashSdkStrings.awsDotconfig
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ARN = java.lang.String
  type AccountAggregationSourceAccountList = js.Array[AccountId]
  type AccountAggregationSourceList = js.Array[AccountAggregationSource]
  type AccountId = java.lang.String
  type AggregateComplianceByConfigRuleList = js.Array[AggregateComplianceByConfigRule]
  type AggregateComplianceCountList = js.Array[AggregateComplianceCount]
  type AggregateEvaluationResultList = js.Array[AggregateEvaluationResult]
  type AggregatedSourceStatusList = js.Array[AggregatedSourceStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.OUTDATED
    - java.lang.String
  */
  type AggregatedSourceStatusType = _AggregatedSourceStatusType | java.lang.String
  type AggregatedSourceStatusTypeList = js.Array[AggregatedSourceStatusType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT
    - typings.awsDashSdk.awsDashSdkStrings.ORGANIZATION
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
    - typings.awsDashSdk.awsDashSdkStrings.Reverse
    - typings.awsDashSdk.awsDashSdkStrings.Forward_
    - java.lang.String
  */
  type ChronologicalOrder = _ChronologicalOrder | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ComplianceByConfigRules = js.Array[ComplianceByConfigRule]
  type ComplianceByResources = js.Array[ComplianceByResource]
  type ComplianceResourceTypes = js.Array[StringWithCharLimit256]
  type ComplianceSummariesByResourceType = js.Array[ComplianceSummaryByResourceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLIANT
    - typings.awsDashSdk.awsDashSdkStrings.NON_COMPLIANT
    - typings.awsDashSdk.awsDashSdkStrings.NOT_APPLICABLE
    - typings.awsDashSdk.awsDashSdkStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type ComplianceType = _ComplianceType | java.lang.String
  type ComplianceTypes = js.Array[ComplianceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT_ID
    - typings.awsDashSdk.awsDashSdkStrings.AWS_REGION
    - java.lang.String
  */
  type ConfigRuleComplianceSummaryGroupKey = _ConfigRuleComplianceSummaryGroupKey | java.lang.String
  type ConfigRuleEvaluationStatusList = js.Array[ConfigRuleEvaluationStatus]
  type ConfigRuleName = java.lang.String
  type ConfigRuleNames = js.Array[ConfigRuleName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING_RESULTS
    - typings.awsDashSdk.awsDashSdkStrings.EVALUATING
    - java.lang.String
  */
  type ConfigRuleState = _ConfigRuleState | java.lang.String
  type ConfigRules = js.Array[ConfigRule]
  type Configuration = java.lang.String
  type ConfigurationAggregatorArn = java.lang.String
  type ConfigurationAggregatorList = js.Array[ConfigurationAggregator]
  type ConfigurationAggregatorName = java.lang.String
  type ConfigurationAggregatorNameList = js.Array[ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime = Date
  type ConfigurationItemList = js.Array[ConfigurationItem]
  type ConfigurationItemMD5Hash = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OK
    - typings.awsDashSdk.awsDashSdkStrings.ResourceDiscovered
    - typings.awsDashSdk.awsDashSdkStrings.ResourceNotRecorded
    - typings.awsDashSdk.awsDashSdkStrings.ResourceDeleted
    - typings.awsDashSdk.awsDashSdkStrings.ResourceDeletedNotRecorded
    - java.lang.String
  */
  type ConfigurationItemStatus = _ConfigurationItemStatus | java.lang.String
  type ConfigurationRecorderList = js.Array[ConfigurationRecorder]
  type ConfigurationRecorderNameList = js.Array[RecorderName]
  type ConfigurationRecorderStatusList = js.Array[ConfigurationRecorderStatus]
  type ConfigurationStateId = java.lang.String
  type ConformancePackArn = java.lang.String
  type ConformancePackComplianceResourceIds = js.Array[StringWithCharLimit256]
  type ConformancePackComplianceSummaryList = js.Array[ConformancePackComplianceSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLIANT
    - typings.awsDashSdk.awsDashSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ConformancePackComplianceType = _ConformancePackComplianceType | java.lang.String
  type ConformancePackConfigRuleNames = js.Array[StringWithCharLimit64]
  type ConformancePackDetailList = js.Array[ConformancePackDetail]
  type ConformancePackId = java.lang.String
  type ConformancePackInputParameters = js.Array[ConformancePackInputParameter]
  type ConformancePackName = java.lang.String
  type ConformancePackNamesList = js.Array[ConformancePackName]
  type ConformancePackNamesToSummarizeList = js.Array[ConformancePackName]
  type ConformancePackRuleComplianceList = js.Array[ConformancePackRuleCompliance]
  type ConformancePackRuleEvaluationResultsList = js.Array[ConformancePackEvaluationResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type ConformancePackState = _ConformancePackState | java.lang.String
  type ConformancePackStatusDetailsList = js.Array[ConformancePackStatusDetail]
  type ConformancePackStatusReason = java.lang.String
  type CosmosPageLimit = Double
  type DeliveryChannelList = js.Array[DeliveryChannel]
  type DeliveryChannelNameList = js.Array[ChannelName]
  type DeliveryChannelStatusList = js.Array[DeliveryChannelStatus]
  type DeliveryS3Bucket = java.lang.String
  type DeliveryS3KeyPrefix = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Success_
    - typings.awsDashSdk.awsDashSdkStrings.Failure_
    - typings.awsDashSdk.awsDashSdkStrings.Not_Applicable_
    - java.lang.String
  */
  type DeliveryStatus = _DeliveryStatus | java.lang.String
  type DescribeConformancePackComplianceLimit = Double
  type DescribePendingAggregationRequestsLimit = Double
  type DiscoveredResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type EarlierTime = Date
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
  type LaterTime = Date
  type Limit = Double
  type Long = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.One_Hour_
    - typings.awsDashSdk.awsDashSdkStrings.Three_Hours
    - typings.awsDashSdk.awsDashSdkStrings.Six_Hours_
    - typings.awsDashSdk.awsDashSdkStrings.Twelve_Hours
    - typings.awsDashSdk.awsDashSdkStrings.TwentyFour_Hours
    - java.lang.String
  */
  type MaximumExecutionFrequency = _MaximumExecutionFrequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type MemberAccountRuleStatus = _MemberAccountRuleStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ConfigurationItemChangeNotification
    - typings.awsDashSdk.awsDashSdkStrings.ConfigurationSnapshotDeliveryCompleted
    - typings.awsDashSdk.awsDashSdkStrings.ScheduledNotification
    - typings.awsDashSdk.awsDashSdkStrings.OversizedConfigurationItemChangeNotification
    - java.lang.String
  */
  type MessageType = _MessageType | java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OrderingTimestamp = Date
  type OrganizationConfigRuleDetailedStatus = js.Array[MemberAccountStatus]
  type OrganizationConfigRuleName = java.lang.String
  type OrganizationConfigRuleNames = js.Array[StringWithCharLimit64]
  type OrganizationConfigRuleStatuses = js.Array[OrganizationConfigRuleStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ConfigurationItemChangeNotification
    - typings.awsDashSdk.awsDashSdkStrings.OversizedConfigurationItemChangeNotification
    - typings.awsDashSdk.awsDashSdkStrings.ScheduledNotification
    - java.lang.String
  */
  type OrganizationConfigRuleTriggerType = _OrganizationConfigRuleTriggerType | java.lang.String
  type OrganizationConfigRuleTriggerTypes = js.Array[OrganizationConfigRuleTriggerType]
  type OrganizationConfigRules = js.Array[OrganizationConfigRule]
  type OrganizationConformancePackDetailedStatuses = js.Array[OrganizationConformancePackDetailedStatus]
  type OrganizationConformancePackName = java.lang.String
  type OrganizationConformancePackNames = js.Array[OrganizationConformancePackName]
  type OrganizationConformancePackStatuses = js.Array[OrganizationConformancePackStatus]
  type OrganizationConformancePacks = js.Array[OrganizationConformancePack]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationResourceDetailedStatus = _OrganizationResourceDetailedStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationResourceStatus = _OrganizationResourceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - java.lang.String
  */
  type OrganizationRuleStatus = _OrganizationRuleStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM_LAMBDA
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - java.lang.String
  */
  type Owner = _Owner | java.lang.String
  type PageSizeLimit = Double
  type ParameterName = java.lang.String
  type ParameterValue = java.lang.String
  type PendingAggregationRequestList = js.Array[PendingAggregationRequest]
  type Percentage = Double
  type RecorderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Success_
    - typings.awsDashSdk.awsDashSdkStrings.Failure_
    - java.lang.String
  */
  type RecorderStatus = _RecorderStatus | java.lang.String
  type ReevaluateConfigRuleNames = js.Array[StringWithCharLimit64]
  type RelatedEvent = java.lang.String
  type RelatedEventList = js.Array[RelatedEvent]
  type RelationshipList = js.Array[Relationship]
  type RelationshipName = java.lang.String
  type RemediationConfigurations = js.Array[RemediationConfiguration]
  type RemediationExceptionResourceKeys = js.Array[RemediationExceptionResourceKey]
  type RemediationExceptions = js.Array[RemediationException]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.QUEUED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionState = _RemediationExecutionState | java.lang.String
  type RemediationExecutionStatuses = js.Array[RemediationExecutionStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionStepState = _RemediationExecutionStepState | java.lang.String
  type RemediationExecutionSteps = js.Array[RemediationExecutionStep]
  type RemediationParameters = StringDictionary[RemediationParameterValue]
  type RemediationTargetType = SSM_DOCUMENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RESOURCE_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.ACCOUNT_ID
    - typings.awsDashSdk.awsDashSdkStrings.AWS_REGION
    - java.lang.String
  */
  type ResourceCountGroupKey = _ResourceCountGroupKey | java.lang.String
  type ResourceCounts = js.Array[ResourceCount]
  type ResourceCreationTime = Date
  type ResourceDeletionTime = Date
  type ResourceId = java.lang.String
  type ResourceIdList = js.Array[ResourceId]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceIdentifiersList = js.Array[AggregateResourceIdentifier]
  type ResourceKeys = js.Array[ResourceKey]
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonCustomerGateway
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonEIP
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonHost
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonInstance
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonInternetGateway
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonNetworkAcl
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonNetworkInterface
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonRouteTable
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonSecurityGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonSubnet
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonCloudTrailColonColonTrail
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonVolume
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonVPC
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonVPNConnection
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonVPNGateway
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonRegisteredHAInstance
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonNatGateway
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonEgressOnlyInternetGateway
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonVPCEndpoint
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonVPCEndpointService
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonFlowLog
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonEC2ColonColonVPCPeeringConnection
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonIAMColonColonGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonIAMColonColonPolicy
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonIAMColonColonRole
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonIAMColonColonUser
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonElasticLoadBalancingV2ColonColonLoadBalancer
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonACMColonColonCertificate
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBInstance
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBParameterGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBOptionGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBSubnetGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBSecurityGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBCluster
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBClusterParameterGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonDBClusterSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRDSColonColonEventSubscription
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonS3ColonColonBucket
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonS3ColonColonAccountPublicAccessBlock
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRedshiftColonColonCluster
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRedshiftColonColonClusterSnapshot
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRedshiftColonColonClusterParameterGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRedshiftColonColonClusterSecurityGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRedshiftColonColonClusterSubnetGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonRedshiftColonColonEventSubscription
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonSSMColonColonManagedInstanceInventory
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonCloudWatchColonColonAlarm
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonCloudFormationColonColonStack
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonElasticLoadBalancingColonColonLoadBalancer
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonAutoScalingColonColonAutoScalingGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonAutoScalingColonColonLaunchConfiguration
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonAutoScalingColonColonScalingPolicy
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonAutoScalingColonColonScheduledAction
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonDynamoDBColonColonTable
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonCodeBuildColonColonProject
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonWAFColonColonRateBasedRule
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonWAFColonColonRule
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonWAFColonColonRuleGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonWAFColonColonWebACL
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonWAFRegionalColonColonRateBasedRule
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonWAFRegionalColonColonRule
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonWAFRegionalColonColonRuleGroup
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonWAFRegionalColonColonWebACL
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonCloudFrontColonColonDistribution
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonCloudFrontColonColonStreamingDistribution
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonLambdaColonColonAlias
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonLambdaColonColonFunction
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonElasticBeanstalkColonColonApplication
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonElasticBeanstalkColonColonApplicationVersion
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonElasticBeanstalkColonColonEnvironment
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonMobileHubColonColonProject
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonXRayColonColonEncryptionConfig
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonSSMColonColonAssociationCompliance
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonSSMColonColonPatchCompliance
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonShieldColonColonProtection
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonShieldRegionalColonColonProtection
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonConfigColonColonResourceCompliance
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonLicenseManagerColonColonLicenseConfiguration
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonApiGatewayColonColonDomainName
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonApiGatewayColonColonMethod
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonApiGatewayColonColonStage
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonApiGatewayColonColonRestApi
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonApiGatewayV2ColonColonDomainName
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonApiGatewayV2ColonColonStage
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonApiGatewayV2ColonColonApi
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonCodePipelineColonColonPipeline
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProvisionedProduct
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonServiceCatalogColonColonCloudFormationProduct
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonServiceCatalogColonColonPortfolio
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
  type SchemaVersionId = java.lang.String
  type SourceDetails = js.Array[SourceDetail]
  type StackArn = java.lang.String
  type StaticParameterValues = js.Array[StringWithCharLimit256]
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
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-11-12`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
