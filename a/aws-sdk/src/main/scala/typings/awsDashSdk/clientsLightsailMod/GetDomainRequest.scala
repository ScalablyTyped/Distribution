package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainRequest extends js.Object {
  /**
    * The domain name for which your want to return information about.
    */
  var domainName: DomainName = js.native
}

object GetDomainRequest {
  @scala.inline
  def apply(domainName: DomainName): GetDomainRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainRequest]
  }
}

