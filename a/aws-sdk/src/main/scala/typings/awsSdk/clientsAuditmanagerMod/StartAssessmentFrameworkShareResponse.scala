package typings.awsSdk.clientsAuditmanagerMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartAssessmentFrameworkShareResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessmentFrameworkShareRequest(value: AssessmentFrameworkShareRequest): Self = StObject.set(x, "assessmentFrameworkShareRequest", value.asInstanceOf[js.Any])
    
    inline def setAssessmentFrameworkShareRequestUndefined: Self = StObject.set(x, "assessmentFrameworkShareRequest", js.undefined)
  }
}
