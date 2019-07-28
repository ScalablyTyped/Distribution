package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainNameRequest extends js.Object {
  /**
    * [Required] The name of the DomainName resource.
    */
  var domainName: String
}

object GetDomainNameRequest {
  @scala.inline
  def apply(domainName: String): GetDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName)
  
    __obj.asInstanceOf[GetDomainNameRequest]
  }
}

