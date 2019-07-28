package typings.amcharts.amXYChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmXYChart
  extends typings.amcharts.amRectangularChartMod.default {
  /**
    * Specifies if Scrollbar of X axis (horizontal) should be hidden.
    */
  var hideXScrollbar: Boolean = js.native
  /**
    * Specifies if Scrollbar of Y axis (vertical) should be hidden.
    */
  var hideYScrollbar: Boolean = js.native
  /**
    * Maximum zoom factor of the chart.
    * @default 20
    */
  var maxZoomFactor: Double = js.native
  /**
    * Zooms out, charts shows all available data.
    */
  def zoomOut(): Unit = js.native
}

