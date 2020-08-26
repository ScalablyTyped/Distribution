package typings.antvG2.mod.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait line extends common {
  var arrowAngle: js.UndefOr[Double] = js.native
  var arrowRadius: js.UndefOr[Double] = js.native
  var endArrow: js.UndefOr[Boolean] = js.native
  var lineCap: js.UndefOr[String] = js.native
  /**
    * 虚线的设置
    */
  var lineDash: js.UndefOr[js.Array[Double]] = js.native
  var lineJoin: js.UndefOr[String] = js.native
  var lineWidth: js.UndefOr[String | Double] = js.native
  var miterLimit: js.UndefOr[String | Double] = js.native
  var startArrow: js.UndefOr[Boolean] = js.native
  var strokeOpacity: js.UndefOr[String | Double] = js.native
}

object line {
  @scala.inline
  def apply(): line = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[line]
  }
  @scala.inline
  implicit class lineOps[Self <: line] (val x: Self) extends AnyVal {
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
    def setArrowAngle(value: Double): Self = this.set("arrowAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowAngle: Self = this.set("arrowAngle", js.undefined)
    @scala.inline
    def setArrowRadius(value: Double): Self = this.set("arrowRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRadius: Self = this.set("arrowRadius", js.undefined)
    @scala.inline
    def setEndArrow(value: Boolean): Self = this.set("endArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndArrow: Self = this.set("endArrow", js.undefined)
    @scala.inline
    def setLineCap(value: String): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    @scala.inline
    def setLineDashVarargs(value: Double*): Self = this.set("lineDash", js.Array(value :_*))
    @scala.inline
    def setLineDash(value: js.Array[Double]): Self = this.set("lineDash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineDash: Self = this.set("lineDash", js.undefined)
    @scala.inline
    def setLineJoin(value: String): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    @scala.inline
    def setLineWidth(value: String | Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setMiterLimit(value: String | Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiterLimit: Self = this.set("miterLimit", js.undefined)
    @scala.inline
    def setStartArrow(value: Boolean): Self = this.set("startArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartArrow: Self = this.set("startArrow", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: String | Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
  }
  
}

