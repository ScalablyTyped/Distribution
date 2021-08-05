package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApiMappingRequest extends StObject {
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string
  
  /**
    * The domain name.
    */
  var DomainName: string
}
object DeleteApiMappingRequest {
  
  inline def apply(ApiMappingId: string, DomainName: string): DeleteApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiMappingRequest]
  }
  
  extension [Self <: DeleteApiMappingRequest](x: Self) {
    
    inline def setApiMappingId(value: string): Self = StObject.set(x, "ApiMappingId", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
