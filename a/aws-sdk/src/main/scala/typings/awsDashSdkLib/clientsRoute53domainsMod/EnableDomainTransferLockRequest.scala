package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableDomainTransferLockRequest extends js.Object {
  /**
    * The name of the domain that you want to set the transfer lock for.
    */
  var DomainName: awsDashSdkLib.clientsRoute53domainsMod.DomainName
}

object EnableDomainTransferLockRequest {
  @scala.inline
  def apply(DomainName: DomainName): EnableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
  
    __obj.asInstanceOf[EnableDomainTransferLockRequest]
  }
}

