package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainDetail extends js.Object {
  /**
    * The domain configuration. Currently, this includes only the domain's retention period.
    */
  var configuration: DomainConfiguration
  /**
    * The basic information about a domain, such as its name, status, and description.
    */
  var domainInfo: DomainInfo
}

object DomainDetail {
  @scala.inline
  def apply(configuration: DomainConfiguration, domainInfo: DomainInfo): DomainDetail = {
    val __obj = js.Dynamic.literal(configuration = configuration, domainInfo = domainInfo)
  
    __obj.asInstanceOf[DomainDetail]
  }
}

