package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainMetadataRequest extends js.Object {
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * The name of the domain.
    */
  var DomainName: awsDashSdkLib.clientsWorklinkMod.DomainName
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
}

object UpdateDomainMetadataRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn, DisplayName: DisplayName = null): UpdateDomainMetadataRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, FleetArn = FleetArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.asInstanceOf[UpdateDomainMetadataRequest]
  }
}

