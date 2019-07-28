package typings.amcharts.gaugeArrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/GaugeArrow", JSImport.Default)
@js.native
class default () extends GaugeArrow {
  /**
    * Opacity of an arrow.
    * @default 1
    */
  /* CompleteClass */
  override var alpha: Double = js.native
  /**
    * Axis of the arrow. You can use reference to the axis or id of the axis.
    * If you don't set any axis, the first axis of a chart will be used.
    * @default GaugeAxis
    */
  /* CompleteClass */
  override var axis: typings.amcharts.gaugeAxisMod.default = js.native
  /**
    * Opacity of arrow border.
    * @default 1
    */
  /* CompleteClass */
  override var borderAlpha: Double = js.native
  /**
    * In case you need the arrow to rotate only clock-wise, set this property to true.
    * @default false
    */
  /* CompleteClass */
  override var clockWiseOnly: Boolean = js.native
  /**
    * Color of an arrow.
    * @default #000000
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Unique id of an arrow.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * Inner radius of an arrow.
    * @default 0
    */
  /* CompleteClass */
  override var innerRadius: js.Any = js.native
  /**
    * Opacity of a nail, holding the arrow.
    * @default 1
    */
  /* CompleteClass */
  override var nailAlpha: Double = js.native
  /**
    * Opacity of nail border.
    * @default 0
    */
  /* CompleteClass */
  override var nailBorderAlpha: Double = js.native
  /**
    * Thickness of nail border.
    * @default 1
    */
  /* CompleteClass */
  override var nailBorderThickness: Double = js.native
  /**
    * Radius of a nail, holding the arrow.
    * @default 8
    */
  /* CompleteClass */
  override var nailRadius: Double = js.native
  /**
    * Radius of an arrow.
    * @default '90%'
    */
  /* CompleteClass */
  override var radius: js.Any = js.native
  /**
    * Width of arrow root.
    * @default 8
    */
  /* CompleteClass */
  override var startWidth: Double = js.native
  /**
    * Value to which the arrow should point at.
    */
  /* CompleteClass */
  override var value: Double = js.native
  /**
    * Sets value for the arrow.
    * Arrow will animate to this value if you do it after chart is written to it's container.
    */
  /* CompleteClass */
  override def setValue(value: Double): Unit = js.native
}

