package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyScrollEvent extends AgGridEvent {
  var direction: java.lang.String
  var left: scala.Double
  var top: scala.Double
}

object BodyScrollEvent {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    direction: java.lang.String,
    left: scala.Double,
    top: scala.Double,
    `type`: java.lang.String
  ): BodyScrollEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, direction = direction, left = left, top = top)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BodyScrollEvent]
  }
}

