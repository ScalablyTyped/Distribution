package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRestApiRequest extends StObject {
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}
object DeleteRestApiRequest {
  
  inline def apply(restApiId: String): DeleteRestApiRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRestApiRequest]
  }
  
  extension [Self <: DeleteRestApiRequest](x: Self) {
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
  }
}
