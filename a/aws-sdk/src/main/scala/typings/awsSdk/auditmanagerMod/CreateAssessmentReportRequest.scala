package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentReportRequest extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The description of the assessment report. 
    */
  var description: js.UndefOr[AssessmentReportDescription] = js.undefined
  
  /**
    *  The name of the new assessment report. 
    */
  var name: AssessmentReportName
}
object CreateAssessmentReportRequest {
  
  inline def apply(assessmentId: UUID, name: AssessmentReportName): CreateAssessmentReportRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentReportRequest]
  }
  
  extension [Self <: CreateAssessmentReportRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: AssessmentReportDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: AssessmentReportName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
