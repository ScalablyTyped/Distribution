package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentReportResponse extends StObject {
  
  /**
    *  The new assessment report that the CreateAssessmentReport API returned. 
    */
  var assessmentReport: js.UndefOr[AssessmentReport] = js.undefined
}
object CreateAssessmentReportResponse {
  
  inline def apply(): CreateAssessmentReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssessmentReportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssessmentReportResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessmentReport(value: AssessmentReport): Self = StObject.set(x, "assessmentReport", value.asInstanceOf[js.Any])
    
    inline def setAssessmentReportUndefined: Self = StObject.set(x, "assessmentReport", js.undefined)
  }
}
