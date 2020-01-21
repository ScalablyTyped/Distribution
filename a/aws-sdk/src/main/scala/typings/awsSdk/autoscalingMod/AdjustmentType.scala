package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustmentType extends js.Object {
  /**
    * The policy adjustment type. The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
}

object AdjustmentType {
  @scala.inline
  def apply(AdjustmentType: XmlStringMaxLen255 = null): AdjustmentType = {
    val __obj = js.Dynamic.literal()
    if (AdjustmentType != null) __obj.updateDynamic("AdjustmentType")(AdjustmentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustmentType]
  }
}

