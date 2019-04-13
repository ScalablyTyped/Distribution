package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainNameRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: __string
}

object GetDomainNameRequest {
  @scala.inline
  def apply(DomainName: __string): GetDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[GetDomainNameRequest]
  }
}

