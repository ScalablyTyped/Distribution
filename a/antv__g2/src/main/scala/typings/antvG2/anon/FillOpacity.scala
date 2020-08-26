package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillOpacity extends js.Object {
  /**
    * 辅助框填充的颜色
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * 辅助框的背景透明度
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * 辅助框的边框宽度
    */
  var lineWidth: js.UndefOr[Double] = js.native
  var stroke: js.UndefOr[String] = js.native
}

object FillOpacity {
  @scala.inline
  def apply(): FillOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillOpacity]
  }
  @scala.inline
  implicit class FillOpacityOps[Self <: FillOpacity] (val x: Self) extends AnyVal {
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
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
  
}

