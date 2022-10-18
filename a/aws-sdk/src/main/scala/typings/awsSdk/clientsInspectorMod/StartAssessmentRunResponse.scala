package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAssessmentRunResponse extends StObject {
  
  /**
    * The ARN of the assessment run that has been started.
    */
  var assessmentRunArn: Arn
}
object StartAssessmentRunResponse {
  
  inline def apply(assessmentRunArn: Arn): StartAssessmentRunResponse = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssessmentRunResponse]
  }
  
  extension [Self <: StartAssessmentRunResponse](x: Self) {
    
    inline def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
  }
}
