package typings.amcharts.amchartsMod.AmCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts", "AmCharts.SerialDataItem")
@js.native
class SerialDataItem ()
  extends typings.amcharts.serialDataItemMod.SerialDataItem {
  /**
    * You can access each GraphDataItem using this object.
    * The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
    */
  /* CompleteClass */
  override var axes: js.Object = js.native
  /**
    * category value. String if parseDates is false, Date if true.
    */
  /* CompleteClass */
  override var category: js.Any = js.native
  /**
    * Timestamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
    */
  /* CompleteClass */
  override var time: Double = js.native
  /**
    * Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
    */
  /* CompleteClass */
  override var x: Double = js.native
}

