package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuditStreamConfigurationRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: awsDashSdkLib.clientsWorklinkMod.FleetArn
}

object DescribeAuditStreamConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn): DescribeAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
  
    __obj.asInstanceOf[DescribeAuditStreamConfigurationRequest]
  }
}

