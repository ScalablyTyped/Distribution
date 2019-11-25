package typings.amapDashJsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultType extends js.Object {
  var defaultType: js.UndefOr[Double] = js.undefined
  var showRoad: js.UndefOr[Boolean] = js.undefined
  var showTraffic: js.UndefOr[Boolean] = js.undefined
}

object Anon_DefaultType {
  @scala.inline
  def apply(
    defaultType: Int | Double = null,
    showRoad: js.UndefOr[Boolean] = js.undefined,
    showTraffic: js.UndefOr[Boolean] = js.undefined
  ): Anon_DefaultType = {
    val __obj = js.Dynamic.literal()
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoad)) __obj.updateDynamic("showRoad")(showRoad.asInstanceOf[js.Any])
    if (!js.isUndefined(showTraffic)) __obj.updateDynamic("showTraffic")(showTraffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultType]
  }
}

