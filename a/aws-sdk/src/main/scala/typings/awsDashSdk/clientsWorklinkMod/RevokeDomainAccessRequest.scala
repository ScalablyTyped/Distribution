package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeDomainAccessRequest extends js.Object {
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsDashSdk.clientsWorklinkMod.DomainName
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object RevokeDomainAccessRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn): RevokeDomainAccessRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, FleetArn = FleetArn)
  
    __obj.asInstanceOf[RevokeDomainAccessRequest]
  }
}

