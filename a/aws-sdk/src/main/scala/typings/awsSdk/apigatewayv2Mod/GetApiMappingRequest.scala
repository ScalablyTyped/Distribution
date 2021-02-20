package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApiMappingRequest extends StObject {
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string = js.native
  
  /**
    * The domain name.
    */
  var DomainName: string = js.native
}
object GetApiMappingRequest {
  
  @scala.inline
  def apply(ApiMappingId: string, DomainName: string): GetApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiMappingRequest]
  }
  
  @scala.inline
  implicit class GetApiMappingRequestMutableBuilder[Self <: GetApiMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiMappingId(value: string): Self = StObject.set(x, "ApiMappingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
