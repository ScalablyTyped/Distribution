package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApiKeysResponse extends StObject {
  
  /**
    * The ApiKey objects.
    */
  var apiKeys: js.UndefOr[ApiKeys] = js.undefined
  
  /**
    * An identifier to pass in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListApiKeysResponse {
  
  inline def apply(): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApiKeysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApiKeysResponse] (val x: Self) extends AnyVal {
    
    inline def setApiKeys(value: ApiKeys): Self = StObject.set(x, "apiKeys", value.asInstanceOf[js.Any])
    
    inline def setApiKeysUndefined: Self = StObject.set(x, "apiKeys", js.undefined)
    
    inline def setApiKeysVarargs(value: ApiKey*): Self = StObject.set(x, "apiKeys", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
