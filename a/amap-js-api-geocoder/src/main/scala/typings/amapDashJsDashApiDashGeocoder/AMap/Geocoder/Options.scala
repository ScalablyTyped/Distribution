package typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import typings.amapDashJsDashApi.AMap.Lang
import typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.all
import typings.amapDashJsDashApiDashGeocoder.amapDashJsDashApiDashGeocoderStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 是否批量查询
    */
  var batch: js.UndefOr[Boolean] = js.undefined
  /**
    * 城市
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * 是否返回详细信息
    */
  var extensions: js.UndefOr[base | all] = js.undefined
  /**
    * 语言类型
    */
  var lang: js.UndefOr[Lang] = js.undefined
  /**
    * 中心点
    */
  var radius: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    batch: js.UndefOr[Boolean] = js.undefined,
    city: String = null,
    extensions: base | all = null,
    lang: Lang = null,
    radius: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

