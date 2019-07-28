package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsSecurityFindingFilters extends js.Object {
  /**
    * The AWS account ID that a finding is generated in.
    */
  var AwsAccountId: js.UndefOr[StringFilterList] = js.undefined
  /**
    * The name of the findings provider (company) that owns the solution (product) that generates findings.
    */
  var CompanyName: js.UndefOr[StringFilterList] = js.undefined
  /**
    * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard (for example, CIS AWS Foundations). Contains compliance-related finding details.
    */
  var ComplianceStatus: js.UndefOr[StringFilterList] = js.undefined
  /**
    * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[NumberFilterList] = js.undefined
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider captured the potential security issue that a finding captured.
    */
  var CreatedAt: js.UndefOr[DateFilterList] = js.undefined
  /**
    * The level of importance assigned to the resources associated with the finding. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
    */
  var Criticality: js.UndefOr[NumberFilterList] = js.undefined
  /**
    * A finding's description.
    */
  var Description: js.UndefOr[StringFilterList] = js.undefined
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider first observed the potential security issue that a finding captured.
    */
  var FirstObservedAt: js.UndefOr[DateFilterList] = js.undefined
  /**
    * The identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security-findings providers' solutions, this generator can be called a rule, a check, a detector, a plug-in, etc.
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
    * An ISO8601-formatted timestamp that indicates when the security-findings provider most recently observed the potential security issue that a finding captured.
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
    * The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) after this provider's product (solution that generates findings) is registered with Security Hub.
    */
  var ProductArn: js.UndefOr[StringFilterList] = js.undefined
  /**
    * A data type where security-findings providers can include additional solution-specific details that aren't part of the defined AwsSecurityFinding format.
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
    * The identifier of the subnet that the instance was launched in.
    */
  var ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList] = js.undefined
  /**
    * The instance type of the instance.
    */
  var ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList] = js.undefined
  /**
    * The identifier of the VPC that the instance was launched in.
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
    * The details of a resource that doesn't have a specific subfield for the resource type defined.
    */
  var ResourceDetailsOther: js.UndefOr[MapFilterList] = js.undefined
  /**
    * The canonical identifier for the given resource type.
    */
  var ResourceId: js.UndefOr[StringFilterList] = js.undefined
  /**
    * The canonical AWS partition name that the Region is assigned to.
    */
  var ResourcePartition: js.UndefOr[StringFilterList] = js.undefined
  /**
    * The canonical AWS external Region name where this resource is located.
    */
  var ResourceRegion: js.UndefOr[StringFilterList] = js.undefined
  /**
    * A list of AWS tags associated with a resource at the time the finding was processed.
    */
  var ResourceTags: js.UndefOr[MapFilterList] = js.undefined
  /**
    * Specifies the type of the resource that details are provided for.
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
    * The native severity as defined by the security-findings provider's solution that generated the finding.
    */
  var SeverityProduct: js.UndefOr[NumberFilterList] = js.undefined
  /**
    * A URL that links to a page about the current finding in the security-findings provider's solution.
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
    * A finding type in the format of namespace/category/classifier that classifies a finding.
    */
  var Type: js.UndefOr[StringFilterList] = js.undefined
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider last updated the finding record. 
    */
  var UpdatedAt: js.UndefOr[DateFilterList] = js.undefined
  /**
    * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. 
    */
  var UserDefinedFields: js.UndefOr[MapFilterList] = js.undefined
  /**
    * The veracity of a finding.
    */
  var VerificationState: js.UndefOr[StringFilterList] = js.undefined
  /**
    * The workflow state of a finding.
    */
  var WorkflowState: js.UndefOr[StringFilterList] = js.undefined
}

object AwsSecurityFindingFilters {
  @scala.inline
  def apply(
    AwsAccountId: StringFilterList = null,
    CompanyName: StringFilterList = null,
    ComplianceStatus: StringFilterList = null,
    Confidence: NumberFilterList = null,
    CreatedAt: DateFilterList = null,
    Criticality: NumberFilterList = null,
    Description: StringFilterList = null,
    FirstObservedAt: DateFilterList = null,
    GeneratorId: StringFilterList = null,
    Id: StringFilterList = null,
    Keyword: KeywordFilterList = null,
    LastObservedAt: DateFilterList = null,
    MalwareName: StringFilterList = null,
    MalwarePath: StringFilterList = null,
    MalwareState: StringFilterList = null,
    MalwareType: StringFilterList = null,
    NetworkDestinationDomain: StringFilterList = null,
    NetworkDestinationIpV4: IpFilterList = null,
    NetworkDestinationIpV6: IpFilterList = null,
    NetworkDestinationPort: NumberFilterList = null,
    NetworkDirection: StringFilterList = null,
    NetworkProtocol: StringFilterList = null,
    NetworkSourceDomain: StringFilterList = null,
    NetworkSourceIpV4: IpFilterList = null,
    NetworkSourceIpV6: IpFilterList = null,
    NetworkSourceMac: StringFilterList = null,
    NetworkSourcePort: NumberFilterList = null,
    NoteText: StringFilterList = null,
    NoteUpdatedAt: DateFilterList = null,
    NoteUpdatedBy: StringFilterList = null,
    ProcessLaunchedAt: DateFilterList = null,
    ProcessName: StringFilterList = null,
    ProcessParentPid: NumberFilterList = null,
    ProcessPath: StringFilterList = null,
    ProcessPid: NumberFilterList = null,
    ProcessTerminatedAt: DateFilterList = null,
    ProductArn: StringFilterList = null,
    ProductFields: MapFilterList = null,
    ProductName: StringFilterList = null,
    RecommendationText: StringFilterList = null,
    RecordState: StringFilterList = null,
    RelatedFindingsId: StringFilterList = null,
    RelatedFindingsProductArn: StringFilterList = null,
    ResourceAwsEc2InstanceIamInstanceProfileArn: StringFilterList = null,
    ResourceAwsEc2InstanceImageId: StringFilterList = null,
    ResourceAwsEc2InstanceIpV4Addresses: IpFilterList = null,
    ResourceAwsEc2InstanceIpV6Addresses: IpFilterList = null,
    ResourceAwsEc2InstanceKeyName: StringFilterList = null,
    ResourceAwsEc2InstanceLaunchedAt: DateFilterList = null,
    ResourceAwsEc2InstanceSubnetId: StringFilterList = null,
    ResourceAwsEc2InstanceType: StringFilterList = null,
    ResourceAwsEc2InstanceVpcId: StringFilterList = null,
    ResourceAwsIamAccessKeyCreatedAt: DateFilterList = null,
    ResourceAwsIamAccessKeyStatus: StringFilterList = null,
    ResourceAwsIamAccessKeyUserName: StringFilterList = null,
    ResourceAwsS3BucketOwnerId: StringFilterList = null,
    ResourceAwsS3BucketOwnerName: StringFilterList = null,
    ResourceContainerImageId: StringFilterList = null,
    ResourceContainerImageName: StringFilterList = null,
    ResourceContainerLaunchedAt: DateFilterList = null,
    ResourceContainerName: StringFilterList = null,
    ResourceDetailsOther: MapFilterList = null,
    ResourceId: StringFilterList = null,
    ResourcePartition: StringFilterList = null,
    ResourceRegion: StringFilterList = null,
    ResourceTags: MapFilterList = null,
    ResourceType: StringFilterList = null,
    SeverityLabel: StringFilterList = null,
    SeverityNormalized: NumberFilterList = null,
    SeverityProduct: NumberFilterList = null,
    SourceUrl: StringFilterList = null,
    ThreatIntelIndicatorCategory: StringFilterList = null,
    ThreatIntelIndicatorLastObservedAt: DateFilterList = null,
    ThreatIntelIndicatorSource: StringFilterList = null,
    ThreatIntelIndicatorSourceUrl: StringFilterList = null,
    ThreatIntelIndicatorType: StringFilterList = null,
    ThreatIntelIndicatorValue: StringFilterList = null,
    Title: StringFilterList = null,
    Type: StringFilterList = null,
    UpdatedAt: DateFilterList = null,
    UserDefinedFields: MapFilterList = null,
    VerificationState: StringFilterList = null,
    WorkflowState: StringFilterList = null
  ): AwsSecurityFindingFilters = {
    val __obj = js.Dynamic.literal()
    if (AwsAccountId != null) __obj.updateDynamic("AwsAccountId")(AwsAccountId)
    if (CompanyName != null) __obj.updateDynamic("CompanyName")(CompanyName)
    if (ComplianceStatus != null) __obj.updateDynamic("ComplianceStatus")(ComplianceStatus)
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Criticality != null) __obj.updateDynamic("Criticality")(Criticality)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FirstObservedAt != null) __obj.updateDynamic("FirstObservedAt")(FirstObservedAt)
    if (GeneratorId != null) __obj.updateDynamic("GeneratorId")(GeneratorId)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Keyword != null) __obj.updateDynamic("Keyword")(Keyword)
    if (LastObservedAt != null) __obj.updateDynamic("LastObservedAt")(LastObservedAt)
    if (MalwareName != null) __obj.updateDynamic("MalwareName")(MalwareName)
    if (MalwarePath != null) __obj.updateDynamic("MalwarePath")(MalwarePath)
    if (MalwareState != null) __obj.updateDynamic("MalwareState")(MalwareState)
    if (MalwareType != null) __obj.updateDynamic("MalwareType")(MalwareType)
    if (NetworkDestinationDomain != null) __obj.updateDynamic("NetworkDestinationDomain")(NetworkDestinationDomain)
    if (NetworkDestinationIpV4 != null) __obj.updateDynamic("NetworkDestinationIpV4")(NetworkDestinationIpV4)
    if (NetworkDestinationIpV6 != null) __obj.updateDynamic("NetworkDestinationIpV6")(NetworkDestinationIpV6)
    if (NetworkDestinationPort != null) __obj.updateDynamic("NetworkDestinationPort")(NetworkDestinationPort)
    if (NetworkDirection != null) __obj.updateDynamic("NetworkDirection")(NetworkDirection)
    if (NetworkProtocol != null) __obj.updateDynamic("NetworkProtocol")(NetworkProtocol)
    if (NetworkSourceDomain != null) __obj.updateDynamic("NetworkSourceDomain")(NetworkSourceDomain)
    if (NetworkSourceIpV4 != null) __obj.updateDynamic("NetworkSourceIpV4")(NetworkSourceIpV4)
    if (NetworkSourceIpV6 != null) __obj.updateDynamic("NetworkSourceIpV6")(NetworkSourceIpV6)
    if (NetworkSourceMac != null) __obj.updateDynamic("NetworkSourceMac")(NetworkSourceMac)
    if (NetworkSourcePort != null) __obj.updateDynamic("NetworkSourcePort")(NetworkSourcePort)
    if (NoteText != null) __obj.updateDynamic("NoteText")(NoteText)
    if (NoteUpdatedAt != null) __obj.updateDynamic("NoteUpdatedAt")(NoteUpdatedAt)
    if (NoteUpdatedBy != null) __obj.updateDynamic("NoteUpdatedBy")(NoteUpdatedBy)
    if (ProcessLaunchedAt != null) __obj.updateDynamic("ProcessLaunchedAt")(ProcessLaunchedAt)
    if (ProcessName != null) __obj.updateDynamic("ProcessName")(ProcessName)
    if (ProcessParentPid != null) __obj.updateDynamic("ProcessParentPid")(ProcessParentPid)
    if (ProcessPath != null) __obj.updateDynamic("ProcessPath")(ProcessPath)
    if (ProcessPid != null) __obj.updateDynamic("ProcessPid")(ProcessPid)
    if (ProcessTerminatedAt != null) __obj.updateDynamic("ProcessTerminatedAt")(ProcessTerminatedAt)
    if (ProductArn != null) __obj.updateDynamic("ProductArn")(ProductArn)
    if (ProductFields != null) __obj.updateDynamic("ProductFields")(ProductFields)
    if (ProductName != null) __obj.updateDynamic("ProductName")(ProductName)
    if (RecommendationText != null) __obj.updateDynamic("RecommendationText")(RecommendationText)
    if (RecordState != null) __obj.updateDynamic("RecordState")(RecordState)
    if (RelatedFindingsId != null) __obj.updateDynamic("RelatedFindingsId")(RelatedFindingsId)
    if (RelatedFindingsProductArn != null) __obj.updateDynamic("RelatedFindingsProductArn")(RelatedFindingsProductArn)
    if (ResourceAwsEc2InstanceIamInstanceProfileArn != null) __obj.updateDynamic("ResourceAwsEc2InstanceIamInstanceProfileArn")(ResourceAwsEc2InstanceIamInstanceProfileArn)
    if (ResourceAwsEc2InstanceImageId != null) __obj.updateDynamic("ResourceAwsEc2InstanceImageId")(ResourceAwsEc2InstanceImageId)
    if (ResourceAwsEc2InstanceIpV4Addresses != null) __obj.updateDynamic("ResourceAwsEc2InstanceIpV4Addresses")(ResourceAwsEc2InstanceIpV4Addresses)
    if (ResourceAwsEc2InstanceIpV6Addresses != null) __obj.updateDynamic("ResourceAwsEc2InstanceIpV6Addresses")(ResourceAwsEc2InstanceIpV6Addresses)
    if (ResourceAwsEc2InstanceKeyName != null) __obj.updateDynamic("ResourceAwsEc2InstanceKeyName")(ResourceAwsEc2InstanceKeyName)
    if (ResourceAwsEc2InstanceLaunchedAt != null) __obj.updateDynamic("ResourceAwsEc2InstanceLaunchedAt")(ResourceAwsEc2InstanceLaunchedAt)
    if (ResourceAwsEc2InstanceSubnetId != null) __obj.updateDynamic("ResourceAwsEc2InstanceSubnetId")(ResourceAwsEc2InstanceSubnetId)
    if (ResourceAwsEc2InstanceType != null) __obj.updateDynamic("ResourceAwsEc2InstanceType")(ResourceAwsEc2InstanceType)
    if (ResourceAwsEc2InstanceVpcId != null) __obj.updateDynamic("ResourceAwsEc2InstanceVpcId")(ResourceAwsEc2InstanceVpcId)
    if (ResourceAwsIamAccessKeyCreatedAt != null) __obj.updateDynamic("ResourceAwsIamAccessKeyCreatedAt")(ResourceAwsIamAccessKeyCreatedAt)
    if (ResourceAwsIamAccessKeyStatus != null) __obj.updateDynamic("ResourceAwsIamAccessKeyStatus")(ResourceAwsIamAccessKeyStatus)
    if (ResourceAwsIamAccessKeyUserName != null) __obj.updateDynamic("ResourceAwsIamAccessKeyUserName")(ResourceAwsIamAccessKeyUserName)
    if (ResourceAwsS3BucketOwnerId != null) __obj.updateDynamic("ResourceAwsS3BucketOwnerId")(ResourceAwsS3BucketOwnerId)
    if (ResourceAwsS3BucketOwnerName != null) __obj.updateDynamic("ResourceAwsS3BucketOwnerName")(ResourceAwsS3BucketOwnerName)
    if (ResourceContainerImageId != null) __obj.updateDynamic("ResourceContainerImageId")(ResourceContainerImageId)
    if (ResourceContainerImageName != null) __obj.updateDynamic("ResourceContainerImageName")(ResourceContainerImageName)
    if (ResourceContainerLaunchedAt != null) __obj.updateDynamic("ResourceContainerLaunchedAt")(ResourceContainerLaunchedAt)
    if (ResourceContainerName != null) __obj.updateDynamic("ResourceContainerName")(ResourceContainerName)
    if (ResourceDetailsOther != null) __obj.updateDynamic("ResourceDetailsOther")(ResourceDetailsOther)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourcePartition != null) __obj.updateDynamic("ResourcePartition")(ResourcePartition)
    if (ResourceRegion != null) __obj.updateDynamic("ResourceRegion")(ResourceRegion)
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (SeverityLabel != null) __obj.updateDynamic("SeverityLabel")(SeverityLabel)
    if (SeverityNormalized != null) __obj.updateDynamic("SeverityNormalized")(SeverityNormalized)
    if (SeverityProduct != null) __obj.updateDynamic("SeverityProduct")(SeverityProduct)
    if (SourceUrl != null) __obj.updateDynamic("SourceUrl")(SourceUrl)
    if (ThreatIntelIndicatorCategory != null) __obj.updateDynamic("ThreatIntelIndicatorCategory")(ThreatIntelIndicatorCategory)
    if (ThreatIntelIndicatorLastObservedAt != null) __obj.updateDynamic("ThreatIntelIndicatorLastObservedAt")(ThreatIntelIndicatorLastObservedAt)
    if (ThreatIntelIndicatorSource != null) __obj.updateDynamic("ThreatIntelIndicatorSource")(ThreatIntelIndicatorSource)
    if (ThreatIntelIndicatorSourceUrl != null) __obj.updateDynamic("ThreatIntelIndicatorSourceUrl")(ThreatIntelIndicatorSourceUrl)
    if (ThreatIntelIndicatorType != null) __obj.updateDynamic("ThreatIntelIndicatorType")(ThreatIntelIndicatorType)
    if (ThreatIntelIndicatorValue != null) __obj.updateDynamic("ThreatIntelIndicatorValue")(ThreatIntelIndicatorValue)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt)
    if (UserDefinedFields != null) __obj.updateDynamic("UserDefinedFields")(UserDefinedFields)
    if (VerificationState != null) __obj.updateDynamic("VerificationState")(VerificationState)
    if (WorkflowState != null) __obj.updateDynamic("WorkflowState")(WorkflowState)
    __obj.asInstanceOf[AwsSecurityFindingFilters]
  }
}

