package typings.amapJsApiStationSearch.AMap.StationSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 公交站点所在城市
    * 可选值：cityname（中文或中文全拼）、citycode、adcode
    * 默认值：“全国”
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * 页码
    * 默认值：1, 取值范围：1-100
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /**
    * 单页显示结果条数
    * 默认值：20, 取值范围：1-100
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    city: String = null,
    pageIndex: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (!js.isUndefined(pageIndex)) __obj.updateDynamic("pageIndex")(pageIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

