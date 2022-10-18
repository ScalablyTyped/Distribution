package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentResponse extends StObject {
  
  var assessment: js.UndefOr[Assessment] = js.undefined
}
object CreateAssessmentResponse {
  
  inline def apply(): CreateAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssessmentResponse]
  }
  
  extension [Self <: CreateAssessmentResponse](x: Self) {
    
    inline def setAssessment(value: Assessment): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
    
    inline def setAssessmentUndefined: Self = StObject.set(x, "assessment", js.undefined)
  }
}
