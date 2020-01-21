package typings.agGrid.columnControllerMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizeSet extends js.Object {
  var columns: js.Array[Column]
  var ratios: js.Array[Double]
  var width: Double
}

object ColumnResizeSet {
  @scala.inline
  def apply(columns: js.Array[Column], ratios: js.Array[Double], width: Double): ColumnResizeSet = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], ratios = ratios.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnResizeSet]
  }
}

