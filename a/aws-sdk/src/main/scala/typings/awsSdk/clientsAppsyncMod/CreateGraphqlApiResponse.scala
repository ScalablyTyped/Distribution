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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGraphqlApiResponse] (val x: Self) extends AnyVal {
    
    inline def setGraphqlApi(value: GraphqlApi): Self = StObject.set(x, "graphqlApi", value.asInstanceOf[js.Any])
    
    inline def setGraphqlApiUndefined: Self = StObject.set(x, "graphqlApi", js.undefined)
  }
}
