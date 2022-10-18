package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationsResponse extends StObject {
  
  /**
    * An array of responses, one for each application that was returned.
    */
  var Item: js.UndefOr[ListOfApplicationResponse] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ApplicationsResponse {
  
  inline def apply(): ApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationsResponse]
  }
  
  extension [Self <: ApplicationsResponse](x: Self) {
    
    inline def setItem(value: ListOfApplicationResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    inline def setItemVarargs(value: ApplicationResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
