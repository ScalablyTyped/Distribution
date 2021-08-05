package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGraphqlApiResponse extends StObject {
  
  /**
    * The updated GraphqlApi object.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
}
object UpdateGraphqlApiResponse {
  
  inline def apply(): UpdateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGraphqlApiResponse]
  }
  
  extension [Self <: UpdateGraphqlApiResponse](x: Self) {
    
    inline def setGraphqlApi(value: GraphqlApi): Self = StObject.set(x, "graphqlApi", value.asInstanceOf[js.Any])
    
    inline def setGraphqlApiUndefined: Self = StObject.set(x, "graphqlApi", js.undefined)
  }
}
