package typings.amapJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCity extends js.Object {
  var city: String
  var citycode: String
  var district: String
  var provice: String
}

object AnonCity {
  @scala.inline
  def apply(city: String, citycode: String, district: String, provice: String): AnonCity = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], provice = provice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCity]
  }
}

