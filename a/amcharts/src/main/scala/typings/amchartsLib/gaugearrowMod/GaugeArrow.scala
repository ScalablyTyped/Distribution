package typings
package amchartsLib.gaugearrowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GaugeArrow extends js.Object {
  /**
       * Opacity of an arrow.
       * @default 1
       */
  var alpha: scala.Double
  /**
       * Axis of the arrow. You can use reference to the axis or id of the axis.
       * If you don't set any axis, the first axis of a chart will be used.
       * @default GaugeAxis
       */
  var axis: amchartsLib.gaugeaxisMod.default
  /**
       * Opacity of arrow border.
       * @default 1
       */
  var borderAlpha: scala.Double
  /**
       * In case you need the arrow to rotate only clock-wise, set this property to true.
       * @default false
       */
  var clockWiseOnly: scala.Boolean
  /**
       * Color of an arrow.
       * @default #000000
       */
  var color: java.lang.String
  /**
       * Unique id of an arrow.
       */
  var id: java.lang.String
  /**
       * Inner radius of an arrow.
       * @default 0
       */
  var innerRadius: js.Any
  /**
       * Opacity of a nail, holding the arrow.
       * @default 1
       */
  var nailAlpha: scala.Double
  /**
       * Opacity of nail border.
       * @default 0
       */
  var nailBorderAlpha: scala.Double
  /**
       * Thickness of nail border.
       * @default 1
       */
  var nailBorderThickness: scala.Double
  /**
       * Radius of a nail, holding the arrow.
       * @default 8
       */
  var nailRadius: scala.Double
  /**
       * Radius of an arrow.
       * @default '90%'
       */
  var radius: js.Any
  /**
       * Width of arrow root.
       * @default 8
       */
  var startWidth: scala.Double
  /**
       * Value to which the arrow should point at.
       */
  var value: scala.Double
  /**
       * Sets value for the arrow.
       * Arrow will animate to this value if you do it after chart is written to it's container.
       */
  def setValue(value: scala.Double): scala.Unit
}

