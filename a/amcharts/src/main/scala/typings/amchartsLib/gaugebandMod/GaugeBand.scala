package typings
package amchartsLib.gaugebandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeBand extends js.Object {
  /**
    * Opacity of band fill. Will use axis.bandAlpha if not set any.
    */
  var alpha: scala.Double
  /**
    * When rolled-over, band will display balloon if you set some text for this property.
    */
  var balloonText: java.lang.String
  /**
    * Color of a band.
    */
  var color: java.lang.String
  /**
    * End value of a fill.
    */
  var endValue: scala.Double
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  var gradientRatio: js.Array[scala.Double]
  /**
    * Unique id of a band.
    */
  var id: java.lang.String
  /**
    * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
    * Set 0 if you want the band to be drawn to the axis center.
    */
  var innerRadius: js.Any
  /**
    * Band radius. If not set any, the band will start with the axis outline.
    */
  var radius: js.Any
  /**
    * Start value of a fill.
    */
  var startValue: scala.Double
  /**
    * Gauge band can be clickable and can lead to some page.
    */
  var url: java.lang.String
  /**
    * Sets end value for the band.
    */
  def setEndValue(value: scala.Double): scala.Unit
  /**
    * Sets start value for the band.
    */
  def setStartValue(value: scala.Double): scala.Unit
}

object GaugeBand {
  @scala.inline
  def apply(
    alpha: scala.Double,
    balloonText: java.lang.String,
    color: java.lang.String,
    endValue: scala.Double,
    gradientRatio: js.Array[scala.Double],
    id: java.lang.String,
    innerRadius: js.Any,
    radius: js.Any,
    setEndValue: js.Function1[scala.Double, scala.Unit],
    setStartValue: js.Function1[scala.Double, scala.Unit],
    startValue: scala.Double,
    url: java.lang.String
  ): GaugeBand = {
    val __obj = js.Dynamic.literal(alpha = alpha, balloonText = balloonText, color = color, endValue = endValue, gradientRatio = gradientRatio, id = id, innerRadius = innerRadius, radius = radius, setEndValue = setEndValue, setStartValue = setStartValue, startValue = startValue, url = url)
  
    __obj.asInstanceOf[GaugeBand]
  }
}

