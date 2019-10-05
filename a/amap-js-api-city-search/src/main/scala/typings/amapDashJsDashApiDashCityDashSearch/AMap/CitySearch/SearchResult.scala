package typings.amapDashJsDashApiDashCityDashSearch.AMap.CitySearch

import typings.amapDashJsDashApi.AMap.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  /**
    * 地区编号
    */
  var adcode: String
  /**
    * 城市范围
    */
  var bounds: Bounds
  /**
    * 城市名称
    */
  var city: String
  /**
    * 成功信息
    */
  var info: String
  /**
    * 查询信息码
    */
  var infocode: String
  /**
    * 省份
    */
  var province: String
  var rectangle: String
  /**
    * 查询状态
    */
  var status: String
}

object SearchResult {
  @scala.inline
  def apply(
    adcode: String,
    bounds: Bounds,
    city: String,
    info: String,
    infocode: String,
    province: String,
    rectangle: String,
    status: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(adcode = adcode, bounds = bounds, city = city, info = info, infocode = infocode, province = province, rectangle = rectangle, status = status)
  
    __obj.asInstanceOf[SearchResult]
  }
}

