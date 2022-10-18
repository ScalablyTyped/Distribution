package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcLinksRequest extends StObject {
  
  /**
    * The maximum number of elements to be returned for this resource.
    */
  var MaxResults: js.UndefOr[string] = js.undefined
  
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object GetVpcLinksRequest {
  
  inline def apply(): GetVpcLinksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcLinksRequest]
  }
  
  extension [Self <: GetVpcLinksRequest](x: Self) {
    
    inline def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
