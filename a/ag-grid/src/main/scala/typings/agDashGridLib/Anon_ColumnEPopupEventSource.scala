package typings
package agDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnEPopupEventSource extends js.Object {
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var ePopup: stdLib.HTMLElement
  var eventSource: stdLib.HTMLElement
  var keepWithinBounds: js.UndefOr[scala.Boolean] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var nudgeX: js.UndefOr[scala.Double] = js.undefined
  var nudgeY: js.UndefOr[scala.Double] = js.undefined
  var rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var `type`: java.lang.String
}

object Anon_ColumnEPopupEventSource {
  @scala.inline
  def apply(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    ePopup: stdLib.HTMLElement,
    eventSource: stdLib.HTMLElement,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    `type`: java.lang.String,
    keepWithinBounds: js.UndefOr[scala.Boolean] = js.undefined,
    minWidth: scala.Int | scala.Double = null,
    nudgeX: scala.Int | scala.Double = null,
    nudgeY: scala.Int | scala.Double = null
  ): Anon_ColumnEPopupEventSource = {
    val __obj = js.Dynamic.literal(column = column, ePopup = ePopup, eventSource = eventSource, rowNode = rowNode)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(keepWithinBounds)) __obj.updateDynamic("keepWithinBounds")(keepWithinBounds)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (nudgeX != null) __obj.updateDynamic("nudgeX")(nudgeX.asInstanceOf[js.Any])
    if (nudgeY != null) __obj.updateDynamic("nudgeY")(nudgeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnEPopupEventSource]
  }
}

