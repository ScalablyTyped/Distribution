package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTargetHealthInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsDashSdk.clientsElbv2Mod.TargetGroupArn
  /**
    * The targets.
    */
  var Targets: js.UndefOr[TargetDescriptions] = js.undefined
}

object DescribeTargetHealthInput {
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn, Targets: TargetDescriptions = null): DescribeTargetHealthInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[DescribeTargetHealthInput]
  }
}

