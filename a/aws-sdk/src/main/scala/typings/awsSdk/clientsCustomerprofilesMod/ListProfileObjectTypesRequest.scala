package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileObjectTypesRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The maximum number of objects returned per page.
    */
  var MaxResults: js.UndefOr[maxSize100] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListProfileObjectTypesRequest {
  
  inline def apply(DomainName: name): ListProfileObjectTypesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfileObjectTypesRequest]
  }
  
  extension [Self <: ListProfileObjectTypesRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: maxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
