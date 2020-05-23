package typings.agGrid.anon

import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSource extends js.Object {
  var column: js.UndefOr[typings.agGrid.columnMod.Column] = js.undefined
  var ePopup: HTMLElement
  var eventSource: HTMLElement
  var keepWithinBounds: js.UndefOr[Boolean] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var nudgeX: js.UndefOr[Double] = js.undefined
  var nudgeY: js.UndefOr[Double] = js.undefined
  var rowNode: js.UndefOr[RowNode] = js.undefined
  var `type`: String
}

object EventSource {
  @scala.inline
  def apply(
    ePopup: HTMLElement,
    eventSource: HTMLElement,
    `type`: String,
    column: typings.agGrid.columnMod.Column = null,
    keepWithinBounds: js.UndefOr[Boolean] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    nudgeX: js.UndefOr[Double] = js.undefined,
    nudgeY: js.UndefOr[Double] = js.undefined,
    rowNode: RowNode = null
  ): EventSource = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(keepWithinBounds)) __obj.updateDynamic("keepWithinBounds")(keepWithinBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nudgeX)) __obj.updateDynamic("nudgeX")(nudgeX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nudgeY)) __obj.updateDynamic("nudgeY")(nudgeY.get.asInstanceOf[js.Any])
    if (rowNode != null) __obj.updateDynamic("rowNode")(rowNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
}

