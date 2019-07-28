package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainMetadataRequest extends js.Object {
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DisplayName] = js.undefined
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsDashSdk.clientsWorklinkMod.DomainName
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object UpdateDomainMetadataRequest {
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn, DisplayName: DisplayName = null): UpdateDomainMetadataRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, FleetArn = FleetArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.asInstanceOf[UpdateDomainMetadataRequest]
  }
}

