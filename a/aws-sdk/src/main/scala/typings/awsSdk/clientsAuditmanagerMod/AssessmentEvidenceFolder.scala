package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentEvidenceFolder extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The total count of evidence that's included in the assessment report. 
    */
  var assessmentReportSelectionCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The name of the user who created the evidence folder. 
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    *  The unique identifier for the control. 
    */
  var controlId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the control. 
    */
  var controlName: js.UndefOr[ControlName] = js.undefined
  
  /**
    *  The identifier for the control set. 
    */
  var controlSetId: js.UndefOr[ControlSetId] = js.undefined
  
  /**
    *  The Amazon Web Service that the evidence was collected from. 
    */
  var dataSource: js.UndefOr[String] = js.undefined
  
  /**
    *  The date when the first evidence was added to the evidence folder. 
    */
  var date: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The total number of Amazon Web Services resources that were assessed to generate the evidence. 
    */
  var evidenceAwsServiceSourceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The number of evidence that falls under the compliance check category. This evidence is collected from Config or Security Hub. 
    */
  var evidenceByTypeComplianceCheckCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The total number of issues that were reported directly from Security Hub, Config, or both. 
    */
  var evidenceByTypeComplianceCheckIssuesCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The number of evidence that falls under the configuration data category. This evidence is collected from configuration snapshots of other Amazon Web Services such as Amazon EC2, Amazon S3, or IAM. 
    */
  var evidenceByTypeConfigurationDataCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The number of evidence that falls under the manual category. This evidence is imported manually. 
    */
  var evidenceByTypeManualCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The number of evidence that falls under the user activity category. This evidence is collected from CloudTrail logs. 
    */
  var evidenceByTypeUserActivityCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The amount of evidence that's included in the evidence folder. 
    */
  var evidenceResourcesIncludedCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The identifier for the folder that the evidence is stored in. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the evidence folder. 
    */
  var name: js.UndefOr[AssessmentEvidenceFolderName] = js.undefined
  
  /**
    *  The total amount of evidence in the evidence folder. 
    */
  var totalEvidence: js.UndefOr[Integer] = js.undefined
}
object AssessmentEvidenceFolder {
  
  inline def apply(): AssessmentEvidenceFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentEvidenceFolder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssessmentEvidenceFolder] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setAssessmentIdUndefined: Self = StObject.set(x, "assessmentId", js.undefined)
    
    inline def setAssessmentReportSelectionCount(value: Integer): Self = StObject.set(x, "assessmentReportSelectionCount", value.asInstanceOf[js.Any])
    
    inline def setAssessmentReportSelectionCountUndefined: Self = StObject.set(x, "assessmentReportSelectionCount", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setControlId(value: UUID): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlIdUndefined: Self = StObject.set(x, "controlId", js.undefined)
    
    inline def setControlName(value: ControlName): Self = StObject.set(x, "controlName", value.asInstanceOf[js.Any])
    
    inline def setControlNameUndefined: Self = StObject.set(x, "controlName", js.undefined)
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setControlSetIdUndefined: Self = StObject.set(x, "controlSetId", js.undefined)
    
    inline def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEvidenceAwsServiceSourceCount(value: Integer): Self = StObject.set(x, "evidenceAwsServiceSourceCount", value.asInstanceOf[js.Any])
    
    inline def setEvidenceAwsServiceSourceCountUndefined: Self = StObject.set(x, "evidenceAwsServiceSourceCount", js.undefined)
    
    inline def setEvidenceByTypeComplianceCheckCount(value: Integer): Self = StObject.set(x, "evidenceByTypeComplianceCheckCount", value.asInstanceOf[js.Any])
    
    inline def setEvidenceByTypeComplianceCheckCountUndefined: Self = StObject.set(x, "evidenceByTypeComplianceCheckCount", js.undefined)
    
    inline def setEvidenceByTypeComplianceCheckIssuesCount(value: Integer): Self = StObject.set(x, "evidenceByTypeComplianceCheckIssuesCount", value.asInstanceOf[js.Any])
    
    inline def setEvidenceByTypeComplianceCheckIssuesCountUndefined: Self = StObject.set(x, "evidenceByTypeComplianceCheckIssuesCount", js.undefined)
    
    inline def setEvidenceByTypeConfigurationDataCount(value: Integer): Self = StObject.set(x, "evidenceByTypeConfigurationDataCount", value.asInstanceOf[js.Any])
    
    inline def setEvidenceByTypeConfigurationDataCountUndefined: Self = StObject.set(x, "evidenceByTypeConfigurationDataCount", js.undefined)
    
    inline def setEvidenceByTypeManualCount(value: Integer): Self = StObject.set(x, "evidenceByTypeManualCount", value.asInstanceOf[js.Any])
    
    inline def setEvidenceByTypeManualCountUndefined: Self = StObject.set(x, "evidenceByTypeManualCount", js.undefined)
    
    inline def setEvidenceByTypeUserActivityCount(value: Integer): Self = StObject.set(x, "evidenceByTypeUserActivityCount", value.asInstanceOf[js.Any])
    
    inline def setEvidenceByTypeUserActivityCountUndefined: Self = StObject.set(x, "evidenceByTypeUserActivityCount", js.undefined)
    
    inline def setEvidenceResourcesIncludedCount(value: Integer): Self = StObject.set(x, "evidenceResourcesIncludedCount", value.asInstanceOf[js.Any])
    
    inline def setEvidenceResourcesIncludedCountUndefined: Self = StObject.set(x, "evidenceResourcesIncludedCount", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: AssessmentEvidenceFolderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTotalEvidence(value: Integer): Self = StObject.set(x, "totalEvidence", value.asInstanceOf[js.Any])
    
    inline def setTotalEvidenceUndefined: Self = StObject.set(x, "totalEvidence", js.undefined)
  }
}
