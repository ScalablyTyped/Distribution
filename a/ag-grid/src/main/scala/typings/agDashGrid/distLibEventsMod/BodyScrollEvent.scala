package typings.agDashGrid.distLibEventsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyScrollEvent extends AgGridEvent {
  var direction: String
  var left: Double
  var top: Double
}

object BodyScrollEvent {
  @scala.inline
  def apply(api: GridApi, columnApi: ColumnApi, direction: String, left: Double, top: Double, `type`: String): BodyScrollEvent = {
    val __obj = js.Dynamic.literal(api = api, columnApi = columnApi, direction = direction, left = left, top = top)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BodyScrollEvent]
  }
}

