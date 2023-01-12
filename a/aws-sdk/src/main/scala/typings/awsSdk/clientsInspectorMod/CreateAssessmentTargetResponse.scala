package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentTargetResponse extends StObject {
  
  /**
    * The ARN that specifies the assessment target that is created.
    */
  var assessmentTargetArn: Arn
}
object CreateAssessmentTargetResponse {
  
  inline def apply(assessmentTargetArn: Arn): CreateAssessmentTargetResponse = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTargetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAssessmentTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessmentTargetArn(value: Arn): Self = StObject.set(x, "assessmentTargetArn", value.asInstanceOf[js.Any])
  }
}
