package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApiKeysResponse extends StObject {
  
  /**
    * The ApiKey objects.
    */
  var apiKeys: js.UndefOr[ApiKeys] = js.native
  
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListApiKeysResponse {
  
  @scala.inline
  def apply(): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApiKeysResponse]
  }
  
  @scala.inline
  implicit class ListApiKeysResponseMutableBuilder[Self <: ListApiKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKeys(value: ApiKeys): Self = StObject.set(x, "apiKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeysUndefined: Self = StObject.set(x, "apiKeys", js.undefined)
    
    @scala.inline
    def setApiKeysVarargs(value: ApiKey*): Self = StObject.set(x, "apiKeys", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
