package typings.antDesignPro.miniAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAxis extends js.Object {
  var grid: js.Any = js.native
  var gridAlign: js.Any = js.native
  var labels: js.Any = js.native
  var line: js.Any = js.native
  var tickLine: js.Any = js.native
  var title: js.Any = js.native
}

object IAxis {
  @scala.inline
  def apply(grid: js.Any, gridAlign: js.Any, labels: js.Any, line: js.Any, tickLine: js.Any, title: js.Any): IAxis = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], gridAlign = gridAlign.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], tickLine = tickLine.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxis]
  }
  @scala.inline
  implicit class IAxisOps[Self <: IAxis] (val x: Self) extends AnyVal {
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
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridAlign(value: js.Any): Self = this.set("gridAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: js.Any): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: js.Any): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickLine(value: js.Any): Self = this.set("tickLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

