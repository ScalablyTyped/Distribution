package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostProcessPopupParams extends js.Object {
  var column: js.UndefOr[agDashGridLib.distLibEntitiesColumnMod.Column] = js.undefined
  var ePopup: stdLib.HTMLElement
  var eventSource: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var mouseEvent: js.UndefOr[stdLib.MouseEvent | stdLib.Touch] = js.undefined
  var rowNode: js.UndefOr[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.undefined
  var `type`: java.lang.String
}

object PostProcessPopupParams {
  @scala.inline
  def apply(
    ePopup: stdLib.HTMLElement,
    `type`: java.lang.String,
    column: agDashGridLib.distLibEntitiesColumnMod.Column = null,
    eventSource: stdLib.HTMLElement = null,
    mouseEvent: stdLib.MouseEvent | stdLib.Touch = null,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode = null
  ): PostProcessPopupParams = {
    val __obj = js.Dynamic.literal(ePopup = ePopup)
    __obj.updateDynamic("type")(`type`)
    if (column != null) __obj.updateDynamic("column")(column)
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource)
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode)
    __obj.asInstanceOf[PostProcessPopupParams]
  }
}

