package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasteEndEvent extends AgGridEvent {
  var source: java.lang.String
}

object PasteEndEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    source: java.lang.String,
    `type`: java.lang.String
  ): PasteEndEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PasteEndEvent]
  }
}

