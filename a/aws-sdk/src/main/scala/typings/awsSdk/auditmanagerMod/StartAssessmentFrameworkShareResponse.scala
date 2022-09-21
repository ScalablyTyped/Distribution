package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAssessmentFrameworkShareResponse extends StObject {
  
  /**
    *  The share request that's created by the StartAssessmentFrameworkShare API. 
    */
  var assessmentFrameworkShareRequest: js.UndefOr[AssessmentFrameworkShareRequest] = js.undefined
}
object StartAssessmentFrameworkShareResponse {
  
  inline def apply(): StartAssessmentFrameworkShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAssessmentFrameworkShareResponse]
  }
  
  extension [Self <: StartAssessmentFrameworkShareResponse](x: Self) {
    
    inline def setAssessmentFrameworkShareRequest(value: AssessmentFrameworkShareRequest): Self = StObject.set(x, "assessmentFrameworkShareRequest", value.asInstanceOf[js.Any])
    
    inline def setAssessmentFrameworkShareRequestUndefined: Self = StObject.set(x, "assessmentFrameworkShareRequest", js.undefined)
  }
}
