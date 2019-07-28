package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnPinnedEvent extends ColumnEvent {
  var pinned: String
}

object ColumnPinnedEvent {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    columns: js.Array[Column],
    pinned: String,
    source: ColumnEventType,
    `type`: String
  ): ColumnPinnedEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, columns = columns, pinned = pinned, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnPinnedEvent]
  }
}

