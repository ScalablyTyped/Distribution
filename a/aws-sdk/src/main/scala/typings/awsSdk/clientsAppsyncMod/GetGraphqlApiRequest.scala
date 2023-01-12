package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGraphqlApiRequest extends StObject {
  
  /**
    * The API ID for the GraphQL API.
    */
  var apiId: String
}
object GetGraphqlApiRequest {
  
  inline def apply(apiId: String): GetGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGraphqlApiRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGraphqlApiRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
