package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDefaultSubnetRequest extends js.Object {
  /**
    * The Availability Zone in which to create the default subnet.
    */
  var AvailabilityZone: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object CreateDefaultSubnetRequest {
  @scala.inline
  def apply(AvailabilityZone: String, DryRun: js.UndefOr[Boolean] = js.undefined): CreateDefaultSubnetRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CreateDefaultSubnetRequest]
  }
}

