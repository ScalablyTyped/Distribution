package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/inspector", "Inspector")
@js.native
object InspectorNs extends js.Object {
  
  trait AddAttributesToFindingsRequest extends js.Object {
    /**
         * The array of attributes that you want to assign to specified findings.
         */
    var attributes: UserAttributeList
    /**
         * The ARNs that specify the findings that you want to assign attributes to.
         */
    var findingArns: AddRemoveAttributesFindingArnList
  }
  
  
  trait AddAttributesToFindingsResponse extends js.Object {
    /**
         * Attribute details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
  }
  
  
  trait AgentFilter extends js.Object {
    /**
         * The detailed health state of the agent. Values can be set to IDLE, RUNNING, SHUTDOWN, UNHEALTHY, THROTTLED, and UNKNOWN. 
         */
    var agentHealthCodes: AgentHealthCodeList
    /**
         * The current health state of the agent. Values can be set to HEALTHY or UNHEALTHY.
         */
    var agentHealths: AgentHealthList
  }
  
  
  trait AgentPreview extends js.Object {
    /**
         * The health status of the Amazon Inspector Agent.
         */
    var agentHealth: js.UndefOr[AgentHealth] = js.undefined
    /**
         * The ID of the EC2 instance where the agent is installed.
         */
    var agentId: AgentId
    /**
         * The version of the Amazon Inspector Agent.
         */
    var agentVersion: js.UndefOr[AgentVersion] = js.undefined
    /**
         * The Auto Scaling group for the EC2 instance where the agent is installed.
         */
    var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
    /**
         * The hostname of the EC2 instance on which the Amazon Inspector Agent is installed.
         */
    var hostname: js.UndefOr[Hostname] = js.undefined
    /**
         * The IP address of the EC2 instance on which the Amazon Inspector Agent is installed.
         */
    var ipv4Address: js.UndefOr[Ipv4Address] = js.undefined
    /**
         * The kernel version of the operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
         */
    var kernelVersion: js.UndefOr[KernelVersion] = js.undefined
    /**
         * The operating system running on the EC2 instance on which the Amazon Inspector Agent is installed.
         */
    var operatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  }
  
  
  trait AssessmentRun extends js.Object {
    /**
         * The ARN of the assessment run.
         */
    var arn: Arn
    /**
         * The ARN of the assessment template that is associated with the assessment run.
         */
    var assessmentTemplateArn: Arn
    /**
         * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
         */
    var completedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The time when StartAssessmentRun was called.
         */
    var createdAt: Timestamp
    /**
         * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is completed.
         */
    var dataCollected: Bool
    /**
         * The duration of the assessment run.
         */
    var durationInSeconds: AssessmentRunDuration
    /**
         * Provides a total count of generated findings per severity.
         */
    var findingCounts: AssessmentRunFindingCounts
    /**
         * The auto-generated name for the assessment run.
         */
    var name: AssessmentRunName
    /**
         * A list of notifications for the event subscriptions. A notification about a particular generated finding is added to this list only once.
         */
    var notifications: AssessmentRunNotificationList
    /**
         * The rules packages selected for the assessment run.
         */
    var rulesPackageArns: AssessmentRulesPackageArnList
    /**
         * The time when StartAssessmentRun was called.
         */
    var startedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The state of the assessment run.
         */
    var state: AssessmentRunState
    /**
         * The last time when the assessment run's state changed.
         */
    var stateChangedAt: Timestamp
    /**
         * A list of the assessment run state changes.
         */
    var stateChanges: AssessmentRunStateChangeList
    /**
         * The user-defined attributes that are assigned to every generated finding.
         */
    var userAttributesForFindings: UserAttributeList
  }
  
  
  trait AssessmentRunAgent extends js.Object {
    /**
         * The current health state of the agent.
         */
    var agentHealth: AgentHealth
    /**
         * The detailed health state of the agent.
         */
    var agentHealthCode: AgentHealthCode
    /**
         * The description for the agent health code.
         */
    var agentHealthDetails: js.UndefOr[Message] = js.undefined
    /**
         * The AWS account of the EC2 instance where the agent is installed.
         */
    var agentId: AgentId
    /**
         * The ARN of the assessment run that is associated with the agent.
         */
    var assessmentRunArn: Arn
    /**
         * The Auto Scaling group of the EC2 instance that is specified by the agent ID.
         */
    var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
    /**
         * The Amazon Inspector application data metrics that are collected by the agent.
         */
    var telemetryMetadata: TelemetryMetadataList
  }
  
  
  trait AssessmentRunFilter extends js.Object {
    /**
         * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the completedAt property of the AssessmentRun data type.
         */
    var completionTimeRange: js.UndefOr[TimestampRange] = js.undefined
    /**
         * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentRun data type.
         */
    var durationRange: js.UndefOr[DurationRange] = js.undefined
    /**
         * For a record to match a filter, an explicit value or a string containing a wildcard that is specified for this data type property must match the value of the assessmentRunName property of the AssessmentRun data type.
         */
    var namePattern: js.UndefOr[NamePattern] = js.undefined
    /**
         * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the rulesPackages property of the AssessmentRun data type.
         */
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined
    /**
         * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the startTime property of the AssessmentRun data type.
         */
    var startTimeRange: js.UndefOr[TimestampRange] = js.undefined
    /**
         * For a record to match a filter, the value that is specified for this data type property must match the stateChangedAt property of the AssessmentRun data type.
         */
    var stateChangeTimeRange: js.UndefOr[TimestampRange] = js.undefined
    /**
         * For a record to match a filter, one of the values specified for this data type property must be the exact match of the value of the assessmentRunState property of the AssessmentRun data type.
         */
    var states: js.UndefOr[AssessmentRunStateList] = js.undefined
  }
  
  
  trait AssessmentRunFindingCounts
    extends /* key */ org.scalablytyped.runtime.StringDictionary[FindingCount]
  
  
  trait AssessmentRunNotification extends js.Object {
    /**
         * The date of the notification.
         */
    var date: Timestamp
    /**
         * The Boolean value that specifies whether the notification represents an error.
         */
    var error: Bool
    /**
         * The event for which a notification is sent.
         */
    var event: InspectorEvent
    /**
         * The message included in the notification.
         */
    var message: js.UndefOr[Message] = js.undefined
    /**
         * The status code of the SNS notification.
         */
    var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode] = js.undefined
    /**
         * The SNS topic to which the SNS notification is sent.
         */
    var snsTopicArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait AssessmentRunStateChange extends js.Object {
    /**
         * The assessment run state.
         */
    var state: AssessmentRunState
    /**
         * The last time the assessment run state changed.
         */
    var stateChangedAt: Timestamp
  }
  
  
  trait AssessmentTarget extends js.Object {
    /**
         * The ARN that specifies the Amazon Inspector assessment target.
         */
    var arn: Arn
    /**
         * The time at which the assessment target is created.
         */
    var createdAt: Timestamp
    /**
         * The name of the Amazon Inspector assessment target.
         */
    var name: AssessmentTargetName
    /**
         * The ARN that specifies the resource group that is associated with the assessment target.
         */
    var resourceGroupArn: js.UndefOr[Arn] = js.undefined
    /**
         * The time at which UpdateAssessmentTarget is called.
         */
    var updatedAt: Timestamp
  }
  
  
  trait AssessmentTargetFilter extends js.Object {
    /**
         * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTargetName property of the AssessmentTarget data type.
         */
    var assessmentTargetNamePattern: js.UndefOr[NamePattern] = js.undefined
  }
  
  
  trait AssessmentTemplate extends js.Object {
    /**
         * The ARN of the assessment template.
         */
    var arn: Arn
    /**
         * The number of existing assessment runs associated with this assessment template. This value can be zero or a positive integer.
         */
    var assessmentRunCount: ArnCount
    /**
         * The ARN of the assessment target that corresponds to this assessment template.
         */
    var assessmentTargetArn: Arn
    /**
         * The time at which the assessment template is created.
         */
    var createdAt: Timestamp
    /**
         * The duration in seconds specified for this assessment template. The default value is 3600 seconds (one hour). The maximum value is 86400 seconds (one day).
         */
    var durationInSeconds: AssessmentRunDuration
    /**
         * The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template. This value exists only when the value of assessmentRunCount is greaterpa than zero.
         */
    var lastAssessmentRunArn: js.UndefOr[Arn] = js.undefined
    /**
         * The name of the assessment template.
         */
    var name: AssessmentTemplateName
    /**
         * The rules packages that are specified for this assessment template.
         */
    var rulesPackageArns: AssessmentTemplateRulesPackageArnList
    /**
         * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this assessment template.
         */
    var userAttributesForFindings: UserAttributeList
  }
  
  
  trait AssessmentTemplateFilter extends js.Object {
    /**
         * For a record to match a filter, the value specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentTemplate data type.
         */
    var durationRange: js.UndefOr[DurationRange] = js.undefined
    /**
         * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTemplateName property of the AssessmentTemplate data type.
         */
    var namePattern: js.UndefOr[NamePattern] = js.undefined
    /**
         * For a record to match a filter, the values that are specified for this data type property must be contained in the list of values of the rulesPackageArns property of the AssessmentTemplate data type.
         */
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined
  }
  
  
  trait AssetAttributes extends js.Object {
    /**
         * The ID of the agent that is installed on the EC2 instance where the finding is generated.
         */
    var agentId: js.UndefOr[AgentId] = js.undefined
    /**
         * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
         */
    var amiId: js.UndefOr[AmiId] = js.undefined
    /**
         * The Auto Scaling group of the EC2 instance where the finding is generated.
         */
    var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
    /**
         * The hostname of the EC2 instance where the finding is generated.
         */
    var hostname: js.UndefOr[Hostname] = js.undefined
    /**
         * The list of IP v4 addresses of the EC2 instance where the finding is generated.
         */
    var ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.undefined
    /**
         * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
         */
    var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
    /**
         * The schema version of this data type.
         */
    var schemaVersion: NumericVersion
    /**
         * The tags related to the EC2 instance where the finding is generated.
         */
    var tags: js.UndefOr[Tags] = js.undefined
  }
  
  
  trait Attribute extends js.Object {
    /**
         * The attribute key.
         */
    var key: AttributeKey
    /**
         * The value assigned to the attribute key.
         */
    var value: js.UndefOr[AttributeValue] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateAssessmentTargetRequest extends js.Object {
    /**
         * The user-defined name that identifies the assessment target that you want to create. The name must be unique within the AWS account.
         */
    var assessmentTargetName: AssessmentTargetName
    /**
         * The ARN that specifies the resource group that is used to create the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
         */
    var resourceGroupArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait CreateAssessmentTargetResponse extends js.Object {
    /**
         * The ARN that specifies the assessment target that is created.
         */
    var assessmentTargetArn: Arn
  }
  
  
  trait CreateAssessmentTemplateRequest extends js.Object {
    /**
         * The ARN that specifies the assessment target for which you want to create the assessment template.
         */
    var assessmentTargetArn: Arn
    /**
         * The user-defined name that identifies the assessment template that you want to create. You can create several assessment templates for an assessment target. The names of the assessment templates that correspond to a particular assessment target must be unique.
         */
    var assessmentTemplateName: AssessmentTemplateName
    /**
         * The duration of the assessment run in seconds.
         */
    var durationInSeconds: AssessmentRunDuration
    /**
         * The ARNs that specify the rules packages that you want to attach to the assessment template.
         */
    var rulesPackageArns: AssessmentTemplateRulesPackageArnList
    /**
         * The user-defined attributes that are assigned to every finding that is generated by the assessment run that uses this assessment template. An attribute is a key and value pair (an Attribute object). Within an assessment template, each key must be unique.
         */
    var userAttributesForFindings: js.UndefOr[UserAttributeList] = js.undefined
  }
  
  
  trait CreateAssessmentTemplateResponse extends js.Object {
    /**
         * The ARN that specifies the assessment template that is created.
         */
    var assessmentTemplateArn: Arn
  }
  
  
  trait CreateExclusionsPreviewRequest extends js.Object {
    /**
         * The ARN that specifies the assessment template for which you want to create an exclusions preview.
         */
    var assessmentTemplateArn: Arn
  }
  
  
  trait CreateExclusionsPreviewResponse extends js.Object {
    /**
         * Specifies the unique identifier of the requested exclusions preview. You can use the unique identifier to retrieve the exclusions preview when running the GetExclusionsPreview API.
         */
    var previewToken: UUID
  }
  
  
  trait CreateResourceGroupRequest extends js.Object {
    /**
         * A collection of keys and an array of possible values, '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'. For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
         */
    var resourceGroupTags: ResourceGroupTags
  }
  
  
  trait CreateResourceGroupResponse extends js.Object {
    /**
         * The ARN that specifies the resource group that is created.
         */
    var resourceGroupArn: Arn
  }
  
  
  trait DeleteAssessmentRunRequest extends js.Object {
    /**
         * The ARN that specifies the assessment run that you want to delete.
         */
    var assessmentRunArn: Arn
  }
  
  
  trait DeleteAssessmentTargetRequest extends js.Object {
    /**
         * The ARN that specifies the assessment target that you want to delete.
         */
    var assessmentTargetArn: Arn
  }
  
  
  trait DeleteAssessmentTemplateRequest extends js.Object {
    /**
         * The ARN that specifies the assessment template that you want to delete.
         */
    var assessmentTemplateArn: Arn
  }
  
  
  trait DescribeAssessmentRunsRequest extends js.Object {
    /**
         * The ARN that specifies the assessment run that you want to describe.
         */
    var assessmentRunArns: BatchDescribeArnList
  }
  
  
  trait DescribeAssessmentRunsResponse extends js.Object {
    /**
         * Information about the assessment run.
         */
    var assessmentRuns: AssessmentRunList
    /**
         * Assessment run details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
  }
  
  
  trait DescribeAssessmentTargetsRequest extends js.Object {
    /**
         * The ARNs that specifies the assessment targets that you want to describe.
         */
    var assessmentTargetArns: BatchDescribeArnList
  }
  
  
  trait DescribeAssessmentTargetsResponse extends js.Object {
    /**
         * Information about the assessment targets.
         */
    var assessmentTargets: AssessmentTargetList
    /**
         * Assessment target details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
  }
  
  
  trait DescribeAssessmentTemplatesRequest extends js.Object {
    var assessmentTemplateArns: BatchDescribeArnList
  }
  
  
  trait DescribeAssessmentTemplatesResponse extends js.Object {
    /**
         * Information about the assessment templates.
         */
    var assessmentTemplates: AssessmentTemplateList
    /**
         * Assessment template details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
  }
  
  
  trait DescribeCrossAccountAccessRoleResponse extends js.Object {
    /**
         * The date when the cross-account access role was registered.
         */
    var registeredAt: Timestamp
    /**
         * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
         */
    var roleArn: Arn
    /**
         * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon Inspector to access your AWS account.
         */
    var valid: Bool
  }
  
  
  trait DescribeExclusionsRequest extends js.Object {
    /**
         * The list of ARNs that specify the exclusions that you want to describe.
         */
    var exclusionArns: BatchDescribeExclusionsArnList
    /**
         * The locale into which you want to translate the exclusion's title, description, and recommendation.
         */
    var locale: js.UndefOr[Locale] = js.undefined
  }
  
  
  trait DescribeExclusionsResponse extends js.Object {
    /**
         * Information about the exclusions.
         */
    var exclusions: ExclusionMap
    /**
         * Exclusion details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
  }
  
  
  trait DescribeFindingsRequest extends js.Object {
    /**
         * The ARN that specifies the finding that you want to describe.
         */
    var findingArns: BatchDescribeArnList
    /**
         * The locale into which you want to translate a finding description, recommendation, and the short description that identifies the finding.
         */
    var locale: js.UndefOr[Locale] = js.undefined
  }
  
  
  trait DescribeFindingsResponse extends js.Object {
    /**
         * Finding details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
    /**
         * Information about the finding.
         */
    var findings: FindingList
  }
  
  
  trait DescribeResourceGroupsRequest extends js.Object {
    /**
         * The ARN that specifies the resource group that you want to describe.
         */
    var resourceGroupArns: BatchDescribeArnList
  }
  
  
  trait DescribeResourceGroupsResponse extends js.Object {
    /**
         * Resource group details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
    /**
         * Information about a resource group.
         */
    var resourceGroups: ResourceGroupList
  }
  
  
  trait DescribeRulesPackagesRequest extends js.Object {
    /**
         * The locale that you want to translate a rules package description into.
         */
    var locale: js.UndefOr[Locale] = js.undefined
    /**
         * The ARN that specifies the rules package that you want to describe.
         */
    var rulesPackageArns: BatchDescribeArnList
  }
  
  
  trait DescribeRulesPackagesResponse extends js.Object {
    /**
         * Rules package details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
    /**
         * Information about the rules package.
         */
    var rulesPackages: RulesPackageList
  }
  
  
  trait DurationRange extends js.Object {
    /**
         * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
         */
    var maxSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined
    /**
         * The minimum value of the duration range. Must be greater than zero.
         */
    var minSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined
  }
  
  
  trait EventSubscription extends js.Object {
    /**
         * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
         */
    var event: InspectorEvent
    /**
         * The time at which SubscribeToEvent is called.
         */
    var subscribedAt: Timestamp
  }
  
  
  trait Exclusion extends js.Object {
    /**
         * The ARN that specifies the exclusion.
         */
    var arn: Arn
    /**
         * The system-defined attributes for the exclusion.
         */
    var attributes: js.UndefOr[AttributeList] = js.undefined
    /**
         * The description of the exclusion.
         */
    var description: Text
    /**
         * The recommendation for the exclusion.
         */
    var recommendation: Text
    /**
         * The AWS resources for which the exclusion pertains.
         */
    var scopes: ScopeList
    /**
         * The name of the exclusion.
         */
    var title: Text
  }
  
  
  trait ExclusionMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Exclusion]
  
  
  trait ExclusionPreview extends js.Object {
    /**
         * The system-defined attributes for the exclusion preview.
         */
    var attributes: js.UndefOr[AttributeList] = js.undefined
    /**
         * The description of the exclusion preview.
         */
    var description: Text
    /**
         * The recommendation for the exclusion preview.
         */
    var recommendation: Text
    /**
         * The AWS resources for which the exclusion preview pertains.
         */
    var scopes: ScopeList
    /**
         * The name of the exclusion preview.
         */
    var title: Text
  }
  
  
  trait FailedItemDetails extends js.Object {
    /**
         * The status code of a failed item.
         */
    var failureCode: FailedItemErrorCode
    /**
         * Indicates whether you can immediately retry a request for this item for a specified resource.
         */
    var retryable: Bool
  }
  
  
  trait FailedItems
    extends /* key */ org.scalablytyped.runtime.StringDictionary[FailedItemDetails]
  
  
  trait Finding extends js.Object {
    /**
         * The ARN that specifies the finding.
         */
    var arn: Arn
    /**
         * A collection of attributes of the host from which the finding is generated.
         */
    var assetAttributes: js.UndefOr[AssetAttributes] = js.undefined
    /**
         * The type of the host from which the finding is generated.
         */
    var assetType: js.UndefOr[AssetType] = js.undefined
    /**
         * The system-defined attributes for the finding.
         */
    var attributes: AttributeList
    /**
         * This data element is currently not used.
         */
    var confidence: js.UndefOr[IocConfidence] = js.undefined
    /**
         * The time when the finding was generated.
         */
    var createdAt: Timestamp
    /**
         * The description of the finding.
         */
    var description: js.UndefOr[Text] = js.undefined
    /**
         * The ID of the finding.
         */
    var id: js.UndefOr[FindingId] = js.undefined
    /**
         * This data element is currently not used.
         */
    var indicatorOfCompromise: js.UndefOr[Bool] = js.undefined
    /**
         * The numeric value of the finding severity.
         */
    var numericSeverity: js.UndefOr[NumericSeverity] = js.undefined
    /**
         * The recommendation for the finding.
         */
    var recommendation: js.UndefOr[Text] = js.undefined
    /**
         * The schema version of this data type.
         */
    var schemaVersion: js.UndefOr[NumericVersion] = js.undefined
    /**
         * The data element is set to "Inspector".
         */
    var service: js.UndefOr[ServiceName] = js.undefined
    /**
         * This data type is used in the Finding data type.
         */
    var serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.undefined
    /**
         * The finding severity. Values can be set to High, Medium, Low, and Informational.
         */
    var severity: js.UndefOr[Severity] = js.undefined
    /**
         * The name of the finding.
         */
    var title: js.UndefOr[Text] = js.undefined
    /**
         * The time when AddAttributesToFindings is called.
         */
    var updatedAt: Timestamp
    /**
         * The user-defined attributes that are assigned to the finding.
         */
    var userAttributes: UserAttributeList
  }
  
  
  trait FindingFilter extends js.Object {
    /**
         * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the agentId property of the Finding data type.
         */
    var agentIds: js.UndefOr[AgentIdList] = js.undefined
    /**
         * For a record to match a filter, the list of values that are specified for this data type property must be contained in the list of values of the attributes property of the Finding data type.
         */
    var attributes: js.UndefOr[AttributeList] = js.undefined
    /**
         * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the autoScalingGroup property of the Finding data type.
         */
    var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined
    /**
         * The time range during which the finding is generated.
         */
    var creationTimeRange: js.UndefOr[TimestampRange] = js.undefined
    /**
         * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the ruleName property of the Finding data type.
         */
    var ruleNames: js.UndefOr[RuleNameList] = js.undefined
    /**
         * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the rulesPackageArn property of the Finding data type.
         */
    var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined
    /**
         * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the severity property of the Finding data type.
         */
    var severities: js.UndefOr[SeverityList] = js.undefined
    /**
         * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the userAttributes property of the Finding data type.
         */
    var userAttributes: js.UndefOr[AttributeList] = js.undefined
  }
  
  
  trait GetAssessmentReportRequest extends js.Object {
    /**
         * The ARN that specifies the assessment run for which you want to generate a report.
         */
    var assessmentRunArn: Arn
    /**
         * Specifies the file format (html or pdf) of the assessment report that you want to generate.
         */
    var reportFileFormat: ReportFileFormat
    /**
         * Specifies the type of the assessment report that you want to generate. There are two types of assessment reports: a finding report and a full report. For more information, see Assessment Reports. 
         */
    var reportType: ReportType
  }
  
  
  trait GetAssessmentReportResponse extends js.Object {
    /**
         * Specifies the status of the request to generate an assessment report. 
         */
    var status: ReportStatus
    /**
         * Specifies the URL where you can find the generated assessment report. This parameter is only returned if the report is successfully generated.
         */
    var url: js.UndefOr[Url] = js.undefined
  }
  
  
  trait GetExclusionsPreviewRequest extends js.Object {
    /**
         * The ARN that specifies the assessment template for which the exclusions preview was requested.
         */
    var assessmentTemplateArn: Arn
    /**
         * The locale into which you want to translate the exclusion's title, description, and recommendation.
         */
    var locale: js.UndefOr[Locale] = js.undefined
    /**
         * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 100. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the GetExclusionsPreviewRequest action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The unique identifier associated of the exclusions preview.
         */
    var previewToken: UUID
  }
  
  
  trait GetExclusionsPreviewResponse extends js.Object {
    /**
         * Information about the exclusions included in the preview.
         */
    var exclusionPreviews: js.UndefOr[ExclusionPreviewList] = js.undefined
    /**
         * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * Specifies the status of the request to generate an exclusions preview.
         */
    var previewStatus: PreviewStatus
  }
  
  
  trait GetTelemetryMetadataRequest extends js.Object {
    /**
         * The ARN that specifies the assessment run that has the telemetry data that you want to obtain.
         */
    var assessmentRunArn: Arn
  }
  
  
  trait GetTelemetryMetadataResponse extends js.Object {
    /**
         * Telemetry details.
         */
    var telemetryMetadata: TelemetryMetadataList
  }
  
  
  trait InspectorServiceAttributes extends js.Object {
    /**
         * The ARN of the assessment run during which the finding is generated.
         */
    var assessmentRunArn: js.UndefOr[Arn] = js.undefined
    /**
         * The ARN of the rules package that is used to generate the finding.
         */
    var rulesPackageArn: js.UndefOr[Arn] = js.undefined
    /**
         * The schema version of this data type.
         */
    var schemaVersion: NumericVersion
  }
  
  
  trait ListAssessmentRunAgentsRequest extends js.Object {
    /**
         * The ARN that specifies the assessment run whose agents you want to list.
         */
    var assessmentRunArn: Arn
    /**
         * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
         */
    var filter: js.UndefOr[AgentFilter] = js.undefined
    /**
         * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 10. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentRunAgents action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListAssessmentRunAgentsResponse extends js.Object {
    /**
         * A list of ARNs that specifies the agents returned by the action.
         */
    var assessmentRunAgents: AssessmentRunAgentList
    /**
         *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListAssessmentRunsRequest extends js.Object {
    /**
         * The ARNs that specify the assessment templates whose assessment runs you want to list.
         */
    var assessmentTemplateArns: js.UndefOr[ListParentArnList] = js.undefined
    /**
         * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
         */
    var filter: js.UndefOr[AssessmentRunFilter] = js.undefined
    /**
         * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 10. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentRuns action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListAssessmentRunsResponse extends js.Object {
    /**
         * A list of ARNs that specifies the assessment runs that are returned by the action.
         */
    var assessmentRunArns: ListReturnedArnList
    /**
         *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListAssessmentTargetsRequest extends js.Object {
    /**
         * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
         */
    var filter: js.UndefOr[AssessmentTargetFilter] = js.undefined
    /**
         * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentTargets action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListAssessmentTargetsResponse extends js.Object {
    /**
         * A list of ARNs that specifies the assessment targets that are returned by the action.
         */
    var assessmentTargetArns: ListReturnedArnList
    /**
         *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListAssessmentTemplatesRequest extends js.Object {
    /**
         * A list of ARNs that specifies the assessment targets whose assessment templates you want to list.
         */
    var assessmentTargetArns: js.UndefOr[ListParentArnList] = js.undefined
    /**
         * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
         */
    var filter: js.UndefOr[AssessmentTemplateFilter] = js.undefined
    /**
         * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListAssessmentTemplates action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListAssessmentTemplatesResponse extends js.Object {
    /**
         * A list of ARNs that specifies the assessment templates returned by the action.
         */
    var assessmentTemplateArns: ListReturnedArnList
    /**
         *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListEventSubscriptionsRequest extends js.Object {
    /**
         * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListEventSubscriptionsMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListEventSubscriptions action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The ARN of the assessment template for which you want to list the existing event subscriptions.
         */
    var resourceArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait ListEventSubscriptionsResponse extends js.Object {
    /**
         *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * Details of the returned event subscriptions.
         */
    var subscriptions: SubscriptionList
  }
  
  
  trait ListExclusionsRequest extends js.Object {
    /**
         * The ARN of the assessment run that generated the exclusions that you want to list.
         */
    var assessmentRunArn: Arn
    /**
         * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 100. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListExclusionsRequest action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListExclusionsResponse extends js.Object {
    /**
         * A list of exclusions' ARNs returned by the action.
         */
    var exclusionArns: ListReturnedArnList
    /**
         * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListFindingsRequest extends js.Object {
    /**
         * The ARNs of the assessment runs that generate the findings that you want to list.
         */
    var assessmentRunArns: js.UndefOr[ListParentArnList] = js.undefined
    /**
         * You can use this parameter to specify a subset of data to be included in the action's response. For a record to match a filter, all specified filter attributes must match. When multiple values are specified for a filter attribute, any of the values can match.
         */
    var filter: js.UndefOr[FindingFilter] = js.undefined
    /**
         * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListFindings action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListFindingsResponse extends js.Object {
    /**
         * A list of ARNs that specifies the findings returned by the action.
         */
    var findingArns: ListReturnedArnList
    /**
         *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListRulesPackagesRequest extends js.Object {
    /**
         * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
         */
    var maxResults: js.UndefOr[ListMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListRulesPackages action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListRulesPackagesResponse extends js.Object {
    /**
         *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The list of ARNs that specifies the rules packages returned by the action.
         */
    var rulesPackageArns: ListReturnedArnList
  }
  
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
         * The ARN that specifies the assessment template whose tags you want to list.
         */
    var resourceArn: Arn
  }
  
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
         * A collection of key and value pairs.
         */
    var tags: TagList
  }
  
  
  trait NetworkInterface extends js.Object {
    /**
         * The IP addresses associated with the network interface.
         */
    var ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined
    /**
         * The ID of the network interface.
         */
    var networkInterfaceId: js.UndefOr[Text] = js.undefined
    /**
         * The name of a private DNS associated with the network interface.
         */
    var privateDnsName: js.UndefOr[Text] = js.undefined
    /**
         * The private IP address associated with the network interface.
         */
    var privateIpAddress: js.UndefOr[Text] = js.undefined
    /**
         * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and privateIpAddress.
         */
    var privateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined
    /**
         * The name of a public DNS associated with the network interface.
         */
    var publicDnsName: js.UndefOr[Text] = js.undefined
    /**
         * The public IP address from which the network interface is reachable.
         */
    var publicIp: js.UndefOr[Text] = js.undefined
    /**
         * A list of the security groups associated with the network interface. Includes the groupId and groupName.
         */
    var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
         * The ID of a subnet associated with the network interface.
         */
    var subnetId: js.UndefOr[Text] = js.undefined
    /**
         * The ID of a VPC associated with the network interface.
         */
    var vpcId: js.UndefOr[Text] = js.undefined
  }
  
  
  trait PreviewAgentsRequest extends js.Object {
    /**
         * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
         */
    var maxResults: js.UndefOr[PreviewAgentsMaxResults] = js.undefined
    /**
         * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the PreviewAgents action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The ARN of the assessment target whose agents you want to preview.
         */
    var previewAgentsArn: Arn
  }
  
  
  trait PreviewAgentsResponse extends js.Object {
    /**
         * The resulting list of agents.
         */
    var agentPreviews: AgentPreviewList
    /**
         *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait PrivateIp extends js.Object {
    /**
         * The DNS name of the private IP address.
         */
    var privateDnsName: js.UndefOr[Text] = js.undefined
    /**
         * The full IP address of the network inteface.
         */
    var privateIpAddress: js.UndefOr[Text] = js.undefined
  }
  
  
  trait RegisterCrossAccountAccessRoleRequest extends js.Object {
    /**
         * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments. 
         */
    var roleArn: Arn
  }
  
  
  trait RemoveAttributesFromFindingsRequest extends js.Object {
    /**
         * The array of attribute keys that you want to remove from specified findings.
         */
    var attributeKeys: UserAttributeKeyList
    /**
         * The ARNs that specify the findings that you want to remove attributes from.
         */
    var findingArns: AddRemoveAttributesFindingArnList
  }
  
  
  trait RemoveAttributesFromFindingsResponse extends js.Object {
    /**
         * Attributes details that cannot be described. An error code is provided for each failed item.
         */
    var failedItems: FailedItems
  }
  
  
  trait ResourceGroup extends js.Object {
    /**
         * The ARN of the resource group.
         */
    var arn: Arn
    /**
         * The time at which resource group is created.
         */
    var createdAt: Timestamp
    /**
         * The tags (key and value pairs) of the resource group. This data type property is used in the CreateResourceGroup action.
         */
    var tags: ResourceGroupTags
  }
  
  
  trait ResourceGroupTag extends js.Object {
    /**
         * A tag key.
         */
    var key: TagKey
    /**
         * The value assigned to a tag key.
         */
    var value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait RulesPackage extends js.Object {
    /**
         * The ARN of the rules package.
         */
    var arn: Arn
    /**
         * The description of the rules package.
         */
    var description: js.UndefOr[Text] = js.undefined
    /**
         * The name of the rules package.
         */
    var name: RulesPackageName
    /**
         * The provider of the rules package.
         */
    var provider: ProviderName
    /**
         * The version ID of the rules package.
         */
    var version: Version
  }
  
  
  trait Scope extends js.Object {
    /**
         * The type of the scope.
         */
    var key: js.UndefOr[ScopeType] = js.undefined
    /**
         * The resource identifier for the specified scope type.
         */
    var value: js.UndefOr[ScopeValue] = js.undefined
  }
  
  
  trait SecurityGroup extends js.Object {
    /**
         * The ID of the security group.
         */
    var groupId: js.UndefOr[Text] = js.undefined
    /**
         * The name of the security group.
         */
    var groupName: js.UndefOr[Text] = js.undefined
  }
  
  
  trait SetTagsForResourceRequest extends js.Object {
    /**
         * The ARN of the assessment template that you want to set tags to.
         */
    var resourceArn: Arn
    /**
         * A collection of key and value pairs that you want to set to the assessment template.
         */
    var tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait StartAssessmentRunRequest extends js.Object {
    /**
         * You can specify the name for the assessment run. The name must be unique for the assessment template whose ARN is used to start the assessment run.
         */
    var assessmentRunName: js.UndefOr[AssessmentRunName] = js.undefined
    /**
         * The ARN of the assessment template of the assessment run that you want to start.
         */
    var assessmentTemplateArn: Arn
  }
  
  
  trait StartAssessmentRunResponse extends js.Object {
    /**
         * The ARN of the assessment run that has been started.
         */
    var assessmentRunArn: Arn
  }
  
  
  trait StopAssessmentRunRequest extends js.Object {
    /**
         * The ARN of the assessment run that you want to stop.
         */
    var assessmentRunArn: Arn
    /**
         * An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default value), stops the AWS agent from collecting data and begins the results evaluation and the findings generation process. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.
         */
    var stopAction: js.UndefOr[StopAction] = js.undefined
  }
  
  
  trait SubscribeToEventRequest extends js.Object {
    /**
         * The event for which you want to receive SNS notifications.
         */
    var event: InspectorEvent
    /**
         * The ARN of the assessment template that is used during the event for which you want to receive SNS notifications.
         */
    var resourceArn: Arn
    /**
         * The ARN of the SNS topic to which the SNS notifications are sent.
         */
    var topicArn: Arn
  }
  
  
  trait Subscription extends js.Object {
    /**
         * The list of existing event subscriptions.
         */
    var eventSubscriptions: EventSubscriptionList
    /**
         * The ARN of the assessment template that is used during the event for which the SNS notification is sent.
         */
    var resourceArn: Arn
    /**
         * The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
         */
    var topicArn: Arn
  }
  
  
  trait Tag extends js.Object {
    /**
         * A tag key.
         */
    var key: TagKey
    /**
         * A value assigned to a tag key.
         */
    var value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TelemetryMetadata extends js.Object {
    /**
         * The count of messages that the agent sends to the Amazon Inspector service.
         */
    var count: Long
    /**
         * The data size of messages that the agent sends to the Amazon Inspector service.
         */
    var dataSize: js.UndefOr[Long] = js.undefined
    /**
         * A specific type of behavioral data that is collected by the agent.
         */
    var messageType: MessageType
  }
  
  
  trait TimestampRange extends js.Object {
    /**
         * The minimum value of the timestamp range.
         */
    var beginDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The maximum value of the timestamp range.
         */
    var endDate: js.UndefOr[Timestamp] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
       */
    def addAttributesToFindings(): awsDashSdkLib.libRequestMod.Request[AddAttributesToFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
       */
    def addAttributesToFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddAttributesToFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddAttributesToFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
       */
    def addAttributesToFindings(params: AddAttributesToFindingsRequest): awsDashSdkLib.libRequestMod.Request[AddAttributesToFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
       */
    def addAttributesToFindings(
      params: AddAttributesToFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddAttributesToFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddAttributesToFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new assessment target using the ARN of the resource group that is generated by CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector Assessment Targets.
       */
    def createAssessmentTarget(): awsDashSdkLib.libRequestMod.Request[CreateAssessmentTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new assessment target using the ARN of the resource group that is generated by CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector Assessment Targets.
       */
    def createAssessmentTarget(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAssessmentTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAssessmentTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new assessment target using the ARN of the resource group that is generated by CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector Assessment Targets.
       */
    def createAssessmentTarget(params: CreateAssessmentTargetRequest): awsDashSdkLib.libRequestMod.Request[CreateAssessmentTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new assessment target using the ARN of the resource group that is generated by CreateResourceGroup. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments. You can create up to 50 assessment targets per AWS account. You can run up to 500 concurrent agents per AWS account. For more information, see  Amazon Inspector Assessment Targets.
       */
    def createAssessmentTarget(
      params: CreateAssessmentTargetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAssessmentTargetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAssessmentTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments.
       */
    def createAssessmentTemplate(): awsDashSdkLib.libRequestMod.Request[CreateAssessmentTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments.
       */
    def createAssessmentTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAssessmentTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAssessmentTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments.
       */
    def createAssessmentTemplate(params: CreateAssessmentTemplateRequest): awsDashSdkLib.libRequestMod.Request[CreateAssessmentTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target. If the service-linked role isn’t already registered, this action also creates and registers a service-linked role to grant Amazon Inspector access to AWS Services needed to perform security assessments.
       */
    def createAssessmentTemplate(
      params: CreateAssessmentTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAssessmentTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAssessmentTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment. 
       */
    def createExclusionsPreview(): awsDashSdkLib.libRequestMod.Request[CreateExclusionsPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment. 
       */
    def createExclusionsPreview(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateExclusionsPreviewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateExclusionsPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment. 
       */
    def createExclusionsPreview(params: CreateExclusionsPreviewRequest): awsDashSdkLib.libRequestMod.Request[CreateExclusionsPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts the generation of an exclusions preview for the specified assessment template. The exclusions preview lists the potential exclusions (ExclusionPreview) that Inspector can detect before it runs the assessment. 
       */
    def createExclusionsPreview(
      params: CreateExclusionsPreviewRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateExclusionsPreviewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateExclusionsPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2 instances to be included in an Amazon Inspector assessment target. The created resource group is then used to create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.
       */
    def createResourceGroup(): awsDashSdkLib.libRequestMod.Request[CreateResourceGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2 instances to be included in an Amazon Inspector assessment target. The created resource group is then used to create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.
       */
    def createResourceGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResourceGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResourceGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2 instances to be included in an Amazon Inspector assessment target. The created resource group is then used to create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.
       */
    def createResourceGroup(params: CreateResourceGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2 instances to be included in an Amazon Inspector assessment target. The created resource group is then used to create an Amazon Inspector assessment target. For more information, see CreateAssessmentTarget.
       */
    def createResourceGroup(
      params: CreateResourceGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateResourceGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateResourceGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment run that is specified by the ARN of the assessment run.
       */
    def deleteAssessmentRun(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment run that is specified by the ARN of the assessment run.
       */
    def deleteAssessmentRun(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment run that is specified by the ARN of the assessment run.
       */
    def deleteAssessmentRun(params: DeleteAssessmentRunRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment run that is specified by the ARN of the assessment run.
       */
    def deleteAssessmentRun(
      params: DeleteAssessmentRunRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment target that is specified by the ARN of the assessment target.
       */
    def deleteAssessmentTarget(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment target that is specified by the ARN of the assessment target.
       */
    def deleteAssessmentTarget(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment target that is specified by the ARN of the assessment target.
       */
    def deleteAssessmentTarget(params: DeleteAssessmentTargetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment target that is specified by the ARN of the assessment target.
       */
    def deleteAssessmentTarget(
      params: DeleteAssessmentTargetRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment template that is specified by the ARN of the assessment template.
       */
    def deleteAssessmentTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment template that is specified by the ARN of the assessment template.
       */
    def deleteAssessmentTemplate(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment template that is specified by the ARN of the assessment template.
       */
    def deleteAssessmentTemplate(params: DeleteAssessmentTemplateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the assessment template that is specified by the ARN of the assessment template.
       */
    def deleteAssessmentTemplate(
      params: DeleteAssessmentTemplateRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def describeAssessmentRuns(): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def describeAssessmentRuns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssessmentRunsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def describeAssessmentRuns(params: DescribeAssessmentRunsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def describeAssessmentRuns(
      params: DescribeAssessmentRunsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssessmentRunsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment targets that are specified by the ARNs of the assessment targets.
       */
    def describeAssessmentTargets(): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment targets that are specified by the ARNs of the assessment targets.
       */
    def describeAssessmentTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssessmentTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment targets that are specified by the ARNs of the assessment targets.
       */
    def describeAssessmentTargets(params: DescribeAssessmentTargetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment targets that are specified by the ARNs of the assessment targets.
       */
    def describeAssessmentTargets(
      params: DescribeAssessmentTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssessmentTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment templates that are specified by the ARNs of the assessment templates.
       */
    def describeAssessmentTemplates(): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment templates that are specified by the ARNs of the assessment templates.
       */
    def describeAssessmentTemplates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssessmentTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment templates that are specified by the ARNs of the assessment templates.
       */
    def describeAssessmentTemplates(params: DescribeAssessmentTemplatesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the assessment templates that are specified by the ARNs of the assessment templates.
       */
    def describeAssessmentTemplates(
      params: DescribeAssessmentTemplatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAssessmentTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAssessmentTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the IAM role that enables Amazon Inspector to access your AWS account.
       */
    def describeCrossAccountAccessRole(): awsDashSdkLib.libRequestMod.Request[DescribeCrossAccountAccessRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the IAM role that enables Amazon Inspector to access your AWS account.
       */
    def describeCrossAccountAccessRole(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCrossAccountAccessRoleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCrossAccountAccessRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the exclusions that are specified by the exclusions' ARNs.
       */
    def describeExclusions(): awsDashSdkLib.libRequestMod.Request[DescribeExclusionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the exclusions that are specified by the exclusions' ARNs.
       */
    def describeExclusions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExclusionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExclusionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the exclusions that are specified by the exclusions' ARNs.
       */
    def describeExclusions(params: DescribeExclusionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeExclusionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the exclusions that are specified by the exclusions' ARNs.
       */
    def describeExclusions(
      params: DescribeExclusionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeExclusionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeExclusionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the findings that are specified by the ARNs of the findings.
       */
    def describeFindings(): awsDashSdkLib.libRequestMod.Request[DescribeFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the findings that are specified by the ARNs of the findings.
       */
    def describeFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the findings that are specified by the ARNs of the findings.
       */
    def describeFindings(params: DescribeFindingsRequest): awsDashSdkLib.libRequestMod.Request[DescribeFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the findings that are specified by the ARNs of the findings.
       */
    def describeFindings(
      params: DescribeFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the resource groups that are specified by the ARNs of the resource groups.
       */
    def describeResourceGroups(): awsDashSdkLib.libRequestMod.Request[DescribeResourceGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the resource groups that are specified by the ARNs of the resource groups.
       */
    def describeResourceGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeResourceGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeResourceGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the resource groups that are specified by the ARNs of the resource groups.
       */
    def describeResourceGroups(params: DescribeResourceGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeResourceGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the resource groups that are specified by the ARNs of the resource groups.
       */
    def describeResourceGroups(
      params: DescribeResourceGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeResourceGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeResourceGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the rules packages that are specified by the ARNs of the rules packages.
       */
    def describeRulesPackages(): awsDashSdkLib.libRequestMod.Request[DescribeRulesPackagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the rules packages that are specified by the ARNs of the rules packages.
       */
    def describeRulesPackages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRulesPackagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRulesPackagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the rules packages that are specified by the ARNs of the rules packages.
       */
    def describeRulesPackages(params: DescribeRulesPackagesRequest): awsDashSdkLib.libRequestMod.Request[DescribeRulesPackagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the rules packages that are specified by the ARNs of the rules packages.
       */
    def describeRulesPackages(
      params: DescribeRulesPackagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRulesPackagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRulesPackagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Produces an assessment report that includes detailed and comprehensive results of a specified assessment run. 
       */
    def getAssessmentReport(): awsDashSdkLib.libRequestMod.Request[GetAssessmentReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Produces an assessment report that includes detailed and comprehensive results of a specified assessment run. 
       */
    def getAssessmentReport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAssessmentReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAssessmentReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Produces an assessment report that includes detailed and comprehensive results of a specified assessment run. 
       */
    def getAssessmentReport(params: GetAssessmentReportRequest): awsDashSdkLib.libRequestMod.Request[GetAssessmentReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Produces an assessment report that includes detailed and comprehensive results of a specified assessment run. 
       */
    def getAssessmentReport(
      params: GetAssessmentReportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAssessmentReportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAssessmentReportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can obtain the preview token by running the CreateExclusionsPreview API.
       */
    def getExclusionsPreview(): awsDashSdkLib.libRequestMod.Request[GetExclusionsPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can obtain the preview token by running the CreateExclusionsPreview API.
       */
    def getExclusionsPreview(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExclusionsPreviewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExclusionsPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can obtain the preview token by running the CreateExclusionsPreview API.
       */
    def getExclusionsPreview(params: GetExclusionsPreviewRequest): awsDashSdkLib.libRequestMod.Request[GetExclusionsPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the exclusions preview (a list of ExclusionPreview objects) specified by the preview token. You can obtain the preview token by running the CreateExclusionsPreview API.
       */
    def getExclusionsPreview(
      params: GetExclusionsPreviewRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetExclusionsPreviewResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetExclusionsPreviewResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Information about the data that is collected for the specified assessment run.
       */
    def getTelemetryMetadata(): awsDashSdkLib.libRequestMod.Request[GetTelemetryMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Information about the data that is collected for the specified assessment run.
       */
    def getTelemetryMetadata(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTelemetryMetadataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTelemetryMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Information about the data that is collected for the specified assessment run.
       */
    def getTelemetryMetadata(params: GetTelemetryMetadataRequest): awsDashSdkLib.libRequestMod.Request[GetTelemetryMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Information about the data that is collected for the specified assessment run.
       */
    def getTelemetryMetadata(
      params: GetTelemetryMetadataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTelemetryMetadataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTelemetryMetadataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def listAssessmentRunAgents(): awsDashSdkLib.libRequestMod.Request[ListAssessmentRunAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def listAssessmentRunAgents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssessmentRunAgentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssessmentRunAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def listAssessmentRunAgents(params: ListAssessmentRunAgentsRequest): awsDashSdkLib.libRequestMod.Request[ListAssessmentRunAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def listAssessmentRunAgents(
      params: ListAssessmentRunAgentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssessmentRunAgentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssessmentRunAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the assessment templates.
       */
    def listAssessmentRuns(): awsDashSdkLib.libRequestMod.Request[ListAssessmentRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the assessment templates.
       */
    def listAssessmentRuns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssessmentRunsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssessmentRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the assessment templates.
       */
    def listAssessmentRuns(params: ListAssessmentRunsRequest): awsDashSdkLib.libRequestMod.Request[ListAssessmentRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the assessment templates.
       */
    def listAssessmentRuns(
      params: ListAssessmentRunsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssessmentRunsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssessmentRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets, see Amazon Inspector Assessment Targets.
       */
    def listAssessmentTargets(): awsDashSdkLib.libRequestMod.Request[ListAssessmentTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets, see Amazon Inspector Assessment Targets.
       */
    def listAssessmentTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssessmentTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssessmentTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets, see Amazon Inspector Assessment Targets.
       */
    def listAssessmentTargets(params: ListAssessmentTargetsRequest): awsDashSdkLib.libRequestMod.Request[ListAssessmentTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets, see Amazon Inspector Assessment Targets.
       */
    def listAssessmentTargets(
      params: ListAssessmentTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssessmentTargetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssessmentTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the assessment targets.
       */
    def listAssessmentTemplates(): awsDashSdkLib.libRequestMod.Request[ListAssessmentTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the assessment targets.
       */
    def listAssessmentTemplates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssessmentTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssessmentTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the assessment targets.
       */
    def listAssessmentTemplates(params: ListAssessmentTemplatesRequest): awsDashSdkLib.libRequestMod.Request[ListAssessmentTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the assessment targets.
       */
    def listAssessmentTemplates(
      params: ListAssessmentTemplatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssessmentTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssessmentTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.
       */
    def listEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[ListEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.
       */
    def listEventSubscriptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEventSubscriptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.
       */
    def listEventSubscriptions(params: ListEventSubscriptionsRequest): awsDashSdkLib.libRequestMod.Request[ListEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment template. For more information, see SubscribeToEvent and UnsubscribeFromEvent.
       */
    def listEventSubscriptions(
      params: ListEventSubscriptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEventSubscriptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List exclusions that are generated by the assessment run.
       */
    def listExclusions(): awsDashSdkLib.libRequestMod.Request[ListExclusionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List exclusions that are generated by the assessment run.
       */
    def listExclusions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListExclusionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListExclusionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List exclusions that are generated by the assessment run.
       */
    def listExclusions(params: ListExclusionsRequest): awsDashSdkLib.libRequestMod.Request[ListExclusionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List exclusions that are generated by the assessment run.
       */
    def listExclusions(
      params: ListExclusionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListExclusionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListExclusionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def listFindings(): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def listFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def listFindings(params: ListFindingsRequest): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
       */
    def listFindings(
      params: ListFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available Amazon Inspector rules packages.
       */
    def listRulesPackages(): awsDashSdkLib.libRequestMod.Request[ListRulesPackagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available Amazon Inspector rules packages.
       */
    def listRulesPackages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRulesPackagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRulesPackagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available Amazon Inspector rules packages.
       */
    def listRulesPackages(params: ListRulesPackagesRequest): awsDashSdkLib.libRequestMod.Request[ListRulesPackagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all available Amazon Inspector rules packages.
       */
    def listRulesPackages(
      params: ListRulesPackagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRulesPackagesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRulesPackagesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags associated with an assessment template.
       */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags associated with an assessment template.
       */
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags associated with an assessment template.
       */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags associated with an assessment template.
       */
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
       */
    def previewAgents(): awsDashSdkLib.libRequestMod.Request[PreviewAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
       */
    def previewAgents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PreviewAgentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PreviewAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
       */
    def previewAgents(params: PreviewAgentsRequest): awsDashSdkLib.libRequestMod.Request[PreviewAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
       */
    def previewAgents(
      params: PreviewAgentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PreviewAgentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PreviewAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments.
       */
    def registerCrossAccountAccessRole(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments.
       */
    def registerCrossAccountAccessRole(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments.
       */
    def registerCrossAccountAccessRole(params: RegisterCrossAccountAccessRoleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Registers the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments.
       */
    def registerCrossAccountAccessRole(
      params: RegisterCrossAccountAccessRoleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings where an attribute with the specified key exists.
       */
    def removeAttributesFromFindings(): awsDashSdkLib.libRequestMod.Request[RemoveAttributesFromFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings where an attribute with the specified key exists.
       */
    def removeAttributesFromFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveAttributesFromFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveAttributesFromFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings where an attribute with the specified key exists.
       */
    def removeAttributesFromFindings(params: RemoveAttributesFromFindingsRequest): awsDashSdkLib.libRequestMod.Request[RemoveAttributesFromFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings where an attribute with the specified key exists.
       */
    def removeAttributesFromFindings(
      params: RemoveAttributesFromFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveAttributesFromFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveAttributesFromFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment template.
       */
    def setTagsForResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment template.
       */
    def setTagsForResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment template.
       */
    def setTagsForResource(params: SetTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment template.
       */
    def setTagsForResource(
      params: SetTagsForResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you must not exceed the limit of running up to 500 concurrent agents per AWS account.
       */
    def startAssessmentRun(): awsDashSdkLib.libRequestMod.Request[StartAssessmentRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you must not exceed the limit of running up to 500 concurrent agents per AWS account.
       */
    def startAssessmentRun(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartAssessmentRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartAssessmentRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you must not exceed the limit of running up to 500 concurrent agents per AWS account.
       */
    def startAssessmentRun(params: StartAssessmentRunRequest): awsDashSdkLib.libRequestMod.Request[StartAssessmentRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you must not exceed the limit of running up to 500 concurrent agents per AWS account.
       */
    def startAssessmentRun(
      params: StartAssessmentRunRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartAssessmentRunResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartAssessmentRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops the assessment run that is specified by the ARN of the assessment run.
       */
    def stopAssessmentRun(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops the assessment run that is specified by the ARN of the assessment run.
       */
    def stopAssessmentRun(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops the assessment run that is specified by the ARN of the assessment run.
       */
    def stopAssessmentRun(params: StopAssessmentRunRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops the assessment run that is specified by the ARN of the assessment run.
       */
    def stopAssessmentRun(
      params: StopAssessmentRunRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
       */
    def subscribeToEvent(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
       */
    def subscribeToEvent(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
       */
    def subscribeToEvent(params: SubscribeToEventRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
       */
    def subscribeToEvent(
      params: SubscribeToEventRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
       */
    def unsubscribeFromEvent(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
       */
    def unsubscribeFromEvent(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
       */
    def unsubscribeFromEvent(params: UnsubscribeFromEventRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to a specified SNS topic.
       */
    def unsubscribeFromEvent(
      params: UnsubscribeFromEventRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the assessment target that is specified by the ARN of the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
       */
    def updateAssessmentTarget(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the assessment target that is specified by the ARN of the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
       */
    def updateAssessmentTarget(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the assessment target that is specified by the ARN of the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
       */
    def updateAssessmentTarget(params: UpdateAssessmentTargetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the assessment target that is specified by the ARN of the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
       */
    def updateAssessmentTarget(
      params: UpdateAssessmentTargetRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UnsubscribeFromEventRequest extends js.Object {
    /**
         * The event for which you want to stop receiving SNS notifications.
         */
    var event: InspectorEvent
    /**
         * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS notifications.
         */
    var resourceArn: Arn
    /**
         * The ARN of the SNS topic to which SNS notifications are sent.
         */
    var topicArn: Arn
  }
  
  
  trait UpdateAssessmentTargetRequest extends js.Object {
    /**
         * The ARN of the assessment target that you want to update.
         */
    var assessmentTargetArn: Arn
    /**
         * The name of the assessment target that you want to update.
         */
    var assessmentTargetName: AssessmentTargetName
    /**
         * The ARN of the resource group that is used to specify the new resource group to associate with the assessment target.
         */
    var resourceGroupArn: js.UndefOr[Arn] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AddRemoveAttributesFindingArnList = js.Array[Arn]
  type AgentHealth = awsDashSdkLib.awsDashSdkLibStrings.HEALTHY | awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY | awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN | java.lang.String
  type AgentHealthCode = awsDashSdkLib.awsDashSdkLibStrings.IDLE | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.SHUTDOWN | awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY | awsDashSdkLib.awsDashSdkLibStrings.THROTTLED | awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN | java.lang.String
  type AgentHealthCodeList = js.Array[AgentHealthCode]
  type AgentHealthList = js.Array[AgentHealth]
  type AgentId = java.lang.String
  type AgentIdList = js.Array[AgentId]
  type AgentPreviewList = js.Array[AgentPreview]
  type AgentVersion = java.lang.String
  type AmiId = java.lang.String
  type Arn = java.lang.String
  type ArnCount = scala.Double
  type AssessmentRulesPackageArnList = js.Array[Arn]
  type AssessmentRunAgentList = js.Array[AssessmentRunAgent]
  type AssessmentRunDuration = scala.Double
  type AssessmentRunList = js.Array[AssessmentRun]
  type AssessmentRunName = java.lang.String
  type AssessmentRunNotificationList = js.Array[AssessmentRunNotification]
  type AssessmentRunNotificationSnsStatusCode = awsDashSdkLib.awsDashSdkLibStrings.SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.TOPIC_DOES_NOT_EXIST | awsDashSdkLib.awsDashSdkLibStrings.ACCESS_DENIED | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | java.lang.String
  type AssessmentRunState = awsDashSdkLib.awsDashSdkLibStrings.CREATED | awsDashSdkLib.awsDashSdkLibStrings.START_DATA_COLLECTION_PENDING | awsDashSdkLib.awsDashSdkLibStrings.START_DATA_COLLECTION_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.COLLECTING_DATA | awsDashSdkLib.awsDashSdkLibStrings.STOP_DATA_COLLECTION_PENDING | awsDashSdkLib.awsDashSdkLibStrings.DATA_COLLECTED | awsDashSdkLib.awsDashSdkLibStrings.START_EVALUATING_RULES_PENDING | awsDashSdkLib.awsDashSdkLibStrings.EVALUATING_RULES | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.ERROR | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED_WITH_ERRORS | awsDashSdkLib.awsDashSdkLibStrings.CANCELED | java.lang.String
  type AssessmentRunStateChangeList = js.Array[AssessmentRunStateChange]
  type AssessmentRunStateList = js.Array[AssessmentRunState]
  type AssessmentTargetList = js.Array[AssessmentTarget]
  type AssessmentTargetName = java.lang.String
  type AssessmentTemplateList = js.Array[AssessmentTemplate]
  type AssessmentTemplateName = java.lang.String
  type AssessmentTemplateRulesPackageArnList = js.Array[Arn]
  type AssetType = awsDashSdkLib.awsDashSdkLibStrings.`ec2-instance` | java.lang.String
  type AttributeKey = java.lang.String
  type AttributeList = js.Array[Attribute]
  type AttributeValue = java.lang.String
  type AutoScalingGroup = java.lang.String
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type BatchDescribeArnList = js.Array[Arn]
  type BatchDescribeExclusionsArnList = js.Array[Arn]
  type Bool = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EventSubscriptionList = js.Array[EventSubscription]
  type ExclusionPreviewList = js.Array[ExclusionPreview]
  type FailedItemErrorCode = awsDashSdkLib.awsDashSdkLibStrings.INVALID_ARN | awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE_ARN | awsDashSdkLib.awsDashSdkLibStrings.ITEM_DOES_NOT_EXIST | awsDashSdkLib.awsDashSdkLibStrings.ACCESS_DENIED | awsDashSdkLib.awsDashSdkLibStrings.LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | java.lang.String
  type FilterRulesPackageArnList = js.Array[Arn]
  type FindingCount = scala.Double
  type FindingId = java.lang.String
  type FindingList = js.Array[Finding]
  type Hostname = java.lang.String
  type InspectorEvent = awsDashSdkLib.awsDashSdkLibStrings.ASSESSMENT_RUN_STARTED | awsDashSdkLib.awsDashSdkLibStrings.ASSESSMENT_RUN_COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.ASSESSMENT_RUN_STATE_CHANGED | awsDashSdkLib.awsDashSdkLibStrings.FINDING_REPORTED | awsDashSdkLib.awsDashSdkLibStrings.OTHER | java.lang.String
  type IocConfidence = scala.Double
  type Ipv4Address = java.lang.String
  type Ipv4AddressList = js.Array[Ipv4Address]
  type Ipv6Addresses = js.Array[Text]
  type KernelVersion = java.lang.String
  type ListEventSubscriptionsMaxResults = scala.Double
  type ListMaxResults = scala.Double
  type ListParentArnList = js.Array[Arn]
  type ListReturnedArnList = js.Array[Arn]
  type Locale = awsDashSdkLib.awsDashSdkLibStrings.EN_US | java.lang.String
  type Long = scala.Double
  type Message = java.lang.String
  type MessageType = java.lang.String
  type NamePattern = java.lang.String
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NumericSeverity = scala.Double
  type NumericVersion = scala.Double
  type OperatingSystem = java.lang.String
  type PaginationToken = java.lang.String
  type PreviewAgentsMaxResults = scala.Double
  type PreviewStatus = awsDashSdkLib.awsDashSdkLibStrings.WORK_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | java.lang.String
  type PrivateIpAddresses = js.Array[PrivateIp]
  type ProviderName = java.lang.String
  type ReportFileFormat = awsDashSdkLib.awsDashSdkLibStrings.HTML | awsDashSdkLib.awsDashSdkLibStrings.PDF | java.lang.String
  type ReportStatus = awsDashSdkLib.awsDashSdkLibStrings.WORK_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | java.lang.String
  type ReportType = awsDashSdkLib.awsDashSdkLibStrings.FINDING | awsDashSdkLib.awsDashSdkLibStrings.FULL | java.lang.String
  type ResourceGroupList = js.Array[ResourceGroup]
  type ResourceGroupTags = js.Array[ResourceGroupTag]
  type RuleName = java.lang.String
  type RuleNameList = js.Array[RuleName]
  type RulesPackageList = js.Array[RulesPackage]
  type RulesPackageName = java.lang.String
  type ScopeList = js.Array[Scope]
  type ScopeType = awsDashSdkLib.awsDashSdkLibStrings.INSTANCE_ID | awsDashSdkLib.awsDashSdkLibStrings.RULES_PACKAGE_ARN | java.lang.String
  type ScopeValue = java.lang.String
  type SecurityGroups = js.Array[SecurityGroup]
  type ServiceName = java.lang.String
  type Severity = awsDashSdkLib.awsDashSdkLibStrings.Low | awsDashSdkLib.awsDashSdkLibStrings.Medium | awsDashSdkLib.awsDashSdkLibStrings.High | awsDashSdkLib.awsDashSdkLibStrings.Informational | awsDashSdkLib.awsDashSdkLibStrings.Undefined | java.lang.String
  type SeverityList = js.Array[Severity]
  type StopAction = awsDashSdkLib.awsDashSdkLibStrings.START_EVALUATION | awsDashSdkLib.awsDashSdkLibStrings.SKIP_EVALUATION | java.lang.String
  type SubscriptionList = js.Array[Subscription]
  type TagKey = java.lang.String
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TelemetryMetadataList = js.Array[TelemetryMetadata]
  type Text = java.lang.String
  type Timestamp = stdLib.Date
  type UUID = java.lang.String
  type Url = java.lang.String
  type UserAttributeKeyList = js.Array[AttributeKey]
  type UserAttributeList = js.Array[Attribute]
  type Version = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2015-08-18` | awsDashSdkLib.awsDashSdkLibStrings.`2016-02-16` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

