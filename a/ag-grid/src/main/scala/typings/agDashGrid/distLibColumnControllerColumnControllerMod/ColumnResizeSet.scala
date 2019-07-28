package typings.agDashGrid.distLibColumnControllerColumnControllerMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
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
    val __obj = js.Dynamic.literal(columns = columns, ratios = ratios, width = width)
  
    __obj.asInstanceOf[ColumnResizeSet]
  }
}

