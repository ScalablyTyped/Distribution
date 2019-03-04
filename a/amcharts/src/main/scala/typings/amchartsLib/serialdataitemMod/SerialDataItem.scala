package typings
package amchartsLib.serialdataitemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialDataItem extends js.Object {
  /**
    * You can access each GraphDataItem using this object.
    * The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
    */
  var axes: js.Object
  /**
    * category value. String if parseDates is false, Date if true.
    */
  var category: js.Any
  /**
    * Timestamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
    */
  var time: scala.Double
  /**
    * Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
    */
  var x: scala.Double
}

object SerialDataItem {
  @scala.inline
  def apply(axes: js.Object, category: js.Any, time: scala.Double, x: scala.Double): SerialDataItem = {
    val __obj = js.Dynamic.literal(axes = axes, category = category, time = time, x = x)
  
    __obj.asInstanceOf[SerialDataItem]
  }
}

