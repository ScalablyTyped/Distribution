package typings.amapJsApiAutocomplete.AMap.Autocomplete

import typings.amapJsApi.AMap.Lang
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 输入提示时限定城市
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * 是否强制限制在设置的城市内搜索
    */
  var citylimit: js.UndefOr[Boolean] = js.undefined
  // internal
  var closeResultOnScroll: js.UndefOr[Boolean] = js.undefined
  /**
    * 返回的数据类型
    */
  var datatype: js.UndefOr[DataType] = js.undefined
  /**
    * 指定输入框
    */
  var input: js.UndefOr[String | HTMLInputElement] = js.undefined
  var lang: js.UndefOr[Lang] = js.undefined
  /**
    * 是否在input位于页面较下方的时候自动将输入面板显示在input上方以避免被遮挡
    */
  var outPutDirAuto: js.UndefOr[Boolean] = js.undefined
  /**
    * 指定输出面板
    */
  var output: js.UndefOr[String | HTMLDivElement] = js.undefined
  /**
    * 输入提示时限定POI类型，多个类型用“|”分隔
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    city: String = null,
    citylimit: js.UndefOr[Boolean] = js.undefined,
    closeResultOnScroll: js.UndefOr[Boolean] = js.undefined,
    datatype: DataType = null,
    input: String | HTMLInputElement = null,
    lang: Lang = null,
    outPutDirAuto: js.UndefOr[Boolean] = js.undefined,
    output: String | HTMLDivElement = null,
    `type`: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (!js.isUndefined(citylimit)) __obj.updateDynamic("citylimit")(citylimit.asInstanceOf[js.Any])
    if (!js.isUndefined(closeResultOnScroll)) __obj.updateDynamic("closeResultOnScroll")(closeResultOnScroll.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(outPutDirAuto)) __obj.updateDynamic("outPutDirAuto")(outPutDirAuto.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

