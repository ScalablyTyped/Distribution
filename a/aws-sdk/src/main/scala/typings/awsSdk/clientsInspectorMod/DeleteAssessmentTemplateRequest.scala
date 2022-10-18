package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssessmentTemplateRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment template that you want to delete.
    */
  var assessmentTemplateArn: Arn
}
object DeleteAssessmentTemplateRequest {
  
  inline def apply(assessmentTemplateArn: Arn): DeleteAssessmentTemplateRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentTemplateRequest]
  }
  
  extension [Self <: DeleteAssessmentTemplateRequest](x: Self) {
    
    inline def setAssessmentTemplateArn(value: Arn): Self = StObject.set(x, "assessmentTemplateArn", value.asInstanceOf[js.Any])
  }
}
