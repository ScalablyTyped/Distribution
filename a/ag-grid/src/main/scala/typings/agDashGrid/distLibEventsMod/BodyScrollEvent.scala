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
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyScrollEvent]
  }
}

