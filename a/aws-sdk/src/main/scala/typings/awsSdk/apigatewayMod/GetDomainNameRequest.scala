package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainNameRequest extends js.Object {
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
}

