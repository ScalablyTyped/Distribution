package typings.amapDashJsDashApiDashDistrictDashSearch.AMapNs.DistrictSearchNs

import typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchNumbers.`0`
import typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchNumbers.`1`
import typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchNumbers.`2`
import typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchNumbers.`3`
import typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.all
import typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 是否返回行政区边界坐标点
    */
  var extensions: js.UndefOr[base | all] = js.undefined
  /**
    * 关键字对应的行政区级别或商圈
    */
  var level: js.UndefOr[Level] = js.undefined
  /**
    * 是否显示商圈
    */
  var showbiz: js.UndefOr[Boolean] = js.undefined
  /**
    * 显示下级行政区级数
    * 0：不返回下级行政区
    * 1：返回下一级行政区
    * 2：返回下两级行政区
    * 3：返回下三级行政区
    */
  var subdistrict: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    extensions: base | all = null,
    level: Level = null,
    showbiz: js.UndefOr[Boolean] = js.undefined,
    subdistrict: `0` | `1` | `2` | `3` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(showbiz)) __obj.updateDynamic("showbiz")(showbiz)
    if (subdistrict != null) __obj.updateDynamic("subdistrict")(subdistrict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

