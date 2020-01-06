package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSecurityFindingFilters extends js.Object {
  /**
    * The AWS account ID that a finding is generated in.
    */
  var AwsAccountId: js.UndefOr[StringFilterList] = js.native
  /**
    * The name of the findings provider (company) that owns the solution (product) that generates findings.
    */
  var CompanyName: js.UndefOr[StringFilterList] = js.native
  /**
    * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard (for example, CIS AWS Foundations). Contains compliance-related finding details.
    */
  var ComplianceStatus: js.UndefOr[StringFilterList] = js.native
  /**
    * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[NumberFilterList] = js.native
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider captured the potential security issue that a finding captured.
    */
  var CreatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The level of importance assigned to the resources associated with the finding. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
    */
  var Criticality: js.UndefOr[NumberFilterList] = js.native
  /**
    * A finding's description.
    */
  var Description: js.UndefOr[StringFilterList] = js.native
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider first observed the potential security issue that a finding captured.
    */
  var FirstObservedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security-findings providers' solutions, this generator can be called a rule, a check, a detector, a plug-in, etc.
    */
  var GeneratorId: js.UndefOr[StringFilterList] = js.native
  /**
    * The security findings provider-specific identifier for a finding.
    */
  var Id: js.UndefOr[StringFilterList] = js.native
  /**
    * A keyword for a finding.
    */
  var Keyword: js.UndefOr[KeywordFilterList] = js.native
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider most recently observed the potential security issue that a finding captured.
    */
  var LastObservedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The name of the malware that was observed.
    */
  var MalwareName: js.UndefOr[StringFilterList] = js.native
  /**
    * The filesystem path of the malware that was observed.
    */
  var MalwarePath: js.UndefOr[StringFilterList] = js.native
  /**
    * The state of the malware that was observed.
    */
  var MalwareState: js.UndefOr[StringFilterList] = js.native
  /**
    * The type of the malware that was observed.
    */
  var MalwareType: js.UndefOr[StringFilterList] = js.native
  /**
    * The destination domain of network-related information about a finding.
    */
  var NetworkDestinationDomain: js.UndefOr[StringFilterList] = js.native
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var NetworkDestinationIpV4: js.UndefOr[IpFilterList] = js.native
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var NetworkDestinationIpV6: js.UndefOr[IpFilterList] = js.native
  /**
    * The destination port of network-related information about a finding.
    */
  var NetworkDestinationPort: js.UndefOr[NumberFilterList] = js.native
  /**
    * Indicates the direction of network traffic associated with a finding.
    */
  var NetworkDirection: js.UndefOr[StringFilterList] = js.native
  /**
    * The protocol of network-related information about a finding.
    */
  var NetworkProtocol: js.UndefOr[StringFilterList] = js.native
  /**
    * The source domain of network-related information about a finding.
    */
  var NetworkSourceDomain: js.UndefOr[StringFilterList] = js.native
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var NetworkSourceIpV4: js.UndefOr[IpFilterList] = js.native
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var NetworkSourceIpV6: js.UndefOr[IpFilterList] = js.native
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var NetworkSourceMac: js.UndefOr[StringFilterList] = js.native
  /**
    * The source port of network-related information about a finding.
    */
  var NetworkSourcePort: js.UndefOr[NumberFilterList] = js.native
  /**
    * The text of a note.
    */
  var NoteText: js.UndefOr[StringFilterList] = js.native
  /**
    * The timestamp of when the note was updated.
    */
  var NoteUpdatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The principal that created a note.
    */
  var NoteUpdatedBy: js.UndefOr[StringFilterList] = js.native
  /**
    * The date/time that the process was launched.
    */
  var ProcessLaunchedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The name of the process.
    */
  var ProcessName: js.UndefOr[StringFilterList] = js.native
  /**
    * The parent process ID.
    */
  var ProcessParentPid: js.UndefOr[NumberFilterList] = js.native
  /**
    * The path to the process executable.
    */
  var ProcessPath: js.UndefOr[StringFilterList] = js.native
  /**
    * The process ID.
    */
  var ProcessPid: js.UndefOr[NumberFilterList] = js.native
  /**
    * The date/time that the process was terminated.
    */
  var ProcessTerminatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) after this provider's product (solution that generates findings) is registered with Security Hub.
    */
  var ProductArn: js.UndefOr[StringFilterList] = js.native
  /**
    * A data type where security-findings providers can include additional solution-specific details that aren't part of the defined AwsSecurityFinding format.
    */
  var ProductFields: js.UndefOr[MapFilterList] = js.native
  /**
    * The name of the solution (product) that generates findings.
    */
  var ProductName: js.UndefOr[StringFilterList] = js.native
  /**
    * The recommendation of what to do about the issue described in a finding.
    */
  var RecommendationText: js.UndefOr[StringFilterList] = js.native
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[StringFilterList] = js.native
  /**
    * The solution-generated identifier for a related finding.
    */
  var RelatedFindingsId: js.UndefOr[StringFilterList] = js.native
  /**
    * The ARN of the solution that generated a related finding.
    */
  var RelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.native
  /**
    * The IAM profile ARN of the instance.
    */
  var ResourceAwsEc2InstanceIamInstanceProfileArn: js.UndefOr[StringFilterList] = js.native
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ResourceAwsEc2InstanceImageId: js.UndefOr[StringFilterList] = js.native
  /**
    * The IPv4 addresses associated with the instance.
    */
  var ResourceAwsEc2InstanceIpV4Addresses: js.UndefOr[IpFilterList] = js.native
  /**
    * The IPv6 addresses associated with the instance.
    */
  var ResourceAwsEc2InstanceIpV6Addresses: js.UndefOr[IpFilterList] = js.native
  /**
    * The key name associated with the instance.
    */
  var ResourceAwsEc2InstanceKeyName: js.UndefOr[StringFilterList] = js.native
  /**
    * The date/time the instance was launched.
    */
  var ResourceAwsEc2InstanceLaunchedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var ResourceAwsEc2InstanceSubnetId: js.UndefOr[StringFilterList] = js.native
  /**
    * The instance type of the instance.
    */
  var ResourceAwsEc2InstanceType: js.UndefOr[StringFilterList] = js.native
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var ResourceAwsEc2InstanceVpcId: js.UndefOr[StringFilterList] = js.native
  /**
    * The creation date/time of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyCreatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The status of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.native
  /**
    * The user associated with the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.native
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var ResourceAwsS3BucketOwnerId: js.UndefOr[StringFilterList] = js.native
  /**
    * The display name of the owner of the S3 bucket.
    */
  var ResourceAwsS3BucketOwnerName: js.UndefOr[StringFilterList] = js.native
  /**
    * The identifier of the image related to a finding.
    */
  var ResourceContainerImageId: js.UndefOr[StringFilterList] = js.native
  /**
    * The name of the image related to a finding.
    */
  var ResourceContainerImageName: js.UndefOr[StringFilterList] = js.native
  /**
    * The date/time that the container was started.
    */
  var ResourceContainerLaunchedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The name of the container related to a finding.
    */
  var ResourceContainerName: js.UndefOr[StringFilterList] = js.native
  /**
    * The details of a resource that doesn't have a specific subfield for the resource type defined.
    */
  var ResourceDetailsOther: js.UndefOr[MapFilterList] = js.native
  /**
    * The canonical identifier for the given resource type.
    */
  var ResourceId: js.UndefOr[StringFilterList] = js.native
  /**
    * The canonical AWS partition name that the Region is assigned to.
    */
  var ResourcePartition: js.UndefOr[StringFilterList] = js.native
  /**
    * The canonical AWS external Region name where this resource is located.
    */
  var ResourceRegion: js.UndefOr[StringFilterList] = js.native
  /**
    * A list of AWS tags associated with a resource at the time the finding was processed.
    */
  var ResourceTags: js.UndefOr[MapFilterList] = js.native
  /**
    * Specifies the type of the resource that details are provided for.
    */
  var ResourceType: js.UndefOr[StringFilterList] = js.native
  /**
    * The label of a finding's severity.
    */
  var SeverityLabel: js.UndefOr[StringFilterList] = js.native
  /**
    * The normalized severity of a finding.
    */
  var SeverityNormalized: js.UndefOr[NumberFilterList] = js.native
  /**
    * The native severity as defined by the security-findings provider's solution that generated the finding.
    */
  var SeverityProduct: js.UndefOr[NumberFilterList] = js.native
  /**
    * A URL that links to a page about the current finding in the security-findings provider's solution.
    */
  var SourceUrl: js.UndefOr[StringFilterList] = js.native
  /**
    * The category of a threat intel indicator.
    */
  var ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList] = js.native
  /**
    * The date/time of the last observation of a threat intel indicator.
    */
  var ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * The source of the threat intel.
    */
  var ThreatIntelIndicatorSource: js.UndefOr[StringFilterList] = js.native
  /**
    * The URL for more details from the source of the threat intel.
    */
  var ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList] = js.native
  /**
    * The type of a threat intel indicator.
    */
  var ThreatIntelIndicatorType: js.UndefOr[StringFilterList] = js.native
  /**
    * The value of a threat intel indicator.
    */
  var ThreatIntelIndicatorValue: js.UndefOr[StringFilterList] = js.native
  /**
    * A finding's title.
    */
  var Title: js.UndefOr[StringFilterList] = js.native
  /**
    * A finding type in the format of namespace/category/classifier that classifies a finding.
    */
  var Type: js.UndefOr[StringFilterList] = js.native
  /**
    * An ISO8601-formatted timestamp that indicates when the security-findings provider last updated the finding record. 
    */
  var UpdatedAt: js.UndefOr[DateFilterList] = js.native
  /**
    * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. 
    */
  var UserDefinedFields: js.UndefOr[MapFilterList] = js.native
  /**
    * The veracity of a finding.
    */
  var VerificationState: js.UndefOr[StringFilterList] = js.native
  /**
    * The workflow state of a finding.
    */
  var WorkflowState: js.UndefOr[StringFilterList] = js.native
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
    if (AwsAccountId != null) __obj.updateDynamic("AwsAccountId")(AwsAccountId.asInstanceOf[js.Any])
    if (CompanyName != null) __obj.updateDynamic("CompanyName")(CompanyName.asInstanceOf[js.Any])
    if (ComplianceStatus != null) __obj.updateDynamic("ComplianceStatus")(ComplianceStatus.asInstanceOf[js.Any])
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Criticality != null) __obj.updateDynamic("Criticality")(Criticality.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FirstObservedAt != null) __obj.updateDynamic("FirstObservedAt")(FirstObservedAt.asInstanceOf[js.Any])
    if (GeneratorId != null) __obj.updateDynamic("GeneratorId")(GeneratorId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Keyword != null) __obj.updateDynamic("Keyword")(Keyword.asInstanceOf[js.Any])
    if (LastObservedAt != null) __obj.updateDynamic("LastObservedAt")(LastObservedAt.asInstanceOf[js.Any])
    if (MalwareName != null) __obj.updateDynamic("MalwareName")(MalwareName.asInstanceOf[js.Any])
    if (MalwarePath != null) __obj.updateDynamic("MalwarePath")(MalwarePath.asInstanceOf[js.Any])
    if (MalwareState != null) __obj.updateDynamic("MalwareState")(MalwareState.asInstanceOf[js.Any])
    if (MalwareType != null) __obj.updateDynamic("MalwareType")(MalwareType.asInstanceOf[js.Any])
    if (NetworkDestinationDomain != null) __obj.updateDynamic("NetworkDestinationDomain")(NetworkDestinationDomain.asInstanceOf[js.Any])
    if (NetworkDestinationIpV4 != null) __obj.updateDynamic("NetworkDestinationIpV4")(NetworkDestinationIpV4.asInstanceOf[js.Any])
    if (NetworkDestinationIpV6 != null) __obj.updateDynamic("NetworkDestinationIpV6")(NetworkDestinationIpV6.asInstanceOf[js.Any])
    if (NetworkDestinationPort != null) __obj.updateDynamic("NetworkDestinationPort")(NetworkDestinationPort.asInstanceOf[js.Any])
    if (NetworkDirection != null) __obj.updateDynamic("NetworkDirection")(NetworkDirection.asInstanceOf[js.Any])
    if (NetworkProtocol != null) __obj.updateDynamic("NetworkProtocol")(NetworkProtocol.asInstanceOf[js.Any])
    if (NetworkSourceDomain != null) __obj.updateDynamic("NetworkSourceDomain")(NetworkSourceDomain.asInstanceOf[js.Any])
    if (NetworkSourceIpV4 != null) __obj.updateDynamic("NetworkSourceIpV4")(NetworkSourceIpV4.asInstanceOf[js.Any])
    if (NetworkSourceIpV6 != null) __obj.updateDynamic("NetworkSourceIpV6")(NetworkSourceIpV6.asInstanceOf[js.Any])
    if (NetworkSourceMac != null) __obj.updateDynamic("NetworkSourceMac")(NetworkSourceMac.asInstanceOf[js.Any])
    if (NetworkSourcePort != null) __obj.updateDynamic("NetworkSourcePort")(NetworkSourcePort.asInstanceOf[js.Any])
    if (NoteText != null) __obj.updateDynamic("NoteText")(NoteText.asInstanceOf[js.Any])
    if (NoteUpdatedAt != null) __obj.updateDynamic("NoteUpdatedAt")(NoteUpdatedAt.asInstanceOf[js.Any])
    if (NoteUpdatedBy != null) __obj.updateDynamic("NoteUpdatedBy")(NoteUpdatedBy.asInstanceOf[js.Any])
    if (ProcessLaunchedAt != null) __obj.updateDynamic("ProcessLaunchedAt")(ProcessLaunchedAt.asInstanceOf[js.Any])
    if (ProcessName != null) __obj.updateDynamic("ProcessName")(ProcessName.asInstanceOf[js.Any])
    if (ProcessParentPid != null) __obj.updateDynamic("ProcessParentPid")(ProcessParentPid.asInstanceOf[js.Any])
    if (ProcessPath != null) __obj.updateDynamic("ProcessPath")(ProcessPath.asInstanceOf[js.Any])
    if (ProcessPid != null) __obj.updateDynamic("ProcessPid")(ProcessPid.asInstanceOf[js.Any])
    if (ProcessTerminatedAt != null) __obj.updateDynamic("ProcessTerminatedAt")(ProcessTerminatedAt.asInstanceOf[js.Any])
    if (ProductArn != null) __obj.updateDynamic("ProductArn")(ProductArn.asInstanceOf[js.Any])
    if (ProductFields != null) __obj.updateDynamic("ProductFields")(ProductFields.asInstanceOf[js.Any])
    if (ProductName != null) __obj.updateDynamic("ProductName")(ProductName.asInstanceOf[js.Any])
    if (RecommendationText != null) __obj.updateDynamic("RecommendationText")(RecommendationText.asInstanceOf[js.Any])
    if (RecordState != null) __obj.updateDynamic("RecordState")(RecordState.asInstanceOf[js.Any])
    if (RelatedFindingsId != null) __obj.updateDynamic("RelatedFindingsId")(RelatedFindingsId.asInstanceOf[js.Any])
    if (RelatedFindingsProductArn != null) __obj.updateDynamic("RelatedFindingsProductArn")(RelatedFindingsProductArn.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceIamInstanceProfileArn != null) __obj.updateDynamic("ResourceAwsEc2InstanceIamInstanceProfileArn")(ResourceAwsEc2InstanceIamInstanceProfileArn.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceImageId != null) __obj.updateDynamic("ResourceAwsEc2InstanceImageId")(ResourceAwsEc2InstanceImageId.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceIpV4Addresses != null) __obj.updateDynamic("ResourceAwsEc2InstanceIpV4Addresses")(ResourceAwsEc2InstanceIpV4Addresses.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceIpV6Addresses != null) __obj.updateDynamic("ResourceAwsEc2InstanceIpV6Addresses")(ResourceAwsEc2InstanceIpV6Addresses.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceKeyName != null) __obj.updateDynamic("ResourceAwsEc2InstanceKeyName")(ResourceAwsEc2InstanceKeyName.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceLaunchedAt != null) __obj.updateDynamic("ResourceAwsEc2InstanceLaunchedAt")(ResourceAwsEc2InstanceLaunchedAt.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceSubnetId != null) __obj.updateDynamic("ResourceAwsEc2InstanceSubnetId")(ResourceAwsEc2InstanceSubnetId.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceType != null) __obj.updateDynamic("ResourceAwsEc2InstanceType")(ResourceAwsEc2InstanceType.asInstanceOf[js.Any])
    if (ResourceAwsEc2InstanceVpcId != null) __obj.updateDynamic("ResourceAwsEc2InstanceVpcId")(ResourceAwsEc2InstanceVpcId.asInstanceOf[js.Any])
    if (ResourceAwsIamAccessKeyCreatedAt != null) __obj.updateDynamic("ResourceAwsIamAccessKeyCreatedAt")(ResourceAwsIamAccessKeyCreatedAt.asInstanceOf[js.Any])
    if (ResourceAwsIamAccessKeyStatus != null) __obj.updateDynamic("ResourceAwsIamAccessKeyStatus")(ResourceAwsIamAccessKeyStatus.asInstanceOf[js.Any])
    if (ResourceAwsIamAccessKeyUserName != null) __obj.updateDynamic("ResourceAwsIamAccessKeyUserName")(ResourceAwsIamAccessKeyUserName.asInstanceOf[js.Any])
    if (ResourceAwsS3BucketOwnerId != null) __obj.updateDynamic("ResourceAwsS3BucketOwnerId")(ResourceAwsS3BucketOwnerId.asInstanceOf[js.Any])
    if (ResourceAwsS3BucketOwnerName != null) __obj.updateDynamic("ResourceAwsS3BucketOwnerName")(ResourceAwsS3BucketOwnerName.asInstanceOf[js.Any])
    if (ResourceContainerImageId != null) __obj.updateDynamic("ResourceContainerImageId")(ResourceContainerImageId.asInstanceOf[js.Any])
    if (ResourceContainerImageName != null) __obj.updateDynamic("ResourceContainerImageName")(ResourceContainerImageName.asInstanceOf[js.Any])
    if (ResourceContainerLaunchedAt != null) __obj.updateDynamic("ResourceContainerLaunchedAt")(ResourceContainerLaunchedAt.asInstanceOf[js.Any])
    if (ResourceContainerName != null) __obj.updateDynamic("ResourceContainerName")(ResourceContainerName.asInstanceOf[js.Any])
    if (ResourceDetailsOther != null) __obj.updateDynamic("ResourceDetailsOther")(ResourceDetailsOther.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourcePartition != null) __obj.updateDynamic("ResourcePartition")(ResourcePartition.asInstanceOf[js.Any])
    if (ResourceRegion != null) __obj.updateDynamic("ResourceRegion")(ResourceRegion.asInstanceOf[js.Any])
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (SeverityLabel != null) __obj.updateDynamic("SeverityLabel")(SeverityLabel.asInstanceOf[js.Any])
    if (SeverityNormalized != null) __obj.updateDynamic("SeverityNormalized")(SeverityNormalized.asInstanceOf[js.Any])
    if (SeverityProduct != null) __obj.updateDynamic("SeverityProduct")(SeverityProduct.asInstanceOf[js.Any])
    if (SourceUrl != null) __obj.updateDynamic("SourceUrl")(SourceUrl.asInstanceOf[js.Any])
    if (ThreatIntelIndicatorCategory != null) __obj.updateDynamic("ThreatIntelIndicatorCategory")(ThreatIntelIndicatorCategory.asInstanceOf[js.Any])
    if (ThreatIntelIndicatorLastObservedAt != null) __obj.updateDynamic("ThreatIntelIndicatorLastObservedAt")(ThreatIntelIndicatorLastObservedAt.asInstanceOf[js.Any])
    if (ThreatIntelIndicatorSource != null) __obj.updateDynamic("ThreatIntelIndicatorSource")(ThreatIntelIndicatorSource.asInstanceOf[js.Any])
    if (ThreatIntelIndicatorSourceUrl != null) __obj.updateDynamic("ThreatIntelIndicatorSourceUrl")(ThreatIntelIndicatorSourceUrl.asInstanceOf[js.Any])
    if (ThreatIntelIndicatorType != null) __obj.updateDynamic("ThreatIntelIndicatorType")(ThreatIntelIndicatorType.asInstanceOf[js.Any])
    if (ThreatIntelIndicatorValue != null) __obj.updateDynamic("ThreatIntelIndicatorValue")(ThreatIntelIndicatorValue.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    if (UserDefinedFields != null) __obj.updateDynamic("UserDefinedFields")(UserDefinedFields.asInstanceOf[js.Any])
    if (VerificationState != null) __obj.updateDynamic("VerificationState")(VerificationState.asInstanceOf[js.Any])
    if (WorkflowState != null) __obj.updateDynamic("WorkflowState")(WorkflowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsSecurityFindingFilters]
  }
}

