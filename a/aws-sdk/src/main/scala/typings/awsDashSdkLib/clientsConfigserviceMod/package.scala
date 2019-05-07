package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsConfigserviceMod {
  type ARN = java.lang.String
  type AccountAggregationSourceAccountList = js.Array[AccountId]
  type AccountAggregationSourceList = js.Array[AccountAggregationSource]
  type AccountId = java.lang.String
  type AggregateComplianceByConfigRuleList = js.Array[AggregateComplianceByConfigRule]
  type AggregateComplianceCountList = js.Array[AggregateComplianceCount]
  type AggregateEvaluationResultList = js.Array[AggregateEvaluationResult]
  type AggregatedSourceStatusList = js.Array[AggregatedSourceStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.OUTDATED
    - java.lang.String
  */
  type AggregatedSourceStatusType = _AggregatedSourceStatusType | java.lang.String
  type AggregatedSourceStatusTypeList = js.Array[AggregatedSourceStatusType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION
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
    - awsDashSdkLib.awsDashSdkLibStrings.Reverse
    - awsDashSdkLib.awsDashSdkLibStrings.Forward
    - java.lang.String
  */
  type ChronologicalOrder = _ChronologicalOrder | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComplianceByConfigRules = js.Array[ComplianceByConfigRule]
  type ComplianceByResources = js.Array[ComplianceByResource]
  type ComplianceResourceTypes = js.Array[StringWithCharLimit256]
  type ComplianceSummariesByResourceType = js.Array[ComplianceSummaryByResourceType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLIANT
    - awsDashSdkLib.awsDashSdkLibStrings.NON_COMPLIANT
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_APPLICABLE
    - awsDashSdkLib.awsDashSdkLibStrings.INSUFFICIENT_DATA
    - java.lang.String
  */
  type ComplianceType = _ComplianceType | java.lang.String
  type ComplianceTypes = js.Array[ComplianceType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT_ID
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_REGION
    - java.lang.String
  */
  type ConfigRuleComplianceSummaryGroupKey = _ConfigRuleComplianceSummaryGroupKey | java.lang.String
  type ConfigRuleEvaluationStatusList = js.Array[ConfigRuleEvaluationStatus]
  type ConfigRuleName = java.lang.String
  type ConfigRuleNames = js.Array[StringWithCharLimit64]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING_RESULTS
    - awsDashSdkLib.awsDashSdkLibStrings.EVALUATING
    - java.lang.String
  */
  type ConfigRuleState = _ConfigRuleState | java.lang.String
  type ConfigRules = js.Array[ConfigRule]
  type Configuration = java.lang.String
  type ConfigurationAggregatorArn = java.lang.String
  type ConfigurationAggregatorList = js.Array[ConfigurationAggregator]
  type ConfigurationAggregatorName = java.lang.String
  type ConfigurationAggregatorNameList = js.Array[ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime = stdLib.Date
  type ConfigurationItemList = js.Array[ConfigurationItem]
  type ConfigurationItemMD5Hash = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OK
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceDiscovered
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceNotRecorded
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceDeleted
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceDeletedNotRecorded
    - java.lang.String
  */
  type ConfigurationItemStatus = _ConfigurationItemStatus | java.lang.String
  type ConfigurationRecorderList = js.Array[ConfigurationRecorder]
  type ConfigurationRecorderNameList = js.Array[RecorderName]
  type ConfigurationRecorderStatusList = js.Array[ConfigurationRecorderStatus]
  type ConfigurationStateId = java.lang.String
  type DeliveryChannelList = js.Array[DeliveryChannel]
  type DeliveryChannelNameList = js.Array[ChannelName]
  type DeliveryChannelStatusList = js.Array[DeliveryChannelStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Failure
    - awsDashSdkLib.awsDashSdkLibStrings.Not_Applicable
    - java.lang.String
  */
  type DeliveryStatus = _DeliveryStatus | java.lang.String
  type DescribePendingAggregationRequestsLimit = scala.Double
  type DiscoveredResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type EarlierTime = stdLib.Date
  type EmptiableStringWithCharLimit256 = java.lang.String
  type EvaluationResults = js.Array[EvaluationResult]
  type Evaluations = js.Array[Evaluation]
  type EventSource = awsDashSdkLib.awsDashSdkLibStrings.awsDOTconfig | java.lang.String
  type Expression = java.lang.String
  type FailedRemediationBatches = js.Array[FailedRemediationBatch]
  type FieldInfoList = js.Array[FieldInfo]
  type FieldName = java.lang.String
  type GroupByAPILimit = scala.Double
  type GroupedResourceCountList = js.Array[GroupedResourceCount]
  type IncludeGlobalResourceTypes = scala.Boolean
  type Integer = scala.Double
  type LaterTime = stdLib.Date
  type Limit = scala.Double
  type Long = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.One_Hour
    - awsDashSdkLib.awsDashSdkLibStrings.Three_Hours
    - awsDashSdkLib.awsDashSdkLibStrings.Six_Hours
    - awsDashSdkLib.awsDashSdkLibStrings.Twelve_Hours
    - awsDashSdkLib.awsDashSdkLibStrings.TwentyFour_Hours
    - java.lang.String
  */
  type MaximumExecutionFrequency = _MaximumExecutionFrequency | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ConfigurationItemChangeNotification
    - awsDashSdkLib.awsDashSdkLibStrings.ConfigurationSnapshotDeliveryCompleted
    - awsDashSdkLib.awsDashSdkLibStrings.ScheduledNotification
    - awsDashSdkLib.awsDashSdkLibStrings.OversizedConfigurationItemChangeNotification
    - java.lang.String
  */
  type MessageType = _MessageType | java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OrderingTimestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM_LAMBDA
    - awsDashSdkLib.awsDashSdkLibStrings.AWS
    - java.lang.String
  */
  type Owner = _Owner | java.lang.String
  type PendingAggregationRequestList = js.Array[PendingAggregationRequest]
  type RecorderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Failure
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
    - awsDashSdkLib.awsDashSdkLibStrings.QUEUED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionState = _RemediationExecutionState | java.lang.String
  type RemediationExecutionStatuses = js.Array[RemediationExecutionStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type RemediationExecutionStepState = _RemediationExecutionStepState | java.lang.String
  type RemediationExecutionSteps = js.Array[RemediationExecutionStep]
  type RemediationParameters = org.scalablytyped.runtime.StringDictionary[RemediationParameterValue]
  type RemediationTargetType = awsDashSdkLib.awsDashSdkLibStrings.SSM_DOCUMENT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT_ID
    - awsDashSdkLib.awsDashSdkLibStrings.AWS_REGION
    - java.lang.String
  */
  type ResourceCountGroupKey = _ResourceCountGroupKey | java.lang.String
  type ResourceCounts = js.Array[ResourceCount]
  type ResourceCreationTime = stdLib.Date
  type ResourceDeletionTime = stdLib.Date
  type ResourceId = java.lang.String
  type ResourceIdList = js.Array[ResourceId]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceIdentifiersList = js.Array[AggregateResourceIdentifier]
  type ResourceKeys = js.Array[ResourceKey]
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::CustomerGateway`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::EIP`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::Host`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::Instance`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::InternetGateway`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::NetworkAcl`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::NetworkInterface`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::RouteTable`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::SecurityGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::Subnet`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::CloudTrail::Trail`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::Volume`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::VPC`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::VPNConnection`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::EC2::VPNGateway`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::IAM::Group`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::IAM::Policy`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::IAM::Role`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::IAM::User`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::ACM::Certificate`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::RDS::DBInstance`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::RDS::DBSubnetGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::RDS::DBSecurityGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::RDS::DBSnapshot`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::RDS::EventSubscription`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::ElasticLoadBalancingV2::LoadBalancer`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::S3::Bucket`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::SSM::ManagedInstanceInventory`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Redshift::Cluster`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Redshift::ClusterSnapshot`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Redshift::ClusterParameterGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Redshift::ClusterSecurityGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Redshift::ClusterSubnetGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Redshift::EventSubscription`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::CloudWatch::Alarm`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::CloudFormation::Stack`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::DynamoDB::Table`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::AutoScaling::AutoScalingGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::AutoScaling::LaunchConfiguration`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::AutoScaling::ScalingPolicy`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::AutoScaling::ScheduledAction`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::CodeBuild::Project`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::WAF::RateBasedRule`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::WAF::Rule`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::WAF::WebACL`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::WAFRegional::RateBasedRule`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::WAFRegional::Rule`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::WAFRegional::WebACL`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::CloudFront::Distribution`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::CloudFront::StreamingDistribution`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::WAF::RuleGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::WAFRegional::RuleGroup`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Lambda::Function`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::ElasticBeanstalk::Application`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::ElasticBeanstalk::ApplicationVersion`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::ElasticBeanstalk::Environment`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::ElasticLoadBalancing::LoadBalancer`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::XRay::EncryptionConfig`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::SSM::AssociationCompliance`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::SSM::PatchCompliance`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Shield::Protection`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::ShieldRegional::Protection`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::Config::ResourceCompliance`
    - awsDashSdkLib.awsDashSdkLibStrings.`AWS::CodePipeline::Pipeline`
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResourceTypeList = js.Array[ResourceType]
  type ResourceTypes = js.Array[StringWithCharLimit256]
  type ResourceValueType = awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_ID | java.lang.String
  type Results = js.Array[String]
  type RetentionConfigurationList = js.Array[RetentionConfiguration]
  type RetentionConfigurationName = java.lang.String
  type RetentionConfigurationNameList = js.Array[RetentionConfigurationName]
  type RetentionPeriodInDays = scala.Double
  type RuleLimit = scala.Double
  type SourceDetails = js.Array[SourceDetail]
  type StaticParameterValues = js.Array[StringWithCharLimit256]
  type String = java.lang.String
  type StringWithCharLimit1024 = java.lang.String
  type StringWithCharLimit128 = java.lang.String
  type StringWithCharLimit256 = java.lang.String
  type StringWithCharLimit64 = java.lang.String
  type SupplementaryConfiguration = org.scalablytyped.runtime.StringDictionary[SupplementaryConfigurationValue]
  type SupplementaryConfigurationName = java.lang.String
  type SupplementaryConfigurationValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[Value]
  type TagsList = js.Array[Tag]
  type UnprocessedResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type Value = java.lang.String
  type Version = java.lang.String
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-11-12`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
