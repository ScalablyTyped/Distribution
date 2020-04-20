package typings.antDesignPro.miniAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxis extends js.Object {
  var grid: js.Any
  var gridAlign: js.Any
  var labels: js.Any
  var line: js.Any
  var tickLine: js.Any
  var title: js.Any
}

object IAxis {
  @scala.inline
  def apply(grid: js.Any, gridAlign: js.Any, labels: js.Any, line: js.Any, tickLine: js.Any, title: js.Any): IAxis = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], gridAlign = gridAlign.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], tickLine = tickLine.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxis]
  }
}

