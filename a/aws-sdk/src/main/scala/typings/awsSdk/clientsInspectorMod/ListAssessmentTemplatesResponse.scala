package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentTemplatesResponse extends StObject {
  
  /**
    * A list of ARNs that specifies the assessment templates returned by the action.
    */
  var assessmentTemplateArns: ListReturnedArnList
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAssessmentTemplatesResponse {
  
  inline def apply(assessmentTemplateArns: ListReturnedArnList): ListAssessmentTemplatesResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentTemplatesResponse]
  }
  
  extension [Self <: ListAssessmentTemplatesResponse](x: Self) {
    
    inline def setAssessmentTemplateArns(value: ListReturnedArnList): Self = StObject.set(x, "assessmentTemplateArns", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTemplateArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentTemplateArns", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
