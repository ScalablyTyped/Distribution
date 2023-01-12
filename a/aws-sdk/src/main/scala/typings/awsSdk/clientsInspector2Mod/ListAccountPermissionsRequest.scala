package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountPermissionsRequest extends StObject {
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[ListAccountPermissionsMaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The service scan type to check permissions for.
    */
  var service: js.UndefOr[Service] = js.undefined
}
object ListAccountPermissionsRequest {
  
  inline def apply(): ListAccountPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountPermissionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccountPermissionsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListAccountPermissionsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
