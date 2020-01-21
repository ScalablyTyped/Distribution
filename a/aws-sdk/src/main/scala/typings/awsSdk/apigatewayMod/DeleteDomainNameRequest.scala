package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainNameRequest extends js.Object {
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
}

