package typings
package agDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnEPopup extends js.Object {
  var column: js.UndefOr[agDashGridLib.distLibEntitiesColumnMod.Column] = js.undefined
  var ePopup: stdLib.HTMLElement
  var eventSource: stdLib.HTMLElement
  var keepWithinBounds: js.UndefOr[scala.Boolean] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var nudgeX: js.UndefOr[scala.Double] = js.undefined
  var nudgeY: js.UndefOr[scala.Double] = js.undefined
  var rowNode: js.UndefOr[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = js.undefined
  var `type`: java.lang.String
}

object Anon_ColumnEPopup {
  @scala.inline
  def apply(
    ePopup: stdLib.HTMLElement,
    eventSource: stdLib.HTMLElement,
    `type`: java.lang.String,
    column: agDashGridLib.distLibEntitiesColumnMod.Column = null,
    keepWithinBounds: js.UndefOr[scala.Boolean] = js.undefined,
    minWidth: scala.Int | scala.Double = null,
    nudgeX: scala.Int | scala.Double = null,
    nudgeY: scala.Int | scala.Double = null,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode = null
  ): Anon_ColumnEPopup = {
    val __obj = js.Dynamic.literal(ePopup = ePopup, eventSource = eventSource)
    __obj.updateDynamic("type")(`type`)
    if (column != null) __obj.updateDynamic("column")(column)
    if (!js.isUndefined(keepWithinBounds)) __obj.updateDynamic("keepWithinBounds")(keepWithinBounds)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (nudgeX != null) __obj.updateDynamic("nudgeX")(nudgeX.asInstanceOf[js.Any])
    if (nudgeY != null) __obj.updateDynamic("nudgeY")(nudgeY.asInstanceOf[js.Any])
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode)
    __obj.asInstanceOf[Anon_ColumnEPopup]
  }
}

