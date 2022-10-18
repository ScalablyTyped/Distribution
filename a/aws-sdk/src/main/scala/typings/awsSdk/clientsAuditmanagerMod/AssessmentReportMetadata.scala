package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentReportMetadata extends StObject {
  
  /**
    *  The unique identifier for the associated assessment. 
    */
  var assessmentId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The name of the associated assessment. 
    */
  var assessmentName: js.UndefOr[AssessmentName] = js.undefined
  
  /**
    *  The name of the user who created the assessment report. 
    */
  var author: js.UndefOr[Username] = js.undefined
  
  /**
    *  Specifies when the assessment report was created. 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The description of the assessment report. 
    */
  var description: js.UndefOr[AssessmentReportDescription] = js.undefined
  
  /**
    *  The unique identifier for the assessment report. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the assessment report. 
    */
  var name: js.UndefOr[AssessmentReportName] = js.undefined
  
  /**
    *  The current status of the assessment report. 
    */
  var status: js.UndefOr[AssessmentReportStatus] = js.undefined
}
object AssessmentReportMetadata {
  
  inline def apply(): AssessmentReportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentReportMetadata]
  }
  
  extension [Self <: AssessmentReportMetadata](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setAssessmentIdUndefined: Self = StObject.set(x, "assessmentId", js.undefined)
    
    inline def setAssessmentName(value: AssessmentName): Self = StObject.set(x, "assessmentName", value.asInstanceOf[js.Any])
    
    inline def setAssessmentNameUndefined: Self = StObject.set(x, "assessmentName", js.undefined)
    
    inline def setAuthor(value: Username): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: AssessmentReportDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: AssessmentReportName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: AssessmentReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
