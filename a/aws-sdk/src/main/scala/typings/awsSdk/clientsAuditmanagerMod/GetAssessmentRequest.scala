package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentRequest extends StObject {
  
  /**
    * The unique identifier for the assessment. 
    */
  var assessmentId: UUID
}
object GetAssessmentRequest {
  
  inline def apply(assessmentId: UUID): GetAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssessmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssessmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
  }
}
