package typings.agGrid.iRowModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowBounds extends js.Object {
  var rowHeight: Double
  var rowTop: Double
}

object RowBounds {
  @scala.inline
  def apply(rowHeight: Double, rowTop: Double): RowBounds = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowTop = rowTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowBounds]
  }
}

