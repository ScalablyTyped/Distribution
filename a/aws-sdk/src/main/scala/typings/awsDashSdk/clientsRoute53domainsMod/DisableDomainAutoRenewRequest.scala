package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableDomainAutoRenewRequest extends js.Object {
  /**
    * The name of the domain that you want to disable automatic renewal for.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
}

object DisableDomainAutoRenewRequest {
  @scala.inline
  def apply(DomainName: DomainName): DisableDomainAutoRenewRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DisableDomainAutoRenewRequest]
  }
}

