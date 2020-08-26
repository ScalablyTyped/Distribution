package typings.amapJsApiDistrictSearch.AMap.DistrictSearch

import typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`0`
import typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`1`
import typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`2`
import typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`3`
import typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.all
import typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 是否返回行政区边界坐标点
    */
  var extensions: js.UndefOr[base | all] = js.native
  /**
    * 关键字对应的行政区级别或商圈
    */
  var level: js.UndefOr[Level] = js.native
  /**
    * 是否显示商圈
    */
  var showbiz: js.UndefOr[Boolean] = js.native
  /**
    * 显示下级行政区级数
    * 0：不返回下级行政区
    * 1：返回下一级行政区
    * 2：返回下两级行政区
    * 3：返回下三级行政区
    */
  var subdistrict: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
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
    def setExtensions(value: base | all): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setLevel(value: Level): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setShowbiz(value: Boolean): Self = this.set("showbiz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowbiz: Self = this.set("showbiz", js.undefined)
    @scala.inline
    def setSubdistrict(value: `0` | `1` | `2` | `3`): Self = this.set("subdistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdistrict: Self = this.set("subdistrict", js.undefined)
  }
  
}

