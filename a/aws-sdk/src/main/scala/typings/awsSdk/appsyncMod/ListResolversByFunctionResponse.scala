package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolversByFunctionResponse extends StObject {
  
  /**
    * An identifier that can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of resolvers.
    */
  var resolvers: js.UndefOr[Resolvers] = js.undefined
}
object ListResolversByFunctionResponse {
  
  @scala.inline
  def apply(): ListResolversByFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolversByFunctionResponse]
  }
  
  @scala.inline
  implicit class ListResolversByFunctionResponseMutableBuilder[Self <: ListResolversByFunctionResponse] (val x: Self) extends AnyVal {
    
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
