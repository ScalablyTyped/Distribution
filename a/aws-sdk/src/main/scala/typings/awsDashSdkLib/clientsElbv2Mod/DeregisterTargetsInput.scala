package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterTargetsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: awsDashSdkLib.clientsElbv2Mod.TargetGroupArn
  /**
    * The targets. If you specified a port override when you registered a target, you must specify both the target ID and the port when you deregister it.
    */
  var Targets: TargetDescriptions
}

object DeregisterTargetsInput {
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn, Targets: TargetDescriptions): DeregisterTargetsInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn, Targets = Targets)
  
    __obj.asInstanceOf[DeregisterTargetsInput]
  }
}

