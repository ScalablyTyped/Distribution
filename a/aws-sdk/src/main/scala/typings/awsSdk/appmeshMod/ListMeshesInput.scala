package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMeshesInput extends StObject {
  
  /**
    * The maximum number of results returned by ListMeshes in paginated output. When you use this parameter, ListMeshes returns only limit results in a single page along with a nextToken response element. You can see the remaining results of the initial request by sending another ListMeshes request with the returned nextToken value. This value can be between 1 and 100. If you don't use this parameter, ListMeshes returns up to 100 results and a nextToken value if applicable.
    */
  var limit: js.UndefOr[ListMeshesLimit] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListMeshes request where limit was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.  This token should be treated as an opaque identifier that is used only to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListMeshesInput {
  
  @scala.inline
  def apply(): ListMeshesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMeshesInput]
  }
  
  @scala.inline
  implicit class ListMeshesInputMutableBuilder[Self <: ListMeshesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: ListMeshesLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
