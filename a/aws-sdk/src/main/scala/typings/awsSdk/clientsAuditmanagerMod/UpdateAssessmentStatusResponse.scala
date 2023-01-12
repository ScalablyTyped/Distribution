package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentStatusResponse extends StObject {
  
  /**
    *  The name of the updated assessment that the UpdateAssessmentStatus API returned. 
    */
  var assessment: js.UndefOr[Assessment] = js.undefined
}
object UpdateAssessmentStatusResponse {
  
  inline def apply(): UpdateAssessmentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssessmentStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssessmentStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessment(value: Assessment): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
    
    inline def setAssessmentUndefined: Self = StObject.set(x, "assessment", js.undefined)
  }
}
