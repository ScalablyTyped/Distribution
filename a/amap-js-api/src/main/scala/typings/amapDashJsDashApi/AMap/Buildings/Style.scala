package typings.amapDashJsDashApi.AMap.Buildings

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
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any])
    if (!js.isUndefined(hideWithoutStyle)) __obj.updateDynamic("hideWithoutStyle")(hideWithoutStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

