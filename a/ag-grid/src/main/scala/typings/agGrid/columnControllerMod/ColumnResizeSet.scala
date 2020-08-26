package typings.agGrid.columnControllerMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnResizeSet extends js.Object {
  var columns: js.Array[Column] = js.native
  var ratios: js.Array[Double] = js.native
  var width: Double = js.native
}

object ColumnResizeSet {
  @scala.inline
  def apply(columns: js.Array[Column], ratios: js.Array[Double], width: Double): ColumnResizeSet = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], ratios = ratios.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnResizeSet]
  }
  @scala.inline
  implicit class ColumnResizeSetOps[Self <: ColumnResizeSet] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setRatiosVarargs(value: Double*): Self = this.set("ratios", js.Array(value :_*))
    @scala.inline
    def setRatios(value: js.Array[Double]): Self = this.set("ratios", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

