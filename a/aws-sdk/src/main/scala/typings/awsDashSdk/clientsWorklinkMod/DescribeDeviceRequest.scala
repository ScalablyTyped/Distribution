package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeviceRequest extends js.Object {
  /**
    * A unique identifier for a registered user's device.
    */
  var DeviceId: Id
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object DescribeDeviceRequest {
  @scala.inline
  def apply(DeviceId: Id, FleetArn: FleetArn): DescribeDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId, FleetArn = FleetArn)
  
    __obj.asInstanceOf[DescribeDeviceRequest]
  }
}

