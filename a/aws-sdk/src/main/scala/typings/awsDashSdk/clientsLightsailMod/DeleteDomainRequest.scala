package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDomainRequest extends js.Object {
  /**
    * The specific domain name to delete.
    */
  var domainName: DomainName
}

object DeleteDomainRequest {
  @scala.inline
  def apply(domainName: DomainName): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName)
  
    __obj.asInstanceOf[DeleteDomainRequest]
  }
}

