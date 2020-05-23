package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultType extends js.Object {
  var defaultType: js.UndefOr[Double] = js.undefined
  var showRoad: js.UndefOr[Boolean] = js.undefined
  var showTraffic: js.UndefOr[Boolean] = js.undefined
}

object DefaultType {
  @scala.inline
  def apply(
    defaultType: js.UndefOr[Double] = js.undefined,
    showRoad: js.UndefOr[Boolean] = js.undefined,
    showTraffic: js.UndefOr[Boolean] = js.undefined
  ): DefaultType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultType)) __obj.updateDynamic("defaultType")(defaultType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoad)) __obj.updateDynamic("showRoad")(showRoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTraffic)) __obj.updateDynamic("showTraffic")(showTraffic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultType]
  }
}

