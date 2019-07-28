package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableDomainAutoRenewRequest extends js.Object {
  /**
    * The name of the domain that you want to enable automatic renewal for.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
}

object EnableDomainAutoRenewRequest {
  @scala.inline
  def apply(DomainName: DomainName): EnableDomainAutoRenewRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[EnableDomainAutoRenewRequest]
  }
}

