package typings.amapJsApiGeocoder.AMap.Geocoder

import typings.amapJsApi.AMap.Lang
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.all
import typings.amapJsApiGeocoder.amapJsApiGeocoderStrings.base
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
    radius: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.get.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

