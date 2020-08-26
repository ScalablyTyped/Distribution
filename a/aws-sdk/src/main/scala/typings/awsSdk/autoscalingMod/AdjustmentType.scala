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
  def apply(): AdjustmentType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustmentType]
  }
  @scala.inline
  implicit class AdjustmentTypeOps[Self <: AdjustmentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjustmentType(value: XmlStringMaxLen255): Self = this.set("AdjustmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustmentType: Self = this.set("AdjustmentType", js.undefined)
  }
  
}

