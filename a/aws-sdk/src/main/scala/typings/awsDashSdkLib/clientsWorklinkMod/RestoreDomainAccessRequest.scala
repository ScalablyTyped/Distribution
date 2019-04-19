package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDomainAccessRequest extends js.Object {
  /**
    * The name of the domain.
    */
  var DomainName: awsDashSdkLib.clientsWorklinkMod.DomainName
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
}

object RestoreDomainAccessRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn): RestoreDomainAccessRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, FleetArn = FleetArn)
  
    __obj.asInstanceOf[RestoreDomainAccessRequest]
  }
}

