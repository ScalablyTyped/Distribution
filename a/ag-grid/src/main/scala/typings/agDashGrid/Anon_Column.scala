package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: js.UndefOr[Column] = js.undefined
  var ePopup: HTMLElement
  var mouseEvent: MouseEvent | Touch
  var rowNode: js.UndefOr[RowNode] = js.undefined
  var `type`: String
}

object Anon_Column {
  @scala.inline
  def apply(
    ePopup: HTMLElement,
    mouseEvent: MouseEvent | Touch,
    `type`: String,
    column: Column = null,
    rowNode: RowNode = null
  ): Anon_Column = {
    val __obj = js.Dynamic.literal(ePopup = ePopup, mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (column != null) __obj.updateDynamic("column")(column)
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode)
    __obj.asInstanceOf[Anon_Column]
  }
}

