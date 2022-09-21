package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentFrameworkShareResponse extends StObject {
  
  /**
    *  The updated share request that's returned by the UpdateAssessmentFrameworkShare operation. 
    */
  var assessmentFrameworkShareRequest: js.UndefOr[AssessmentFrameworkShareRequest] = js.undefined
}
object UpdateAssessmentFrameworkShareResponse {
  
  inline def apply(): UpdateAssessmentFrameworkShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssessmentFrameworkShareResponse]
  }
  
  extension [Self <: UpdateAssessmentFrameworkShareResponse](x: Self) {
    
    inline def setAssessmentFrameworkShareRequest(value: AssessmentFrameworkShareRequest): Self = StObject.set(x, "assessmentFrameworkShareRequest", value.asInstanceOf[js.Any])
    
    inline def setAssessmentFrameworkShareRequestUndefined: Self = StObject.set(x, "assessmentFrameworkShareRequest", js.undefined)
  }
}
