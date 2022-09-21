package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAssessmentReportEvidenceFolderRequest extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The identifier for the folder that the evidence is stored in. 
    */
  var evidenceFolderId: UUID
}
object AssociateAssessmentReportEvidenceFolderRequest {
  
  inline def apply(assessmentId: UUID, evidenceFolderId: UUID): AssociateAssessmentReportEvidenceFolderRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], evidenceFolderId = evidenceFolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAssessmentReportEvidenceFolderRequest]
  }
  
  extension [Self <: AssociateAssessmentReportEvidenceFolderRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFolderId(value: UUID): Self = StObject.set(x, "evidenceFolderId", value.asInstanceOf[js.Any])
  }
}
