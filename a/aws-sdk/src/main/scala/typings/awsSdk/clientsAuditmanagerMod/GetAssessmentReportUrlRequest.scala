package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentReportUrlRequest extends StObject {
  
  /**
    *  The unique identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The unique identifier for the assessment report. 
    */
  var assessmentReportId: UUID
}
object GetAssessmentReportUrlRequest {
  
  inline def apply(assessmentId: UUID, assessmentReportId: UUID): GetAssessmentReportUrlRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], assessmentReportId = assessmentReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssessmentReportUrlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssessmentReportUrlRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setAssessmentReportId(value: UUID): Self = StObject.set(x, "assessmentReportId", value.asInstanceOf[js.Any])
  }
}
