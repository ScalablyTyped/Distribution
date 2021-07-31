package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGraphqlApisResponse extends StObject {
  
  /**
    * The GraphqlApi objects.
    */
  var graphqlApis: js.UndefOr[GraphqlApis] = js.undefined
  
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListGraphqlApisResponse {
  
  @scala.inline
  def apply(): ListGraphqlApisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphqlApisResponse]
  }
  
  @scala.inline
  implicit class ListGraphqlApisResponseMutableBuilder[Self <: ListGraphqlApisResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphqlApis(value: GraphqlApis): Self = StObject.set(x, "graphqlApis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphqlApisUndefined: Self = StObject.set(x, "graphqlApis", js.undefined)
    
    @scala.inline
    def setGraphqlApisVarargs(value: GraphqlApi*): Self = StObject.set(x, "graphqlApis", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
