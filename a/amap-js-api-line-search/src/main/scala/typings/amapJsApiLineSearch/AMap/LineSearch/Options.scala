package typings.amapJsApiLineSearch.AMap.LineSearch

import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.all
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 公交线路所在城市
    * 默认值：“全国”
    * 可选值：cityname（中文或中文全拼）、citycode、adcode
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * 此项仅公交路线查询时有效，默认值：base，返回公交路线基本信息，当取值为：all，返回公交路线基本信息+详细信息
    */
  var extensions: js.UndefOr[base | all] = js.undefined
  /**
    * 页码
    * 默认值：1
    * 取值范围：1-100，超过取值范围按默认，超出实际页数按最大值返回
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /**
    * 单页显示结果条数
    * 默认值：20
    * 取值范围：1-100，超过取值范围按默认
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    city: String = null,
    extensions: base | all = null,
    pageIndex: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(pageIndex)) __obj.updateDynamic("pageIndex")(pageIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

