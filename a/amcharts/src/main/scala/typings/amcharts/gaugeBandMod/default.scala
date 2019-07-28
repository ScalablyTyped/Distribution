package typings.amcharts.gaugeBandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/GaugeBand", JSImport.Default)
@js.native
class default () extends GaugeBand {
  /**
    * Opacity of band fill. Will use axis.bandAlpha if not set any.
    */
  /* CompleteClass */
  override var alpha: Double = js.native
  /**
    * When rolled-over, band will display balloon if you set some text for this property.
    */
  /* CompleteClass */
  override var balloonText: String = js.native
  /**
    * Color of a band.
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * End value of a fill.
    */
  /* CompleteClass */
  override var endValue: Double = js.native
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  /* CompleteClass */
  override var gradientRatio: js.Array[Double] = js.native
  /**
    * Unique id of a band.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
    * Set 0 if you want the band to be drawn to the axis center.
    */
  /* CompleteClass */
  override var innerRadius: js.Any = js.native
  /**
    * Band radius. If not set any, the band will start with the axis outline.
    */
  /* CompleteClass */
  override var radius: js.Any = js.native
  /**
    * Start value of a fill.
    */
  /* CompleteClass */
  override var startValue: Double = js.native
  /**
    * Gauge band can be clickable and can lead to some page.
    */
  /* CompleteClass */
  override var url: String = js.native
  /**
    * Sets end value for the band.
    */
  /* CompleteClass */
  override def setEndValue(value: Double): Unit = js.native
  /**
    * Sets start value for the band.
    */
  /* CompleteClass */
  override def setStartValue(value: Double): Unit = js.native
}

