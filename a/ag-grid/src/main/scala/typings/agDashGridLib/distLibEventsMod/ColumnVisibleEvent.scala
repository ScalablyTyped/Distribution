package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnVisibleEvent extends ColumnEvent {
  var visible: scala.Boolean
}

object ColumnVisibleEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    source: ColumnEventType,
    `type`: java.lang.String,
    visible: scala.Boolean
  ): ColumnVisibleEvent = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, columns = columns, source = source, visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnVisibleEvent]
  }
}

