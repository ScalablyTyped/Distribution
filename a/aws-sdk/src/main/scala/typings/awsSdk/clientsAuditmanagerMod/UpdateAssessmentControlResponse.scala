package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentControlResponse extends StObject {
  
  /**
    *  The name of the updated control set that the UpdateAssessmentControl API returned. 
    */
  var control: js.UndefOr[AssessmentControl] = js.undefined
}
object UpdateAssessmentControlResponse {
  
  inline def apply(): UpdateAssessmentControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssessmentControlResponse]
  }
  
  extension [Self <: UpdateAssessmentControlResponse](x: Self) {
    
    inline def setControl(value: AssessmentControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
  }
}
