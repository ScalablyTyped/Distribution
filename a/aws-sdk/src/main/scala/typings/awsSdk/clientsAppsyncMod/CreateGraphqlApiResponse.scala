package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGraphqlApiResponse extends StObject {
  
  /**
    * The GraphqlApi.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
}
object CreateGraphqlApiResponse {
  
  inline def apply(): CreateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphqlApiResponse]
  }
  
  extension [Self <: CreateGraphqlApiResponse](x: Self) {
    
    inline def setGraphqlApi(value: GraphqlApi): Self = StObject.set(x, "graphqlApi", value.asInstanceOf[js.Any])
    
    inline def setGraphqlApiUndefined: Self = StObject.set(x, "graphqlApi", js.undefined)
  }
}
