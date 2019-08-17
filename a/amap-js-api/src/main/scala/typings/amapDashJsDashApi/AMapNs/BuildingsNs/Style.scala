package typings.amapDashJsDashApi.AMapNs.BuildingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var areas: js.Array[AreaStyle]
  var hideWithoutStyle: js.UndefOr[Boolean] = js.undefined
}

object Style {
  @scala.inline
  def apply(areas: js.Array[AreaStyle], hideWithoutStyle: js.UndefOr[Boolean] = js.undefined): Style = {
    val __obj = js.Dynamic.literal(areas = areas)
    if (!js.isUndefined(hideWithoutStyle)) __obj.updateDynamic("hideWithoutStyle")(hideWithoutStyle)
    __obj.asInstanceOf[Style]
  }
}

