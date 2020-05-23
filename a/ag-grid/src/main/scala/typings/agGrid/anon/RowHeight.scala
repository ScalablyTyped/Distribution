package typings.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowHeight extends js.Object {
  var rowHeight: Double
  var rowTop: Double
}

object RowHeight {
  @scala.inline
  def apply(rowHeight: Double, rowTop: Double): RowHeight = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowTop = rowTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeight]
  }
}

