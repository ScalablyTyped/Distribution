package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentFrameworkShareRequestsRequest extends StObject {
  
  /**
    *  Represents the maximum number of results on a page or for an API request call. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  Specifies whether the share request is a sent request or a received request.
    */
  var requestType: ShareRequestType
}
object ListAssessmentFrameworkShareRequestsRequest {
  
  inline def apply(requestType: ShareRequestType): ListAssessmentFrameworkShareRequestsRequest = {
    val __obj = js.Dynamic.literal(requestType = requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentFrameworkShareRequestsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssessmentFrameworkShareRequestsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestType(value: ShareRequestType): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
  }
}
