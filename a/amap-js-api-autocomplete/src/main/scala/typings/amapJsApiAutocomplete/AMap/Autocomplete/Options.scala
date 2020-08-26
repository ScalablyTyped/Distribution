package typings.amapJsApiAutocomplete.AMap.Autocomplete

import typings.amapJsApi.AMap.Lang
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 输入提示时限定城市
    */
  var city: js.UndefOr[String] = js.native
  /**
    * 是否强制限制在设置的城市内搜索
    */
  var citylimit: js.UndefOr[Boolean] = js.native
  // internal
  var closeResultOnScroll: js.UndefOr[Boolean] = js.native
  /**
    * 返回的数据类型
    */
  var datatype: js.UndefOr[DataType] = js.native
  /**
    * 指定输入框
    */
  var input: js.UndefOr[String | HTMLInputElement] = js.native
  var lang: js.UndefOr[Lang] = js.native
  /**
    * 是否在input位于页面较下方的时候自动将输入面板显示在input上方以避免被遮挡
    */
  var outPutDirAuto: js.UndefOr[Boolean] = js.native
  /**
    * 指定输出面板
    */
  var output: js.UndefOr[String | HTMLDivElement] = js.native
  /**
    * 输入提示时限定POI类型，多个类型用“|”分隔
    */
  var `type`: js.UndefOr[String] = js.native
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
    def setCitylimit(value: Boolean): Self = this.set("citylimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCitylimit: Self = this.set("citylimit", js.undefined)
    @scala.inline
    def setCloseResultOnScroll(value: Boolean): Self = this.set("closeResultOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseResultOnScroll: Self = this.set("closeResultOnScroll", js.undefined)
    @scala.inline
    def setDatatype(value: DataType): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setInput(value: String | HTMLInputElement): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setLang(value: Lang): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setOutPutDirAuto(value: Boolean): Self = this.set("outPutDirAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutPutDirAuto: Self = this.set("outPutDirAuto", js.undefined)
    @scala.inline
    def setOutput(value: String | HTMLDivElement): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

