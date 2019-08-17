package typings.amapDashJsDashApiDashAutocomplete.AMapNs.AutocompleteNs

import typings.amapDashJsDashApi.AMapNs.LngLat
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
    val __obj = js.Dynamic.literal(adcode = adcode, address = address, city = city, district = district, id = id, location = location, name = name, typecode = typecode)
  
    __obj.asInstanceOf[Tip]
  }
}

