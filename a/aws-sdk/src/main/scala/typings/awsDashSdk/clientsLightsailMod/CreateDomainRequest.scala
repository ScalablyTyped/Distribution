package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainRequest extends js.Object {
  /**
    * The domain name to manage (e.g., example.com).  You cannot register a new domain name using Lightsail. You must register a domain name using Amazon Route 53 or another domain name registrar. If you have already registered your domain, you can enter its name in this parameter to manage the DNS records for that domain. 
    */
  var domainName: DomainName
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateDomainRequest {
  @scala.inline
  def apply(domainName: DomainName, tags: TagList = null): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateDomainRequest]
  }
}

