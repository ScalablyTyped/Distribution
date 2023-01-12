package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateAssessmentReportEvidenceFolderRequest extends StObject {
  
  /**
    *  The unique identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The unique identifier for the folder that the evidence is stored in. 
    */
  var evidenceFolderId: UUID
}
object DisassociateAssessmentReportEvidenceFolderRequest {
  
  inline def apply(assessmentId: UUID, evidenceFolderId: UUID): DisassociateAssessmentReportEvidenceFolderRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], evidenceFolderId = evidenceFolderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAssessmentReportEvidenceFolderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateAssessmentReportEvidenceFolderRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFolderId(value: UUID): Self = StObject.set(x, "evidenceFolderId", value.asInstanceOf[js.Any])
  }
}
