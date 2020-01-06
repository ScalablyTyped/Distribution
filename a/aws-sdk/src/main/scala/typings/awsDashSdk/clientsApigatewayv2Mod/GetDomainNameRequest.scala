package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainNameRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: __string = js.native
}

object GetDomainNameRequest {
  @scala.inline
  def apply(DomainName: __string): GetDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainNameRequest]
  }
}

