package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiMappingRequest extends StObject {
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string
  
  /**
    * The domain name.
    */
  var DomainName: string
}
object GetApiMappingRequest {
  
  inline def apply(ApiMappingId: string, DomainName: string): GetApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiMappingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApiMappingRequest] (val x: Self) extends AnyVal {
    
    inline def setApiMappingId(value: string): Self = StObject.set(x, "ApiMappingId", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
