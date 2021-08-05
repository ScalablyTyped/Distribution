package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApiRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
}
object DeleteApiRequest {
  
  inline def apply(ApiId: string): DeleteApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiRequest]
  }
  
  extension [Self <: DeleteApiRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
  }
}
