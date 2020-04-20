package typings.amcharts.gaugeBandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeBand extends js.Object {
  /**
    * Opacity of band fill. Will use axis.bandAlpha if not set any.
    */
  var alpha: Double
  /**
    * When rolled-over, band will display balloon if you set some text for this property.
    */
  var balloonText: String
  /**
    * Color of a band.
    */
  var color: String
  /**
    * End value of a fill.
    */
  var endValue: Double
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  var gradientRatio: js.Array[Double]
  /**
    * Unique id of a band.
    */
  var id: String
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
  var startValue: Double
  /**
    * Gauge band can be clickable and can lead to some page.
    */
  var url: String
  /**
    * Sets end value for the band.
    */
  def setEndValue(value: Double): Unit
  /**
    * Sets start value for the band.
    */
  def setStartValue(value: Double): Unit
}

object GaugeBand {
  @scala.inline
  def apply(
    alpha: Double,
    balloonText: String,
    color: String,
    endValue: Double,
    gradientRatio: js.Array[Double],
    id: String,
    innerRadius: js.Any,
    radius: js.Any,
    setEndValue: Double => Unit,
    setStartValue: Double => Unit,
    startValue: Double,
    url: String
  ): GaugeBand = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], gradientRatio = gradientRatio.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setEndValue = js.Any.fromFunction1(setEndValue), setStartValue = js.Any.fromFunction1(setStartValue), startValue = startValue.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeBand]
  }
}

