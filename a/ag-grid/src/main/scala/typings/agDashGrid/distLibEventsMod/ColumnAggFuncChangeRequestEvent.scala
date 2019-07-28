package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnAggFuncChangeRequestEvent extends ColumnRequestEvent {
  var aggFunc: js.Any
}

object ColumnAggFuncChangeRequestEvent {
  @scala.inline
  def apply(aggFunc: js.Any, api: GridApi, columnApi: ColumnApi, columns: js.Array[Column], `type`: String): ColumnAggFuncChangeRequestEvent = {
    val __obj = js.Dynamic.literal(aggFunc = aggFunc, api = api, columnApi = columnApi, columns = columns)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnAggFuncChangeRequestEvent]
  }
}

