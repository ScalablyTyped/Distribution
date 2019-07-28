package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTargetGroupOutput extends js.Object {
  /**
    * Information about the modified target group.
    */
  var TargetGroups: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.TargetGroups] = js.undefined
}

object ModifyTargetGroupOutput {
  @scala.inline
  def apply(TargetGroups: TargetGroups = null): ModifyTargetGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups)
    __obj.asInstanceOf[ModifyTargetGroupOutput]
  }
}

