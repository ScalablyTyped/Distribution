package typings.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowHeight extends js.Object {
  var rowHeight: Double = js.native
  var rowTop: Double = js.native
}

object RowHeight {
  @scala.inline
  def apply(rowHeight: Double, rowTop: Double): RowHeight = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowTop = rowTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeight]
  }
  @scala.inline
  implicit class RowHeightOps[Self <: RowHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowTop(value: Double): Self = this.set("rowTop", value.asInstanceOf[js.Any])
  }
  
}

