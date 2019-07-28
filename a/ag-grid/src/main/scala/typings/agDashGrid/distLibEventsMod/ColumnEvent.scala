package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnEvent extends AgGridEvent {
  var column: Column
  var columns: js.Array[Column]
  var source: ColumnEventType
}

object ColumnEvent {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    columns: js.Array[Column],
    source: ColumnEventType,
    `type`: String
  ): ColumnEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, columns = columns, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnEvent]
  }
}

