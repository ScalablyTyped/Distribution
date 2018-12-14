package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/securityhub", "SecurityHub")
@js.native
object SecurityHubNs extends js.Object {
  
  trait AcceptInvitationRequest extends js.Object {
    /**
         * The ID of the invitation that is sent to the AWS account by the Security Hub master account. 
         */
    var InvitationId: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The account ID of the master Security Hub account whose invitation you're accepting. 
         */
    var MasterId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait AcceptInvitationResponse extends js.Object
  
  
  trait AccountDetails extends js.Object {
    /**
         * The ID of an AWS account.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The email of an AWS account.
         */
    var Email: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait AwsEc2InstanceDetails extends js.Object {
    /**
         * The IAM profile ARN of the instance.
         */
    var IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The Amazon Machine Image (AMI) ID of the instance.
         */
    var ImageId: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The IPv4 addresses associated with the instance.
         */
    var IpV4Addresses: js.UndefOr[StringList] = js.undefined
    /**
         * The IPv6 addresses associated with the instance.
         */
    var IpV6Addresses: js.UndefOr[StringList] = js.undefined
    /**
         * The key name associated with the instance.
         */
    var KeyName: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The date/time the instance was launched.
         */
    var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The identifier of the subnet in which the instance was launched.
         */
    var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The instance type of the instance. 
         */
    var Type: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The identifier of the VPC in which the instance was launched.
         */
    var VpcId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait AwsIamAccessKeyDetails extends js.Object {
    /**
         * The creation date/time of the IAM access key related to a finding.
         */
    var CreatedAt: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The status of the IAM access key related to a finding.
         */
    var Status: js.UndefOr[AwsIamAccessKeyStatus] = js.undefined
    /**
         * The user associated with the IAM access key related to a finding.
         */
    var UserName: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait AwsS3BucketDetails extends js.Object {
    /**
         * The canonical user ID of the owner of the S3 bucket.
         */
    var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The display name of the owner of the S3 bucket.
         */
    var OwnerName: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait AwsSecurityFinding extends js.Object {
    /**
         * The AWS account ID in which a finding is generated.
         */
    var AwsAccountId: NonEmptyString
    /**
         * This data type is exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard (for example, AWS CIS Foundations). Contains compliance-related finding details.
         */
    var Compliance: js.UndefOr[Compliance] = js.undefined
    /**
         * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale. 0 equates zero percent confidence and 100 equates to 100 percent confidence.
         */
    var Confidence: js.UndefOr[Integer] = js.undefined
    /**
         * An ISO8601-formatted timestamp that indicates when the potential security issue captured by a finding was created by the security findings provider.
         */
    var CreatedAt: NonEmptyString
    /**
         * The level of importance assigned to the resources associated with the finding. A score of 0 means the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
         */
    var Criticality: js.UndefOr[Integer] = js.undefined
    /**
         * A finding's description.
         */
    var Description: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * An ISO8601-formatted timestamp that indicates when the potential security issue captured by a finding was first observed by the security findings provider.
         */
    var FirstObservedAt: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * This is the identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security findings provider's solutions, this generator can be called a rule, a check, a detector, a plug-in, etc. 
         */
    var GeneratorId: NonEmptyString
    /**
         * The security findings provider-specific identifier for a finding.
         */
    var Id: NonEmptyString
    /**
         * An ISO8601-formatted timestamp that indicates when the potential security issue captured by a finding was most recently observed by the security findings provider.
         */
    var LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * A list of malware related to a finding.
         */
    var Malware: js.UndefOr[MalwareList] = js.undefined
    /**
         * The details of network-related information about a finding.
         */
    var Network: js.UndefOr[Network] = js.undefined
    /**
         * A user-defined note added to a finding.
         */
    var Note: js.UndefOr[Note] = js.undefined
    /**
         * The details of process-related information about a finding.
         */
    var Process: js.UndefOr[ProcessDetails] = js.undefined
    /**
         * The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) once this provider's product (solution that generates findings) is registered with Security Hub. 
         */
    var ProductArn: NonEmptyString
    /**
         * A data type where security findings providers can include additional solution-specific details that are not part of the defined AwsSecurityFinding format.
         */
    var ProductFields: js.UndefOr[FieldMap] = js.undefined
    /**
         * The record state of a finding.
         */
    var RecordState: js.UndefOr[RecordState] = js.undefined
    /**
         * A list of related findings.
         */
    var RelatedFindings: js.UndefOr[RelatedFindingList] = js.undefined
    /**
         * An data type that describes the remediation options for a finding.
         */
    var Remediation: js.UndefOr[Remediation] = js.undefined
    /**
         * A set of resource data types that describe the resources to which the finding refers.
         */
    var Resources: ResourceList
    /**
         * The schema version for which a finding is formatted.
         */
    var SchemaVersion: NonEmptyString
    /**
         * A finding's severity.
         */
    var Severity: Severity
    /**
         * A URL that links to a page about the current finding in the security findings provider's solution.
         */
    var SourceUrl: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Threat intel details related to a finding.
         */
    var ThreatIntelIndicators: js.UndefOr[ThreatIntelIndicatorList] = js.undefined
    /**
         * A finding's title.
         */
    var Title: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * One or more finding types in the format of 'namespace/category/classifier' that classify a finding. Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive Data Identifications
         */
    var Types: TypeList
    /**
         * An ISO8601-formatted timestamp that indicates when the finding record was last updated by the security findings provider. 
         */
    var UpdatedAt: NonEmptyString
    /**
         * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. 
         */
    var UserDefinedFields: js.UndefOr[FieldMap] = js.undefined
    /**
         * Indicates the veracity of a finding. 
         */
    var VerificationState: js.UndefOr[VerificationState] = js.undefined
    /**
         * The workflow state of a finding. 
         */
    var WorkflowState: js.UndefOr[WorkflowState] = js.undefined
  }
  
  
  trait AwsSecurityFindingFilters extends js.Object {
    /**
         * The AWS account ID in which a finding is generated.
         */
    var AwsAccountId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The name of the findings provider (company) that owns the solution (product) that generates findings.
         */
    var CompanyName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard (for example, AWS CIS Foundations). Contains compliance-related finding details.
         */
    var ComplianceStatus: js.UndefOr[StringFilterList] = js.undefined
    /**
         * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale. 0 equates zero percent confidence and 100 equates to 100 percent confidence.
         */
    var Confidence: js.UndefOr[NumberFilterList] = js.undefined
    /**
         * An ISO8601-formatted timestamp that indicates when the potential security issue captured by a finding was created by the security findings provider.
         */
    var CreatedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The level of importance assigned to the resources associated with the finding. A score of 0 means the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
         */
    var Criticality: js.UndefOr[NumberFilterList] = js.undefined
    /**
         * A finding's description.
         */
    var Description: js.UndefOr[StringFilterList] = js.undefined
    /**
         * An ISO8601-formatted timestamp that indicates when the potential security issue captured by a finding was first observed by the security findings provider.
         */
    var FirstObservedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * This is the identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security findings provider's solutions, this generator can be called a rule, a check, a detector, a plug-in, etc.
         */
    var GeneratorId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The security findings provider-specific identifier for a finding.
         */
    var Id: js.UndefOr[StringFilterList] = js.undefined
    /**
         * A keyword for a finding.
         */
    var Keyword: js.UndefOr[KeywordFilterList] = js.undefined
    /**
         * An ISO8601-formatted timestamp that indicates when the potential security issue captured by a finding was most recently observed by the security findings provider.
         */
    var LastObservedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The name of the malware that was observed.
         */
    var MalwareName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The filesystem path of the malware that was observed.
         */
    var MalwarePath: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The state of the malware that was observed.
         */
    var MalwareState: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The type of the malware that was observed.
         */
    var MalwareType: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The destination domain of network-related information about a finding.
         */
    var NetworkDestinationDomain: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The destination IPv4 address of network-related information about a finding.
         */
    var NetworkDestinationIpV4: js.UndefOr[IpFilterList] = js.undefined
    /**
         * The destination IPv6 address of network-related information about a finding.
         */
    var NetworkDestinationIpV6: js.UndefOr[IpFilterList] = js.undefined
    /**
         * The destination port of network-related information about a finding.
         */
    var NetworkDestinationPort: js.UndefOr[NumberFilterList] = js.undefined
    /**
         * Indicates the direction of network traffic associated with a finding.
         */
    var NetworkDirection: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The protocol of network-related information about a finding.
         */
    var NetworkProtocol: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The source domain of network-related information about a finding.
         */
    var NetworkSourceDomain: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The source IPv4 address of network-related information about a finding.
         */
    var NetworkSourceIpV4: js.UndefOr[IpFilterList] = js.undefined
    /**
         * The source IPv6 address of network-related information about a finding.
         */
    var NetworkSourceIpV6: js.UndefOr[IpFilterList] = js.undefined
    /**
         * The source media access control (MAC) address of network-related information about a finding.
         */
    var NetworkSourceMac: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The source port of network-related information about a finding.
         */
    var NetworkSourcePort: js.UndefOr[NumberFilterList] = js.undefined
    /**
         * The text of a note.
         */
    var NoteText: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The timestamp of when the note was updated.
         */
    var NoteUpdatedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The principal that created a note.
         */
    var NoteUpdatedBy: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The date/time that the process was launched.
         */
    var ProcessLaunchedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The name of the process.
         */
    var ProcessName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The parent process ID.
         */
    var ProcessParentPid: js.UndefOr[NumberFilterList] = js.undefined
    /**
         * The path to the process executable.
         */
    var ProcessPath: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The process ID.
         */
    var ProcessPid: js.UndefOr[NumberFilterList] = js.undefined
    /**
         * The date/time that the process was terminated.
         */
    var ProcessTerminatedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) once this provider's product (solution that generates findings) is registered with Security Hub.
         */
    var ProductArn: js.UndefOr[StringFilterList] = js.undefined
    /**
         * A data type where security findings providers can include additional solution-specific details that are not part of the defined AwsSecurityFinding format.
         */
    var ProductFields: js.UndefOr[MapFilterList] = js.undefined
    /**
         * The name of the solution (product) that generates findings.
         */
    var ProductName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The recommendation of what to do about the issue described in a finding.
         */
    var RecommendationText: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The updated record state for the finding.
         */
    var RecordState: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The solution-generated identifier for a related finding.
         */
    var RelatedFindingsId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The ARN of the solution that generated a related finding.
         */
    var RelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The IAM profile ARN of the instance.
         */
    var ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The Amazon Machine Image (AMI) ID of the instance.
         */
    var ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The IPv4 addresses associated with the instance.
         */
    var ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList] = js.undefined
    /**
         * The IPv6 addresses associated with the instance.
         */
    var ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList] = js.undefined
    /**
         * The key name associated with the instance.
         */
    var ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The date/time the instance was launched.
         */
    var ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The identifier of the subnet in which the instance was launched.
         */
    var ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The instance type of the instance.
         */
    var ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The identifier of the VPC in which the instance was launched.
         */
    var ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The creation date/time of the IAM access key related to a finding.
         */
    var ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The status of the IAM access key related to a finding.
         */
    var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The user associated with the IAM access key related to a finding.
         */
    var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The canonical user ID of the owner of the S3 bucket.
         */
    var ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The display name of the owner of the S3 bucket.
         */
    var ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The identifier of the image related to a finding.
         */
    var ResourceContainerImageId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The name of the image related to a finding.
         */
    var ResourceContainerImageName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The date/time that the container was started.
         */
    var ResourceContainerLaunchedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The name of the container related to a finding.
         */
    var ResourceContainerName: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The details of a resource that does not have a specific sub-field for the resource type defined.
         */
    var ResourceDetailsOther: js.UndefOr[MapFilterList] = js.undefined
    /**
         * The canonical identifier for the given resource type.
         */
    var ResourceId: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The canonical AWS partition name to which the region is assigned.
         */
    var ResourcePartition: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The canonical AWS external region name where this resource is located.
         */
    var ResourceRegion: js.UndefOr[StringFilterList] = js.undefined
    /**
         * A list of AWS tags associated with a resource at the time the finding was processed.
         */
    var ResourceTags: js.UndefOr[MapFilterList] = js.undefined
    /**
         * Specifies the type of the resource for which details are provided.
         */
    var ResourceType: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The label of a finding's severity.
         */
    var SeverityLabel: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The normalized severity of a finding.
         */
    var SeverityNormalized: js.UndefOr[NumberFilterList] = js.undefined
    /**
         * The native severity as defined by the security findings provider's solution that generated the finding.
         */
    var SeverityProduct: js.UndefOr[NumberFilterList] = js.undefined
    /**
         * A URL that links to a page about the current finding in the security findings provider's solution.
         */
    var SourceUrl: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The category of a threat intel indicator.
         */
    var ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The date/time of the last observation of a threat intel indicator.
         */
    var ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * The source of the threat intel.
         */
    var ThreatIntelIndicatorSource: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The URL for more details from the source of the threat intel.
         */
    var ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The type of a threat intel indicator.
         */
    var ThreatIntelIndicatorType: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The value of a threat intel indicator.
         */
    var ThreatIntelIndicatorValue: js.UndefOr[StringFilterList] = js.undefined
    /**
         * A finding's title.
         */
    var Title: js.UndefOr[StringFilterList] = js.undefined
    /**
         * A finding type in the format of 'namespace/category/classifier' that classifies a finding.
         */
    var Type: js.UndefOr[StringFilterList] = js.undefined
    /**
         * An ISO8601-formatted timestamp that indicates when the finding record was last updated by the security findings provider. 
         */
    var UpdatedAt: js.UndefOr[DateFilterList] = js.undefined
    /**
         * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. 
         */
    var UserDefinedFields: js.UndefOr[MapFilterList] = js.undefined
    /**
         * Indicates the veracity of a finding. 
         */
    var VerificationState: js.UndefOr[StringFilterList] = js.undefined
    /**
         * The workflow state of a finding.
         */
    var WorkflowState: js.UndefOr[StringFilterList] = js.undefined
  }
  
  
  trait BatchDisableStandardsRequest extends js.Object {
    /**
         * The ARNS of the standards subscriptions that you want to disable.
         */
    var StandardsSubscriptionArns: StandardsSubscriptionArns
  }
  
  
  trait BatchDisableStandardsResponse extends js.Object {
    /**
         * The details of the standards subscriptions that were disabled.
         */
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined
  }
  
  
  trait BatchEnableStandardsRequest extends js.Object {
    /**
         * The list of standards that you want to enable.
         */
    var StandardsSubscriptionRequests: StandardsSubscriptionRequests
  }
  
  
  trait BatchEnableStandardsResponse extends js.Object {
    /**
         * The details of the standards subscriptions that were enabled.
         */
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined
  }
  
  
  trait BatchImportFindingsRequest extends js.Object {
    /**
         * A list of findings that you want to import. Must be submitted in the AWSSecurityFinding format.
         */
    var Findings: AwsSecurityFindingList
  }
  
  
  trait BatchImportFindingsResponse extends js.Object {
    /**
         * The number of findings that cannot be imported.
         */
    var FailedCount: Integer
    /**
         * The list of the findings that cannot be imported.
         */
    var FailedFindings: js.UndefOr[ImportFindingsErrorList] = js.undefined
    /**
         * The number of findings that were successfully imported
         */
    var SuccessCount: Integer
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Compliance extends js.Object {
    /**
         * Indicates the result of a compliance check.
         */
    var Status: js.UndefOr[ComplianceStatus] = js.undefined
  }
  
  
  trait ContainerDetails extends js.Object {
    /**
         * The identifier of the image related to a finding.
         */
    var ImageId: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The name of the image related to a finding.
         */
    var ImageName: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The date/time that the container was started.
         */
    var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The name of the container related to a finding.
         */
    var Name: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait CreateInsightRequest extends js.Object {
    /**
         * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a subset of findings that are included in this insight.
         */
    var Filters: AwsSecurityFindingFilters
    /**
         * The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator for the purposes of viewing and managing multiple related findings under a single operand. 
         */
    var GroupByAttribute: NonEmptyString
    /**
         * The user-defined name that identifies the insight that you want to create.
         */
    var Name: NonEmptyString
  }
  
  
  trait CreateInsightResponse extends js.Object {
    /**
         * The ARN Of the created insight.
         */
    var InsightArn: NonEmptyString
  }
  
  
  trait CreateMembersRequest extends js.Object {
    /**
         * A list of account ID and email address pairs of the accounts that you want to associate with the master Security Hub account.
         */
    var AccountDetails: js.UndefOr[AccountDetailsList] = js.undefined
  }
  
  
  trait CreateMembersResponse extends js.Object {
    /**
         * A list of account ID and email address pairs of the AWS accounts that could not be processed.
         */
    var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
  }
  
  
  trait DateFilter extends js.Object {
    /**
         * A date range for the date filter.
         */
    var DateRange: js.UndefOr[DateRange] = js.undefined
    /**
         * An end date for the date filter.
         */
    var End: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * A start date for the date filter.
         */
    var Start: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait DateRange extends js.Object {
    /**
         * A date range unit for the date filter.
         */
    var Unit: js.UndefOr[DateRangeUnit] = js.undefined
    /**
         * A date range value for the date filter.
         */
    var Value: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait DeclineInvitationsRequest extends js.Object {
    /**
         * A list of account IDs specifying accounts whose invitations to Security Hub you want to decline. 
         */
    var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  }
  
  
  trait DeclineInvitationsResponse extends js.Object {
    /**
         * A list of account ID and email address pairs of the AWS accounts that could not be processed. 
         */
    var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
  }
  
  
  trait DeleteInsightRequest extends js.Object {
    /**
         * The ARN of the insight that you want to delete.
         */
    var InsightArn: NonEmptyString
  }
  
  
  trait DeleteInsightResponse extends js.Object {
    /**
         * The ARN of the insight that was deleted.
         */
    var InsightArn: NonEmptyString
  }
  
  
  trait DeleteInvitationsRequest extends js.Object {
    /**
         * A list of account IDs specifying accounts whose invitations to Security Hub you want to delete. 
         */
    var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  }
  
  
  trait DeleteInvitationsResponse extends js.Object {
    /**
         * A list of account ID and email address pairs of the AWS accounts that could not be processed. 
         */
    var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
  }
  
  
  trait DeleteMembersRequest extends js.Object {
    /**
         * A list of account IDs of the Security Hub member accounts that you want to delete. 
         */
    var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  }
  
  
  trait DeleteMembersResponse extends js.Object {
    /**
         * A list of account ID and email address pairs of the AWS accounts that could not be processed. 
         */
    var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
  }
  
  
  trait DisableImportFindingsForProductRequest extends js.Object {
    /**
         * The ARN of a resource that represents your subscription to a supported product.
         */
    var ProductSubscriptionArn: NonEmptyString
  }
  
  
  trait DisableImportFindingsForProductResponse extends js.Object
  
  
  trait DisableSecurityHubRequest extends js.Object
  
  
  trait DisableSecurityHubResponse extends js.Object
  
  
  trait DisassociateFromMasterAccountRequest extends js.Object
  
  
  trait DisassociateFromMasterAccountResponse extends js.Object
  
  
  trait DisassociateMembersRequest extends js.Object {
    /**
         * The account IDs of the member accounts that you want to disassociate from the master account.
         */
    var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  }
  
  
  trait DisassociateMembersResponse extends js.Object
  
  
  trait EnableImportFindingsForProductRequest extends js.Object {
    /**
         * The ARN of the product that generates findings that you want to import into Security Hub.
         */
    var ProductArn: NonEmptyString
  }
  
  
  trait EnableImportFindingsForProductResponse extends js.Object {
    /**
         * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
         */
    var ProductSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait EnableSecurityHubRequest extends js.Object
  
  
  trait EnableSecurityHubResponse extends js.Object
  
  
  trait FieldMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[NonEmptyString]
  
  
  trait GetEnabledStandardsRequest extends js.Object {
    /**
         * Indicates the maximum number of items that you want in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Paginates results. Set the value of this parameter to NULL on your first call to the GetEnabledStandards operation. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The list of standards subscription ARNS that you want to list and describe.
         */
    var StandardsSubscriptionArns: js.UndefOr[StandardsSubscriptionArns] = js.undefined
  }
  
  
  trait GetEnabledStandardsResponse extends js.Object {
    /**
         * The token that is required for pagination.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The standards subscription details returned by the operation.
         */
    var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined
  }
  
  
  trait GetFindingsRequest extends js.Object {
    /**
         * A collection of attributes that is use for querying findings.
         */
    var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined
    /**
         * Indicates the maximum number of items that you want in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Paginates results. Set the value of this parameter to NULL on your first call to the GetFindings operation. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A collection of attributes used for sorting findings.
         */
    var SortCriteria: js.UndefOr[SortCriteria] = js.undefined
  }
  
  
  trait GetFindingsResponse extends js.Object {
    /**
         * Findings details returned by the operation.
         */
    var Findings: AwsSecurityFindingList
    /**
         * The token that is required for pagination.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetInsightResultsRequest extends js.Object {
    /**
         * The ARN of the insight whose results you want to see.
         */
    var InsightArn: NonEmptyString
  }
  
  
  trait GetInsightResultsResponse extends js.Object {
    /**
         * The insight results returned by the operation.
         */
    var InsightResults: InsightResults
  }
  
  
  trait GetInsightsRequest extends js.Object {
    /**
         * The ARNS of the insights that you want to describe.
         */
    var InsightArns: js.UndefOr[ArnList] = js.undefined
    /**
         * Indicates the maximum number of items that you want in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Paginates results. Set the value of this parameter to NULL on your first call to the GetInsights operation. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetInsightsResponse extends js.Object {
    /**
         * The insights returned by the operation.
         */
    var Insights: InsightList
    /**
         * The token that is required for pagination.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait GetInvitationsCountRequest extends js.Object
  
  
  trait GetInvitationsCountResponse extends js.Object {
    /**
         * The number of all membership invitations sent to this Security Hub member account, not including the currently accepted invitation. 
         */
    var InvitationsCount: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait GetMasterAccountRequest extends js.Object
  
  
  trait GetMasterAccountResponse extends js.Object {
    /**
         * A list of details about the Security Hub master account for the current member account. 
         */
    var Master: js.UndefOr[Invitation] = js.undefined
  }
  
  
  trait GetMembersRequest extends js.Object {
    /**
         * A list of account IDs for the Security Hub member accounts on which you want to return the details. 
         */
    var AccountIds: AccountIdList
  }
  
  
  trait GetMembersResponse extends js.Object {
    /**
         * A list of details about the Security Hub member accounts.
         */
    var Members: js.UndefOr[MemberList] = js.undefined
    /**
         * A list of account ID and email address pairs of the AWS accounts that could not be processed.
         */
    var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
  }
  
  
  trait ImportFindingsError extends js.Object {
    /**
         * The code of the error made during the BatchImportFindings operation. 
         */
    var ErrorCode: NonEmptyString
    /**
         * The message of the error made during the BatchImportFindings operation. 
         */
    var ErrorMessage: NonEmptyString
    /**
         * The id of the error made during the BatchImportFindings operation.
         */
    var Id: NonEmptyString
  }
  
  
  trait Insight extends js.Object {
    /**
         * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a subset of findings that are included in this insight. 
         */
    var Filters: AwsSecurityFindingFilters
    /**
         * The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator for the purposes of viewing and managing multiple related findings under a single operand.
         */
    var GroupByAttribute: NonEmptyString
    /**
         * The ARN of a Security Hub insight.
         */
    var InsightArn: NonEmptyString
    /**
         * The name of a Security Hub insight.
         */
    var Name: NonEmptyString
  }
  
  
  trait InsightResultValue extends js.Object {
    /**
         * The number of findings returned for each GroupByAttributeValue.
         */
    var Count: Integer
    /**
         * The value of the attribute by which the findings are grouped for the insight's whose results are returned by the GetInsightResults operation.
         */
    var GroupByAttributeValue: NonEmptyString
  }
  
  
  trait InsightResults extends js.Object {
    /**
         * The attribute by which the findings are grouped for the insight's whose results are returned by the GetInsightResults operation.
         */
    var GroupByAttribute: NonEmptyString
    /**
         * The ARN of the insight whose results are returned by the GetInsightResults operation.
         */
    var InsightArn: NonEmptyString
    /**
         * The list of insight result values returned by the GetInsightResults operation.
         */
    var ResultValues: InsightResultValueList
  }
  
  
  trait Invitation extends js.Object {
    /**
         * The account ID of the master Security Hub account who sent the invitation. 
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The ID of the invitation sent by the master Security Hub account.
         */
    var InvitationId: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The timestamp of when the invitation was sent.
         */
    var InvitedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The current relationship status between the inviter and invitee accounts.
         */
    var MemberStatus: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait InviteMembersRequest extends js.Object {
    /**
         * A list of IDs of the AWS accounts that you want to invite to Security Hub as members. 
         */
    var AccountIds: js.UndefOr[AccountIdList] = js.undefined
  }
  
  
  trait InviteMembersResponse extends js.Object {
    /**
         * A list of account ID and email address pairs of the AWS accounts that could not be processed. 
         */
    var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
  }
  
  
  trait IpFilter extends js.Object {
    /**
         * Finding's CIDR value.
         */
    var Cidr: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait KeywordFilter extends js.Object {
    /**
         * A value for the keyword.
         */
    var Value: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait ListEnabledProductsForImportRequest extends js.Object {
    /**
         * Indicates the maximum number of items that you want in the response.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Paginates results. Set the value of this parameter to NULL on your first call to the ListEnabledProductsForImport operation. For subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListEnabledProductsForImportResponse extends js.Object {
    /**
         * The token that is required for pagination.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of ARNs for the resources that represent your subscriptions to products. 
         */
    var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.undefined
  }
  
  
  trait ListInvitationsRequest extends js.Object {
    /**
         * Indicates the maximum number of items that you want in the response. 
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Paginates results. Set the value of this parameter to NULL on your first call to the ListInvitations operation. For subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous response to continue listing data. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListInvitationsResponse extends js.Object {
    /**
         * The details of the invitations returned by the operation.
         */
    var Invitations: js.UndefOr[InvitationList] = js.undefined
    /**
         * The token that is required for pagination.
         */
    var NextToken: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait ListMembersRequest extends js.Object {
    /**
         * Indicates the maximum number of items that you want in the response. 
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers operation. For subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous response to continue listing data. 
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Specifies what member accounts the response includes based on their relationship status with the master account. The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member accounts whose relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set to FALSE, the response includes all existing member accounts. 
         */
    var OnlyAssociated: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait ListMembersResponse extends js.Object {
    /**
         * Member details returned by the operation.
         */
    var Members: js.UndefOr[MemberList] = js.undefined
    /**
         * The token that is required for pagination.
         */
    var NextToken: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait Malware extends js.Object {
    /**
         * The name of the malware that was observed.
         */
    var Name: NonEmptyString
    /**
         * The filesystem path of the malware that was observed.
         */
    var Path: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The state of the malware that was observed.
         */
    var State: js.UndefOr[MalwareState] = js.undefined
    /**
         * The type of the malware that was observed.
         */
    var Type: js.UndefOr[MalwareType] = js.undefined
  }
  
  
  trait MapFilter extends js.Object {
    /**
         * Represents the condition to be applied to a key value when querying for findings with a map filter.
         */
    var Comparison: js.UndefOr[MapFilterComparison] = js.undefined
    /**
         * The key of the map filter.
         */
    var Key: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The value for the key in the map filter.
         */
    var Value: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait Member extends js.Object {
    /**
         * The AWS account ID of a Security Hub member account.
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The email of a Security Hub member account.
         */
    var Email: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Time stamp at which the member account was invited to Security Hub.
         */
    var InvitedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The AWS account ID of the master Security Hub account to this member account.
         */
    var MasterId: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The status of the relationship between the member account and its master account. 
         */
    var MemberStatus: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Time stamp at which this member account was updated.
         */
    var UpdatedAt: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait Network extends js.Object {
    /**
         * The destination domain of network-related information about a finding.
         */
    var DestinationDomain: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The destination IPv4 address of network-related information about a finding.
         */
    var DestinationIpV4: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The destination IPv6 address of network-related information about a finding.
         */
    var DestinationIpV6: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The destination port of network-related information about a finding.
         */
    var DestinationPort: js.UndefOr[Integer] = js.undefined
    /**
         * Indicates the direction of network traffic associated with a finding.
         */
    var Direction: js.UndefOr[NetworkDirection] = js.undefined
    /**
         * The protocol of network-related information about a finding.
         */
    var Protocol: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The source domain of network-related information about a finding.
         */
    var SourceDomain: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The source IPv4 address of network-related information about a finding.
         */
    var SourceIpV4: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The source IPv6 address of network-related information about a finding.
         */
    var SourceIpV6: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The source media access control (MAC) address of network-related information about a finding.
         */
    var SourceMac: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The source port of network-related information about a finding.
         */
    var SourcePort: js.UndefOr[Integer] = js.undefined
  }
  
  
  trait Note extends js.Object {
    /**
         * The text of a note.
         */
    var Text: NonEmptyString
    /**
         * The timestamp of when the note was updated.
         */
    var UpdatedAt: NonEmptyString
    /**
         * The principal that created a note.
         */
    var UpdatedBy: NonEmptyString
  }
  
  
  trait NoteUpdate extends js.Object {
    /**
         * The updated note text.
         */
    var Text: NonEmptyString
    /**
         * The principal that updated the note.
         */
    var UpdatedBy: NonEmptyString
  }
  
  
  trait NumberFilter extends js.Object {
    /**
         * Represents the "equal to" condition to be applied to a single field when querying for findings.
         */
    var Eq: js.UndefOr[Double] = js.undefined
    /**
         * Represents the "greater than equal" condition to be applied to a single field when querying for findings. 
         */
    var Gte: js.UndefOr[Double] = js.undefined
    /**
         * Represents the "less than equal" condition to be applied to a single field when querying for findings. 
         */
    var Lte: js.UndefOr[Double] = js.undefined
  }
  
  
  trait ProcessDetails extends js.Object {
    /**
         * The date/time that the process was launched.
         */
    var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The name of the process.
         */
    var Name: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The parent process ID.
         */
    var ParentPid: js.UndefOr[Integer] = js.undefined
    /**
         * The path to the process executable.
         */
    var Path: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The process ID.
         */
    var Pid: js.UndefOr[Integer] = js.undefined
    /**
         * The date/time that the process was terminated.
         */
    var TerminatedAt: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait Recommendation extends js.Object {
    /**
         * The recommendation of what to do about the issue described in a finding. 
         */
    var Text: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * A URL to link to general remediation information for the finding type of a finding. 
         */
    var Url: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait RelatedFinding extends js.Object {
    /**
         * The solution-generated identifier for a related finding.
         */
    var Id: NonEmptyString
    /**
         * The ARN of the solution that generated a related finding.
         */
    var ProductArn: NonEmptyString
  }
  
  
  trait Remediation extends js.Object {
    /**
         * Provides a recommendation on how to remediate the issue identified within a finding.
         */
    var Recommendation: js.UndefOr[Recommendation] = js.undefined
  }
  
  
  trait Resource extends js.Object {
    /**
         * Provides additional details about the resource.
         */
    var Details: js.UndefOr[ResourceDetails] = js.undefined
    /**
         * The canonical identifier for the given resource type.
         */
    var Id: NonEmptyString
    /**
         * The canonical AWS partition name to which the region is assigned.
         */
    var Partition: js.UndefOr[Partition] = js.undefined
    /**
         * The canonical AWS external region name where this resource is located.
         */
    var Region: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * A list of AWS tags associated with a resource at the time the finding was processed.
         */
    var Tags: js.UndefOr[FieldMap] = js.undefined
    /**
         * Specifies the type of the resource for which details are provided.
         */
    var Type: NonEmptyString
  }
  
  
  trait ResourceDetails extends js.Object {
    /**
         * The details of an AWS EC2 instance.
         */
    var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined
    /**
         * AWS IAM access key details related to a finding.
         */
    var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.undefined
    /**
         * The details of an AWS S3 Bucket.
         */
    var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.undefined
    /**
         * Container details related to a finding.
         */
    var Container: js.UndefOr[ContainerDetails] = js.undefined
    /**
         * The details of a resource that does not have a specific sub-field for the resource type defined.
         */
    var Other: js.UndefOr[FieldMap] = js.undefined
  }
  
  
  trait Result extends js.Object {
    /**
         * An ID of the AWS account that could not be processed. 
         */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
         * The reason for why an account could not be processed.
         */
    var ProcessingResult: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait Severity extends js.Object {
    /**
         * The normalized severity of a finding.
         */
    var Normalized: Integer
    /**
         * The native severity as defined by the security findings provider's solution that generated the finding.
         */
    var Product: js.UndefOr[Double] = js.undefined
  }
  
  
  trait SortCriterion extends js.Object {
    /**
         * The finding attribute used for sorting findings.
         */
    var Field: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The order used for sorting findings.
         */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  
  trait StandardsInputParameterMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[NonEmptyString]
  
  
  trait StandardsSubscription extends js.Object {
    /**
         * The ARN of a standard.
         */
    var StandardsArn: NonEmptyString
    /**
         * 
         */
    var StandardsInput: StandardsInputParameterMap
    /**
         * The standard's status.
         */
    var StandardsStatus: StandardsStatus
    /**
         * The ARN of a resource that represents your subscription to a supported standard.
         */
    var StandardsSubscriptionArn: NonEmptyString
  }
  
  
  trait StandardsSubscriptionRequest extends js.Object {
    /**
         * The ARN of the standard that you want to enable.
         */
    var StandardsArn: NonEmptyString
    /**
         * 
         */
    var StandardsInput: js.UndefOr[StandardsInputParameterMap] = js.undefined
  }
  
  
  trait StringFilter extends js.Object {
    /**
         * Represents the condition to be applied to a string value when querying for findings. 
         */
    var Comparison: js.UndefOr[StringFilterComparison] = js.undefined
    /**
         * The string filter value.
         */
    var Value: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait ThreatIntelIndicator extends js.Object {
    /**
         * The category of a threat intel indicator.
         */
    var Category: js.UndefOr[ThreatIntelIndicatorCategory] = js.undefined
    /**
         * The date/time of the last observation of a threat intel indicator.
         */
    var LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The source of the threat intel.
         */
    var Source: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The URL for more details from the source of the threat intel.
         */
    var SourceUrl: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The type of a threat intel indicator.
         */
    var Type: js.UndefOr[ThreatIntelIndicatorType] = js.undefined
    /**
         * The value of a threat intel indicator.
         */
    var Value: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Accepts the invitation to be monitored by a master SecurityHub account.
       */
    def acceptInvitation(): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts the invitation to be monitored by a master SecurityHub account.
       */
    def acceptInvitation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptInvitationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts the invitation to be monitored by a master SecurityHub account.
       */
    def acceptInvitation(params: AcceptInvitationRequest): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Accepts the invitation to be monitored by a master SecurityHub account.
       */
    def acceptInvitation(
      params: AcceptInvitationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptInvitationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
       */
    def batchDisableStandards(): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
       */
    def batchDisableStandards(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDisableStandardsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
       */
    def batchDisableStandards(params: BatchDisableStandardsRequest): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
       */
    def batchDisableStandards(
      params: BatchDisableStandardsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDisableStandardsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDisableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
       */
    def batchEnableStandards(): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
       */
    def batchEnableStandards(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchEnableStandardsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
       */
    def batchEnableStandards(params: BatchEnableStandardsRequest): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status against security industry (including AWS) best practices. 
       */
    def batchEnableStandards(
      params: BatchEnableStandardsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchEnableStandardsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchEnableStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Imports security findings that are generated by the integrated third-party products into Security Hub.
       */
    def batchImportFindings(): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Imports security findings that are generated by the integrated third-party products into Security Hub.
       */
    def batchImportFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchImportFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Imports security findings that are generated by the integrated third-party products into Security Hub.
       */
    def batchImportFindings(params: BatchImportFindingsRequest): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Imports security findings that are generated by the integrated third-party products into Security Hub.
       */
    def batchImportFindings(
      params: BatchImportFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchImportFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchImportFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention or intervention.
       */
    def createInsight(): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention or intervention.
       */
    def createInsight(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInsightResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention or intervention.
       */
    def createInsight(params: CreateInsightRequest): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention or intervention.
       */
    def createInsight(
      params: CreateInsightRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInsightResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account) that has Security Hub enabled.
       */
    def createMembers(): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account) that has Security Hub enabled.
       */
    def createMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account) that has Security Hub enabled.
       */
    def createMembers(params: CreateMembersRequest): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account) that has Security Hub enabled.
       */
    def createMembers(
      params: CreateMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by the account IDs. 
       */
    def declineInvitations(): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by the account IDs. 
       */
    def declineInvitations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeclineInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by the account IDs. 
       */
    def declineInvitations(params: DeclineInvitationsRequest): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by the account IDs. 
       */
    def declineInvitations(
      params: DeclineInvitationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeclineInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeclineInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an insight that is specified by the insight ARN.
       */
    def deleteInsight(): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an insight that is specified by the insight ARN.
       */
    def deleteInsight(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInsightResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an insight that is specified by the insight ARN.
       */
    def deleteInsight(params: DeleteInsightRequest): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an insight that is specified by the insight ARN.
       */
    def deleteInsight(
      params: DeleteInsightRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInsightResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by their account IDs. 
       */
    def deleteInvitations(): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by their account IDs. 
       */
    def deleteInvitations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by their account IDs. 
       */
    def deleteInvitations(params: DeleteInvitationsRequest): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified by their account IDs. 
       */
    def deleteInvitations(
      params: DeleteInvitationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the Security Hub member accounts that are specified by the account IDs.
       */
    def deleteMembers(): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the Security Hub member accounts that are specified by the account IDs.
       */
    def deleteMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the Security Hub member accounts that are specified by the account IDs.
       */
    def deleteMembers(params: DeleteMembersRequest): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the Security Hub member accounts that are specified by the account IDs.
       */
    def deleteMembers(
      params: DeleteMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops you from being able to import findings generated by integrated third-party providers into Security Hub.
       */
    def disableImportFindingsForProduct(): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops you from being able to import findings generated by integrated third-party providers into Security Hub.
       */
    def disableImportFindingsForProduct(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableImportFindingsForProductResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops you from being able to import findings generated by integrated third-party providers into Security Hub.
       */
    def disableImportFindingsForProduct(params: DisableImportFindingsForProductRequest): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Stops you from being able to import findings generated by integrated third-party providers into Security Hub.
       */
    def disableImportFindingsForProduct(
      params: DisableImportFindingsForProductRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableImportFindingsForProductResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the AWS Security Hub Service.
       */
    def disableSecurityHub(): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the AWS Security Hub Service.
       */
    def disableSecurityHub(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableSecurityHubResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the AWS Security Hub Service.
       */
    def disableSecurityHub(params: DisableSecurityHubRequest): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the AWS Security Hub Service.
       */
    def disableSecurityHub(
      params: DisableSecurityHubRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableSecurityHubResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates the current Security Hub member account from its master account.
       */
    def disassociateFromMasterAccount(): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates the current Security Hub member account from its master account.
       */
    def disassociateFromMasterAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateFromMasterAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates the current Security Hub member account from its master account.
       */
    def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates the current Security Hub member account from its master account.
       */
    def disassociateFromMasterAccount(
      params: DisassociateFromMasterAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateFromMasterAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateFromMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account. 
       */
    def disassociateMembers(): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account. 
       */
    def disassociateMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account. 
       */
    def disassociateMembers(params: DisassociateMembersRequest): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account. 
       */
    def disassociateMembers(
      params: DisassociateMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables you to import findings generated by integrated third-party providers into Security Hub.
       */
    def enableImportFindingsForProduct(): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables you to import findings generated by integrated third-party providers into Security Hub.
       */
    def enableImportFindingsForProduct(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableImportFindingsForProductResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables you to import findings generated by integrated third-party providers into Security Hub.
       */
    def enableImportFindingsForProduct(params: EnableImportFindingsForProductRequest): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables you to import findings generated by integrated third-party providers into Security Hub.
       */
    def enableImportFindingsForProduct(
      params: EnableImportFindingsForProductRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableImportFindingsForProductResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableImportFindingsForProductResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the AWS Security Hub service.
       */
    def enableSecurityHub(): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the AWS Security Hub service.
       */
    def enableSecurityHub(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableSecurityHubResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the AWS Security Hub service.
       */
    def enableSecurityHub(params: EnableSecurityHubRequest): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the AWS Security Hub service.
       */
    def enableSecurityHub(
      params: EnableSecurityHubRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableSecurityHubResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableSecurityHubResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes enabled standards.
       */
    def getEnabledStandards(): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes enabled standards.
       */
    def getEnabledStandards(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEnabledStandardsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes enabled standards.
       */
    def getEnabledStandards(params: GetEnabledStandardsRequest): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes enabled standards.
       */
    def getEnabledStandards(
      params: GetEnabledStandardsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEnabledStandardsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEnabledStandardsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
       */
    def getFindings(): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
       */
    def getFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
       */
    def getFindings(params: GetFindingsRequest): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
       */
    def getFindings(
      params: GetFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the results of the Security Hub insight specified by the insight ARN.
       */
    def getInsightResults(): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the results of the Security Hub insight specified by the insight ARN.
       */
    def getInsightResults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInsightResultsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the results of the Security Hub insight specified by the insight ARN.
       */
    def getInsightResults(params: GetInsightResultsRequest): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the results of the Security Hub insight specified by the insight ARN.
       */
    def getInsightResults(
      params: GetInsightResultsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInsightResultsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInsightResultsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes insights that are specified by insight ARNs.
       */
    def getInsights(): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes insights that are specified by insight ARNs.
       */
    def getInsights(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInsightsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes insights that are specified by insight ARNs.
       */
    def getInsights(params: GetInsightsRequest): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists and describes insights that are specified by insight ARNs.
       */
    def getInsights(
      params: GetInsightsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInsightsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInsightsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
       */
    def getInvitationsCount(): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
       */
    def getInvitationsCount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvitationsCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
       */
    def getInvitationsCount(params: GetInvitationsCountRequest): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
       */
    def getInvitationsCount(
      params: GetInvitationsCountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvitationsCountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvitationsCountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the details for the Security Hub master account to the current member account. 
       */
    def getMasterAccount(): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the details for the Security Hub master account to the current member account. 
       */
    def getMasterAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMasterAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the details for the Security Hub master account to the current member account. 
       */
    def getMasterAccount(params: GetMasterAccountRequest): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides the details for the Security Hub master account to the current member account. 
       */
    def getMasterAccount(
      params: GetMasterAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMasterAccountResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMasterAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details on the Security Hub member accounts that are specified by the account IDs. 
       */
    def getMembers(): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details on the Security Hub member accounts that are specified by the account IDs. 
       */
    def getMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details on the Security Hub member accounts that are specified by the account IDs. 
       */
    def getMembers(params: GetMembersRequest): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the details on the Security Hub member accounts that are specified by the account IDs. 
       */
    def getMembers(
      params: GetMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account accepts the invitation and becomes a member account, the master account can view Security Hub findings of the member account. 
       */
    def inviteMembers(): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account accepts the invitation and becomes a member account, the master account can view Security Hub findings of the member account. 
       */
    def inviteMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InviteMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account accepts the invitation and becomes a member account, the master account can view Security Hub findings of the member account. 
       */
    def inviteMembers(params: InviteMembersRequest): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account accepts the invitation and becomes a member account, the master account can view Security Hub findings of the member account. 
       */
    def inviteMembers(
      params: InviteMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InviteMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InviteMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Security Hub-integrated third-party findings providers.
       */
    def listEnabledProductsForImport(): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Security Hub-integrated third-party findings providers.
       */
    def listEnabledProductsForImport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEnabledProductsForImportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Security Hub-integrated third-party findings providers.
       */
    def listEnabledProductsForImport(params: ListEnabledProductsForImportRequest): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Security Hub-integrated third-party findings providers.
       */
    def listEnabledProductsForImport(
      params: ListEnabledProductsForImportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListEnabledProductsForImportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListEnabledProductsForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Security Hub membership invitations that were sent to the current AWS account. 
       */
    def listInvitations(): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Security Hub membership invitations that were sent to the current AWS account. 
       */
    def listInvitations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Security Hub membership invitations that were sent to the current AWS account. 
       */
    def listInvitations(params: ListInvitationsRequest): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all Security Hub membership invitations that were sent to the current AWS account. 
       */
    def listInvitations(
      params: ListInvitationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInvitationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInvitationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists details about all member accounts for the current Security Hub master account.
       */
    def listMembers(): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists details about all member accounts for the current Security Hub master account.
       */
    def listMembers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists details about all member accounts for the current Security Hub master account.
       */
    def listMembers(params: ListMembersRequest): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists details about all member accounts for the current Security Hub master account.
       */
    def listMembers(
      params: ListMembersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMembersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMembersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
       */
    def updateFindings(): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
       */
    def updateFindings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
       */
    def updateFindings(params: UpdateFindingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
       */
    def updateFindings(
      params: UpdateFindingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFindingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFindingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the AWS Security Hub insight specified by the insight ARN.
       */
    def updateInsight(): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the AWS Security Hub insight specified by the insight ARN.
       */
    def updateInsight(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateInsightResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the AWS Security Hub insight specified by the insight ARN.
       */
    def updateInsight(params: UpdateInsightRequest): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the AWS Security Hub insight specified by the insight ARN.
       */
    def updateInsight(
      params: UpdateInsightRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateInsightResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateInsightResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateFindingsRequest extends js.Object {
    /**
         * A collection of attributes that specify what findings you want to update.
         */
    var Filters: AwsSecurityFindingFilters
    /**
         * The updated note for the finding.
         */
    var Note: js.UndefOr[NoteUpdate] = js.undefined
    /**
         * The updated record state for the finding.
         */
    var RecordState: js.UndefOr[RecordState] = js.undefined
  }
  
  
  trait UpdateFindingsResponse extends js.Object
  
  
  trait UpdateInsightRequest extends js.Object {
    /**
         * The updated filters that define this insight.
         */
    var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined
    /**
         * The updated GroupBy attribute that defines this insight.
         */
    var GroupByAttribute: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The ARN of the insight that you want to update.
         */
    var InsightArn: NonEmptyString
    /**
         * The updated name for the insight.
         */
    var Name: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait UpdateInsightResponse extends js.Object
  
  val TypesNs: this.type = js.native
  type AccountDetailsList = js.Array[AccountDetails]
  type AccountId = java.lang.String
  type AccountIdList = js.Array[NonEmptyString]
  type ArnList = js.Array[NonEmptyString]
  type AwsIamAccessKeyStatus = awsDashSdkLib.awsDashSdkLibStrings.Active | awsDashSdkLib.awsDashSdkLibStrings.Inactive | java.lang.String
  type AwsSecurityFindingList = js.Array[AwsSecurityFinding]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComplianceStatus = awsDashSdkLib.awsDashSdkLibStrings.PASSED | awsDashSdkLib.awsDashSdkLibStrings.WARNING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.NOT_AVAILABLE | java.lang.String
  type DateFilterList = js.Array[DateFilter]
  type DateRangeUnit = awsDashSdkLib.awsDashSdkLibStrings.DAYS | java.lang.String
  type Double = scala.Double
  type ImportFindingsErrorList = js.Array[ImportFindingsError]
  type InsightList = js.Array[Insight]
  type InsightResultValueList = js.Array[InsightResultValue]
  type Integer = scala.Double
  type InvitationList = js.Array[Invitation]
  type IpFilterList = js.Array[IpFilter]
  type KeywordFilterList = js.Array[KeywordFilter]
  type MalwareList = js.Array[Malware]
  type MalwareState = awsDashSdkLib.awsDashSdkLibStrings.OBSERVED | awsDashSdkLib.awsDashSdkLibStrings.REMOVAL_FAILED | awsDashSdkLib.awsDashSdkLibStrings.REMOVED | java.lang.String
  type MalwareType = awsDashSdkLib.awsDashSdkLibStrings.ADWARE | awsDashSdkLib.awsDashSdkLibStrings.BLENDED_THREAT | awsDashSdkLib.awsDashSdkLibStrings.BOTNET_AGENT | awsDashSdkLib.awsDashSdkLibStrings.COIN_MINER | awsDashSdkLib.awsDashSdkLibStrings.EXPLOIT_KIT | awsDashSdkLib.awsDashSdkLibStrings.KEYLOGGER | awsDashSdkLib.awsDashSdkLibStrings.MACRO | awsDashSdkLib.awsDashSdkLibStrings.POTENTIALLY_UNWANTED | awsDashSdkLib.awsDashSdkLibStrings.SPYWARE | awsDashSdkLib.awsDashSdkLibStrings.RANSOMWARE | awsDashSdkLib.awsDashSdkLibStrings.REMOTE_ACCESS | awsDashSdkLib.awsDashSdkLibStrings.ROOTKIT | awsDashSdkLib.awsDashSdkLibStrings.TROJAN | awsDashSdkLib.awsDashSdkLibStrings.VIRUS | awsDashSdkLib.awsDashSdkLibStrings.WORM | java.lang.String
  type MapFilterComparison = awsDashSdkLib.awsDashSdkLibStrings.CONTAINS | java.lang.String
  type MapFilterList = js.Array[MapFilter]
  type MaxResults = scala.Double
  type MemberList = js.Array[Member]
  type NetworkDirection = awsDashSdkLib.awsDashSdkLibStrings.IN | awsDashSdkLib.awsDashSdkLibStrings.OUT | java.lang.String
  type NextToken = java.lang.String
  type NonEmptyString = java.lang.String
  type NumberFilterList = js.Array[NumberFilter]
  type Partition = awsDashSdkLib.awsDashSdkLibStrings.aws | awsDashSdkLib.awsDashSdkLibStrings.`aws-cn` | awsDashSdkLib.awsDashSdkLibStrings.`aws-us-gov` | java.lang.String
  type ProductSubscriptionArnList = js.Array[NonEmptyString]
  type RecordState = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.ARCHIVED | java.lang.String
  type RelatedFindingList = js.Array[RelatedFinding]
  type ResourceList = js.Array[Resource]
  type ResultList = js.Array[Result]
  type SortCriteria = js.Array[SortCriterion]
  type SortOrder = awsDashSdkLib.awsDashSdkLibStrings.asc | awsDashSdkLib.awsDashSdkLibStrings.desc | java.lang.String
  type StandardsStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.DELETING | java.lang.String
  type StandardsSubscriptionArns = js.Array[NonEmptyString]
  type StandardsSubscriptionRequests = js.Array[StandardsSubscriptionRequest]
  type StandardsSubscriptions = js.Array[StandardsSubscription]
  type StringFilterComparison = awsDashSdkLib.awsDashSdkLibStrings.EQUALS | awsDashSdkLib.awsDashSdkLibStrings.CONTAINS | awsDashSdkLib.awsDashSdkLibStrings.PREFIX | java.lang.String
  type StringFilterList = js.Array[StringFilter]
  type StringList = js.Array[NonEmptyString]
  type ThreatIntelIndicatorCategory = awsDashSdkLib.awsDashSdkLibStrings.BACKDOOR | awsDashSdkLib.awsDashSdkLibStrings.CARD_STEALER | awsDashSdkLib.awsDashSdkLibStrings.COMMAND_AND_CONTROL | awsDashSdkLib.awsDashSdkLibStrings.DROP_SITE | awsDashSdkLib.awsDashSdkLibStrings.EXPLOIT_SITE | awsDashSdkLib.awsDashSdkLibStrings.KEYLOGGER | java.lang.String
  type ThreatIntelIndicatorList = js.Array[ThreatIntelIndicator]
  type ThreatIntelIndicatorType = awsDashSdkLib.awsDashSdkLibStrings.DOMAIN | awsDashSdkLib.awsDashSdkLibStrings.EMAIL_ADDRESS | awsDashSdkLib.awsDashSdkLibStrings.HASH_MD5 | awsDashSdkLib.awsDashSdkLibStrings.HASH_SHA1 | awsDashSdkLib.awsDashSdkLibStrings.HASH_SHA256 | awsDashSdkLib.awsDashSdkLibStrings.HASH_SHA512 | awsDashSdkLib.awsDashSdkLibStrings.IPV4_ADDRESS | awsDashSdkLib.awsDashSdkLibStrings.IPV6_ADDRESS | awsDashSdkLib.awsDashSdkLibStrings.MUTEX | awsDashSdkLib.awsDashSdkLibStrings.PROCESS | awsDashSdkLib.awsDashSdkLibStrings.URL | java.lang.String
  type Timestamp = stdLib.Date
  type TypeList = js.Array[NonEmptyString]
  type VerificationState = awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN | awsDashSdkLib.awsDashSdkLibStrings.TRUE_POSITIVE | awsDashSdkLib.awsDashSdkLibStrings.FALSE_POSITIVE | awsDashSdkLib.awsDashSdkLibStrings.BENIGN_POSITIVE | java.lang.String
  type WorkflowState = awsDashSdkLib.awsDashSdkLibStrings.NEW | awsDashSdkLib.awsDashSdkLibStrings.ASSIGNED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.DEFERRED | awsDashSdkLib.awsDashSdkLibStrings.RESOLVED | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-10-26` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

