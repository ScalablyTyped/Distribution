package typings.agDashGrid.distLibEntitiesGridOptionsMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostProcessPopupParams extends js.Object {
  var column: js.UndefOr[Column] = js.undefined
  var ePopup: HTMLElement
  var eventSource: js.UndefOr[HTMLElement] = js.undefined
  var mouseEvent: js.UndefOr[MouseEvent | Touch] = js.undefined
  var rowNode: js.UndefOr[RowNode] = js.undefined
  var `type`: String
}

object PostProcessPopupParams {
  @scala.inline
  def apply(
    ePopup: HTMLElement,
    `type`: String,
    column: Column = null,
    eventSource: HTMLElement = null,
    mouseEvent: MouseEvent | Touch = null,
    rowNode: RowNode = null
  ): PostProcessPopupParams = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource.asInstanceOf[js.Any])
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProcessPopupParams]
  }
}

