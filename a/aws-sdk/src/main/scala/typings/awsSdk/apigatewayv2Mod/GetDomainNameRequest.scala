package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainNameRequest extends StObject {
  
  /**
    * The domain name.
    */
  var DomainName: string
}
object GetDomainNameRequest {
  
  @scala.inline
  def apply(DomainName: string): GetDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainNameRequest]
  }
  
  @scala.inline
  implicit class GetDomainNameRequestMutableBuilder[Self <: GetDomainNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
