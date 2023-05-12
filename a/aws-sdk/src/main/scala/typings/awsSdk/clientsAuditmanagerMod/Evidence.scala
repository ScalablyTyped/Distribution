package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evidence extends StObject {
  
  /**
    *  Specifies whether the evidence is included in the assessment report. 
    */
  var assessmentReportSelection: js.UndefOr[String] = js.undefined
  
  /**
    *  The names and values that are used by the evidence event. This includes an attribute name (such as allowUsersToChangePassword) and value (such as true or false). 
    */
  var attributes: js.UndefOr[EvidenceAttributes] = js.undefined
  
  /**
    *  The identifier for the Amazon Web Services account. 
    */
  var awsAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The Amazon Web Services account that the evidence is collected from, and its organization path. 
    */
  var awsOrganization: js.UndefOr[String] = js.undefined
  
  /**
    * The evaluation status for automated evidence that falls under the compliance check category.   Audit Manager classes evidence as non-compliant if Security Hub reports a Fail result, or if Config reports a Non-compliant result.   Audit Manager classes evidence as compliant if Security Hub reports a Pass result, or if Config reports a Compliant result.   If a compliance check isn't available or applicable, then no compliance evaluation can be made for that evidence. This is the case if the evidence uses Config or Security Hub as the underlying data source type, but those services aren't enabled. This is also the case if the evidence uses an underlying data source type that doesn't support compliance checks (such as manual evidence, Amazon Web Services API calls, or CloudTrail).   
    */
  var complianceCheck: js.UndefOr[String] = js.undefined
  
  /**
    *  The data source where the evidence was collected from. 
    */
  var dataSource: js.UndefOr[String] = js.undefined
  
  /**
    *  The name of the evidence event. 
    */
  var eventName: js.UndefOr[EventName] = js.undefined
  
  /**
    *  The Amazon Web Service that the evidence is collected from. 
    */
  var eventSource: js.UndefOr[AWSServiceName] = js.undefined
  
  /**
    *  The identifier for the Amazon Web Services account. 
    */
  var evidenceAwsAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The type of automated evidence. 
    */
  var evidenceByType: js.UndefOr[String] = js.undefined
  
  /**
    *  The identifier for the folder that the evidence is stored in. 
    */
  var evidenceFolderId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The unique identifier for the user or role that's associated with the evidence. 
    */
  var iamId: js.UndefOr[IamArn] = js.undefined
  
  /**
    *  The identifier for the evidence. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The list of resources that are assessed to generate the evidence. 
    */
  var resourcesIncluded: js.UndefOr[Resources] = js.undefined
  
  /**
    *  The timestamp that represents when the evidence was collected. 
    */
  var time: js.UndefOr[js.Date] = js.undefined
}
object Evidence {
  
  inline def apply(): Evidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Evidence] (val x: Self) extends AnyVal {
    
    inline def setAssessmentReportSelection(value: String): Self = StObject.set(x, "assessmentReportSelection", value.asInstanceOf[js.Any])
    
    inline def setAssessmentReportSelectionUndefined: Self = StObject.set(x, "assessmentReportSelection", js.undefined)
    
    inline def setAttributes(value: EvidenceAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAwsAccountId(value: AccountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setAwsOrganization(value: String): Self = StObject.set(x, "awsOrganization", value.asInstanceOf[js.Any])
    
    inline def setAwsOrganizationUndefined: Self = StObject.set(x, "awsOrganization", js.undefined)
    
    inline def setComplianceCheck(value: String): Self = StObject.set(x, "complianceCheck", value.asInstanceOf[js.Any])
    
    inline def setComplianceCheckUndefined: Self = StObject.set(x, "complianceCheck", js.undefined)
    
    inline def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setEventName(value: EventName): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setEventSource(value: AWSServiceName): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
    
    inline def setEvidenceAwsAccountId(value: AccountId): Self = StObject.set(x, "evidenceAwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceAwsAccountIdUndefined: Self = StObject.set(x, "evidenceAwsAccountId", js.undefined)
    
    inline def setEvidenceByType(value: String): Self = StObject.set(x, "evidenceByType", value.asInstanceOf[js.Any])
    
    inline def setEvidenceByTypeUndefined: Self = StObject.set(x, "evidenceByType", js.undefined)
    
    inline def setEvidenceFolderId(value: UUID): Self = StObject.set(x, "evidenceFolderId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFolderIdUndefined: Self = StObject.set(x, "evidenceFolderId", js.undefined)
    
    inline def setIamId(value: IamArn): Self = StObject.set(x, "iamId", value.asInstanceOf[js.Any])
    
    inline def setIamIdUndefined: Self = StObject.set(x, "iamId", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setResourcesIncluded(value: Resources): Self = StObject.set(x, "resourcesIncluded", value.asInstanceOf[js.Any])
    
    inline def setResourcesIncludedUndefined: Self = StObject.set(x, "resourcesIncluded", js.undefined)
    
    inline def setResourcesIncludedVarargs(value: Resource*): Self = StObject.set(x, "resourcesIncluded", js.Array(value*))
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
