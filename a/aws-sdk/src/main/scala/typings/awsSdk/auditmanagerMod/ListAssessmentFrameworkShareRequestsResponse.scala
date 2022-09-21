package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentFrameworkShareRequestsResponse extends StObject {
  
  /**
    *  The list of share requests that the ListAssessmentFrameworkShareRequests API returned. 
    */
  var assessmentFrameworkShareRequests: js.UndefOr[AssessmentFrameworkShareRequestList] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAssessmentFrameworkShareRequestsResponse {
  
  inline def apply(): ListAssessmentFrameworkShareRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssessmentFrameworkShareRequestsResponse]
  }
  
  extension [Self <: ListAssessmentFrameworkShareRequestsResponse](x: Self) {
    
    inline def setAssessmentFrameworkShareRequests(value: AssessmentFrameworkShareRequestList): Self = StObject.set(x, "assessmentFrameworkShareRequests", value.asInstanceOf[js.Any])
    
    inline def setAssessmentFrameworkShareRequestsUndefined: Self = StObject.set(x, "assessmentFrameworkShareRequests", js.undefined)
    
    inline def setAssessmentFrameworkShareRequestsVarargs(value: AssessmentFrameworkShareRequest*): Self = StObject.set(x, "assessmentFrameworkShareRequests", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
