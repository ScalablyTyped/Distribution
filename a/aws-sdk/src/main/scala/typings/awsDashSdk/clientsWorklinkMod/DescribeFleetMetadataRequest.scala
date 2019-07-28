package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetMetadataRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
}

object DescribeFleetMetadataRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
  
    __obj.asInstanceOf[DescribeFleetMetadataRequest]
  }
}

