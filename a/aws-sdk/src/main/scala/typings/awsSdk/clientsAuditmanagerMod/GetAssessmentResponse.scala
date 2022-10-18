package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentResponse extends StObject {
  
  var assessment: js.UndefOr[Assessment] = js.undefined
  
  var userRole: js.UndefOr[Role] = js.undefined
}
object GetAssessmentResponse {
  
  inline def apply(): GetAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssessmentResponse]
  }
  
  extension [Self <: GetAssessmentResponse](x: Self) {
    
    inline def setAssessment(value: Assessment): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
    
    inline def setAssessmentUndefined: Self = StObject.set(x, "assessment", js.undefined)
    
    inline def setUserRole(value: Role): Self = StObject.set(x, "userRole", value.asInstanceOf[js.Any])
    
    inline def setUserRoleUndefined: Self = StObject.set(x, "userRole", js.undefined)
  }
}
