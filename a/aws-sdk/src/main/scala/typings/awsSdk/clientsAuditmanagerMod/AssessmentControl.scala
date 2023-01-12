package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentControl extends StObject {
  
  /**
    *  The amount of evidence in the assessment report. 
    */
  var assessmentReportEvidenceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The list of comments that's attached to the control. 
    */
  var comments: js.UndefOr[ControlComments] = js.undefined
  
  /**
    *  The description of the control. 
    */
  var description: js.UndefOr[ControlDescription] = js.undefined
  
  /**
    *  The amount of evidence that's generated for the control. 
    */
  var evidenceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The list of data sources for the evidence. 
    */
  var evidenceSources: js.UndefOr[EvidenceSources] = js.undefined
  
  /**
    *  The identifier for the control. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the control. 
    */
  var name: js.UndefOr[ControlName] = js.undefined
  
  /**
    *  The response of the control. 
    */
  var response: js.UndefOr[ControlResponse] = js.undefined
  
  /**
    *  The status of the control. 
    */
  var status: js.UndefOr[ControlStatus] = js.undefined
}
object AssessmentControl {
  
  inline def apply(): AssessmentControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssessmentControl] (val x: Self) extends AnyVal {
    
    inline def setAssessmentReportEvidenceCount(value: Integer): Self = StObject.set(x, "assessmentReportEvidenceCount", value.asInstanceOf[js.Any])
    
    inline def setAssessmentReportEvidenceCountUndefined: Self = StObject.set(x, "assessmentReportEvidenceCount", js.undefined)
    
    inline def setComments(value: ControlComments): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: ControlComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setDescription(value: ControlDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvidenceCount(value: Integer): Self = StObject.set(x, "evidenceCount", value.asInstanceOf[js.Any])
    
    inline def setEvidenceCountUndefined: Self = StObject.set(x, "evidenceCount", js.undefined)
    
    inline def setEvidenceSources(value: EvidenceSources): Self = StObject.set(x, "evidenceSources", value.asInstanceOf[js.Any])
    
    inline def setEvidenceSourcesUndefined: Self = StObject.set(x, "evidenceSources", js.undefined)
    
    inline def setEvidenceSourcesVarargs(value: NonEmptyString*): Self = StObject.set(x, "evidenceSources", js.Array(value*))
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ControlName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResponse(value: ControlResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: ControlStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
