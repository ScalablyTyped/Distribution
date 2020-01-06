package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableDomainTransferLockRequest extends js.Object {
  /**
    * The name of the domain that you want to set the transfer lock for.
    */
  var DomainName: typings.awsDashSdk.clientsRoute53domainsMod.DomainName = js.native
}

object EnableDomainTransferLockRequest {
  @scala.inline
  def apply(DomainName: DomainName): EnableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableDomainTransferLockRequest]
  }
}

