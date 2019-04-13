package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetDescription extends js.Object {
  /**
    * An Availability Zone or all. This determines whether the target receives traffic from the load balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load balancer. This parameter is not supported if the target type of the target group is instance. If the target type is ip and the IP address is in a subnet of the VPC for the target group, the Availability Zone is automatically detected and this parameter is optional. If the IP address is outside the VPC, this parameter is required. With an Application Load Balancer, if the target type is ip and the IP address is outside the VPC for the target group, the only supported value is all. If the target type is lambda, this parameter is optional and the only supported value is all.
    */
  var AvailabilityZone: js.UndefOr[ZoneName] = js.undefined
  /**
    * The ID of the target. If the target type of the target group is instance, specify an instance ID. If the target type is ip, specify an IP address. If the target type is lambda, specify the ARN of the Lambda function.
    */
  var Id: TargetId
  /**
    * The port on which the target is listening.
    */
  var Port: js.UndefOr[Port] = js.undefined
}

object TargetDescription {
  @scala.inline
  def apply(Id: TargetId, AvailabilityZone: ZoneName = null, Port: js.UndefOr[Port] = js.undefined): TargetDescription = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    __obj.asInstanceOf[TargetDescription]
  }
}

