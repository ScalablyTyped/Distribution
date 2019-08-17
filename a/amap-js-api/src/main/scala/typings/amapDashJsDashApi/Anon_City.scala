package typings.amapDashJsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  /**
    * 市名称
    */
  var city: String
  /**
    * 市代码
    */
  var citycode: String
  /**
    * 区名称
    */
  var district: String
  /**
    * 省
    */
  var province: String | js.Array[scala.Nothing]
}

object Anon_City {
  @scala.inline
  def apply(city: String, citycode: String, district: String, province: String | js.Array[scala.Nothing]): Anon_City = {
    val __obj = js.Dynamic.literal(city = city, citycode = citycode, district = district, province = province.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_City]
  }
}

