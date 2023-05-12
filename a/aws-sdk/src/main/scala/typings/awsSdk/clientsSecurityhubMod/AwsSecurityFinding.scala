package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSecurityFinding extends StObject {
  
  /**
    * Provides details about an action that affects or that was taken on a resource.
    */
  var Action: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Action] = js.undefined
  
  /**
    * The Amazon Web Services account ID that a finding is generated in.
    */
  var AwsAccountId: NonEmptyString
  
  /**
    * The name of the company for the product that generated the finding. Security Hub populates this attribute automatically for each finding. You cannot update this attribute with BatchImportFindings or BatchUpdateFindings. The exception to this is a custom integration. When you use the Security Hub console or API to filter findings by company name, you use this attribute.
    */
  var CompanyName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * This data type is exclusive to findings that are generated as the result of a check run against a specific rule in a supported security standard, such as CIS Amazon Web Services Foundations. Contains security standard-related finding details.
    */
  var Compliance: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Compliance] = js.undefined
  
  /**
    * A finding's confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates when the security findings provider created the potential security issue that a finding captured. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedAt: NonEmptyString
  
  /**
    * The level of importance assigned to the resources associated with the finding. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources.
    */
  var Criticality: js.UndefOr[Integer] = js.undefined
  
  /**
    * A finding's description.  In this release, Description is a required property. 
    */
  var Description: NonEmptyString
  
  /**
    * In a BatchImportFindings request, finding providers use FindingProviderFields to provide and update their own values for confidence, criticality, related findings, severity, and types.
    */
  var FindingProviderFields: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.FindingProviderFields] = js.undefined
  
  /**
    * Indicates when the security findings provider first observed the potential security issue that a finding captured. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var FirstObservedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier for the solution-specific component (a discrete unit of logic) that generated a finding. In various security findings providers' solutions, this generator can be called a rule, a check, a detector, a plugin, etc. 
    */
  var GeneratorId: NonEmptyString
  
  /**
    * The security findings provider-specific identifier for a finding.
    */
  var Id: NonEmptyString
  
  /**
    * Indicates when the security findings provider most recently observed the potential security issue that a finding captured. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of malware related to a finding.
    */
  var Malware: js.UndefOr[MalwareList] = js.undefined
  
  /**
    * The details of network-related information about a finding.
    */
  var Network: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Network] = js.undefined
  
  /**
    * Provides information about a network path that is relevant to a finding. Each entry under NetworkPath represents a component of that path.
    */
  var NetworkPath: js.UndefOr[NetworkPathList] = js.undefined
  
  /**
    * A user-defined note added to a finding.
    */
  var Note: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Note] = js.undefined
  
  /**
    * Provides an overview of the patch compliance status for an instance against a selected compliance standard.
    */
  var PatchSummary: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.PatchSummary] = js.undefined
  
  /**
    * The details of process-related information about a finding.
    */
  var Process: js.UndefOr[ProcessDetails] = js.undefined
  
  /**
    * The ARN generated by Security Hub that uniquely identifies a product that generates findings. This can be the ARN for a third-party product that is integrated with Security Hub, or the ARN for a custom integration.
    */
  var ProductArn: NonEmptyString
  
  /**
    * A data type where security findings providers can include additional solution-specific details that aren't part of the defined AwsSecurityFinding format. Can contain up to 50 key-value pairs. For each key-value pair, the key can contain up to 128 characters, and the value can contain up to 2048 characters.
    */
  var ProductFields: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * The name of the product that generated the finding. Security Hub populates this attribute automatically for each finding. You cannot update this attribute with BatchImportFindings or BatchUpdateFindings. The exception to this is a custom integration. When you use the Security Hub console or API to filter findings by product name, you use this attribute.
    */
  var ProductName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The record state of a finding.
    */
  var RecordState: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.RecordState] = js.undefined
  
  /**
    * The Region from which the finding was generated. Security Hub populates this attribute automatically for each finding. You cannot update it using BatchImportFindings or BatchUpdateFindings.
    */
  var Region: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of related findings.
    */
  var RelatedFindings: js.UndefOr[RelatedFindingList] = js.undefined
  
  /**
    * A data type that describes the remediation options for a finding.
    */
  var Remediation: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Remediation] = js.undefined
  
  /**
    * A set of resource data types that describe the resources that the finding refers to.
    */
  var Resources: ResourceList
  
  /**
    * Indicates whether the finding is a sample finding.
    */
  var Sample: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The schema version that a finding is formatted for.
    */
  var SchemaVersion: NonEmptyString
  
  /**
    * A finding's severity.
    */
  var Severity: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Severity] = js.undefined
  
  /**
    * A URL that links to a page about the current finding in the security findings provider's solution.
    */
  var SourceUrl: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Threat intelligence details related to a finding.
    */
  var ThreatIntelIndicators: js.UndefOr[ThreatIntelIndicatorList] = js.undefined
  
  /**
    * Details about the threat detected in a security finding and the file paths that were affected by the threat. 
    */
  var Threats: js.UndefOr[ThreatList] = js.undefined
  
  /**
    * A finding's title.  In this release, Title is a required property. 
    */
  var Title: NonEmptyString
  
  /**
    * One or more finding types in the format of namespace/category/classifier that classify a finding. Valid namespace values are: Software and Configuration Checks | TTPs | Effects | Unusual Behaviors | Sensitive Data Identifications
    */
  var Types: js.UndefOr[TypeList] = js.undefined
  
  /**
    * Indicates when the security findings provider last updated the finding record. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var UpdatedAt: NonEmptyString
  
  /**
    * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding. 
    */
  var UserDefinedFields: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * Indicates the veracity of a finding. 
    */
  var VerificationState: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.VerificationState] = js.undefined
  
  /**
    * Provides a list of vulnerabilities associated with the findings.
    */
  var Vulnerabilities: js.UndefOr[VulnerabilityList] = js.undefined
  
  /**
    * Provides information about the status of the investigation into a finding.
    */
  var Workflow: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Workflow] = js.undefined
  
  /**
    * The workflow state of a finding. 
    */
  var WorkflowState: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.WorkflowState] = js.undefined
}
object AwsSecurityFinding {
  
  inline def apply(
    AwsAccountId: NonEmptyString,
    CreatedAt: NonEmptyString,
    Description: NonEmptyString,
    GeneratorId: NonEmptyString,
    Id: NonEmptyString,
    ProductArn: NonEmptyString,
    Resources: ResourceList,
    SchemaVersion: NonEmptyString,
    Title: NonEmptyString,
    UpdatedAt: NonEmptyString
  ): AwsSecurityFinding = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], GeneratorId = GeneratorId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ProductArn = ProductArn.asInstanceOf[js.Any], Resources = Resources.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsSecurityFinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsSecurityFinding] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setAwsAccountId(value: NonEmptyString): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setCompanyName(value: NonEmptyString): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
    
    inline def setCompliance(value: Compliance): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    inline def setConfidence(value: Integer): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setCreatedAt(value: NonEmptyString): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCriticality(value: Integer): Self = StObject.set(x, "Criticality", value.asInstanceOf[js.Any])
    
    inline def setCriticalityUndefined: Self = StObject.set(x, "Criticality", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFields(value: FindingProviderFields): Self = StObject.set(x, "FindingProviderFields", value.asInstanceOf[js.Any])
    
    inline def setFindingProviderFieldsUndefined: Self = StObject.set(x, "FindingProviderFields", js.undefined)
    
    inline def setFirstObservedAt(value: NonEmptyString): Self = StObject.set(x, "FirstObservedAt", value.asInstanceOf[js.Any])
    
    inline def setFirstObservedAtUndefined: Self = StObject.set(x, "FirstObservedAt", js.undefined)
    
    inline def setGeneratorId(value: NonEmptyString): Self = StObject.set(x, "GeneratorId", value.asInstanceOf[js.Any])
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastObservedAt(value: NonEmptyString): Self = StObject.set(x, "LastObservedAt", value.asInstanceOf[js.Any])
    
    inline def setLastObservedAtUndefined: Self = StObject.set(x, "LastObservedAt", js.undefined)
    
    inline def setMalware(value: MalwareList): Self = StObject.set(x, "Malware", value.asInstanceOf[js.Any])
    
    inline def setMalwareUndefined: Self = StObject.set(x, "Malware", js.undefined)
    
    inline def setMalwareVarargs(value: Malware*): Self = StObject.set(x, "Malware", js.Array(value*))
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
    
    inline def setNetworkPath(value: NetworkPathList): Self = StObject.set(x, "NetworkPath", value.asInstanceOf[js.Any])
    
    inline def setNetworkPathUndefined: Self = StObject.set(x, "NetworkPath", js.undefined)
    
    inline def setNetworkPathVarargs(value: NetworkPathComponent*): Self = StObject.set(x, "NetworkPath", js.Array(value*))
    
    inline def setNetworkUndefined: Self = StObject.set(x, "Network", js.undefined)
    
    inline def setNote(value: Note): Self = StObject.set(x, "Note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "Note", js.undefined)
    
    inline def setPatchSummary(value: PatchSummary): Self = StObject.set(x, "PatchSummary", value.asInstanceOf[js.Any])
    
    inline def setPatchSummaryUndefined: Self = StObject.set(x, "PatchSummary", js.undefined)
    
    inline def setProcess(value: ProcessDetails): Self = StObject.set(x, "Process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "Process", js.undefined)
    
    inline def setProductArn(value: NonEmptyString): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
    
    inline def setProductFields(value: FieldMap): Self = StObject.set(x, "ProductFields", value.asInstanceOf[js.Any])
    
    inline def setProductFieldsUndefined: Self = StObject.set(x, "ProductFields", js.undefined)
    
    inline def setProductName(value: NonEmptyString): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    inline def setRecordState(value: RecordState): Self = StObject.set(x, "RecordState", value.asInstanceOf[js.Any])
    
    inline def setRecordStateUndefined: Self = StObject.set(x, "RecordState", js.undefined)
    
    inline def setRegion(value: NonEmptyString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setRelatedFindings(value: RelatedFindingList): Self = StObject.set(x, "RelatedFindings", value.asInstanceOf[js.Any])
    
    inline def setRelatedFindingsUndefined: Self = StObject.set(x, "RelatedFindings", js.undefined)
    
    inline def setRelatedFindingsVarargs(value: RelatedFinding*): Self = StObject.set(x, "RelatedFindings", js.Array(value*))
    
    inline def setRemediation(value: Remediation): Self = StObject.set(x, "Remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "Remediation", js.undefined)
    
    inline def setResources(value: ResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setSample(value: Boolean): Self = StObject.set(x, "Sample", value.asInstanceOf[js.Any])
    
    inline def setSampleUndefined: Self = StObject.set(x, "Sample", js.undefined)
    
    inline def setSchemaVersion(value: NonEmptyString): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setSourceUrl(value: NonEmptyString): Self = StObject.set(x, "SourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "SourceUrl", js.undefined)
    
    inline def setThreatIntelIndicators(value: ThreatIntelIndicatorList): Self = StObject.set(x, "ThreatIntelIndicators", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelIndicatorsUndefined: Self = StObject.set(x, "ThreatIntelIndicators", js.undefined)
    
    inline def setThreatIntelIndicatorsVarargs(value: ThreatIntelIndicator*): Self = StObject.set(x, "ThreatIntelIndicators", js.Array(value*))
    
    inline def setThreats(value: ThreatList): Self = StObject.set(x, "Threats", value.asInstanceOf[js.Any])
    
    inline def setThreatsUndefined: Self = StObject.set(x, "Threats", js.undefined)
    
    inline def setThreatsVarargs(value: Threat*): Self = StObject.set(x, "Threats", js.Array(value*))
    
    inline def setTitle(value: NonEmptyString): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: TypeList): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    inline def setTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Types", js.Array(value*))
    
    inline def setUpdatedAt(value: NonEmptyString): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFields(value: FieldMap): Self = StObject.set(x, "UserDefinedFields", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFieldsUndefined: Self = StObject.set(x, "UserDefinedFields", js.undefined)
    
    inline def setVerificationState(value: VerificationState): Self = StObject.set(x, "VerificationState", value.asInstanceOf[js.Any])
    
    inline def setVerificationStateUndefined: Self = StObject.set(x, "VerificationState", js.undefined)
    
    inline def setVulnerabilities(value: VulnerabilityList): Self = StObject.set(x, "Vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesUndefined: Self = StObject.set(x, "Vulnerabilities", js.undefined)
    
    inline def setVulnerabilitiesVarargs(value: Vulnerability*): Self = StObject.set(x, "Vulnerabilities", js.Array(value*))
    
    inline def setWorkflow(value: Workflow): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
    
    inline def setWorkflowState(value: WorkflowState): Self = StObject.set(x, "WorkflowState", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStateUndefined: Self = StObject.set(x, "WorkflowState", js.undefined)
    
    inline def setWorkflowUndefined: Self = StObject.set(x, "Workflow", js.undefined)
  }
}
