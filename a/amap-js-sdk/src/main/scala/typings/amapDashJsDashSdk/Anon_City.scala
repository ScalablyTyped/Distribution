package typings.amapDashJsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  var city: String
  var citycode: String
  var district: String
  var provice: String
}

object Anon_City {
  @scala.inline
  def apply(city: String, citycode: String, district: String, provice: String): Anon_City = {
    val __obj = js.Dynamic.literal(city = city, citycode = citycode, district = district, provice = provice)
  
    __obj.asInstanceOf[Anon_City]
  }
}

