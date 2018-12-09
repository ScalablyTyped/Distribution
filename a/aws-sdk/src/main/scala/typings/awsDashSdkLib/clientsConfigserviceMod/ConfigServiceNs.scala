package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/configservice", "ConfigService")
@js.native
object ConfigServiceNs extends js.Object {
  
  trait AccountAggregationSource extends js.Object {
    /**
         * The 12-digit account ID of the account being aggregated. 
         */
    var AccountIds: AccountAggregationSourceAccountList
    /**
         * If true, aggregate existing AWS Config regions and future regions.
         */
    var AllAwsRegions: js.UndefOr[Boolean] = js.undefined
    /**
         * The source regions being aggregated.
         */
    var AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
  }
  
  
  trait AggregateComplianceByConfigRule extends js.Object {
    /**
         * The 12-digit account ID of the source account.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The source region from where the data is aggregated.
         */
    var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
    /**
         * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.
         */
    var Compliance: js.UndefOr[Compliance] = js.undefined
    /**
         * The name of the AWS Config rule.
         */
    var ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined
  }
  
  
  trait AggregateComplianceCount extends js.Object {
    /**
         * The number of compliant and noncompliant AWS Config rules.
         */
    var ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined
    /**
         * The 12-digit account ID or region based on the GroupByKey value.
         */
    var GroupName: js.UndefOr[StringWithCharLimit256] = js.undefined
  }
  
  
  trait AggregateEvaluationResult extends js.Object {
    /**
         * The 12-digit account ID of the source account.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * Supplementary information about how the agrregate evaluation determined the compliance.
         */
    var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
    /**
         * The source region from where the data is aggregated.
         */
    var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
    /**
         * The resource compliance status. For the AggregationEvaluationResult data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA value.
         */
    var ComplianceType: js.UndefOr[ComplianceType] = js.undefined
    /**
         * The time when the AWS Config rule evaluated the AWS resource.
         */
    var ConfigRuleInvokedTime: js.UndefOr[_Date] = js.undefined
    /**
         * Uniquely identifies the evaluation result.
         */
    var EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined
    /**
         * The time when AWS Config recorded the aggregate evaluation result.
         */
    var ResultRecordedTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait AggregateResourceIdentifier extends js.Object {
    /**
         * The ID of the AWS resource.
         */
    var ResourceId: ResourceId
    /**
         * The name of the AWS resource.
         */
    var ResourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The type of the AWS resource.
         */
    var ResourceType: ResourceType
    /**
         * The 12-digit account ID of the source account.
         */
    var SourceAccountId: AccountId
    /**
         * The source region where data is aggregated.
         */
    var SourceRegion: AwsRegion
  }
  
  
  trait AggregatedSourceStatus extends js.Object {
    /**
         * The region authorized to collect aggregated data.
         */
    var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
    /**
         * The error code that AWS Config returned when the source account aggregation last failed.
         */
    var LastErrorCode: js.UndefOr[String] = js.undefined
    /**
         * The message indicating that the source account aggregation failed due to an error.
         */
    var LastErrorMessage: js.UndefOr[String] = js.undefined
    /**
         * Filters the last updated status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
         */
    var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.undefined
    /**
         * The time of the last update.
         */
    var LastUpdateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The source account ID or an organization.
         */
    var SourceId: js.UndefOr[String] = js.undefined
    /**
         * The source account or an organization.
         */
    var SourceType: js.UndefOr[AggregatedSourceType] = js.undefined
  }
  
  
  trait AggregationAuthorization extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the aggregation object.
         */
    var AggregationAuthorizationArn: js.UndefOr[String] = js.undefined
    /**
         * The 12-digit account ID of the account authorized to aggregate data.
         */
    var AuthorizedAccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The region authorized to collect aggregated data.
         */
    var AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.undefined
    /**
         * The time stamp when the aggregation authorization was created.
         */
    var CreationTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait BaseConfigurationItem extends js.Object {
    /**
         * The 12-digit AWS account ID associated with the resource.
         */
    var accountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var arn: js.UndefOr[ARN] = js.undefined
    /**
         * The Availability Zone associated with the resource.
         */
    var availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    /**
         * The region where the resource resides.
         */
    var awsRegion: js.UndefOr[AwsRegion] = js.undefined
    /**
         * The description of the resource configuration.
         */
    var configuration: js.UndefOr[Configuration] = js.undefined
    /**
         * The time when the configuration recording was initiated.
         */
    var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.undefined
    /**
         * The configuration item status.
         */
    var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined
    /**
         * An identifier that indicates the ordering of the configuration items of a resource.
         */
    var configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined
    /**
         * The time stamp when the resource was created.
         */
    var resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.undefined
    /**
         * The ID of the resource (for example., sg-xxxxxx).
         */
    var resourceId: js.UndefOr[ResourceId] = js.undefined
    /**
         * The custom name of the resource, if available.
         */
    var resourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The type of AWS resource.
         */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
         * Configuration attributes that AWS Config returns for certain resource types to supplement the information returned for the configuration parameter.
         */
    var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.undefined
    /**
         * The version number of the resource configuration.
         */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  
  trait BatchGetAggregateResourceConfigRequest extends js.Object {
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * A list of aggregate ResourceIdentifiers objects. 
         */
    var ResourceIdentifiers: ResourceIdentifiersList
  }
  
  
  trait BatchGetAggregateResourceConfigResponse extends js.Object {
    /**
         * A list that contains the current configuration of one or more resources.
         */
    var BaseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined
    /**
         * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources are processed.
         */
    var UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.undefined
  }
  
  
  trait BatchGetResourceConfigRequest extends js.Object {
    /**
         * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID.
         */
    var resourceKeys: ResourceKeys
  }
  
  
  trait BatchGetResourceConfigResponse extends js.Object {
    /**
         * A list that contains the current configuration of one or more resources.
         */
    var baseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined
    /**
         * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys list. 
         */
    var unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Compliance extends js.Object {
    /**
         * The number of AWS resources or AWS Config rules that cause a result of NON_COMPLIANT, up to a maximum number.
         */
    var ComplianceContributorCount: js.UndefOr[ComplianceContributorCount] = js.undefined
    /**
         * Indicates whether an AWS resource or AWS Config rule is compliant. A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is noncompliant if it does not comply with one or more of these rules. A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any of these resources do not comply. AWS Config returns the INSUFFICIENT_DATA value when no evaluation results are available for the AWS resource or AWS Config rule. For the Compliance data type, AWS Config supports only COMPLIANT, NON_COMPLIANT, and INSUFFICIENT_DATA values. AWS Config does not support the NOT_APPLICABLE value for the Compliance data type.
         */
    var ComplianceType: js.UndefOr[ComplianceType] = js.undefined
  }
  
  
  trait ComplianceByConfigRule extends js.Object {
    /**
         * Indicates whether the AWS Config rule is compliant.
         */
    var Compliance: js.UndefOr[Compliance] = js.undefined
    /**
         * The name of the AWS Config rule.
         */
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
  }
  
  
  trait ComplianceByResource extends js.Object {
    /**
         * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
         */
    var Compliance: js.UndefOr[Compliance] = js.undefined
    /**
         * The ID of the AWS resource that was evaluated.
         */
    var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
    /**
         * The type of the AWS resource that was evaluated.
         */
    var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
  }
  
  
  trait ComplianceContributorCount extends js.Object {
    /**
         * Indicates whether the maximum count is reached.
         */
    var CapExceeded: js.UndefOr[Boolean] = js.undefined
    /**
         * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
         */
    var CappedCount: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait ComplianceSummary extends js.Object {
    /**
         * The time that AWS Config created the compliance summary.
         */
    var ComplianceSummaryTimestamp: js.UndefOr[_Date] = js.undefined
    /**
         * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for resources.
         */
    var CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined
    /**
         * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100 for resources.
         */
    var NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined
  }
  
  
  trait ComplianceSummaryByResourceType extends js.Object {
    /**
         * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each.
         */
    var ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined
    /**
         * The type of AWS resource.
         */
    var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
  }
  
  
  trait ConfigExportDeliveryInfo extends js.Object {
    /**
         * The time of the last attempted delivery.
         */
    var lastAttemptTime: js.UndefOr[_Date] = js.undefined
    /**
         * The error code from the last attempted delivery.
         */
    var lastErrorCode: js.UndefOr[String] = js.undefined
    /**
         * The error message from the last attempted delivery.
         */
    var lastErrorMessage: js.UndefOr[String] = js.undefined
    /**
         * Status of the last attempted delivery.
         */
    var lastStatus: js.UndefOr[DeliveryStatus] = js.undefined
    /**
         * The time of the last successful delivery.
         */
    var lastSuccessfulTime: js.UndefOr[_Date] = js.undefined
    /**
         * The time that the next delivery occurs.
         */
    var nextDeliveryTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait ConfigRule extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the AWS Config rule.
         */
    var ConfigRuleArn: js.UndefOr[String] = js.undefined
    /**
         * The ID of the AWS Config rule.
         */
    var ConfigRuleId: js.UndefOr[String] = js.undefined
    /**
         * The name that you assign to the AWS Config rule. The name is required if you are adding a new rule.
         */
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
    /**
         * Indicates whether the AWS Config rule is active or is currently being deleted by AWS Config. It can also indicate the evaluation status for the AWS Config rule. AWS Config sets the state of the rule to EVALUATING temporarily after you use the StartConfigRulesEvaluation request to evaluate your resources against the AWS Config rule. AWS Config sets the state of the rule to DELETING_RESULTS temporarily after you use the DeleteEvaluationResults request to delete the current evaluation results for the AWS Config rule. AWS Config temporarily sets the state of a rule to DELETING after you use the DeleteConfigRule request to delete the rule. After AWS Config deletes the rule, the rule and all of its evaluations are erased and are no longer available.
         */
    var ConfigRuleState: js.UndefOr[ConfigRuleState] = js.undefined
    /**
         * Service principal name of the service that created the rule.  The field is populated only if the service linked rule is created by a service. The field is empty if you create your own rule. 
         */
    var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.undefined
    /**
         * The description that you provide for the AWS Config rule.
         */
    var Description: js.UndefOr[EmptiableStringWithCharLimit256] = js.undefined
    /**
         * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
         */
    var InputParameters: js.UndefOr[StringWithCharLimit1024] = js.undefined
    /**
         * The maximum frequency with which AWS Config runs evaluations for a rule. You can specify a value for MaximumExecutionFrequency when:   You are using an AWS managed rule that is triggered at a periodic frequency.   Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more information, see ConfigSnapshotDeliveryProperties.    By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. 
         */
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
    /**
         * Defines which resources can trigger an evaluation for the rule. The scope can include one or more resource types, a combination of one resource type and one resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are triggered when any resource in the recording group changes.
         */
    var Scope: js.UndefOr[Scope] = js.undefined
    /**
         * Provides the rule owner (AWS or customer), the rule identifier, and the notifications that cause the function to evaluate your AWS resources.
         */
    var Source: Source
  }
  
  
  trait ConfigRuleComplianceFilters extends js.Object {
    /**
         * The 12-digit account ID of the source account. 
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The source region where the data is aggregated. 
         */
    var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
    /**
         * The rule compliance status. For the ConfigRuleComplianceFilters data type, AWS Config supports only COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and the INSUFFICIENT_DATA values.
         */
    var ComplianceType: js.UndefOr[ComplianceType] = js.undefined
    /**
         * The name of the AWS Config rule.
         */
    var ConfigRuleName: js.UndefOr[ConfigRuleName] = js.undefined
  }
  
  
  trait ConfigRuleComplianceSummaryFilters extends js.Object {
    /**
         * The 12-digit account ID of the source account.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The source region where the data is aggregated.
         */
    var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
  }
  
  
  trait ConfigRuleEvaluationStatus extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the AWS Config rule.
         */
    var ConfigRuleArn: js.UndefOr[String] = js.undefined
    /**
         * The ID of the AWS Config rule.
         */
    var ConfigRuleId: js.UndefOr[String] = js.undefined
    /**
         * The name of the AWS Config rule.
         */
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
    /**
         * The time that you first activated the AWS Config rule.
         */
    var FirstActivatedTime: js.UndefOr[_Date] = js.undefined
    /**
         * Indicates whether AWS Config has evaluated your resources against the rule at least once.    true - AWS Config has evaluated your AWS resources against the rule at least once.    false - AWS Config has not once finished evaluating your AWS resources against the rule.  
         */
    var FirstEvaluationStarted: js.UndefOr[Boolean] = js.undefined
    /**
         * The error code that AWS Config returned when the rule last failed.
         */
    var LastErrorCode: js.UndefOr[String] = js.undefined
    /**
         * The error message that AWS Config returned when the rule last failed.
         */
    var LastErrorMessage: js.UndefOr[String] = js.undefined
    /**
         * The time that AWS Config last failed to evaluate your AWS resources against the rule.
         */
    var LastFailedEvaluationTime: js.UndefOr[_Date] = js.undefined
    /**
         * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
         */
    var LastFailedInvocationTime: js.UndefOr[_Date] = js.undefined
    /**
         * The time that AWS Config last successfully evaluated your AWS resources against the rule.
         */
    var LastSuccessfulEvaluationTime: js.UndefOr[_Date] = js.undefined
    /**
         * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
         */
    var LastSuccessfulInvocationTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait ConfigSnapshotDeliveryProperties extends js.Object {
    /**
         * The frequency with which AWS Config delivers configuration snapshots.
         */
    var deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
  }
  
  
  trait ConfigStreamDeliveryInfo extends js.Object {
    /**
         * The error code from the last attempted delivery.
         */
    var lastErrorCode: js.UndefOr[String] = js.undefined
    /**
         * The error message from the last attempted delivery.
         */
    var lastErrorMessage: js.UndefOr[String] = js.undefined
    /**
         * Status of the last attempted delivery.  Note Providing an SNS topic on a DeliveryChannel for AWS Config is optional. If the SNS delivery is turned off, the last status will be Not_Applicable.
         */
    var lastStatus: js.UndefOr[DeliveryStatus] = js.undefined
    /**
         * The time from the last status change.
         */
    var lastStatusChangeTime: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait ConfigurationAggregator extends js.Object {
    /**
         * Provides a list of source accounts and regions to be aggregated.
         */
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the aggregator.
         */
    var ConfigurationAggregatorArn: js.UndefOr[ConfigurationAggregatorArn] = js.undefined
    /**
         * The name of the aggregator.
         */
    var ConfigurationAggregatorName: js.UndefOr[ConfigurationAggregatorName] = js.undefined
    /**
         * The time stamp when the configuration aggregator was created.
         */
    var CreationTime: js.UndefOr[_Date] = js.undefined
    /**
         * The time of the last update.
         */
    var LastUpdatedTime: js.UndefOr[_Date] = js.undefined
    /**
         * Provides an organization and list of regions to be aggregated.
         */
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined
  }
  
  
  trait ConfigurationItem extends js.Object {
    /**
         * The 12-digit AWS account ID associated with the resource.
         */
    var accountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var arn: js.UndefOr[ARN] = js.undefined
    /**
         * The Availability Zone associated with the resource.
         */
    var availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    /**
         * The region where the resource resides.
         */
    var awsRegion: js.UndefOr[AwsRegion] = js.undefined
    /**
         * The description of the resource configuration.
         */
    var configuration: js.UndefOr[Configuration] = js.undefined
    /**
         * The time when the configuration recording was initiated.
         */
    var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.undefined
    /**
         * Unique MD5 hash that represents the configuration item's state. You can use MD5 hash to compare the states of two or more configuration items that are associated with the same resource.
         */
    var configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash] = js.undefined
    /**
         * The configuration item status.
         */
    var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined
    /**
         * An identifier that indicates the ordering of the configuration items of a resource.
         */
    var configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined
    /**
         * A list of CloudTrail event IDs. A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail log. For more information about CloudTrail, see What Is AWS CloudTrail. An empty field indicates that the current configuration was not initiated by any event.
         */
    var relatedEvents: js.UndefOr[RelatedEventList] = js.undefined
    /**
         * A list of related AWS resources.
         */
    var relationships: js.UndefOr[RelationshipList] = js.undefined
    /**
         * The time stamp when the resource was created.
         */
    var resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.undefined
    /**
         * The ID of the resource (for example, sg-xxxxxx).
         */
    var resourceId: js.UndefOr[ResourceId] = js.undefined
    /**
         * The custom name of the resource, if available.
         */
    var resourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The type of AWS resource.
         */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
    /**
         * Configuration attributes that AWS Config returns for certain resource types to supplement the information returned for the configuration parameter.
         */
    var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.undefined
    /**
         * A mapping of key value tags associated with the resource.
         */
    var tags: js.UndefOr[Tags] = js.undefined
    /**
         * The version number of the resource configuration.
         */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  
  trait ConfigurationRecorder extends js.Object {
    /**
         * The name of the recorder. By default, AWS Config automatically assigns the name "default" when creating the configuration recorder. You cannot change the assigned name.
         */
    var name: js.UndefOr[RecorderName] = js.undefined
    /**
         * Specifies the types of AWS resources for which AWS Config records configuration changes.
         */
    var recordingGroup: js.UndefOr[RecordingGroup] = js.undefined
    /**
         * Amazon Resource Name (ARN) of the IAM role used to describe the AWS resources associated with the account.
         */
    var roleARN: js.UndefOr[String] = js.undefined
  }
  
  
  trait ConfigurationRecorderStatus extends js.Object {
    /**
         * The error code indicating that the recording failed.
         */
    var lastErrorCode: js.UndefOr[String] = js.undefined
    /**
         * The message indicating that the recording failed due to an error.
         */
    var lastErrorMessage: js.UndefOr[String] = js.undefined
    /**
         * The time the recorder was last started.
         */
    var lastStartTime: js.UndefOr[_Date] = js.undefined
    /**
         * The last (previous) status of the recorder.
         */
    var lastStatus: js.UndefOr[RecorderStatus] = js.undefined
    /**
         * The time when the status was last changed.
         */
    var lastStatusChangeTime: js.UndefOr[_Date] = js.undefined
    /**
         * The time the recorder was last stopped.
         */
    var lastStopTime: js.UndefOr[_Date] = js.undefined
    /**
         * The name of the configuration recorder.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * Specifies whether or not the recorder is currently recording.
         */
    var recording: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait DeleteAggregationAuthorizationRequest extends js.Object {
    /**
         * The 12-digit account ID of the account authorized to aggregate data.
         */
    var AuthorizedAccountId: AccountId
    /**
         * The region authorized to collect aggregated data.
         */
    var AuthorizedAwsRegion: AwsRegion
  }
  
  
  trait DeleteConfigRuleRequest extends js.Object {
    /**
         * The name of the AWS Config rule that you want to delete.
         */
    var ConfigRuleName: StringWithCharLimit64
  }
  
  
  trait DeleteConfigurationAggregatorRequest extends js.Object {
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
  }
  
  
  trait DeleteConfigurationRecorderRequest extends js.Object {
    /**
         * The name of the configuration recorder to be deleted. You can retrieve the name of your configuration recorder by using the DescribeConfigurationRecorders action.
         */
    var ConfigurationRecorderName: RecorderName
  }
  
  
  trait DeleteDeliveryChannelRequest extends js.Object {
    /**
         * The name of the delivery channel to delete.
         */
    var DeliveryChannelName: ChannelName
  }
  
  
  trait DeleteEvaluationResultsRequest extends js.Object {
    /**
         * The name of the AWS Config rule for which you want to delete the evaluation results.
         */
    var ConfigRuleName: StringWithCharLimit64
  }
  
  
  trait DeleteEvaluationResultsResponse extends js.Object
  
  
  trait DeletePendingAggregationRequestRequest extends js.Object {
    /**
         * The 12-digit account ID of the account requesting to aggregate data.
         */
    var RequesterAccountId: AccountId
    /**
         * The region requesting to aggregate data.
         */
    var RequesterAwsRegion: AwsRegion
  }
  
  
  trait DeleteRetentionConfigurationRequest extends js.Object {
    /**
         * The name of the retention configuration to delete.
         */
    var RetentionConfigurationName: RetentionConfigurationName
  }
  
  
  trait DeliverConfigSnapshotRequest extends js.Object {
    /**
         * The name of the delivery channel through which the snapshot is delivered.
         */
    var deliveryChannelName: ChannelName
  }
  
  
  trait DeliverConfigSnapshotResponse extends js.Object {
    /**
         * The ID of the snapshot that is being created.
         */
    var configSnapshotId: js.UndefOr[String] = js.undefined
  }
  
  
  trait DeliveryChannel extends js.Object {
    /**
         * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
         */
    var configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties] = js.undefined
    /**
         * The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the delivery channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to delete your current delivery channel, and then you must use the PutDeliveryChannel command to create a delivery channel that has the desired name.
         */
    var name: js.UndefOr[ChannelName] = js.undefined
    /**
         * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration history files. If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant access permissions to AWS Config. For more information, see Permissions for the Amazon S3 Bucket in the AWS Config Developer Guide.
         */
    var s3BucketName: js.UndefOr[String] = js.undefined
    /**
         * The prefix for the specified Amazon S3 bucket.
         */
    var s3KeyPrefix: js.UndefOr[String] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about configuration changes. If you choose a topic from another account, the topic must have policies that grant access permissions to AWS Config. For more information, see Permissions for the Amazon SNS Topic in the AWS Config Developer Guide.
         */
    var snsTopicARN: js.UndefOr[String] = js.undefined
  }
  
  
  trait DeliveryChannelStatus extends js.Object {
    /**
         * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
         */
    var configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined
    /**
         * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
         */
    var configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined
    /**
         * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS topic.
         */
    var configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.undefined
    /**
         * The name of the delivery channel.
         */
    var name: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeAggregateComplianceByConfigRulesRequest extends js.Object {
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * Filters the results by ConfigRuleComplianceFilters object. 
         */
    var Filters: js.UndefOr[ConfigRuleComplianceFilters] = js.undefined
    /**
         * The maximum number of evaluation results returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[GroupByAPILimit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait DescribeAggregateComplianceByConfigRulesResponse extends js.Object {
    /**
         * Returns a list of AggregateComplianceByConfigRule object.
         */
    var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait DescribeAggregationAuthorizationsRequest extends js.Object {
    /**
         * The maximum number of AggregationAuthorizations returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeAggregationAuthorizationsResponse extends js.Object {
    /**
         * Returns a list of authorizations granted to various aggregator accounts and regions.
         */
    var AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeComplianceByConfigRuleRequest extends js.Object {
    /**
         * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and INSUFFICIENT_DATA.
         */
    var ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined
    /**
         * Specify one or more AWS Config rule names to filter the results by rule.
         */
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeComplianceByConfigRuleResponse extends js.Object {
    /**
         * Indicates whether each of the specified AWS Config rules is compliant.
         */
    var ComplianceByConfigRules: js.UndefOr[ComplianceByConfigRules] = js.undefined
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeComplianceByResourceRequest extends js.Object {
    /**
         * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
         */
    var ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined
    /**
         * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The ID of the AWS resource for which you want compliance information. You can specify only one resource ID. If you specify a resource ID, you must also specify a type for ResourceType.
         */
    var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
    /**
         * The types of AWS resources for which you want compliance information (for example, AWS::EC2::Instance). For this action, you can specify that the resource type is an AWS account by specifying AWS::::Account.
         */
    var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
  }
  
  
  trait DescribeComplianceByResourceResponse extends js.Object {
    /**
         * Indicates whether the specified AWS resource complies with all of the AWS Config rules that evaluate it.
         */
    var ComplianceByResources: js.UndefOr[ComplianceByResources] = js.undefined
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait DescribeConfigRuleEvaluationStatusRequest extends js.Object {
    /**
         * The name of the AWS managed Config rules for which you want status information. If you do not specify any names, AWS Config returns status information for all AWS managed Config rules that you use.
         */
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined
    /**
         * The number of rule evaluation results that you want returned. This parameter is required if the rule limit for your account is more than the default of 50 rules. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide.
         */
    var Limit: js.UndefOr[RuleLimit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeConfigRuleEvaluationStatusResponse extends js.Object {
    /**
         * Status information about your AWS managed Config rules.
         */
    var ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList] = js.undefined
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeConfigRulesRequest extends js.Object {
    /**
         * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns details for all your rules.
         */
    var ConfigRuleNames: js.UndefOr[ConfigRuleNames] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeConfigRulesResponse extends js.Object {
    /**
         * The details about your AWS Config rules.
         */
    var ConfigRules: js.UndefOr[ConfigRules] = js.undefined
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeConfigurationAggregatorSourcesStatusRequest extends js.Object {
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * The maximum number of AggregatorSourceStatus returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * Filters the status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
         */
    var UpdateStatus: js.UndefOr[AggregatedSourceStatusTypeList] = js.undefined
  }
  
  
  trait DescribeConfigurationAggregatorSourcesStatusResponse extends js.Object {
    /**
         * Returns an AggregatedSourceStatus object. 
         */
    var AggregatedSourceStatusList: js.UndefOr[AggregatedSourceStatusList] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeConfigurationAggregatorsRequest extends js.Object {
    /**
         * The name of the configuration aggregators.
         */
    var ConfigurationAggregatorNames: js.UndefOr[ConfigurationAggregatorNameList] = js.undefined
    /**
         * The maximum number of configuration aggregators returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeConfigurationAggregatorsResponse extends js.Object {
    /**
         * Returns a ConfigurationAggregators object.
         */
    var ConfigurationAggregators: js.UndefOr[ConfigurationAggregatorList] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribeConfigurationRecorderStatusRequest extends js.Object {
    /**
         * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of all the configuration recorders associated with the account.
         */
    var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
  }
  
  
  trait DescribeConfigurationRecorderStatusResponse extends js.Object {
    /**
         * A list that contains status of the specified recorders.
         */
    var ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.undefined
  }
  
  
  trait DescribeConfigurationRecordersRequest extends js.Object {
    /**
         * A list of configuration recorder names.
         */
    var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
  }
  
  
  trait DescribeConfigurationRecordersResponse extends js.Object {
    /**
         * A list that contains the descriptions of the specified configuration recorders.
         */
    var ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.undefined
  }
  
  
  trait DescribeDeliveryChannelStatusRequest extends js.Object {
    /**
         * A list of delivery channel names.
         */
    var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
  }
  
  
  trait DescribeDeliveryChannelStatusResponse extends js.Object {
    /**
         * A list that contains the status of a specified delivery channel.
         */
    var DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined
  }
  
  
  trait DescribeDeliveryChannelsRequest extends js.Object {
    /**
         * A list of delivery channel names.
         */
    var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
  }
  
  
  trait DescribeDeliveryChannelsResponse extends js.Object {
    /**
         * A list that contains the descriptions of the specified delivery channel.
         */
    var DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.undefined
  }
  
  
  trait DescribePendingAggregationRequestsRequest extends js.Object {
    /**
         * The maximum number of evaluation results returned on each page. The default is maximum. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[DescribePendingAggregationRequestsLimit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait DescribePendingAggregationRequestsResponse extends js.Object {
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * Returns a PendingAggregationRequests object.
         */
    var PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList] = js.undefined
  }
  
  
  trait DescribeRetentionConfigurationsRequest extends js.Object {
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config returns details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
         */
    var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.undefined
  }
  
  
  trait DescribeRetentionConfigurationsResponse extends js.Object {
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Returns a retention configuration object.
         */
    var RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.undefined
  }
  
  
  trait Evaluation extends js.Object {
    /**
         * Supplementary information about how the evaluation determined the compliance.
         */
    var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
    /**
         * The ID of the AWS resource that was evaluated.
         */
    var ComplianceResourceId: BaseResourceId
    /**
         * The type of AWS resource that was evaluated.
         */
    var ComplianceResourceType: StringWithCharLimit256
    /**
         * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against. For the Evaluation data type, AWS Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. AWS Config does not support the INSUFFICIENT_DATA value for this data type. Similarly, AWS Config does not accept INSUFFICIENT_DATA as the value for ComplianceType from a PutEvaluations request. For example, an AWS Lambda function for a custom AWS Config rule cannot pass an INSUFFICIENT_DATA value to AWS Config.
         */
    var ComplianceType: ComplianceType
    /**
         * The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time indicates when AWS Config created the configuration item that triggered the evaluation. For periodic evaluations, the time indicates when AWS Config triggered the evaluation at the frequency that you specified (for example, every 24 hours).
         */
    var OrderingTimestamp: OrderingTimestamp
  }
  
  
  trait EvaluationResult extends js.Object {
    /**
         * Supplementary information about how the evaluation determined the compliance.
         */
    var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
    /**
         * Indicates whether the AWS resource complies with the AWS Config rule that evaluated it. For the EvaluationResult data type, AWS Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. AWS Config does not support the INSUFFICIENT_DATA value for the EvaluationResult data type.
         */
    var ComplianceType: js.UndefOr[ComplianceType] = js.undefined
    /**
         * The time when the AWS Config rule evaluated the AWS resource.
         */
    var ConfigRuleInvokedTime: js.UndefOr[_Date] = js.undefined
    /**
         * Uniquely identifies the evaluation result.
         */
    var EvaluationResultIdentifier: js.UndefOr[EvaluationResultIdentifier] = js.undefined
    /**
         * The time when AWS Config recorded the evaluation result.
         */
    var ResultRecordedTime: js.UndefOr[_Date] = js.undefined
    /**
         * An encrypted token that associates an evaluation with an AWS Config rule. The token identifies the rule, the AWS resource being evaluated, and the event that triggered the evaluation.
         */
    var ResultToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait EvaluationResultIdentifier extends js.Object {
    /**
         * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated resource.
         */
    var EvaluationResultQualifier: js.UndefOr[EvaluationResultQualifier] = js.undefined
    /**
         * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config delivered a configuration item change notification, or it can indicate when AWS Config delivered the configuration snapshot, depending on which event triggered the evaluation.
         */
    var OrderingTimestamp: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait EvaluationResultQualifier extends js.Object {
    /**
         * The name of the AWS Config rule that was used in the evaluation.
         */
    var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
    /**
         * The ID of the evaluated AWS resource.
         */
    var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
    /**
         * The type of AWS resource that was evaluated.
         */
    var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
  }
  
  
  trait GetAggregateComplianceDetailsByConfigRuleRequest extends js.Object {
    /**
         * The 12-digit account ID of the source account.
         */
    var AccountId: AccountId
    /**
         * The source region from where the data is aggregated.
         */
    var AwsRegion: AwsRegion
    /**
         * The resource compliance status.  For the GetAggregateComplianceDetailsByConfigRuleRequest data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA values. 
         */
    var ComplianceType: js.UndefOr[ComplianceType] = js.undefined
    /**
         * The name of the AWS Config rule for which you want compliance information.
         */
    var ConfigRuleName: ConfigRuleName
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetAggregateComplianceDetailsByConfigRuleResponse extends js.Object {
    /**
         * Returns an AggregateEvaluationResults object.
         */
    var AggregateEvaluationResults: js.UndefOr[AggregateEvaluationResultList] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetAggregateConfigRuleComplianceSummaryRequest extends js.Object {
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * Filters the results based on the ConfigRuleComplianceSummaryFilters object.
         */
    var Filters: js.UndefOr[ConfigRuleComplianceSummaryFilters] = js.undefined
    /**
         * Groups the result based on ACCOUNT_ID or AWS_REGION.
         */
    var GroupByKey: js.UndefOr[ConfigRuleComplianceSummaryGroupKey] = js.undefined
    /**
         * The maximum number of evaluation results returned on each page. The default is 1000. You cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[GroupByAPILimit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetAggregateConfigRuleComplianceSummaryResponse extends js.Object {
    /**
         * Returns a list of AggregateComplianceCounts object.
         */
    var AggregateComplianceCounts: js.UndefOr[AggregateComplianceCountList] = js.undefined
    /**
         * Groups the result based on ACCOUNT_ID or AWS_REGION.
         */
    var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetAggregateDiscoveredResourceCountsRequest extends js.Object {
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * Filters the results based on the ResourceCountFilters object.
         */
    var Filters: js.UndefOr[ResourceCountFilters] = js.undefined
    /**
         * The key to group the resource counts.
         */
    var GroupByKey: js.UndefOr[ResourceCountGroupKey] = js.undefined
    /**
         * The maximum number of GroupedResourceCount objects returned on each page. The default is 1000. You cannot specify a number greater than 1000. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[GroupByAPILimit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetAggregateDiscoveredResourceCountsResponse extends js.Object {
    /**
         * The key passed into the request object. If GroupByKey is not provided, the result will be empty.
         */
    var GroupByKey: js.UndefOr[StringWithCharLimit256] = js.undefined
    /**
         * Returns a list of GroupedResourceCount objects.
         */
    var GroupedResourceCounts: js.UndefOr[GroupedResourceCountList] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The total number of resources that are present in an aggregator with the filters that you provide.
         */
    var TotalDiscoveredResources: Long
  }
  
  
  trait GetAggregateResourceConfigRequest extends js.Object {
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * An object that identifies aggregate resource.
         */
    var ResourceIdentifier: AggregateResourceIdentifier
  }
  
  
  trait GetAggregateResourceConfigResponse extends js.Object {
    /**
         * Returns a ConfigurationItem object.
         */
    var ConfigurationItem: js.UndefOr[ConfigurationItem] = js.undefined
  }
  
  
  trait GetComplianceDetailsByConfigRuleRequest extends js.Object {
    /**
         * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
         */
    var ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined
    /**
         * The name of the AWS Config rule for which you want compliance information.
         */
    var ConfigRuleName: StringWithCharLimit64
    /**
         * The maximum number of evaluation results returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetComplianceDetailsByConfigRuleResponse extends js.Object {
    /**
         * Indicates whether the AWS resource complies with the specified AWS Config rule.
         */
    var EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetComplianceDetailsByResourceRequest extends js.Object {
    /**
         * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
         */
    var ComplianceTypes: js.UndefOr[ComplianceTypes] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * The ID of the AWS resource for which you want compliance information.
         */
    var ResourceId: BaseResourceId
    /**
         * The type of the AWS resource for which you want compliance information.
         */
    var ResourceType: StringWithCharLimit256
  }
  
  
  trait GetComplianceDetailsByResourceResponse extends js.Object {
    /**
         * Indicates whether the specified AWS resource complies each AWS Config rule.
         */
    var EvaluationResults: js.UndefOr[EvaluationResults] = js.undefined
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait GetComplianceSummaryByConfigRuleResponse extends js.Object {
    /**
         * The number of AWS Config rules that are compliant and the number that are noncompliant, up to a maximum of 25 for each.
         */
    var ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined
  }
  
  
  trait GetComplianceSummaryByResourceTypeRequest extends js.Object {
    /**
         * Specify one or more resource types to get the number of resources that are compliant and the number that are noncompliant for each resource type. For this request, you can specify an AWS resource type such as AWS::EC2::Instance. You can specify that the resource type is an AWS account by specifying AWS::::Account.
         */
    var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
  }
  
  
  trait GetComplianceSummaryByResourceTypeResponse extends js.Object {
    /**
         * The number of resources that are compliant and the number that are noncompliant. If one or more resource types were provided with the request, the numbers are returned for each resource type. The maximum number returned is 100.
         */
    var ComplianceSummariesByResourceType: js.UndefOr[ComplianceSummariesByResourceType] = js.undefined
  }
  
  
  trait GetDiscoveredResourceCountsRequest extends js.Object {
    /**
         * The maximum number of ResourceCount objects returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
         */
    var limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The comma-separated list that specifies the resource types that you want AWS Config to return (for example, "AWS::EC2::Instance", "AWS::IAM::User"). If a value for resourceTypes is not specified, AWS Config returns all resource types that AWS Config is recording in the region for your account.  If the configuration recorder is turned off, AWS Config returns an empty list of ResourceCount objects. If the configuration recorder is not recording a specific resource type (for example, S3 buckets), that resource type is not returned in the list of ResourceCount objects. 
         */
    var resourceTypes: js.UndefOr[ResourceTypes] = js.undefined
  }
  
  
  trait GetDiscoveredResourceCountsResponse extends js.Object {
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The list of ResourceCount objects. Each object is listed in descending order by the number of resources.
         */
    var resourceCounts: js.UndefOr[ResourceCounts] = js.undefined
    /**
         * The total number of resources that AWS Config is recording in the region for your account. If you specify resource types in the request, AWS Config returns only the total number of resources for those resource types.  Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets, for a total of 60 resources.   You make a call to the GetDiscoveredResourceCounts action and specify the resource type, "AWS::EC2::Instances", in the request.   AWS Config returns 25 for totalDiscoveredResources.  
         */
    var totalDiscoveredResources: js.UndefOr[Long] = js.undefined
  }
  
  
  trait GetResourceConfigHistoryRequest extends js.Object {
    /**
         * The chronological order for configuration items listed. By default, the results are listed in reverse chronological order.
         */
    var chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.undefined
    /**
         * The time stamp that indicates an earlier time. If not specified, the action returns paginated results that contain configuration items that start when the first configuration item was recorded.
         */
    var earlierTime: js.UndefOr[EarlierTime] = js.undefined
    /**
         * The time stamp that indicates a later time. If not specified, current time is taken.
         */
    var laterTime: js.UndefOr[LaterTime] = js.undefined
    /**
         * The maximum number of configuration items returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
         */
    var limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The ID of the resource (for example., sg-xxxxxx).
         */
    var resourceId: ResourceId
    /**
         * The resource type.
         */
    var resourceType: ResourceType
  }
  
  
  trait GetResourceConfigHistoryResponse extends js.Object {
    /**
         * A list that contains the configuration history of one or more resources.
         */
    var configurationItems: js.UndefOr[ConfigurationItemList] = js.undefined
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GroupedResourceCount extends js.Object {
    /**
         * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the region was chosen as GroupByKey.
         */
    var GroupName: StringWithCharLimit256
    /**
         * The number of resources in the group.
         */
    var ResourceCount: Long
  }
  
  
  trait ListAggregateDiscoveredResourcesRequest extends js.Object {
    /**
         * The name of the configuration aggregator. 
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * Filters the results based on the ResourceFilters object.
         */
    var Filters: js.UndefOr[ResourceFilters] = js.undefined
    /**
         * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
         */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The type of resources that you want AWS Config to list in the response.
         */
    var ResourceType: ResourceType
  }
  
  
  trait ListAggregateDiscoveredResourcesResponse extends js.Object {
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Returns a list of ResourceIdentifiers objects.
         */
    var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.undefined
  }
  
  
  trait ListDiscoveredResourcesRequest extends js.Object {
    /**
         * Specifies whether AWS Config includes deleted resources in the results. By default, deleted resources are not included.
         */
    var includeDeletedResources: js.UndefOr[Boolean] = js.undefined
    /**
         * The maximum number of resource identifiers returned on each page. The default is 100. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
         */
    var limit: js.UndefOr[Limit] = js.undefined
    /**
         * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The IDs of only those resources that you want AWS Config to list in the response. If you do not specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
         */
    var resourceIds: js.UndefOr[ResourceIdList] = js.undefined
    /**
         * The custom name of only those resources that you want AWS Config to list in the response. If you do not specify this parameter, AWS Config lists all resources of the specified type that it has discovered.
         */
    var resourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The type of resources that you want AWS Config to list in the response.
         */
    var resourceType: ResourceType
  }
  
  
  trait ListDiscoveredResourcesResponse extends js.Object {
    /**
         * The string that you use in a subsequent request to get the next page of results in a paginated response.
         */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if available) the custom resource name.
         */
    var resourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
  }
  
  
  trait OrganizationAggregationSource extends js.Object {
    /**
         * If true, aggregate existing AWS Config regions and future regions.
         */
    var AllAwsRegions: js.UndefOr[Boolean] = js.undefined
    /**
         * The source regions being aggregated.
         */
    var AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
    /**
         * ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
         */
    var RoleArn: String
  }
  
  
  trait PendingAggregationRequest extends js.Object {
    /**
         * The 12-digit account ID of the account requesting to aggregate data.
         */
    var RequesterAccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The region requesting to aggregate data. 
         */
    var RequesterAwsRegion: js.UndefOr[AwsRegion] = js.undefined
  }
  
  
  trait PutAggregationAuthorizationRequest extends js.Object {
    /**
         * The 12-digit account ID of the account authorized to aggregate data.
         */
    var AuthorizedAccountId: AccountId
    /**
         * The region authorized to collect aggregated data.
         */
    var AuthorizedAwsRegion: AwsRegion
  }
  
  
  trait PutAggregationAuthorizationResponse extends js.Object {
    /**
         * Returns an AggregationAuthorization object. 
         */
    var AggregationAuthorization: js.UndefOr[AggregationAuthorization] = js.undefined
  }
  
  
  trait PutConfigRuleRequest extends js.Object {
    /**
         * The rule that you want to add to your account.
         */
    var ConfigRule: ConfigRule
  }
  
  
  trait PutConfigurationAggregatorRequest extends js.Object {
    /**
         * A list of AccountAggregationSource object. 
         */
    var AccountAggregationSources: js.UndefOr[AccountAggregationSourceList] = js.undefined
    /**
         * The name of the configuration aggregator.
         */
    var ConfigurationAggregatorName: ConfigurationAggregatorName
    /**
         * An OrganizationAggregationSource object.
         */
    var OrganizationAggregationSource: js.UndefOr[OrganizationAggregationSource] = js.undefined
  }
  
  
  trait PutConfigurationAggregatorResponse extends js.Object {
    /**
         * Returns a ConfigurationAggregator object.
         */
    var ConfigurationAggregator: js.UndefOr[ConfigurationAggregator] = js.undefined
  }
  
  
  trait PutConfigurationRecorderRequest extends js.Object {
    /**
         * The configuration recorder object that records each configuration change made to the resources.
         */
    var ConfigurationRecorder: ConfigurationRecorder
  }
  
  
  trait PutDeliveryChannelRequest extends js.Object {
    /**
         * The configuration delivery channel object that delivers the configuration information to an Amazon S3 bucket and to an Amazon SNS topic.
         */
    var DeliveryChannel: DeliveryChannel
  }
  
  
  trait PutEvaluationsRequest extends js.Object {
    /**
         * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates whether it complies with the AWS Config rule that invokes the AWS Lambda function.
         */
    var Evaluations: js.UndefOr[Evaluations] = js.undefined
    /**
         * An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the event that triggered the evaluation.
         */
    var ResultToken: String
    /**
         * Use this parameter to specify a test run for PutEvaluations. You can verify whether your AWS Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and evaluation results are not sent to AWS Config.  When TestMode is true, PutEvaluations doesn't require a valid value for the ResultToken parameter, but the value cannot be null. 
         */
    var TestMode: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait PutEvaluationsResponse extends js.Object {
    /**
         * Requests that failed because of a client or server error.
         */
    var FailedEvaluations: js.UndefOr[Evaluations] = js.undefined
  }
  
  
  trait PutRetentionConfigurationRequest extends js.Object {
    /**
         * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
         */
    var RetentionPeriodInDays: RetentionPeriodInDays
  }
  
  
  trait PutRetentionConfigurationResponse extends js.Object {
    /**
         * Returns a retention configuration object.
         */
    var RetentionConfiguration: js.UndefOr[RetentionConfiguration] = js.undefined
  }
  
  
  trait RecordingGroup extends js.Object {
    /**
         * Specifies whether AWS Config records configuration changes for every supported type of regional resource. If you set this option to true, when AWS Config adds support for a new type of regional resource, it starts recording resources of that type automatically. If you set this option to true, you cannot enumerate a list of resourceTypes.
         */
    var allSupported: js.UndefOr[AllSupported] = js.undefined
    /**
         * Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources) with the resources that it records. Before you can set this option to true, you must set the allSupported option to true. If you set this option to true, when AWS Config adds support for a new type of global resource, it starts recording resources of that type automatically. The configuration details for any global resource are the same in all regions. To prevent duplicate configuration items, you should consider customizing AWS Config in only one region to record global resources.
         */
    var includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes] = js.undefined
    /**
         * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration changes (for example, AWS::EC2::Instance or AWS::CloudTrail::Trail). Before you can set this option to true, you must set the allSupported option to false. If you set this option to true, when AWS Config adds support for a new type of resource, it will not record resources of that type unless you manually add that type to your recording group. For a list of valid resourceTypes values, see the resourceType Value column in Supported AWS Resource Types.
         */
    var resourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
  }
  
  
  trait Relationship extends js.Object {
    /**
         * The type of relationship with the related resource.
         */
    var relationshipName: js.UndefOr[RelationshipName] = js.undefined
    /**
         * The ID of the related resource (for example, sg-xxxxxx).
         */
    var resourceId: js.UndefOr[ResourceId] = js.undefined
    /**
         * The custom name of the related resource, if available.
         */
    var resourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The resource type of the related resource.
         */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait ResourceCount extends js.Object {
    /**
         * The number of resources.
         */
    var count: js.UndefOr[Long] = js.undefined
    /**
         * The resource type (for example, "AWS::EC2::Instance").
         */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait ResourceCountFilters extends js.Object {
    /**
         * The 12-digit ID of the account.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The region where the account is located.
         */
    var Region: js.UndefOr[AwsRegion] = js.undefined
    /**
         * The type of the AWS resource.
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait ResourceFilters extends js.Object {
    /**
         * The 12-digit source account ID.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The source region.
         */
    var Region: js.UndefOr[AwsRegion] = js.undefined
    /**
         * The ID of the resource.
         */
    var ResourceId: js.UndefOr[ResourceId] = js.undefined
    /**
         * The name of the resource.
         */
    var ResourceName: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait ResourceIdentifier extends js.Object {
    /**
         * The time that the resource was deleted.
         */
    var resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.undefined
    /**
         * The ID of the resource (for example, sg-xxxxxx).
         */
    var resourceId: js.UndefOr[ResourceId] = js.undefined
    /**
         * The custom name of the resource (if available).
         */
    var resourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The type of resource.
         */
    var resourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait ResourceKey extends js.Object {
    /**
         * The ID of the resource (for example., sg-xxxxxx). 
         */
    var resourceId: ResourceId
    /**
         * The resource type.
         */
    var resourceType: ResourceType
  }
  
  
  trait RetentionConfiguration extends js.Object {
    /**
         * The name of the retention configuration object.
         */
    var Name: RetentionConfigurationName
    /**
         * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
         */
    var RetentionPeriodInDays: RetentionPeriodInDays
  }
  
  
  trait Scope extends js.Object {
    /**
         * The ID of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for ComplianceResourceTypes.
         */
    var ComplianceResourceId: js.UndefOr[BaseResourceId] = js.undefined
    /**
         * The resource types of only those AWS resources that you want to trigger an evaluation for the rule. You can only specify one type if you also specify a resource ID for ComplianceResourceId.
         */
    var ComplianceResourceTypes: js.UndefOr[ComplianceResourceTypes] = js.undefined
    /**
         * The tag key that is applied to only those AWS resources that you want to trigger an evaluation for the rule.
         */
    var TagKey: js.UndefOr[StringWithCharLimit128] = js.undefined
    /**
         * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule. If you specify a value for TagValue, you must also specify a value for TagKey.
         */
    var TagValue: js.UndefOr[StringWithCharLimit256] = js.undefined
  }
  
  
  trait Source extends js.Object {
    /**
         * Indicates whether AWS or the customer owns and manages the AWS Config rule.
         */
    var Owner: Owner
    /**
         * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
         */
    var SourceDetails: js.UndefOr[SourceDetails] = js.undefined
    /**
         * For AWS Config managed rules, a predefined identifier from a list. For example, IAM_PASSWORD_POLICY is a managed rule. To reference a managed rule, see Using AWS Managed Config Rules. For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such as arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name.
         */
    var SourceIdentifier: StringWithCharLimit256
  }
  
  
  trait SourceDetail extends js.Object {
    /**
         * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources.
         */
    var EventSource: js.UndefOr[EventSource] = js.undefined
    /**
         * The frequency at which you want AWS Config to run evaluations for a custom rule with a periodic trigger. If you specify a value for MaximumExecutionFrequency, then MessageType must use the ScheduledNotification value.  By default, rules with a periodic trigger are evaluated every 24 hours. To change the frequency, specify a valid value for the MaximumExecutionFrequency parameter. Based on the valid value you choose, AWS Config runs evaluations once for each valid value. For example, if you choose Three_Hours, AWS Config runs evaluations once every three hours. In this case, Three_Hours is the frequency of this rule.  
         */
    var MaximumExecutionFrequency: js.UndefOr[MaximumExecutionFrequency] = js.undefined
    /**
         * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:    ConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers a configuration item as a result of a resource change.    OversizedConfigurationItemChangeNotification - Triggers an evaluation when AWS Config delivers an oversized configuration item. AWS Config may generate this notification type when a resource changes and the notification exceeds the maximum size allowed by Amazon SNS.    ScheduledNotification - Triggers a periodic evaluation at the frequency specified for MaximumExecutionFrequency.    ConfigurationSnapshotDeliveryCompleted - Triggers a periodic evaluation when AWS Config delivers a configuration snapshot.   If you want your custom rule to be triggered by configuration changes, specify two SourceDetail objects, one for ConfigurationItemChangeNotification and one for OversizedConfigurationItemChangeNotification.
         */
    var MessageType: js.UndefOr[MessageType] = js.undefined
  }
  
  
  trait StartConfigRulesEvaluationRequest extends js.Object {
    /**
         * The list of names of AWS Config rules that you want to run evaluations for.
         */
    var ConfigRuleNames: js.UndefOr[ReevaluateConfigRuleNames] = js.undefined
  }
  
  
  trait StartConfigRulesEvaluationResponse extends js.Object
  
  
  trait StartConfigurationRecorderRequest extends js.Object {
    /**
         * The name of the recorder object that records each configuration change made to the resources.
         */
    var ConfigurationRecorderName: RecorderName
  }
  
  
  trait StopConfigurationRecorderRequest extends js.Object {
    /**
         * The name of the recorder object that records each configuration change made to the resources.
         */
    var ConfigurationRecorderName: RecorderName
  }
  
  
  trait SupplementaryConfiguration
    extends /* key */ ScalablyTyped.runtime.StringDictionary[SupplementaryConfigurationValue]
  
  
  trait Tags
    extends /* key */ ScalablyTyped.runtime.StringDictionary[Value]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Returns the current configuration items for resources that are present in your AWS Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
       */
    def batchGetAggregateResourceConfig(): awsDashSdkLib.libRequestMod.Request[BatchGetAggregateResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current configuration items for resources that are present in your AWS Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
       */
    def batchGetAggregateResourceConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetAggregateResourceConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetAggregateResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current configuration items for resources that are present in your AWS Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
       */
    def batchGetAggregateResourceConfig(params: BatchGetAggregateResourceConfigRequest): awsDashSdkLib.libRequestMod.Request[BatchGetAggregateResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current configuration items for resources that are present in your AWS Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
       */
    def batchGetAggregateResourceConfig(
      params: BatchGetAggregateResourceConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetAggregateResourceConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetAggregateResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current configuration for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
       */
    def batchGetResourceConfig(): awsDashSdkLib.libRequestMod.Request[BatchGetResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current configuration for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
       */
    def batchGetResourceConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetResourceConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current configuration for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
       */
    def batchGetResourceConfig(params: BatchGetResourceConfigRequest): awsDashSdkLib.libRequestMod.Request[BatchGetResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current configuration for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
       */
    def batchGetResourceConfig(
      params: BatchGetResourceConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetResourceConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
       */
    def deleteAggregationAuthorization(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
       */
    def deleteAggregationAuthorization(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
       */
    def deleteAggregationAuthorization(params: DeleteAggregationAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
       */
    def deleteAggregationAuthorization(
      params: DeleteAggregationAuthorizationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified AWS Config rule and all of its evaluation results. AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
       */
    def deleteConfigRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified AWS Config rule and all of its evaluation results. AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
       */
    def deleteConfigRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified AWS Config rule and all of its evaluation results. AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
       */
    def deleteConfigRule(params: DeleteConfigRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified AWS Config rule and all of its evaluation results. AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
       */
    def deleteConfigRule(
      params: DeleteConfigRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
       */
    def deleteConfigurationAggregator(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
       */
    def deleteConfigurationAggregator(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
       */
    def deleteConfigurationAggregator(params: DeleteConfigurationAggregatorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
       */
    def deleteConfigurationAggregator(
      params: DeleteConfigurationAggregatorRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration recorder. After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the AWS Config console until you create a new configuration recorder.
       */
    def deleteConfigurationRecorder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration recorder. After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the AWS Config console until you create a new configuration recorder.
       */
    def deleteConfigurationRecorder(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration recorder. After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the AWS Config console until you create a new configuration recorder.
       */
    def deleteConfigurationRecorder(params: DeleteConfigurationRecorderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration recorder. After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the AWS Config console until you create a new configuration recorder.
       */
    def deleteConfigurationRecorder(
      params: DeleteConfigurationRecorderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
       */
    def deleteDeliveryChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
       */
    def deleteDeliveryChannel(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
       */
    def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
       */
    def deleteDeliveryChannel(
      params: DeleteDeliveryChannelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your AWS resources against the rule.
       */
    def deleteEvaluationResults(): awsDashSdkLib.libRequestMod.Request[DeleteEvaluationResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your AWS resources against the rule.
       */
    def deleteEvaluationResults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEvaluationResultsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEvaluationResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your AWS resources against the rule.
       */
    def deleteEvaluationResults(params: DeleteEvaluationResultsRequest): awsDashSdkLib.libRequestMod.Request[DeleteEvaluationResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your AWS resources against the rule.
       */
    def deleteEvaluationResults(
      params: DeleteEvaluationResultsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEvaluationResultsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEvaluationResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes pending authorization requests for a specified aggregator account in a specified region.
       */
    def deletePendingAggregationRequest(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes pending authorization requests for a specified aggregator account in a specified region.
       */
    def deletePendingAggregationRequest(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes pending authorization requests for a specified aggregator account in a specified region.
       */
    def deletePendingAggregationRequest(params: DeletePendingAggregationRequestRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes pending authorization requests for a specified aggregator account in a specified region.
       */
    def deletePendingAggregationRequest(
      params: DeletePendingAggregationRequestRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the retention configuration.
       */
    def deleteRetentionConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the retention configuration.
       */
    def deleteRetentionConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the retention configuration.
       */
    def deleteRetentionConfiguration(params: DeleteRetentionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the retention configuration.
       */
    def deleteRetentionConfiguration(
      params: DeleteRetentionConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
       */
    def deliverConfigSnapshot(): awsDashSdkLib.libRequestMod.Request[DeliverConfigSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
       */
    def deliverConfigSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeliverConfigSnapshotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeliverConfigSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
       */
    def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest): awsDashSdkLib.libRequestMod.Request[DeliverConfigSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
       */
    def deliverConfigSnapshot(
      params: DeliverConfigSnapshotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeliverConfigSnapshotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeliverConfigSnapshotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
       */
    def describeAggregateComplianceByConfigRules(): awsDashSdkLib.libRequestMod.Request[
        DescribeAggregateComplianceByConfigRulesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
       */
    def describeAggregateComplianceByConfigRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAggregateComplianceByConfigRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeAggregateComplianceByConfigRulesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
       */
    def describeAggregateComplianceByConfigRules(params: DescribeAggregateComplianceByConfigRulesRequest): awsDashSdkLib.libRequestMod.Request[
        DescribeAggregateComplianceByConfigRulesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
       */
    def describeAggregateComplianceByConfigRules(
      params: DescribeAggregateComplianceByConfigRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAggregateComplianceByConfigRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeAggregateComplianceByConfigRulesResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns a list of authorizations granted to various aggregator accounts and regions.
       */
    def describeAggregationAuthorizations(): awsDashSdkLib.libRequestMod.Request[DescribeAggregationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of authorizations granted to various aggregator accounts and regions.
       */
    def describeAggregationAuthorizations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAggregationAuthorizationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAggregationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of authorizations granted to various aggregator accounts and regions.
       */
    def describeAggregationAuthorizations(params: DescribeAggregationAuthorizationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAggregationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of authorizations granted to various aggregator accounts and regions.
       */
    def describeAggregationAuthorizations(
      params: DescribeAggregationAuthorizationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAggregationAuthorizationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAggregationAuthorizationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns the number of AWS resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
       */
    def describeComplianceByConfigRule(): awsDashSdkLib.libRequestMod.Request[DescribeComplianceByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns the number of AWS resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
       */
    def describeComplianceByConfigRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeComplianceByConfigRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeComplianceByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns the number of AWS resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
       */
    def describeComplianceByConfigRule(params: DescribeComplianceByConfigRuleRequest): awsDashSdkLib.libRequestMod.Request[DescribeComplianceByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns the number of AWS resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
       */
    def describeComplianceByConfigRule(
      params: DescribeComplianceByConfigRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeComplianceByConfigRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeComplianceByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns the number of AWS Config rules that the resource does not comply with. A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
       */
    def describeComplianceByResource(): awsDashSdkLib.libRequestMod.Request[DescribeComplianceByResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns the number of AWS Config rules that the resource does not comply with. A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
       */
    def describeComplianceByResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeComplianceByResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeComplianceByResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns the number of AWS Config rules that the resource does not comply with. A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
       */
    def describeComplianceByResource(params: DescribeComplianceByResourceRequest): awsDashSdkLib.libRequestMod.Request[DescribeComplianceByResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns the number of AWS Config rules that the resource does not comply with. A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
       */
    def describeComplianceByResource(
      params: DescribeComplianceByResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeComplianceByResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeComplianceByResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns status information for each of your AWS managed Config rules. The status includes information such as the last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error for the last failure.
       */
    def describeConfigRuleEvaluationStatus(): awsDashSdkLib.libRequestMod.Request[DescribeConfigRuleEvaluationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns status information for each of your AWS managed Config rules. The status includes information such as the last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error for the last failure.
       */
    def describeConfigRuleEvaluationStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigRuleEvaluationStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigRuleEvaluationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns status information for each of your AWS managed Config rules. The status includes information such as the last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error for the last failure.
       */
    def describeConfigRuleEvaluationStatus(params: DescribeConfigRuleEvaluationStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigRuleEvaluationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns status information for each of your AWS managed Config rules. The status includes information such as the last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error for the last failure.
       */
    def describeConfigRuleEvaluationStatus(
      params: DescribeConfigRuleEvaluationStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigRuleEvaluationStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigRuleEvaluationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about your AWS Config rules.
       */
    def describeConfigRules(): awsDashSdkLib.libRequestMod.Request[DescribeConfigRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about your AWS Config rules.
       */
    def describeConfigRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about your AWS Config rules.
       */
    def describeConfigRules(params: DescribeConfigRulesRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about your AWS Config rules.
       */
    def describeConfigRules(
      params: DescribeConfigRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns status information for sources within an aggregator. The status includes information about the last time AWS Config aggregated data from source accounts or AWS Config failed to aggregate data from source accounts with the related error code or message. 
       */
    def describeConfigurationAggregatorSourcesStatus(): awsDashSdkLib.libRequestMod.Request[
        DescribeConfigurationAggregatorSourcesStatusResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns status information for sources within an aggregator. The status includes information about the last time AWS Config aggregated data from source accounts or AWS Config failed to aggregate data from source accounts with the related error code or message. 
       */
    def describeConfigurationAggregatorSourcesStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationAggregatorSourcesStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeConfigurationAggregatorSourcesStatusResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns status information for sources within an aggregator. The status includes information about the last time AWS Config aggregated data from source accounts or AWS Config failed to aggregate data from source accounts with the related error code or message. 
       */
    def describeConfigurationAggregatorSourcesStatus(params: DescribeConfigurationAggregatorSourcesStatusRequest): awsDashSdkLib.libRequestMod.Request[
        DescribeConfigurationAggregatorSourcesStatusResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns status information for sources within an aggregator. The status includes information about the last time AWS Config aggregated data from source accounts or AWS Config failed to aggregate data from source accounts with the related error code or message. 
       */
    def describeConfigurationAggregatorSourcesStatus(
      params: DescribeConfigurationAggregatorSourcesStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationAggregatorSourcesStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeConfigurationAggregatorSourcesStatusResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
       */
    def describeConfigurationAggregators(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationAggregatorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
       */
    def describeConfigurationAggregators(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationAggregatorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationAggregatorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
       */
    def describeConfigurationAggregators(params: DescribeConfigurationAggregatorsRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationAggregatorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
       */
    def describeConfigurationAggregators(
      params: DescribeConfigurationAggregatorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationAggregatorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationAggregatorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
       */
    def describeConfigurationRecorderStatus(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRecorderStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
       */
    def describeConfigurationRecorderStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationRecorderStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRecorderStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
       */
    def describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRecorderStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
       */
    def describeConfigurationRecorderStatus(
      params: DescribeConfigurationRecorderStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationRecorderStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRecorderStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
       */
    def describeConfigurationRecorders(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRecordersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
       */
    def describeConfigurationRecorders(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationRecordersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRecordersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
       */
    def describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRecordersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
       */
    def describeConfigurationRecorders(
      params: DescribeConfigurationRecordersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationRecordersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRecordersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
       */
    def describeDeliveryChannelStatus(): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryChannelStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
       */
    def describeDeliveryChannelStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeliveryChannelStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryChannelStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
       */
    def describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryChannelStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
       */
    def describeDeliveryChannelStatus(
      params: DescribeDeliveryChannelStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeliveryChannelStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryChannelStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
       */
    def describeDeliveryChannels(): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
       */
    def describeDeliveryChannels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeliveryChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
       */
    def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
       */
    def describeDeliveryChannels(
      params: DescribeDeliveryChannelsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeliveryChannelsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeliveryChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all pending aggregation requests.
       */
    def describePendingAggregationRequests(): awsDashSdkLib.libRequestMod.Request[DescribePendingAggregationRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all pending aggregation requests.
       */
    def describePendingAggregationRequests(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePendingAggregationRequestsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePendingAggregationRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all pending aggregation requests.
       */
    def describePendingAggregationRequests(params: DescribePendingAggregationRequestsRequest): awsDashSdkLib.libRequestMod.Request[DescribePendingAggregationRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all pending aggregation requests.
       */
    def describePendingAggregationRequests(
      params: DescribePendingAggregationRequestsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePendingAggregationRequestsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePendingAggregationRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
       */
    def describeRetentionConfigurations(): awsDashSdkLib.libRequestMod.Request[DescribeRetentionConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
       */
    def describeRetentionConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRetentionConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRetentionConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
       */
    def describeRetentionConfigurations(params: DescribeRetentionConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeRetentionConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
       */
    def describeRetentionConfigurations(
      params: DescribeRetentionConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRetentionConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRetentionConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
       */
    def getAggregateComplianceDetailsByConfigRule(): awsDashSdkLib.libRequestMod.Request[
        GetAggregateComplianceDetailsByConfigRuleResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
       */
    def getAggregateComplianceDetailsByConfigRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAggregateComplianceDetailsByConfigRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        GetAggregateComplianceDetailsByConfigRuleResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
       */
    def getAggregateComplianceDetailsByConfigRule(params: GetAggregateComplianceDetailsByConfigRuleRequest): awsDashSdkLib.libRequestMod.Request[
        GetAggregateComplianceDetailsByConfigRuleResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
       */
    def getAggregateComplianceDetailsByConfigRule(
      params: GetAggregateComplianceDetailsByConfigRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAggregateComplianceDetailsByConfigRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        GetAggregateComplianceDetailsByConfigRuleResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
       */
    def getAggregateConfigRuleComplianceSummary(): awsDashSdkLib.libRequestMod.Request[
        GetAggregateConfigRuleComplianceSummaryResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
       */
    def getAggregateConfigRuleComplianceSummary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAggregateConfigRuleComplianceSummaryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        GetAggregateConfigRuleComplianceSummaryResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
       */
    def getAggregateConfigRuleComplianceSummary(params: GetAggregateConfigRuleComplianceSummaryRequest): awsDashSdkLib.libRequestMod.Request[
        GetAggregateConfigRuleComplianceSummaryResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
       */
    def getAggregateConfigRuleComplianceSummary(
      params: GetAggregateConfigRuleComplianceSummaryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAggregateConfigRuleComplianceSummaryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        GetAggregateConfigRuleComplianceSummaryResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
       * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
       */
    def getAggregateDiscoveredResourceCounts(): awsDashSdkLib.libRequestMod.Request[GetAggregateDiscoveredResourceCountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
       */
    def getAggregateDiscoveredResourceCounts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAggregateDiscoveredResourceCountsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAggregateDiscoveredResourceCountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
       */
    def getAggregateDiscoveredResourceCounts(params: GetAggregateDiscoveredResourceCountsRequest): awsDashSdkLib.libRequestMod.Request[GetAggregateDiscoveredResourceCountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
       */
    def getAggregateDiscoveredResourceCounts(
      params: GetAggregateDiscoveredResourceCountsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAggregateDiscoveredResourceCountsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAggregateDiscoveredResourceCountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
       */
    def getAggregateResourceConfig(): awsDashSdkLib.libRequestMod.Request[GetAggregateResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
       */
    def getAggregateResourceConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAggregateResourceConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAggregateResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
       */
    def getAggregateResourceConfig(params: GetAggregateResourceConfigRequest): awsDashSdkLib.libRequestMod.Request[GetAggregateResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
       */
    def getAggregateResourceConfig(
      params: GetAggregateResourceConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAggregateResourceConfigResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAggregateResourceConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
       */
    def getComplianceDetailsByConfigRule(): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailsByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
       */
    def getComplianceDetailsByConfigRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceDetailsByConfigRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailsByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
       */
    def getComplianceDetailsByConfigRule(params: GetComplianceDetailsByConfigRuleRequest): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailsByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
       */
    def getComplianceDetailsByConfigRule(
      params: GetComplianceDetailsByConfigRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceDetailsByConfigRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailsByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
       */
    def getComplianceDetailsByResource(): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailsByResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
       */
    def getComplianceDetailsByResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceDetailsByResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailsByResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
       */
    def getComplianceDetailsByResource(params: GetComplianceDetailsByResourceRequest): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailsByResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
       */
    def getComplianceDetailsByResource(
      params: GetComplianceDetailsByResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceDetailsByResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceDetailsByResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
       */
    def getComplianceSummaryByConfigRule(): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
       */
    def getComplianceSummaryByConfigRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceSummaryByConfigRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryByConfigRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
       */
    def getComplianceSummaryByResourceType(): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryByResourceTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
       */
    def getComplianceSummaryByResourceType(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceSummaryByResourceTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryByResourceTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
       */
    def getComplianceSummaryByResourceType(params: GetComplianceSummaryByResourceTypeRequest): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryByResourceTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
       */
    def getComplianceSummaryByResourceType(
      params: GetComplianceSummaryByResourceTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetComplianceSummaryByResourceTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetComplianceSummaryByResourceTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in this region for your AWS account.   Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    AWS Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new AWS Config customer.   You just enabled resource recording.   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
       */
    def getDiscoveredResourceCounts(): awsDashSdkLib.libRequestMod.Request[GetDiscoveredResourceCountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in this region for your AWS account.   Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    AWS Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new AWS Config customer.   You just enabled resource recording.   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
       */
    def getDiscoveredResourceCounts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDiscoveredResourceCountsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDiscoveredResourceCountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in this region for your AWS account.   Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    AWS Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new AWS Config customer.   You just enabled resource recording.   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
       */
    def getDiscoveredResourceCounts(params: GetDiscoveredResourceCountsRequest): awsDashSdkLib.libRequestMod.Request[GetDiscoveredResourceCountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in this region for your AWS account.   Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    AWS Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new AWS Config customer.   You just enabled resource recording.   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
       */
    def getDiscoveredResourceCounts(
      params: GetDiscoveredResourceCountsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDiscoveredResourceCountsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDiscoveredResourceCountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of configuration items for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
       */
    def getResourceConfigHistory(): awsDashSdkLib.libRequestMod.Request[GetResourceConfigHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of configuration items for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
       */
    def getResourceConfigHistory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourceConfigHistoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourceConfigHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of configuration items for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
       */
    def getResourceConfigHistory(params: GetResourceConfigHistoryRequest): awsDashSdkLib.libRequestMod.Request[GetResourceConfigHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of configuration items for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
       */
    def getResourceConfigHistory(
      params: GetResourceConfigHistoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourceConfigHistoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourceConfigHistoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
       */
    def listAggregateDiscoveredResources(): awsDashSdkLib.libRequestMod.Request[ListAggregateDiscoveredResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
       */
    def listAggregateDiscoveredResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAggregateDiscoveredResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAggregateDiscoveredResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
       */
    def listAggregateDiscoveredResources(params: ListAggregateDiscoveredResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListAggregateDiscoveredResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
       */
    def listAggregateDiscoveredResources(
      params: ListAggregateDiscoveredResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAggregateDiscoveredResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAggregateDiscoveredResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
       */
    def listDiscoveredResources(): awsDashSdkLib.libRequestMod.Request[ListDiscoveredResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
       */
    def listDiscoveredResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDiscoveredResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDiscoveredResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
       */
    def listDiscoveredResources(params: ListDiscoveredResourcesRequest): awsDashSdkLib.libRequestMod.Request[ListDiscoveredResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
       */
    def listDiscoveredResources(
      params: ListDiscoveredResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDiscoveredResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDiscoveredResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the aggregator account and region to collect data from the source account and region. 
       */
    def putAggregationAuthorization(): awsDashSdkLib.libRequestMod.Request[PutAggregationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the aggregator account and region to collect data from the source account and region. 
       */
    def putAggregationAuthorization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutAggregationAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutAggregationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the aggregator account and region to collect data from the source account and region. 
       */
    def putAggregationAuthorization(params: PutAggregationAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[PutAggregationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Authorizes the aggregator account and region to collect data from the source account and region. 
       */
    def putAggregationAuthorization(
      params: PutAggregationAuthorizationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutAggregationAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutAggregationAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations. You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides. If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier key. To reference AWS managed Config rule identifiers, see About AWS Managed Config Rules. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. The maximum number of rules that AWS Config supports is 50. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide. For more information about developing and using AWS Config rules, see Evaluating AWS Resource Configurations with AWS Config in the AWS Config Developer Guide.
       */
    def putConfigRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations. You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides. If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier key. To reference AWS managed Config rule identifiers, see About AWS Managed Config Rules. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. The maximum number of rules that AWS Config supports is 50. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide. For more information about developing and using AWS Config rules, see Evaluating AWS Resource Configurations with AWS Config in the AWS Config Developer Guide.
       */
    def putConfigRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations. You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides. If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier key. To reference AWS managed Config rule identifiers, see About AWS Managed Config Rules. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. The maximum number of rules that AWS Config supports is 50. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide. For more information about developing and using AWS Config rules, see Evaluating AWS Resource Configurations with AWS Config in the AWS Config Developer Guide.
       */
    def putConfigRule(params: PutConfigRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations. You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides. If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier key. To reference AWS managed Config rule identifiers, see About AWS Managed Config Rules. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. The maximum number of rules that AWS Config supports is 50. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide. For more information about developing and using AWS Config rules, see Evaluating AWS Resource Configurations with AWS Config in the AWS Config Developer Guide.
       */
    def putConfigRule(
      params: PutConfigRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  AWS Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the master account and all features must be enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration between AWS Config and AWS Organizations.  
       */
    def putConfigurationAggregator(): awsDashSdkLib.libRequestMod.Request[PutConfigurationAggregatorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  AWS Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the master account and all features must be enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration between AWS Config and AWS Organizations.  
       */
    def putConfigurationAggregator(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationAggregatorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationAggregatorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  AWS Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the master account and all features must be enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration between AWS Config and AWS Organizations.  
       */
    def putConfigurationAggregator(params: PutConfigurationAggregatorRequest): awsDashSdkLib.libRequestMod.Request[PutConfigurationAggregatorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  AWS Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the master account and all features must be enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration between AWS Config and AWS Organizations.  
       */
    def putConfigurationAggregator(
      params: PutConfigurationAggregatorRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConfigurationAggregatorResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConfigurationAggregatorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
       */
    def putConfigurationRecorder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
       */
    def putConfigurationRecorder(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
       */
    def putConfigurationRecorder(params: PutConfigurationRecorderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
       */
    def putConfigurationRecorder(
      params: PutConfigurationRecorderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
       */
    def putDeliveryChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
       */
    def putDeliveryChannel(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
       */
    def putDeliveryChannel(params: PutDeliveryChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
       */
    def putDeliveryChannel(
      params: PutDeliveryChannelRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS Lambda function that is invoked by an AWS Config rule.
       */
    def putEvaluations(): awsDashSdkLib.libRequestMod.Request[PutEvaluationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS Lambda function that is invoked by an AWS Config rule.
       */
    def putEvaluations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEvaluationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEvaluationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS Lambda function that is invoked by an AWS Config rule.
       */
    def putEvaluations(params: PutEvaluationsRequest): awsDashSdkLib.libRequestMod.Request[PutEvaluationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS Lambda function that is invoked by an AWS Config rule.
       */
    def putEvaluations(
      params: PutEvaluationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEvaluationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEvaluationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates and updates the retention configuration with details about retention period (number of days) that AWS Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, AWS Config supports only one retention configuration per region in your account. 
       */
    def putRetentionConfiguration(): awsDashSdkLib.libRequestMod.Request[PutRetentionConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates and updates the retention configuration with details about retention period (number of days) that AWS Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, AWS Config supports only one retention configuration per region in your account. 
       */
    def putRetentionConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRetentionConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRetentionConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates and updates the retention configuration with details about retention period (number of days) that AWS Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, AWS Config supports only one retention configuration per region in your account. 
       */
    def putRetentionConfiguration(params: PutRetentionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutRetentionConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates and updates the retention configuration with details about retention period (number of days) that AWS Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, AWS Config supports only one retention configuration per region in your account. 
       */
    def putRetentionConfiguration(
      params: PutRetentionConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRetentionConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRetentionConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 AWS Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, AWS Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   AWS Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
       */
    def startConfigRulesEvaluation(): awsDashSdkLib.libRequestMod.Request[StartConfigRulesEvaluationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 AWS Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, AWS Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   AWS Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
       */
    def startConfigRulesEvaluation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartConfigRulesEvaluationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartConfigRulesEvaluationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 AWS Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, AWS Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   AWS Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
       */
    def startConfigRulesEvaluation(params: StartConfigRulesEvaluationRequest): awsDashSdkLib.libRequestMod.Request[StartConfigRulesEvaluationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 AWS Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, AWS Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   AWS Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
       */
    def startConfigRulesEvaluation(
      params: StartConfigRulesEvaluationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartConfigRulesEvaluationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartConfigRulesEvaluationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts recording configurations of the AWS resources you have selected to record in your AWS account. You must have created at least one delivery channel to successfully start the configuration recorder.
       */
    def startConfigurationRecorder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts recording configurations of the AWS resources you have selected to record in your AWS account. You must have created at least one delivery channel to successfully start the configuration recorder.
       */
    def startConfigurationRecorder(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts recording configurations of the AWS resources you have selected to record in your AWS account. You must have created at least one delivery channel to successfully start the configuration recorder.
       */
    def startConfigurationRecorder(params: StartConfigurationRecorderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts recording configurations of the AWS resources you have selected to record in your AWS account. You must have created at least one delivery channel to successfully start the configuration recorder.
       */
    def startConfigurationRecorder(
      params: StartConfigurationRecorderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
       */
    def stopConfigurationRecorder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
       */
    def stopConfigurationRecorder(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
       */
    def stopConfigurationRecorder(params: StopConfigurationRecorderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
       */
    def stopConfigurationRecorder(
      params: StopConfigurationRecorderRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type ARN = java.lang.String
  type AccountAggregationSourceAccountList = js.Array[AccountId]
  type AccountAggregationSourceList = js.Array[AccountAggregationSource]
  type AccountId = java.lang.String
  type AggregateComplianceByConfigRuleList = js.Array[AggregateComplianceByConfigRule]
  type AggregateComplianceCountList = js.Array[AggregateComplianceCount]
  type AggregateEvaluationResultList = js.Array[AggregateEvaluationResult]
  type AggregatedSourceStatusList = js.Array[AggregatedSourceStatus]
  type AggregatedSourceStatusType = awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.OUTDATED | java.lang.String
  type AggregatedSourceStatusTypeList = js.Array[AggregatedSourceStatusType]
  type AggregatedSourceType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATION | java.lang.String
  type AggregationAuthorizationList = js.Array[AggregationAuthorization]
  type AggregatorRegionList = js.Array[String]
  type AllSupported = scala.Boolean
  type AvailabilityZone = java.lang.String
  type AwsRegion = java.lang.String
  type BaseConfigurationItems = js.Array[BaseConfigurationItem]
  type BaseResourceId = java.lang.String
  type Boolean = scala.Boolean
  type ChannelName = java.lang.String
  type ChronologicalOrder = awsDashSdkLib.awsDashSdkLibStrings.Reverse | awsDashSdkLib.awsDashSdkLibStrings.Forward | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComplianceByConfigRules = js.Array[ComplianceByConfigRule]
  type ComplianceByResources = js.Array[ComplianceByResource]
  type ComplianceResourceTypes = js.Array[StringWithCharLimit256]
  type ComplianceSummariesByResourceType = js.Array[ComplianceSummaryByResourceType]
  type ComplianceType = awsDashSdkLib.awsDashSdkLibStrings.COMPLIANT | awsDashSdkLib.awsDashSdkLibStrings.NON_COMPLIANT | awsDashSdkLib.awsDashSdkLibStrings.NOT_APPLICABLE | awsDashSdkLib.awsDashSdkLibStrings.INSUFFICIENT_DATA | java.lang.String
  type ComplianceTypes = js.Array[ComplianceType]
  type ConfigRuleComplianceSummaryGroupKey = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT_ID | awsDashSdkLib.awsDashSdkLibStrings.AWS_REGION | java.lang.String
  type ConfigRuleEvaluationStatusList = js.Array[ConfigRuleEvaluationStatus]
  type ConfigRuleName = java.lang.String
  type ConfigRuleNames = js.Array[StringWithCharLimit64]
  type ConfigRuleState = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.DELETING_RESULTS | awsDashSdkLib.awsDashSdkLibStrings.EVALUATING | java.lang.String
  type ConfigRules = js.Array[ConfigRule]
  type Configuration = java.lang.String
  type ConfigurationAggregatorArn = java.lang.String
  type ConfigurationAggregatorList = js.Array[ConfigurationAggregator]
  type ConfigurationAggregatorName = java.lang.String
  type ConfigurationAggregatorNameList = js.Array[ConfigurationAggregatorName]
  type ConfigurationItemCaptureTime = stdLib.Date
  type ConfigurationItemList = js.Array[ConfigurationItem]
  type ConfigurationItemMD5Hash = java.lang.String
  type ConfigurationItemStatus = awsDashSdkLib.awsDashSdkLibStrings.OK | awsDashSdkLib.awsDashSdkLibStrings.ResourceDiscovered | awsDashSdkLib.awsDashSdkLibStrings.ResourceNotRecorded | awsDashSdkLib.awsDashSdkLibStrings.ResourceDeleted | awsDashSdkLib.awsDashSdkLibStrings.ResourceDeletedNotRecorded | java.lang.String
  type ConfigurationRecorderList = js.Array[ConfigurationRecorder]
  type ConfigurationRecorderNameList = js.Array[RecorderName]
  type ConfigurationRecorderStatusList = js.Array[ConfigurationRecorderStatus]
  type ConfigurationStateId = java.lang.String
  type DeliveryChannelList = js.Array[DeliveryChannel]
  type DeliveryChannelNameList = js.Array[ChannelName]
  type DeliveryChannelStatusList = js.Array[DeliveryChannelStatus]
  type DeliveryStatus = awsDashSdkLib.awsDashSdkLibStrings.Success | awsDashSdkLib.awsDashSdkLibStrings.Failure | awsDashSdkLib.awsDashSdkLibStrings.Not_Applicable | java.lang.String
  type DescribePendingAggregationRequestsLimit = scala.Double
  type DiscoveredResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type EarlierTime = stdLib.Date
  type EmptiableStringWithCharLimit256 = java.lang.String
  type EvaluationResults = js.Array[EvaluationResult]
  type Evaluations = js.Array[Evaluation]
  type EventSource = awsDashSdkLib.awsDashSdkLibStrings.awsDOTconfig | java.lang.String
  type GroupByAPILimit = scala.Double
  type GroupedResourceCountList = js.Array[GroupedResourceCount]
  type IncludeGlobalResourceTypes = scala.Boolean
  type Integer = scala.Double
  type LaterTime = stdLib.Date
  type Limit = scala.Double
  type Long = scala.Double
  type MaximumExecutionFrequency = awsDashSdkLib.awsDashSdkLibStrings.One_Hour | awsDashSdkLib.awsDashSdkLibStrings.Three_Hours | awsDashSdkLib.awsDashSdkLibStrings.Six_Hours | awsDashSdkLib.awsDashSdkLibStrings.Twelve_Hours | awsDashSdkLib.awsDashSdkLibStrings.TwentyFour_Hours | java.lang.String
  type MessageType = awsDashSdkLib.awsDashSdkLibStrings.ConfigurationItemChangeNotification | awsDashSdkLib.awsDashSdkLibStrings.ConfigurationSnapshotDeliveryCompleted | awsDashSdkLib.awsDashSdkLibStrings.ScheduledNotification | awsDashSdkLib.awsDashSdkLibStrings.OversizedConfigurationItemChangeNotification | java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type OrderingTimestamp = stdLib.Date
  type Owner = awsDashSdkLib.awsDashSdkLibStrings.CUSTOM_LAMBDA | awsDashSdkLib.awsDashSdkLibStrings.AWS | java.lang.String
  type PendingAggregationRequestList = js.Array[PendingAggregationRequest]
  type RecorderName = java.lang.String
  type RecorderStatus = awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.Success | awsDashSdkLib.awsDashSdkLibStrings.Failure | java.lang.String
  type ReevaluateConfigRuleNames = js.Array[StringWithCharLimit64]
  type RelatedEvent = java.lang.String
  type RelatedEventList = js.Array[RelatedEvent]
  type RelationshipList = js.Array[Relationship]
  type RelationshipName = java.lang.String
  type ResourceCountGroupKey = awsDashSdkLib.awsDashSdkLibStrings.RESOURCE_TYPE | awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT_ID | awsDashSdkLib.awsDashSdkLibStrings.AWS_REGION | java.lang.String
  type ResourceCounts = js.Array[ResourceCount]
  type ResourceCreationTime = stdLib.Date
  type ResourceDeletionTime = stdLib.Date
  type ResourceId = java.lang.String
  type ResourceIdList = js.Array[ResourceId]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceIdentifiersList = js.Array[AggregateResourceIdentifier]
  type ResourceKeys = js.Array[ResourceKey]
  type ResourceName = java.lang.String
  type ResourceType = /* LimitUnionLength: was union type with length 65 */js.Any
  type ResourceTypeList = js.Array[ResourceType]
  type ResourceTypes = js.Array[StringWithCharLimit256]
  type RetentionConfigurationList = js.Array[RetentionConfiguration]
  type RetentionConfigurationName = java.lang.String
  type RetentionConfigurationNameList = js.Array[RetentionConfigurationName]
  type RetentionPeriodInDays = scala.Double
  type RuleLimit = scala.Double
  type SourceDetails = js.Array[SourceDetail]
  type String = java.lang.String
  type StringWithCharLimit1024 = java.lang.String
  type StringWithCharLimit128 = java.lang.String
  type StringWithCharLimit256 = java.lang.String
  type StringWithCharLimit64 = java.lang.String
  type SupplementaryConfigurationName = java.lang.String
  type SupplementaryConfigurationValue = java.lang.String
  type UnprocessedResourceIdentifierList = js.Array[AggregateResourceIdentifier]
  type Value = java.lang.String
  type Version = java.lang.String
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2014-11-12` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

