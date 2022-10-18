package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentFrameworksRequest extends StObject {
  
  /**
    *  The type of framework, such as a standard framework or a custom framework. 
    */
  var frameworkType: FrameworkType
  
  /**
    *  Represents the maximum number of results on a page or for an API request call. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAssessmentFrameworksRequest {
  
  inline def apply(frameworkType: FrameworkType): ListAssessmentFrameworksRequest = {
    val __obj = js.Dynamic.literal(frameworkType = frameworkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssessmentFrameworksRequest]
  }
  
  extension [Self <: ListAssessmentFrameworksRequest](x: Self) {
    
    inline def setFrameworkType(value: FrameworkType): Self = StObject.set(x, "frameworkType", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
