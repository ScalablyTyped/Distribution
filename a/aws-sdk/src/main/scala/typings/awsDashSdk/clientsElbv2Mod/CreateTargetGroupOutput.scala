package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTargetGroupOutput extends js.Object {
  /**
    * Information about the target group.
    */
  var TargetGroups: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.TargetGroups] = js.undefined
}

object CreateTargetGroupOutput {
  @scala.inline
  def apply(TargetGroups: TargetGroups = null): CreateTargetGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups)
    __obj.asInstanceOf[CreateTargetGroupOutput]
  }
}

