package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
}
object GetApiRequest {
  
  inline def apply(ApiId: string): GetApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiRequest]
  }
  
  extension [Self <: GetApiRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
  }
}
