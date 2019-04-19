package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateDomainRequest extends js.Object {
  /**
    * The name of the domain.
    */
  var DomainName: awsDashSdkLib.clientsWorklinkMod.DomainName
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
}

object DisassociateDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn): DisassociateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, FleetArn = FleetArn)
  
    __obj.asInstanceOf[DisassociateDomainRequest]
  }
}

