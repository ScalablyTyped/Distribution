package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDomainNameRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: __string
}

object DeleteDomainNameRequest {
  @scala.inline
  def apply(DomainName: __string): DeleteDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DeleteDomainNameRequest]
  }
}

