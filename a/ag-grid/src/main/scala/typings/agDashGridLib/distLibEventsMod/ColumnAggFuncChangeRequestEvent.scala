package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnAggFuncChangeRequestEvent extends ColumnRequestEvent {
  var aggFunc: js.Any
}

object ColumnAggFuncChangeRequestEvent {
  @scala.inline
  def apply(
    aggFunc: js.Any,
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    `type`: java.lang.String
  ): ColumnAggFuncChangeRequestEvent = {
    val __obj = js.Dynamic.literal(aggFunc = aggFunc, api = api, columnApi = columnApi, columns = columns)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnAggFuncChangeRequestEvent]
  }
}

