package typings.amapJsApiLineSearch.AMap.LineSearch

import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.all
import typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 公交线路所在城市
    * 默认值：“全国”
    * 可选值：cityname（中文或中文全拼）、citycode、adcode
    */
  var city: js.UndefOr[String] = js.native
  /**
    * 此项仅公交路线查询时有效，默认值：base，返回公交路线基本信息，当取值为：all，返回公交路线基本信息+详细信息
    */
  var extensions: js.UndefOr[base | all] = js.native
  /**
    * 页码
    * 默认值：1
    * 取值范围：1-100，超过取值范围按默认，超出实际页数按最大值返回
    */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
    * 单页显示结果条数
    * 默认值：20
    * 取值范围：1-100，超过取值范围按默认
    */
  var pageSize: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setExtensions(value: base | all): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndex: Self = this.set("pageIndex", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
  }
  
}

