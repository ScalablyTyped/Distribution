package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDevicePolicyConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object DescribeDevicePolicyConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeDevicePolicyConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
  
    __obj.asInstanceOf[DescribeDevicePolicyConfigurationRequest]
  }
}

