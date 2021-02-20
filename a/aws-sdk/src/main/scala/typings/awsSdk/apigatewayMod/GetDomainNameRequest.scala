package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainNameRequest extends StObject {
  
  /**
    * [Required] The name of the DomainName resource.
    */
  var domainName: String = js.native
}
object GetDomainNameRequest {
  
  @scala.inline
  def apply(domainName: String): GetDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainNameRequest]
  }
  
  @scala.inline
  implicit class GetDomainNameRequestMutableBuilder[Self <: GetDomainNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
