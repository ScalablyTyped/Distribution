package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnVisibleEvent extends ColumnEvent {
  var visible: Boolean
}

object ColumnVisibleEvent {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    columns: js.Array[Column],
    source: ColumnEventType,
    `type`: String,
    visible: Boolean
  ): ColumnVisibleEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, columns = columns, source = source, visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnVisibleEvent]
  }
}

