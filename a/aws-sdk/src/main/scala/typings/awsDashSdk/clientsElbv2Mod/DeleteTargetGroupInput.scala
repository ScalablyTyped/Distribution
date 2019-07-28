package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTargetGroupInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsDashSdk.clientsElbv2Mod.TargetGroupArn
}

object DeleteTargetGroupInput {
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn): DeleteTargetGroupInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn)
  
    __obj.asInstanceOf[DeleteTargetGroupInput]
  }
}

