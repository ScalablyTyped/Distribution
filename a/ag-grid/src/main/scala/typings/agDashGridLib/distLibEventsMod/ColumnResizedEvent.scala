package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResizedEvent extends ColumnEvent {
  var finished: scala.Boolean
}

object ColumnResizedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    finished: scala.Boolean,
    source: ColumnEventType,
    `type`: java.lang.String
  ): ColumnResizedEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, columns = columns, finished = finished, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnResizedEvent]
  }
}

