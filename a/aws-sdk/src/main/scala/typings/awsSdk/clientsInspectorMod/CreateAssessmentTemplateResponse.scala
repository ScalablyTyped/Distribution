package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentTemplateResponse extends StObject {
  
  /**
    * The ARN that specifies the assessment template that is created.
    */
  var assessmentTemplateArn: Arn
}
object CreateAssessmentTemplateResponse {
  
  inline def apply(assessmentTemplateArn: Arn): CreateAssessmentTemplateResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTemplateResponse]
  }
  
  extension [Self <: CreateAssessmentTemplateResponse](x: Self) {
    
    inline def setAssessmentTemplateArn(value: Arn): Self = StObject.set(x, "assessmentTemplateArn", value.asInstanceOf[js.Any])
  }
}
