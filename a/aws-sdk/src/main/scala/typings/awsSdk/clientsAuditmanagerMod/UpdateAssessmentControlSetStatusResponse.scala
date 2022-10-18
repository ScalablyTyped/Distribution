package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentControlSetStatusResponse extends StObject {
  
  /**
    *  The name of the updated control set that the UpdateAssessmentControlSetStatus API returned. 
    */
  var controlSet: js.UndefOr[AssessmentControlSet] = js.undefined
}
object UpdateAssessmentControlSetStatusResponse {
  
  inline def apply(): UpdateAssessmentControlSetStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssessmentControlSetStatusResponse]
  }
  
  extension [Self <: UpdateAssessmentControlSetStatusResponse](x: Self) {
    
    inline def setControlSet(value: AssessmentControlSet): Self = StObject.set(x, "controlSet", value.asInstanceOf[js.Any])
    
    inline def setControlSetUndefined: Self = StObject.set(x, "controlSet", js.undefined)
  }
}
