package typings.amcharts.gaugeArrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaugeArrow extends js.Object {
  /**
    * Opacity of an arrow.
    * @default 1
    */
  var alpha: Double = js.native
  /**
    * Axis of the arrow. You can use reference to the axis or id of the axis.
    * If you don't set any axis, the first axis of a chart will be used.
    * @default GaugeAxis
    */
  var axis: typings.amcharts.gaugeAxisMod.default = js.native
  /**
    * Opacity of arrow border.
    * @default 1
    */
  var borderAlpha: Double = js.native
  /**
    * In case you need the arrow to rotate only clock-wise, set this property to true.
    * @default false
    */
  var clockWiseOnly: Boolean = js.native
  /**
    * Color of an arrow.
    * @default #000000
    */
  var color: String = js.native
  /**
    * Unique id of an arrow.
    */
  var id: String = js.native
  /**
    * Inner radius of an arrow.
    * @default 0
    */
  var innerRadius: js.Any = js.native
  /**
    * Opacity of a nail, holding the arrow.
    * @default 1
    */
  var nailAlpha: Double = js.native
  /**
    * Opacity of nail border.
    * @default 0
    */
  var nailBorderAlpha: Double = js.native
  /**
    * Thickness of nail border.
    * @default 1
    */
  var nailBorderThickness: Double = js.native
  /**
    * Radius of a nail, holding the arrow.
    * @default 8
    */
  var nailRadius: Double = js.native
  /**
    * Radius of an arrow.
    * @default '90%'
    */
  var radius: js.Any = js.native
  /**
    * Width of arrow root.
    * @default 8
    */
  var startWidth: Double = js.native
  /**
    * Value to which the arrow should point at.
    */
  var value: Double = js.native
  /**
    * Sets value for the arrow.
    * Arrow will animate to this value if you do it after chart is written to it's container.
    */
  def setValue(value: Double): Unit = js.native
}

object GaugeArrow {
  @scala.inline
  def apply(
    alpha: Double,
    axis: typings.amcharts.gaugeAxisMod.default,
    borderAlpha: Double,
    clockWiseOnly: Boolean,
    color: String,
    id: String,
    innerRadius: js.Any,
    nailAlpha: Double,
    nailBorderAlpha: Double,
    nailBorderThickness: Double,
    nailRadius: Double,
    radius: js.Any,
    setValue: Double => Unit,
    startWidth: Double,
    value: Double
  ): GaugeArrow = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], clockWiseOnly = clockWiseOnly.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], nailAlpha = nailAlpha.asInstanceOf[js.Any], nailBorderAlpha = nailBorderAlpha.asInstanceOf[js.Any], nailBorderThickness = nailBorderThickness.asInstanceOf[js.Any], nailRadius = nailRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), startWidth = startWidth.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeArrow]
  }
  @scala.inline
  implicit class GaugeArrowOps[Self <: GaugeArrow] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxis(value: typings.amcharts.gaugeAxisMod.default): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderAlpha(value: Double): Self = this.set("borderAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setClockWiseOnly(value: Boolean): Self = this.set("clockWiseOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerRadius(value: js.Any): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setNailAlpha(value: Double): Self = this.set("nailAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setNailBorderAlpha(value: Double): Self = this.set("nailBorderAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setNailBorderThickness(value: Double): Self = this.set("nailBorderThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setNailRadius(value: Double): Self = this.set("nailRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: js.Any): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetValue(value: Double => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def setStartWidth(value: Double): Self = this.set("startWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

