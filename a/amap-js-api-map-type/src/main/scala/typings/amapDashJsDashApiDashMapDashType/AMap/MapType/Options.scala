package typings.amapDashJsDashApiDashMapDashType.AMap.MapType

import typings.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeNumbers.`0`
import typings.amapDashJsDashApiDashMapDashType.amapDashJsDashApiDashMapDashTypeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 初始化默认图层类型，默认为0
    * 取值为0：默认底图
    * 取值为1：卫星图
    */
  var defaultType: js.UndefOr[`0` | `1`] = js.undefined
  /**
    * 是否叠加路网图层，默认false
    */
  var showRoad: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否叠加实时交通图层，默认false
    */
  var showTraffic: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultType: `0` | `1` = null,
    showRoad: js.UndefOr[Boolean] = js.undefined,
    showTraffic: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoad)) __obj.updateDynamic("showRoad")(showRoad.asInstanceOf[js.Any])
    if (!js.isUndefined(showTraffic)) __obj.updateDynamic("showTraffic")(showTraffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

