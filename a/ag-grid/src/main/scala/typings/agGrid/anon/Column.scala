package typings.agGrid.anon

import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: js.UndefOr[typings.agGrid.columnMod.Column] = js.undefined
  var ePopup: HTMLElement
  var mouseEvent: MouseEvent | Touch
  var rowNode: js.UndefOr[RowNode] = js.undefined
  var `type`: String
}

object Column {
  @scala.inline
  def apply(
    ePopup: HTMLElement,
    mouseEvent: MouseEvent | Touch,
    `type`: String,
    column: typings.agGrid.columnMod.Column = null,
    rowNode: RowNode = null
  ): Column = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

