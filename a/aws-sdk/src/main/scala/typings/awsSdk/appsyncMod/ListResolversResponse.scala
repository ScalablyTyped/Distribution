package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolversResponse extends StObject {
  
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The Resolver objects.
    */
  var resolvers: js.UndefOr[Resolvers] = js.native
}
object ListResolversResponse {
  
  @scala.inline
  def apply(): ListResolversResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolversResponse]
  }
  
  @scala.inline
  implicit class ListResolversResponseMutableBuilder[Self <: ListResolversResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResolvers(value: Resolvers): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
    
    @scala.inline
    def setResolversVarargs(value: Resolver*): Self = StObject.set(x, "resolvers", js.Array(value :_*))
  }
}
