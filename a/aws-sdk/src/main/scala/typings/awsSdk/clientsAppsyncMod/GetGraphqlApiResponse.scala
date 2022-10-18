package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGraphqlApiResponse extends StObject {
  
  /**
    * The GraphqlApi object.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
}
object GetGraphqlApiResponse {
  
  inline def apply(): GetGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGraphqlApiResponse]
  }
  
  extension [Self <: GetGraphqlApiResponse](x: Self) {
    
    inline def setGraphqlApi(value: GraphqlApi): Self = StObject.set(x, "graphqlApi", value.asInstanceOf[js.Any])
    
    inline def setGraphqlApiUndefined: Self = StObject.set(x, "graphqlApi", js.undefined)
  }
}
