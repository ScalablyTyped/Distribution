package typings
package amchartsLib.amXYChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmXYChart
  extends amchartsLib.amRectangularChartMod.default {
  /**
    * Specifies if Scrollbar of X axis (horizontal) should be hidden.
    */
  var hideXScrollbar: scala.Boolean = js.native
  /**
    * Specifies if Scrollbar of Y axis (vertical) should be hidden.
    */
  var hideYScrollbar: scala.Boolean = js.native
  /**
    * Maximum zoom factor of the chart.
    * @default 20
    */
  var maxZoomFactor: scala.Double = js.native
  /**
    * Zooms out, charts shows all available data.
    */
  def zoomOut(): scala.Unit = js.native
}

