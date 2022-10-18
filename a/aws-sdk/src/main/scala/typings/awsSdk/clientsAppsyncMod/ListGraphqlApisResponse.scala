package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGraphqlApisResponse extends StObject {
  
  /**
    * The GraphqlApi objects.
    */
  var graphqlApis: js.UndefOr[GraphqlApis] = js.undefined
  
  /**
    * An identifier to pass in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListGraphqlApisResponse {
  
  inline def apply(): ListGraphqlApisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphqlApisResponse]
  }
  
  extension [Self <: ListGraphqlApisResponse](x: Self) {
    
    inline def setGraphqlApis(value: GraphqlApis): Self = StObject.set(x, "graphqlApis", value.asInstanceOf[js.Any])
    
    inline def setGraphqlApisUndefined: Self = StObject.set(x, "graphqlApis", js.undefined)
    
    inline def setGraphqlApisVarargs(value: GraphqlApi*): Self = StObject.set(x, "graphqlApis", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
