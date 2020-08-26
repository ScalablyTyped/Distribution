package typings.antd.placementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementsConfig extends js.Object {
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
  var arrowWidth: js.UndefOr[Double] = js.native
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
  var horizontalArrowShift: js.UndefOr[Double] = js.native
  var verticalArrowShift: js.UndefOr[Double] = js.native
}

object PlacementsConfig {
  @scala.inline
  def apply(): PlacementsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementsConfig]
  }
  @scala.inline
  implicit class PlacementsConfigOps[Self <: PlacementsConfig] (val x: Self) extends AnyVal {
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
    def setArrowPointAtCenter(value: Boolean): Self = this.set("arrowPointAtCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowPointAtCenter: Self = this.set("arrowPointAtCenter", js.undefined)
    @scala.inline
    def setArrowWidth(value: Double): Self = this.set("arrowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowWidth: Self = this.set("arrowWidth", js.undefined)
    @scala.inline
    def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = this.set("autoAdjustOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAdjustOverflow: Self = this.set("autoAdjustOverflow", js.undefined)
    @scala.inline
    def setHorizontalArrowShift(value: Double): Self = this.set("horizontalArrowShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalArrowShift: Self = this.set("horizontalArrowShift", js.undefined)
    @scala.inline
    def setVerticalArrowShift(value: Double): Self = this.set("verticalArrowShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalArrowShift: Self = this.set("verticalArrowShift", js.undefined)
  }
  
}

