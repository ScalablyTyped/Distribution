package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainNameRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: __string = js.native
}

object DeleteDomainNameRequest {
  @scala.inline
  def apply(DomainName: __string): DeleteDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDomainNameRequest]
  }
}

