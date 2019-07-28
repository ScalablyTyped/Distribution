package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainRequest extends js.Object {
  /**
    * The domain name for which your want to return information about.
    */
  var domainName: DomainName
}

object GetDomainRequest {
  @scala.inline
  def apply(domainName: DomainName): GetDomainRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName)
  
    __obj.asInstanceOf[GetDomainRequest]
  }
}

