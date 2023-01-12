package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentRunsResponse extends StObject {
  
  /**
    * A list of ARNs that specifies the assessment runs that are returned by the action.
    */
  var assessmentRunArns: ListReturnedArnList
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAssessmentRunsResponse {
  
  inline def apply(assessmentRunArns: ListReturnedArnList): ListAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal(assessmentRunArns = assessmentRunArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssessmentRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setAssessmentRunArns(value: ListReturnedArnList): Self = StObject.set(x, "assessmentRunArns", value.asInstanceOf[js.Any])
    
    inline def setAssessmentRunArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentRunArns", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
