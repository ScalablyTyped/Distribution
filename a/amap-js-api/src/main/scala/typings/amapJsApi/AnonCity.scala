package typings.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCity extends js.Object {
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

object AnonCity {
  @scala.inline
  def apply(city: String, citycode: String, district: String, province: String | js.Array[scala.Nothing]): AnonCity = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCity]
  }
}

