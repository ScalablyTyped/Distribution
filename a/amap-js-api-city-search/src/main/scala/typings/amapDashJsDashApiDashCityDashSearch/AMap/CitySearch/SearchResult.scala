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
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

