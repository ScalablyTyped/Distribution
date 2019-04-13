package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckDomainTransferabilityResponse extends js.Object {
  /**
    * A complex type that contains information about whether the specified domain can be transferred to Amazon Route 53.
    */
  var Transferability: DomainTransferability
}

object CheckDomainTransferabilityResponse {
  @scala.inline
  def apply(Transferability: DomainTransferability): CheckDomainTransferabilityResponse = {
    val __obj = js.Dynamic.literal(Transferability = Transferability)
  
    __obj.asInstanceOf[CheckDomainTransferabilityResponse]
  }
}

