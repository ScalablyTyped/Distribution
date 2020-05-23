package typings.agGrid.anon

import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepWithinBounds extends js.Object {
  var column: typings.agGrid.columnMod.Column
  var ePopup: HTMLElement
  var eventSource: HTMLElement
  var keepWithinBounds: js.UndefOr[Boolean] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var nudgeX: js.UndefOr[Double] = js.undefined
  var nudgeY: js.UndefOr[Double] = js.undefined
  var rowNode: RowNode
  var `type`: String
}

object KeepWithinBounds {
  @scala.inline
  def apply(
    column: typings.agGrid.columnMod.Column,
    ePopup: HTMLElement,
    eventSource: HTMLElement,
    rowNode: RowNode,
    `type`: String,
    keepWithinBounds: js.UndefOr[Boolean] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    nudgeX: js.UndefOr[Double] = js.undefined,
    nudgeY: js.UndefOr[Double] = js.undefined
  ): KeepWithinBounds = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(keepWithinBounds)) __obj.updateDynamic("keepWithinBounds")(keepWithinBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nudgeX)) __obj.updateDynamic("nudgeX")(nudgeX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nudgeY)) __obj.updateDynamic("nudgeY")(nudgeY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepWithinBounds]
  }
}

