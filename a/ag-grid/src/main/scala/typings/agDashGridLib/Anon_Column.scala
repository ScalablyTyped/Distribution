package typings
package agDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: js.UndefOr[agDashGridLib.distLibEntitiesColumnMod.Column] = js.undefined
  var ePopup: stdLib.HTMLElement
  var mouseEvent: stdLib.MouseEvent | stdLib.Touch
  var rowNode: js.UndefOr[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.undefined
  var `type`: java.lang.String
}

object Anon_Column {
  @scala.inline
  def apply(
    ePopup: stdLib.HTMLElement,
    mouseEvent: stdLib.MouseEvent | stdLib.Touch,
    `type`: java.lang.String,
    column: agDashGridLib.distLibEntitiesColumnMod.Column = null,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode = null
  ): Anon_Column = {
    val __obj = js.Dynamic.literal(ePopup = ePopup, mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (column != null) __obj.updateDynamic("column")(column)
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode)
    __obj.asInstanceOf[Anon_Column]
  }
}

