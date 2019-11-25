package typings.amcharts.gaugeArrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeArrow extends js.Object {
  /**
    * Opacity of an arrow.
    * @default 1
    */
  var alpha: Double
  /**
    * Axis of the arrow. You can use reference to the axis or id of the axis.
    * If you don't set any axis, the first axis of a chart will be used.
    * @default GaugeAxis
    */
  var axis: typings.amcharts.gaugeAxisMod.default
  /**
    * Opacity of arrow border.
    * @default 1
    */
  var borderAlpha: Double
  /**
    * In case you need the arrow to rotate only clock-wise, set this property to true.
    * @default false
    */
  var clockWiseOnly: Boolean
  /**
    * Color of an arrow.
    * @default #000000
    */
  var color: String
  /**
    * Unique id of an arrow.
    */
  var id: String
  /**
    * Inner radius of an arrow.
    * @default 0
    */
  var innerRadius: js.Any
  /**
    * Opacity of a nail, holding the arrow.
    * @default 1
    */
  var nailAlpha: Double
  /**
    * Opacity of nail border.
    * @default 0
    */
  var nailBorderAlpha: Double
  /**
    * Thickness of nail border.
    * @default 1
    */
  var nailBorderThickness: Double
  /**
    * Radius of a nail, holding the arrow.
    * @default 8
    */
  var nailRadius: Double
  /**
    * Radius of an arrow.
    * @default '90%'
    */
  var radius: js.Any
  /**
    * Width of arrow root.
    * @default 8
    */
  var startWidth: Double
  /**
    * Value to which the arrow should point at.
    */
  var value: Double
  /**
    * Sets value for the arrow.
    * Arrow will animate to this value if you do it after chart is written to it's container.
    */
  def setValue(value: Double): Unit
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
}

