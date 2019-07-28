package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableDomainTransferLockRequest extends js.Object {
  /**
    * The name of the domain that you want to remove the transfer lock for.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName
}

object DisableDomainTransferLockRequest {
  @scala.inline
  def apply(DomainName: DomainName): DisableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[DisableDomainTransferLockRequest]
  }
}

