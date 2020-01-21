package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnAggFuncChangeRequestEvent extends ColumnRequestEvent {
  var aggFunc: js.Any
}

object ColumnAggFuncChangeRequestEvent {
  @scala.inline
  def apply(aggFunc: js.Any, api: GridApi, columnApi: ColumnApi, columns: js.Array[Column], `type`: String): ColumnAggFuncChangeRequestEvent = {
    val __obj = js.Dynamic.literal(aggFunc = aggFunc.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnAggFuncChangeRequestEvent]
  }
}

