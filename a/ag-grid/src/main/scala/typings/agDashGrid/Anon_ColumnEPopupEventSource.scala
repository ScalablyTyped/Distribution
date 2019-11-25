package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnEPopupEventSource extends js.Object {
  var column: Column
  var ePopup: HTMLElement
  var eventSource: HTMLElement
  var keepWithinBounds: js.UndefOr[Boolean] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var nudgeX: js.UndefOr[Double] = js.undefined
  var nudgeY: js.UndefOr[Double] = js.undefined
  var rowNode: RowNode
  var `type`: String
}

object Anon_ColumnEPopupEventSource {
  @scala.inline
  def apply(
    column: Column,
    ePopup: HTMLElement,
    eventSource: HTMLElement,
    rowNode: RowNode,
    `type`: String,
    keepWithinBounds: js.UndefOr[Boolean] = js.undefined,
    minWidth: Int | Double = null,
    nudgeX: Int | Double = null,
    nudgeY: Int | Double = null
  ): Anon_ColumnEPopupEventSource = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(keepWithinBounds)) __obj.updateDynamic("keepWithinBounds")(keepWithinBounds.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (nudgeX != null) __obj.updateDynamic("nudgeX")(nudgeX.asInstanceOf[js.Any])
    if (nudgeY != null) __obj.updateDynamic("nudgeY")(nudgeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnEPopupEventSource]
  }
}

