package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait City extends js.Object {
  var city: String
  var citycode: String
  var district: String
  var provice: String
}

object City {
  @scala.inline
  def apply(city: String, citycode: String, district: String, provice: String): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], provice = provice.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
}

