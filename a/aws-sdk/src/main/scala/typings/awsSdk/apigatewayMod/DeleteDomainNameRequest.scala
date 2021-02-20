package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainNameRequest extends StObject {
  
  /**
    * [Required] The name of the DomainName resource to be deleted.
    */
  var domainName: String = js.native
}
object DeleteDomainNameRequest {
  
  @scala.inline
  def apply(domainName: String): DeleteDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainNameRequest]
  }
  
  @scala.inline
  implicit class DeleteDomainNameRequestMutableBuilder[Self <: DeleteDomainNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
