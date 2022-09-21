package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlInsightsByControlDomainRequest extends StObject {
  
  /**
    * The unique identifier for the control domain. 
    */
  var controlDomainId: UUID
  
  /**
    * Represents the maximum number of results on a page or for an API request call. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListControlInsightsByControlDomainRequest {
  
  inline def apply(controlDomainId: UUID): ListControlInsightsByControlDomainRequest = {
    val __obj = js.Dynamic.literal(controlDomainId = controlDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListControlInsightsByControlDomainRequest]
  }
  
  extension [Self <: ListControlInsightsByControlDomainRequest](x: Self) {
    
    inline def setControlDomainId(value: UUID): Self = StObject.set(x, "controlDomainId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
