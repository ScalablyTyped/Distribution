package typings.amapJsApiAutocomplete.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Lang
import typings.amapJsApiAutocomplete.AMap.Autocomplete.SearchResult
import typings.amapJsApiAutocomplete.AMap.Autocomplete.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete_ extends EventEmitter {
  /**
    * 返回查询语言
    */
  def getLang(): js.UndefOr[Lang] = js.native
  /**
    * 根据输入关键字提示匹配信息
    * @param keyword 关键字
    * @param callback 回调
    */
  def search(
    keyword: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
  ): Unit = js.native
  /**
    * 设置城市
    * @param city 城市
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  /**
    * 设置是否强制限制城市
    * @param cityLimit 是否强制限制城市
    */
  def setCityLimit(cityLimit: Boolean): Unit = js.native
  // internal
  /**
    * 设置查询语言
    * @param lang 语言
    */
  def setLang(): Unit = js.native
  def setLang(lang: Lang): Unit = js.native
  /**
    * 设置提示Poi类型，多个类型用“|”分隔
    * @param type Poi类型
    */
  def setType(): Unit = js.native
  def setType(`type`: String): Unit = js.native
}

