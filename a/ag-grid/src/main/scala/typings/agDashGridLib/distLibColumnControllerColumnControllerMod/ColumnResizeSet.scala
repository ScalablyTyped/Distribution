package typings
package agDashGridLib.distLibColumnControllerColumnControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizeSet extends js.Object {
  var columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]
  var ratios: js.Array[scala.Double]
  var width: scala.Double
}

object ColumnResizeSet {
  @scala.inline
  def apply(
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    ratios: js.Array[scala.Double],
    width: scala.Double
  ): ColumnResizeSet = {
    val __obj = js.Dynamic.literal(columns = columns, ratios = ratios, width = width)
  
    __obj.asInstanceOf[ColumnResizeSet]
  }
}

