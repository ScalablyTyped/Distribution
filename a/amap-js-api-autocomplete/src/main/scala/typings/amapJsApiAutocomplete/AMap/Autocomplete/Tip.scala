package typings.amapJsApiAutocomplete.AMap.Autocomplete

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tip extends js.Object {
  /**
    * 区域编码
    */
  var adcode: String
  /**
    * 地址
    */
  var address: String
  /**
    * 城市
    */
  var city: js.Array[_]
  /**
    * 所属区域
    */
  var district: String
  /**
    * ID
    */
  var id: String
  /**
    * 坐标经纬度
    */
  var location: LngLat
  /**
    * 名称
    */
  var name: String
  /**
    * 类型编码
    */
  var typecode: String
}

object Tip {
  @scala.inline
  def apply(
    adcode: String,
    address: String,
    city: js.Array[_],
    district: String,
    id: String,
    location: LngLat,
    name: String,
    typecode: String
  ): Tip = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typecode = typecode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tip]
  }
}

