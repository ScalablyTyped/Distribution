package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainNameRequest extends StObject {
  
  /**
    * The domain name.
    */
  var DomainName: string = js.native
}
object DeleteDomainNameRequest {
  
  @scala.inline
  def apply(DomainName: string): DeleteDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainNameRequest]
  }
  
  @scala.inline
  implicit class DeleteDomainNameRequestMutableBuilder[Self <: DeleteDomainNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
