package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDomainNameRequest extends js.Object {
  /**
    * [Required] The name of the DomainName resource to be deleted.
    */
  var domainName: String
}

object DeleteDomainNameRequest {
  @scala.inline
  def apply(domainName: String): DeleteDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName)
  
    __obj.asInstanceOf[DeleteDomainNameRequest]
  }
}

