package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnPinnedEvent extends ColumnEvent {
  var pinned: java.lang.String
}

object ColumnPinnedEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    pinned: java.lang.String,
    source: ColumnEventType,
    `type`: java.lang.String
  ): ColumnPinnedEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, columns = columns, pinned = pinned, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnPinnedEvent]
  }
}

