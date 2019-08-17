package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsConfigserviceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.RESOURCE_ID
  import typings.awsDashSdk.awsDashSdkStrings.SSM_DOCUMENT
  import typings.awsDashSdk.awsDashSdkStrings.awsDOTconfig
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
  type AvailabilityZone = java.lang.String
  type AwsRegion = java.lang.String
  type BaseConfigurationItems = js.Array[BaseConfigurationItem]
  type BaseResourceId = java.lang.String
  type Boolean = scala.Boolean
  type ChannelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Reverse
    - typings.awsDashSdk.awsDashSdkStrings.Forward
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
  type ConfigRuleNames = js.Array[StringWithCharLimit64]
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
  type CosmosPageLimit = Double
  type DeliveryChannelList = js.Array[DeliveryChannel]
  type DeliveryChannelNameList = js.Array[ChannelName]
  type DeliveryChannelStatusList = js.Array[DeliveryChannelStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.Failure
    - typings.awsDashSdk.awsDashSdkStrings.Not_Applicable
    - java.lang.String
  */
  type DeliveryStatus = _DeliveryStatus | java.lang.String
  type DescribePendingAggregationRequestsLimit = Double
  type DiscoveredResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type EarlierTime = Date
  type EmptiableStringWithCharLimit256 = java.lang.String
  type EvaluationResults = js.Array[EvaluationResult]
  type Evaluations = js.Array[Evaluation]
  type EventSource = awsDOTconfig | java.lang.String
  type ExcludedAccounts = js.Array[AccountId]
  type Expression = java.lang.String
  type FailedRemediationBatches = js.Array[FailedRemediationBatch]
  type FieldInfoList = js.Array[FieldInfo]
  type FieldName = java.lang.String
  type GroupByAPILimit = Double
  type GroupedResourceCountList = js.Array[GroupedResourceCount]
  type IncludeGlobalResourceTypes = scala.Boolean
  type Integer = Double
  type LaterTime = Date
  type Limit = Double
  type Long = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.One_Hour
    - typings.awsDashSdk.awsDashSdkStrings.Three_Hours
    - typings.awsDashSdk.awsDashSdkStrings.Six_Hours
    - typings.awsDashSdk.awsDashSdkStrings.Twelve_Hours
    - typings.awsDashSdk.awsDashSdkStrings.TwentyFour_Hours
    - java.lang.String
  */
  type MaximumExecutionFrequency = _MaximumExecutionFrequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_IN_PROGRESS
    - java.lang.String
  */
  type OrganizationRuleStatus = _OrganizationRuleStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM_LAMBDA
    - typings.awsDashSdk.awsDashSdkStrings.AWS
    - java.lang.String
  */
  type Owner = _Owner | java.lang.String
  type PendingAggregationRequestList = js.Array[PendingAggregationRequest]
  type RecorderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Success
    - typings.awsDashSdk.awsDashSdkStrings.Failure
    - java.lang.String
  */
  type RecorderStatus = _RecorderStatus | java.lang.String
  type ReevaluateConfigRuleNames = js.Array[StringWithCharLimit64]
  type RelatedEvent = java.lang.String
  type RelatedEventList = js.Array[RelatedEvent]
  type RelationshipList = js.Array[Relationship]
  type RelationshipName = java.lang.String
  type RemediationConfigurations = js.Array[RemediationConfiguration]
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
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::CustomerGateway`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::EIP`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::Host`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::Instance`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::InternetGateway`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::NetworkAcl`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::NetworkInterface`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::RouteTable`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::SecurityGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::Subnet`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::CloudTrail::Trail`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::Volume`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::VPC`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::VPNConnection`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::EC2::VPNGateway`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::IAM::Group`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::IAM::Policy`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::IAM::Role`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::IAM::User`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::ACM::Certificate`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::RDS::DBInstance`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::RDS::DBSubnetGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::RDS::DBSecurityGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::RDS::DBSnapshot`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::RDS::EventSubscription`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::ElasticLoadBalancingV2::LoadBalancer`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::S3::Bucket`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::SSM::ManagedInstanceInventory`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Redshift::Cluster`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Redshift::ClusterSnapshot`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Redshift::ClusterParameterGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Redshift::ClusterSecurityGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Redshift::ClusterSubnetGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Redshift::EventSubscription`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::CloudWatch::Alarm`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::CloudFormation::Stack`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::DynamoDB::Table`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::AutoScaling::AutoScalingGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::AutoScaling::LaunchConfiguration`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::AutoScaling::ScalingPolicy`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::AutoScaling::ScheduledAction`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::CodeBuild::Project`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::WAF::RateBasedRule`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::WAF::Rule`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::WAF::WebACL`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::WAFRegional::RateBasedRule`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::WAFRegional::Rule`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::WAFRegional::WebACL`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::CloudFront::Distribution`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::CloudFront::StreamingDistribution`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::WAF::RuleGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::WAFRegional::RuleGroup`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Lambda::Function`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::ElasticBeanstalk::Application`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::ElasticBeanstalk::ApplicationVersion`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::ElasticBeanstalk::Environment`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::ElasticLoadBalancing::LoadBalancer`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::XRay::EncryptionConfig`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::SSM::AssociationCompliance`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::SSM::PatchCompliance`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Shield::Protection`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::ShieldRegional::Protection`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::Config::ResourceCompliance`
    - typings.awsDashSdk.awsDashSdkStrings.`AWS::CodePipeline::Pipeline`
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResourceTypeList = js.Array[ResourceType]
  type ResourceTypes = js.Array[StringWithCharLimit256]
  type ResourceTypesScope = js.Array[StringWithCharLimit256]
  type ResourceValueType = RESOURCE_ID | java.lang.String
  type Results = js.Array[String]
  type RetentionConfigurationList = js.Array[RetentionConfiguration]
  type RetentionConfigurationName = java.lang.String
  type RetentionConfigurationNameList = js.Array[RetentionConfigurationName]
  type RetentionPeriodInDays = Double
  type RuleLimit = Double
  type SourceDetails = js.Array[SourceDetail]
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
  type UnprocessedResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type Value = java.lang.String
  type Version = java.lang.String
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-11-12`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
