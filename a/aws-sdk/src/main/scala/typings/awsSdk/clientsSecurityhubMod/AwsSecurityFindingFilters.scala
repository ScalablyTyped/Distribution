package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSecurityFindingFilters extends StObject {
  
  /**
    * The Amazon Web Services account ID that a finding is generated in.
    */
  var AwsAccountId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The name of the findings provider (company) that owns the solution (product) that generates findings.
    */
  var CompanyName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    *  The unique identifier of a standard in which a control is enabled. This field consists of the resource portion of the Amazon Resource Name (ARN) returned for a standard in the DescribeStandards API response. 
    */
  var ComplianceAssociatedStandardsId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    *  The unique identifier of a control across standards. Values for this field typically consist of an Amazon Web Service and a number, such as APIGateway.5. 
    */
  var ComplianceSecurityControlId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard, such as CIS Amazon Web Services Foundations. Contains security standard-related finding details.
    */
  var ComplianceStatus: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security findings provider captured the potential security issue that a finding captured. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
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
    * The finding provider value for the finding confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var FindingProviderFieldsConfidence: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * The finding provider value for the level of importance assigned to the resources associated with the findings. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources. 
    */
  var FindingProviderFieldsCriticality: js.UndefOr[NumberFilterList] = js.undefined
  
  /**
    * The finding identifier of a related finding that is identified by the finding provider.
    */
  var FindingProviderFieldsRelatedFindingsId: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The ARN of the solution that generated a related finding that is identified by the finding provider.
    */
  var FindingProviderFieldsRelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The finding provider value for the severity label.
    */
  var FindingProviderFieldsSeverityLabel: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The finding provider's original value for the severity.
    */
  var FindingProviderFieldsSeverityOriginal: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * One or more finding types that the finding provider assigned to the finding. Uses the format of namespace/category/classifier that classify a finding. Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive Data Identifications
    */
  var FindingProviderFieldsTypes: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * An ISO8601-formatted timestamp that indicates when the security findings provider first observed the potential security issue that a finding captured. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
    */
  var FirstObservedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security findings providers' solutions, this generator can be called a rule, a check, a detector, a plugin, etc.
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
    * An ISO8601-formatted timestamp that indicates when the security findings provider most recently observed the potential security issue that a finding captured. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
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
    * A timestamp that identifies when the process was launched. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
    */
  var ProcessLaunchedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The name of the process.
    */
  var ProcessName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The parent process ID. This field accepts positive integers between O and 2147483647.
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
    * A timestamp that identifies when the process was terminated. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
    */
  var ProcessTerminatedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The ARN generated by Security Hub that uniquely identifies a third-party company (security findings provider) after this provider's product (solution that generates findings) is registered with Security Hub.
    */
  var ProductArn: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A data type where security findings providers can include additional solution-specific details that aren't part of the defined AwsSecurityFinding format.
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
    * The Region from which the finding was generated.
    */
  var Region: js.UndefOr[StringFilterList] = js.undefined
  
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
    * The date and time the instance was launched.
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
    * The name of the principal that is associated with an IAM access key.
    */
  var ResourceAwsIamAccessKeyPrincipalName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The status of the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The user associated with the IAM access key related to a finding.
    */
  var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The name of an IAM user.
    */
  var ResourceAwsIamUserUserName: js.UndefOr[StringFilterList] = js.undefined
  
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
    * A timestamp that identifies when the container was started. A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
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
    * The canonical Amazon Web Services partition name that the Region is assigned to.
    */
  var ResourcePartition: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The canonical Amazon Web Services external Region name where this resource is located.
    */
  var ResourceRegion: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A list of Amazon Web Services tags associated with a resource at the time the finding was processed.
    */
  var ResourceTags: js.UndefOr[MapFilterList] = js.undefined
  
  /**
    * Specifies the type of the resource that details are provided for.
    */
  var ResourceType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Indicates whether or not sample findings are included in the filter results.
    */
  var Sample: js.UndefOr[BooleanFilterList] = js.undefined
  
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
    * The category of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorCategory: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * A timestamp that identifies the last observation of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorLastObservedAt: js.UndefOr[DateFilterList] = js.undefined
  
  /**
    * The source of the threat intelligence.
    */
  var ThreatIntelIndicatorSource: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The URL for more details from the source of the threat intelligence.
    */
  var ThreatIntelIndicatorSourceUrl: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The type of a threat intelligence indicator.
    */
  var ThreatIntelIndicatorType: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The value of a threat intelligence indicator.
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
    * An ISO8601-formatted timestamp that indicates when the security findings provider last updated the finding record.  A correctly formatted example is 2020-05-21T20:16:34.724Z. The value cannot contain spaces, and date and time should be separated by T. For more information, see RFC 3339 section 5.6, Internet Date/Time Format.
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
    * The workflow state of a finding. Note that this field is deprecated. To search for a finding based on its workflow status, use WorkflowStatus.
    */
  var WorkflowState: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The status of the investigation into a finding. Allowed values are the following.    NEW - The initial state of a finding, before it is reviewed. Security Hub also resets the workflow status from NOTIFIED or RESOLVED to NEW in the following cases:    RecordState changes from ARCHIVED to ACTIVE.    Compliance.Status changes from PASSED to either WARNING, FAILED, or NOT_AVAILABLE.      NOTIFIED - Indicates that the resource owner has been notified about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner. If one of the following occurs, the workflow status is changed automatically from NOTIFIED to NEW:    RecordState changes from ARCHIVED to ACTIVE.    Compliance.Status changes from PASSED to FAILED, WARNING, or NOT_AVAILABLE.      SUPPRESSED - Indicates that you reviewed the finding and do not believe that any action is needed. The workflow status of a SUPPRESSED finding does not change if RecordState changes from ARCHIVED to ACTIVE.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.  The finding remains RESOLVED unless one of the following occurs:    RecordState changes from ARCHIVED to ACTIVE.    Compliance.Status changes from PASSED to FAILED, WARNING, or NOT_AVAILABLE.   In those cases, the workflow status is automatically reset to NEW. For findings from controls, if Compliance.Status is PASSED, then Security Hub automatically sets the workflow status to RESOLVED.  
    */
  var WorkflowStatus: js.UndefOr[StringFilterList] = js.undefined
}
object AwsSecurityFindingFilters {
  
  inline def apply(): AwsSecurityFindingFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSecurityFindingFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsSecurityFindingFilters] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: StringFilterList): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    inline def setAwsAccountIdVarargs(value: StringFilter*): Self = StObject.set(x, "AwsAccountId", js.Array(value*))
    
    inline def setCompanyName(value: StringFilterList): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
    
    inline def setCompanyNameVarargs(value: StringFilter*): Self = StObject.set(x, "CompanyName", js.Array(value*))
    
    inline def setComplianceAssociatedStandardsId(value: StringFilterList): Self = StObject.set(x, "ComplianceAssociatedStandardsId", value.asInstanceOf[js.Any])
    
    inline def setComplianceAssociatedStandardsIdUndefined: Self = StObject.set(x, "ComplianceAssociatedStandardsId", js.undefined)
    
    inline def setComplianceAssociatedStandardsIdVarargs(value: StringFilter*): Self = StObject.set(x, "ComplianceAssociatedStandardsId", js.Array(value*))
    
    inline def setComplianceSecurityControlId(value: StringFilterList): Self = StObject.set(x, "ComplianceSecurityControlId", value.asInstanceOf[js.Any])
    
    inline def setComplianceSecurityControlIdUndefined: Self = StObject.set(x, "ComplianceSecurityControlId", js.undefined)
    
    inline def setComplianceSecurityControlIdVarargs(value: StringFilter*): Self = StObject.set(x, "ComplianceSecurityControlId", js.Array(value*))
    
    inline def setComplianceStatus(value: StringFilterList): Self = StObject.set(x, "ComplianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "ComplianceStatus", js.undefined)
    
    inline def setComplianceStatusVarargs(value: StringFilter*): Self = StObject.set(x, "ComplianceStatus", js.Array(value*))
    
    inline def setConfidence(value: NumberFilterList): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setConfidenceVarargs(value: NumberFilter*): Self = StObject.set(x, "Confidence", js.Array(value*))
    
    inline def setCreatedAt(value: DateFilterList): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setCreatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "CreatedAt", js.Array(value*))
    
    inline def setCriticality(value: NumberFilterList): Self = StObject.set(x, "Criticality", value.asInstanceOf[js.Any])
    
    inline def setCriticalityUndefined: Self = StObject.set(x, "Criticality", js.undefined)
    
    inline def setCriticalityVarargs(value: NumberFilter*): Self = StObject.set(x, "Criticality", js.Array(value*))
    
    inline def setDescription(value: StringFilterList): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDescriptionVarargs(value: StringFilter*): Self = StObject.set(x, "Description", js.Array(value*))
    
    inline def setFindingProviderFieldsConfidence(value: NumberFilterList): Self = StObject.set(x, "FindingProviderFieldsConfidence", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFieldsConfidenceUndefined: Self = StObject.set(x, "FindingProviderFieldsConfidence", js.undefined)
    
    inline def setFindingProviderFieldsConfidenceVarargs(value: NumberFilter*): Self = StObject.set(x, "FindingProviderFieldsConfidence", js.Array(value*))
    
    inline def setFindingProviderFieldsCriticality(value: NumberFilterList): Self = StObject.set(x, "FindingProviderFieldsCriticality", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFieldsCriticalityUndefined: Self = StObject.set(x, "FindingProviderFieldsCriticality", js.undefined)
    
    inline def setFindingProviderFieldsCriticalityVarargs(value: NumberFilter*): Self = StObject.set(x, "FindingProviderFieldsCriticality", js.Array(value*))
    
    inline def setFindingProviderFieldsRelatedFindingsId(value: StringFilterList): Self = StObject.set(x, "FindingProviderFieldsRelatedFindingsId", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFieldsRelatedFindingsIdUndefined: Self = StObject.set(x, "FindingProviderFieldsRelatedFindingsId", js.undefined)
    
    inline def setFindingProviderFieldsRelatedFindingsIdVarargs(value: StringFilter*): Self = StObject.set(x, "FindingProviderFieldsRelatedFindingsId", js.Array(value*))
    
    inline def setFindingProviderFieldsRelatedFindingsProductArn(value: StringFilterList): Self = StObject.set(x, "FindingProviderFieldsRelatedFindingsProductArn", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFieldsRelatedFindingsProductArnUndefined: Self = StObject.set(x, "FindingProviderFieldsRelatedFindingsProductArn", js.undefined)
    
    inline def setFindingProviderFieldsRelatedFindingsProductArnVarargs(value: StringFilter*): Self = StObject.set(x, "FindingProviderFieldsRelatedFindingsProductArn", js.Array(value*))
    
    inline def setFindingProviderFieldsSeverityLabel(value: StringFilterList): Self = StObject.set(x, "FindingProviderFieldsSeverityLabel", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFieldsSeverityLabelUndefined: Self = StObject.set(x, "FindingProviderFieldsSeverityLabel", js.undefined)
    
    inline def setFindingProviderFieldsSeverityLabelVarargs(value: StringFilter*): Self = StObject.set(x, "FindingProviderFieldsSeverityLabel", js.Array(value*))
    
    inline def setFindingProviderFieldsSeverityOriginal(value: StringFilterList): Self = StObject.set(x, "FindingProviderFieldsSeverityOriginal", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFieldsSeverityOriginalUndefined: Self = StObject.set(x, "FindingProviderFieldsSeverityOriginal", js.undefined)
    
    inline def setFindingProviderFieldsSeverityOriginalVarargs(value: StringFilter*): Self = StObject.set(x, "FindingProviderFieldsSeverityOriginal", js.Array(value*))
    
    inline def setFindingProviderFieldsTypes(value: StringFilterList): Self = StObject.set(x, "FindingProviderFieldsTypes", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFieldsTypesUndefined: Self = StObject.set(x, "FindingProviderFieldsTypes", js.undefined)
    
    inline def setFindingProviderFieldsTypesVarargs(value: StringFilter*): Self = StObject.set(x, "FindingProviderFieldsTypes", js.Array(value*))
    
    inline def setFirstObservedAt(value: DateFilterList): Self = StObject.set(x, "FirstObservedAt", value.asInstanceOf[js.Any])
    
    inline def setFirstObservedAtUndefined: Self = StObject.set(x, "FirstObservedAt", js.undefined)
    
    inline def setFirstObservedAtVarargs(value: DateFilter*): Self = StObject.set(x, "FirstObservedAt", js.Array(value*))
    
    inline def setGeneratorId(value: StringFilterList): Self = StObject.set(x, "GeneratorId", value.asInstanceOf[js.Any])
    
    inline def setGeneratorIdUndefined: Self = StObject.set(x, "GeneratorId", js.undefined)
    
    inline def setGeneratorIdVarargs(value: StringFilter*): Self = StObject.set(x, "GeneratorId", js.Array(value*))
    
    inline def setId(value: StringFilterList): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIdVarargs(value: StringFilter*): Self = StObject.set(x, "Id", js.Array(value*))
    
    inline def setKeyword(value: KeywordFilterList): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
    
    inline def setKeywordVarargs(value: KeywordFilter*): Self = StObject.set(x, "Keyword", js.Array(value*))
    
    inline def setLastObservedAt(value: DateFilterList): Self = StObject.set(x, "LastObservedAt", value.asInstanceOf[js.Any])
    
    inline def setLastObservedAtUndefined: Self = StObject.set(x, "LastObservedAt", js.undefined)
    
    inline def setLastObservedAtVarargs(value: DateFilter*): Self = StObject.set(x, "LastObservedAt", js.Array(value*))
    
    inline def setMalwareName(value: StringFilterList): Self = StObject.set(x, "MalwareName", value.asInstanceOf[js.Any])
    
    inline def setMalwareNameUndefined: Self = StObject.set(x, "MalwareName", js.undefined)
    
    inline def setMalwareNameVarargs(value: StringFilter*): Self = StObject.set(x, "MalwareName", js.Array(value*))
    
    inline def setMalwarePath(value: StringFilterList): Self = StObject.set(x, "MalwarePath", value.asInstanceOf[js.Any])
    
    inline def setMalwarePathUndefined: Self = StObject.set(x, "MalwarePath", js.undefined)
    
    inline def setMalwarePathVarargs(value: StringFilter*): Self = StObject.set(x, "MalwarePath", js.Array(value*))
    
    inline def setMalwareState(value: StringFilterList): Self = StObject.set(x, "MalwareState", value.asInstanceOf[js.Any])
    
    inline def setMalwareStateUndefined: Self = StObject.set(x, "MalwareState", js.undefined)
    
    inline def setMalwareStateVarargs(value: StringFilter*): Self = StObject.set(x, "MalwareState", js.Array(value*))
    
    inline def setMalwareType(value: StringFilterList): Self = StObject.set(x, "MalwareType", value.asInstanceOf[js.Any])
    
    inline def setMalwareTypeUndefined: Self = StObject.set(x, "MalwareType", js.undefined)
    
    inline def setMalwareTypeVarargs(value: StringFilter*): Self = StObject.set(x, "MalwareType", js.Array(value*))
    
    inline def setNetworkDestinationDomain(value: StringFilterList): Self = StObject.set(x, "NetworkDestinationDomain", value.asInstanceOf[js.Any])
    
    inline def setNetworkDestinationDomainUndefined: Self = StObject.set(x, "NetworkDestinationDomain", js.undefined)
    
    inline def setNetworkDestinationDomainVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkDestinationDomain", js.Array(value*))
    
    inline def setNetworkDestinationIpV4(value: IpFilterList): Self = StObject.set(x, "NetworkDestinationIpV4", value.asInstanceOf[js.Any])
    
    inline def setNetworkDestinationIpV4Undefined: Self = StObject.set(x, "NetworkDestinationIpV4", js.undefined)
    
    inline def setNetworkDestinationIpV4Varargs(value: IpFilter*): Self = StObject.set(x, "NetworkDestinationIpV4", js.Array(value*))
    
    inline def setNetworkDestinationIpV6(value: IpFilterList): Self = StObject.set(x, "NetworkDestinationIpV6", value.asInstanceOf[js.Any])
    
    inline def setNetworkDestinationIpV6Undefined: Self = StObject.set(x, "NetworkDestinationIpV6", js.undefined)
    
    inline def setNetworkDestinationIpV6Varargs(value: IpFilter*): Self = StObject.set(x, "NetworkDestinationIpV6", js.Array(value*))
    
    inline def setNetworkDestinationPort(value: NumberFilterList): Self = StObject.set(x, "NetworkDestinationPort", value.asInstanceOf[js.Any])
    
    inline def setNetworkDestinationPortUndefined: Self = StObject.set(x, "NetworkDestinationPort", js.undefined)
    
    inline def setNetworkDestinationPortVarargs(value: NumberFilter*): Self = StObject.set(x, "NetworkDestinationPort", js.Array(value*))
    
    inline def setNetworkDirection(value: StringFilterList): Self = StObject.set(x, "NetworkDirection", value.asInstanceOf[js.Any])
    
    inline def setNetworkDirectionUndefined: Self = StObject.set(x, "NetworkDirection", js.undefined)
    
    inline def setNetworkDirectionVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkDirection", js.Array(value*))
    
    inline def setNetworkProtocol(value: StringFilterList): Self = StObject.set(x, "NetworkProtocol", value.asInstanceOf[js.Any])
    
    inline def setNetworkProtocolUndefined: Self = StObject.set(x, "NetworkProtocol", js.undefined)
    
    inline def setNetworkProtocolVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkProtocol", js.Array(value*))
    
    inline def setNetworkSourceDomain(value: StringFilterList): Self = StObject.set(x, "NetworkSourceDomain", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourceDomainUndefined: Self = StObject.set(x, "NetworkSourceDomain", js.undefined)
    
    inline def setNetworkSourceDomainVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkSourceDomain", js.Array(value*))
    
    inline def setNetworkSourceIpV4(value: IpFilterList): Self = StObject.set(x, "NetworkSourceIpV4", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourceIpV4Undefined: Self = StObject.set(x, "NetworkSourceIpV4", js.undefined)
    
    inline def setNetworkSourceIpV4Varargs(value: IpFilter*): Self = StObject.set(x, "NetworkSourceIpV4", js.Array(value*))
    
    inline def setNetworkSourceIpV6(value: IpFilterList): Self = StObject.set(x, "NetworkSourceIpV6", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourceIpV6Undefined: Self = StObject.set(x, "NetworkSourceIpV6", js.undefined)
    
    inline def setNetworkSourceIpV6Varargs(value: IpFilter*): Self = StObject.set(x, "NetworkSourceIpV6", js.Array(value*))
    
    inline def setNetworkSourceMac(value: StringFilterList): Self = StObject.set(x, "NetworkSourceMac", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourceMacUndefined: Self = StObject.set(x, "NetworkSourceMac", js.undefined)
    
    inline def setNetworkSourceMacVarargs(value: StringFilter*): Self = StObject.set(x, "NetworkSourceMac", js.Array(value*))
    
    inline def setNetworkSourcePort(value: NumberFilterList): Self = StObject.set(x, "NetworkSourcePort", value.asInstanceOf[js.Any])
    
    inline def setNetworkSourcePortUndefined: Self = StObject.set(x, "NetworkSourcePort", js.undefined)
    
    inline def setNetworkSourcePortVarargs(value: NumberFilter*): Self = StObject.set(x, "NetworkSourcePort", js.Array(value*))
    
    inline def setNoteText(value: StringFilterList): Self = StObject.set(x, "NoteText", value.asInstanceOf[js.Any])
    
    inline def setNoteTextUndefined: Self = StObject.set(x, "NoteText", js.undefined)
    
    inline def setNoteTextVarargs(value: StringFilter*): Self = StObject.set(x, "NoteText", js.Array(value*))
    
    inline def setNoteUpdatedAt(value: DateFilterList): Self = StObject.set(x, "NoteUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setNoteUpdatedAtUndefined: Self = StObject.set(x, "NoteUpdatedAt", js.undefined)
    
    inline def setNoteUpdatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "NoteUpdatedAt", js.Array(value*))
    
    inline def setNoteUpdatedBy(value: StringFilterList): Self = StObject.set(x, "NoteUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setNoteUpdatedByUndefined: Self = StObject.set(x, "NoteUpdatedBy", js.undefined)
    
    inline def setNoteUpdatedByVarargs(value: StringFilter*): Self = StObject.set(x, "NoteUpdatedBy", js.Array(value*))
    
    inline def setProcessLaunchedAt(value: DateFilterList): Self = StObject.set(x, "ProcessLaunchedAt", value.asInstanceOf[js.Any])
    
    inline def setProcessLaunchedAtUndefined: Self = StObject.set(x, "ProcessLaunchedAt", js.undefined)
    
    inline def setProcessLaunchedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ProcessLaunchedAt", js.Array(value*))
    
    inline def setProcessName(value: StringFilterList): Self = StObject.set(x, "ProcessName", value.asInstanceOf[js.Any])
    
    inline def setProcessNameUndefined: Self = StObject.set(x, "ProcessName", js.undefined)
    
    inline def setProcessNameVarargs(value: StringFilter*): Self = StObject.set(x, "ProcessName", js.Array(value*))
    
    inline def setProcessParentPid(value: NumberFilterList): Self = StObject.set(x, "ProcessParentPid", value.asInstanceOf[js.Any])
    
    inline def setProcessParentPidUndefined: Self = StObject.set(x, "ProcessParentPid", js.undefined)
    
    inline def setProcessParentPidVarargs(value: NumberFilter*): Self = StObject.set(x, "ProcessParentPid", js.Array(value*))
    
    inline def setProcessPath(value: StringFilterList): Self = StObject.set(x, "ProcessPath", value.asInstanceOf[js.Any])
    
    inline def setProcessPathUndefined: Self = StObject.set(x, "ProcessPath", js.undefined)
    
    inline def setProcessPathVarargs(value: StringFilter*): Self = StObject.set(x, "ProcessPath", js.Array(value*))
    
    inline def setProcessPid(value: NumberFilterList): Self = StObject.set(x, "ProcessPid", value.asInstanceOf[js.Any])
    
    inline def setProcessPidUndefined: Self = StObject.set(x, "ProcessPid", js.undefined)
    
    inline def setProcessPidVarargs(value: NumberFilter*): Self = StObject.set(x, "ProcessPid", js.Array(value*))
    
    inline def setProcessTerminatedAt(value: DateFilterList): Self = StObject.set(x, "ProcessTerminatedAt", value.asInstanceOf[js.Any])
    
    inline def setProcessTerminatedAtUndefined: Self = StObject.set(x, "ProcessTerminatedAt", js.undefined)
    
    inline def setProcessTerminatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ProcessTerminatedAt", js.Array(value*))
    
    inline def setProductArn(value: StringFilterList): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
    
    inline def setProductArnUndefined: Self = StObject.set(x, "ProductArn", js.undefined)
    
    inline def setProductArnVarargs(value: StringFilter*): Self = StObject.set(x, "ProductArn", js.Array(value*))
    
    inline def setProductFields(value: MapFilterList): Self = StObject.set(x, "ProductFields", value.asInstanceOf[js.Any])
    
    inline def setProductFieldsUndefined: Self = StObject.set(x, "ProductFields", js.undefined)
    
    inline def setProductFieldsVarargs(value: MapFilter*): Self = StObject.set(x, "ProductFields", js.Array(value*))
    
    inline def setProductName(value: StringFilterList): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    inline def setProductNameVarargs(value: StringFilter*): Self = StObject.set(x, "ProductName", js.Array(value*))
    
    inline def setRecommendationText(value: StringFilterList): Self = StObject.set(x, "RecommendationText", value.asInstanceOf[js.Any])
    
    inline def setRecommendationTextUndefined: Self = StObject.set(x, "RecommendationText", js.undefined)
    
    inline def setRecommendationTextVarargs(value: StringFilter*): Self = StObject.set(x, "RecommendationText", js.Array(value*))
    
    inline def setRecordState(value: StringFilterList): Self = StObject.set(x, "RecordState", value.asInstanceOf[js.Any])
    
    inline def setRecordStateUndefined: Self = StObject.set(x, "RecordState", js.undefined)
    
    inline def setRecordStateVarargs(value: StringFilter*): Self = StObject.set(x, "RecordState", js.Array(value*))
    
    inline def setRegion(value: StringFilterList): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setRegionVarargs(value: StringFilter*): Self = StObject.set(x, "Region", js.Array(value*))
    
    inline def setRelatedFindingsId(value: StringFilterList): Self = StObject.set(x, "RelatedFindingsId", value.asInstanceOf[js.Any])
    
    inline def setRelatedFindingsIdUndefined: Self = StObject.set(x, "RelatedFindingsId", js.undefined)
    
    inline def setRelatedFindingsIdVarargs(value: StringFilter*): Self = StObject.set(x, "RelatedFindingsId", js.Array(value*))
    
    inline def setRelatedFindingsProductArn(value: StringFilterList): Self = StObject.set(x, "RelatedFindingsProductArn", value.asInstanceOf[js.Any])
    
    inline def setRelatedFindingsProductArnUndefined: Self = StObject.set(x, "RelatedFindingsProductArn", js.undefined)
    
    inline def setRelatedFindingsProductArnVarargs(value: StringFilter*): Self = StObject.set(x, "RelatedFindingsProductArn", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceIamInstanceProfileArn(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceIamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceIamInstanceProfileArnUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceIamInstanceProfileArn", js.undefined)
    
    inline def setResourceAwsEc2InstanceIamInstanceProfileArnVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceIamInstanceProfileArn", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceImageId(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceImageId", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceImageIdUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceImageId", js.undefined)
    
    inline def setResourceAwsEc2InstanceImageIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceImageId", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceIpV4Addresses(value: IpFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceIpV4Addresses", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceIpV4AddressesUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceIpV4Addresses", js.undefined)
    
    inline def setResourceAwsEc2InstanceIpV4AddressesVarargs(value: IpFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceIpV4Addresses", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceIpV6Addresses(value: IpFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceIpV6Addresses", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceIpV6AddressesUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceIpV6Addresses", js.undefined)
    
    inline def setResourceAwsEc2InstanceIpV6AddressesVarargs(value: IpFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceIpV6Addresses", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceKeyName(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceKeyName", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceKeyNameUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceKeyName", js.undefined)
    
    inline def setResourceAwsEc2InstanceKeyNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceKeyName", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceLaunchedAt(value: DateFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceLaunchedAt", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceLaunchedAtUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceLaunchedAt", js.undefined)
    
    inline def setResourceAwsEc2InstanceLaunchedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceLaunchedAt", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceSubnetId(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceSubnetId", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceSubnetIdUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceSubnetId", js.undefined)
    
    inline def setResourceAwsEc2InstanceSubnetIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceSubnetId", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceType(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceType", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceTypeUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceType", js.undefined)
    
    inline def setResourceAwsEc2InstanceTypeVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceType", js.Array(value*))
    
    inline def setResourceAwsEc2InstanceVpcId(value: StringFilterList): Self = StObject.set(x, "ResourceAwsEc2InstanceVpcId", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsEc2InstanceVpcIdUndefined: Self = StObject.set(x, "ResourceAwsEc2InstanceVpcId", js.undefined)
    
    inline def setResourceAwsEc2InstanceVpcIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsEc2InstanceVpcId", js.Array(value*))
    
    inline def setResourceAwsIamAccessKeyCreatedAt(value: DateFilterList): Self = StObject.set(x, "ResourceAwsIamAccessKeyCreatedAt", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsIamAccessKeyCreatedAtUndefined: Self = StObject.set(x, "ResourceAwsIamAccessKeyCreatedAt", js.undefined)
    
    inline def setResourceAwsIamAccessKeyCreatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ResourceAwsIamAccessKeyCreatedAt", js.Array(value*))
    
    inline def setResourceAwsIamAccessKeyPrincipalName(value: StringFilterList): Self = StObject.set(x, "ResourceAwsIamAccessKeyPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsIamAccessKeyPrincipalNameUndefined: Self = StObject.set(x, "ResourceAwsIamAccessKeyPrincipalName", js.undefined)
    
    inline def setResourceAwsIamAccessKeyPrincipalNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsIamAccessKeyPrincipalName", js.Array(value*))
    
    inline def setResourceAwsIamAccessKeyStatus(value: StringFilterList): Self = StObject.set(x, "ResourceAwsIamAccessKeyStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsIamAccessKeyStatusUndefined: Self = StObject.set(x, "ResourceAwsIamAccessKeyStatus", js.undefined)
    
    inline def setResourceAwsIamAccessKeyStatusVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsIamAccessKeyStatus", js.Array(value*))
    
    inline def setResourceAwsIamAccessKeyUserName(value: StringFilterList): Self = StObject.set(x, "ResourceAwsIamAccessKeyUserName", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsIamAccessKeyUserNameUndefined: Self = StObject.set(x, "ResourceAwsIamAccessKeyUserName", js.undefined)
    
    inline def setResourceAwsIamAccessKeyUserNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsIamAccessKeyUserName", js.Array(value*))
    
    inline def setResourceAwsIamUserUserName(value: StringFilterList): Self = StObject.set(x, "ResourceAwsIamUserUserName", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsIamUserUserNameUndefined: Self = StObject.set(x, "ResourceAwsIamUserUserName", js.undefined)
    
    inline def setResourceAwsIamUserUserNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsIamUserUserName", js.Array(value*))
    
    inline def setResourceAwsS3BucketOwnerId(value: StringFilterList): Self = StObject.set(x, "ResourceAwsS3BucketOwnerId", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsS3BucketOwnerIdUndefined: Self = StObject.set(x, "ResourceAwsS3BucketOwnerId", js.undefined)
    
    inline def setResourceAwsS3BucketOwnerIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsS3BucketOwnerId", js.Array(value*))
    
    inline def setResourceAwsS3BucketOwnerName(value: StringFilterList): Self = StObject.set(x, "ResourceAwsS3BucketOwnerName", value.asInstanceOf[js.Any])
    
    inline def setResourceAwsS3BucketOwnerNameUndefined: Self = StObject.set(x, "ResourceAwsS3BucketOwnerName", js.undefined)
    
    inline def setResourceAwsS3BucketOwnerNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceAwsS3BucketOwnerName", js.Array(value*))
    
    inline def setResourceContainerImageId(value: StringFilterList): Self = StObject.set(x, "ResourceContainerImageId", value.asInstanceOf[js.Any])
    
    inline def setResourceContainerImageIdUndefined: Self = StObject.set(x, "ResourceContainerImageId", js.undefined)
    
    inline def setResourceContainerImageIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceContainerImageId", js.Array(value*))
    
    inline def setResourceContainerImageName(value: StringFilterList): Self = StObject.set(x, "ResourceContainerImageName", value.asInstanceOf[js.Any])
    
    inline def setResourceContainerImageNameUndefined: Self = StObject.set(x, "ResourceContainerImageName", js.undefined)
    
    inline def setResourceContainerImageNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceContainerImageName", js.Array(value*))
    
    inline def setResourceContainerLaunchedAt(value: DateFilterList): Self = StObject.set(x, "ResourceContainerLaunchedAt", value.asInstanceOf[js.Any])
    
    inline def setResourceContainerLaunchedAtUndefined: Self = StObject.set(x, "ResourceContainerLaunchedAt", js.undefined)
    
    inline def setResourceContainerLaunchedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ResourceContainerLaunchedAt", js.Array(value*))
    
    inline def setResourceContainerName(value: StringFilterList): Self = StObject.set(x, "ResourceContainerName", value.asInstanceOf[js.Any])
    
    inline def setResourceContainerNameUndefined: Self = StObject.set(x, "ResourceContainerName", js.undefined)
    
    inline def setResourceContainerNameVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceContainerName", js.Array(value*))
    
    inline def setResourceDetailsOther(value: MapFilterList): Self = StObject.set(x, "ResourceDetailsOther", value.asInstanceOf[js.Any])
    
    inline def setResourceDetailsOtherUndefined: Self = StObject.set(x, "ResourceDetailsOther", js.undefined)
    
    inline def setResourceDetailsOtherVarargs(value: MapFilter*): Self = StObject.set(x, "ResourceDetailsOther", js.Array(value*))
    
    inline def setResourceId(value: StringFilterList): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceIdVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceId", js.Array(value*))
    
    inline def setResourcePartition(value: StringFilterList): Self = StObject.set(x, "ResourcePartition", value.asInstanceOf[js.Any])
    
    inline def setResourcePartitionUndefined: Self = StObject.set(x, "ResourcePartition", js.undefined)
    
    inline def setResourcePartitionVarargs(value: StringFilter*): Self = StObject.set(x, "ResourcePartition", js.Array(value*))
    
    inline def setResourceRegion(value: StringFilterList): Self = StObject.set(x, "ResourceRegion", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionUndefined: Self = StObject.set(x, "ResourceRegion", js.undefined)
    
    inline def setResourceRegionVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceRegion", js.Array(value*))
    
    inline def setResourceTags(value: MapFilterList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: MapFilter*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: StringFilterList): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setResourceTypeVarargs(value: StringFilter*): Self = StObject.set(x, "ResourceType", js.Array(value*))
    
    inline def setSample(value: BooleanFilterList): Self = StObject.set(x, "Sample", value.asInstanceOf[js.Any])
    
    inline def setSampleUndefined: Self = StObject.set(x, "Sample", js.undefined)
    
    inline def setSampleVarargs(value: BooleanFilter*): Self = StObject.set(x, "Sample", js.Array(value*))
    
    inline def setSeverityLabel(value: StringFilterList): Self = StObject.set(x, "SeverityLabel", value.asInstanceOf[js.Any])
    
    inline def setSeverityLabelUndefined: Self = StObject.set(x, "SeverityLabel", js.undefined)
    
    inline def setSeverityLabelVarargs(value: StringFilter*): Self = StObject.set(x, "SeverityLabel", js.Array(value*))
    
    inline def setSeverityNormalized(value: NumberFilterList): Self = StObject.set(x, "SeverityNormalized", value.asInstanceOf[js.Any])
    
    inline def setSeverityNormalizedUndefined: Self = StObject.set(x, "SeverityNormalized", js.undefined)
    
    inline def setSeverityNormalizedVarargs(value: NumberFilter*): Self = StObject.set(x, "SeverityNormalized", js.Array(value*))
    
    inline def setSeverityProduct(value: NumberFilterList): Self = StObject.set(x, "SeverityProduct", value.asInstanceOf[js.Any])
    
    inline def setSeverityProductUndefined: Self = StObject.set(x, "SeverityProduct", js.undefined)
    
    inline def setSeverityProductVarargs(value: NumberFilter*): Self = StObject.set(x, "SeverityProduct", js.Array(value*))
    
    inline def setSourceUrl(value: StringFilterList): Self = StObject.set(x, "SourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "SourceUrl", js.undefined)
    
    inline def setSourceUrlVarargs(value: StringFilter*): Self = StObject.set(x, "SourceUrl", js.Array(value*))
    
    inline def setThreatIntelIndicatorCategory(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorCategory", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelIndicatorCategoryUndefined: Self = StObject.set(x, "ThreatIntelIndicatorCategory", js.undefined)
    
    inline def setThreatIntelIndicatorCategoryVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorCategory", js.Array(value*))
    
    inline def setThreatIntelIndicatorLastObservedAt(value: DateFilterList): Self = StObject.set(x, "ThreatIntelIndicatorLastObservedAt", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelIndicatorLastObservedAtUndefined: Self = StObject.set(x, "ThreatIntelIndicatorLastObservedAt", js.undefined)
    
    inline def setThreatIntelIndicatorLastObservedAtVarargs(value: DateFilter*): Self = StObject.set(x, "ThreatIntelIndicatorLastObservedAt", js.Array(value*))
    
    inline def setThreatIntelIndicatorSource(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorSource", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelIndicatorSourceUndefined: Self = StObject.set(x, "ThreatIntelIndicatorSource", js.undefined)
    
    inline def setThreatIntelIndicatorSourceUrl(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelIndicatorSourceUrlUndefined: Self = StObject.set(x, "ThreatIntelIndicatorSourceUrl", js.undefined)
    
    inline def setThreatIntelIndicatorSourceUrlVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorSourceUrl", js.Array(value*))
    
    inline def setThreatIntelIndicatorSourceVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorSource", js.Array(value*))
    
    inline def setThreatIntelIndicatorType(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorType", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelIndicatorTypeUndefined: Self = StObject.set(x, "ThreatIntelIndicatorType", js.undefined)
    
    inline def setThreatIntelIndicatorTypeVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorType", js.Array(value*))
    
    inline def setThreatIntelIndicatorValue(value: StringFilterList): Self = StObject.set(x, "ThreatIntelIndicatorValue", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelIndicatorValueUndefined: Self = StObject.set(x, "ThreatIntelIndicatorValue", js.undefined)
    
    inline def setThreatIntelIndicatorValueVarargs(value: StringFilter*): Self = StObject.set(x, "ThreatIntelIndicatorValue", js.Array(value*))
    
    inline def setTitle(value: StringFilterList): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setTitleVarargs(value: StringFilter*): Self = StObject.set(x, "Title", js.Array(value*))
    
    inline def setType(value: StringFilterList): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setTypeVarargs(value: StringFilter*): Self = StObject.set(x, "Type", js.Array(value*))
    
    inline def setUpdatedAt(value: DateFilterList): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setUpdatedAtVarargs(value: DateFilter*): Self = StObject.set(x, "UpdatedAt", js.Array(value*))
    
    inline def setUserDefinedFields(value: MapFilterList): Self = StObject.set(x, "UserDefinedFields", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFieldsUndefined: Self = StObject.set(x, "UserDefinedFields", js.undefined)
    
    inline def setUserDefinedFieldsVarargs(value: MapFilter*): Self = StObject.set(x, "UserDefinedFields", js.Array(value*))
    
    inline def setVerificationState(value: StringFilterList): Self = StObject.set(x, "VerificationState", value.asInstanceOf[js.Any])
    
    inline def setVerificationStateUndefined: Self = StObject.set(x, "VerificationState", js.undefined)
    
    inline def setVerificationStateVarargs(value: StringFilter*): Self = StObject.set(x, "VerificationState", js.Array(value*))
    
    inline def setWorkflowState(value: StringFilterList): Self = StObject.set(x, "WorkflowState", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStateUndefined: Self = StObject.set(x, "WorkflowState", js.undefined)
    
    inline def setWorkflowStateVarargs(value: StringFilter*): Self = StObject.set(x, "WorkflowState", js.Array(value*))
    
    inline def setWorkflowStatus(value: StringFilterList): Self = StObject.set(x, "WorkflowStatus", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStatusUndefined: Self = StObject.set(x, "WorkflowStatus", js.undefined)
    
    inline def setWorkflowStatusVarargs(value: StringFilter*): Self = StObject.set(x, "WorkflowStatus", js.Array(value*))
  }
}
