package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  var city: java.lang.String
  var citycode: java.lang.String
  var district: java.lang.String
  var provice: java.lang.String
}

object Anon_City {
  @scala.inline
  def apply(
    city: java.lang.String,
    citycode: java.lang.String,
    district: java.lang.String,
    provice: java.lang.String
  ): Anon_City = {
    val __obj = js.Dynamic.literal(city = city, citycode = citycode, district = district, provice = provice)
  
    __obj.asInstanceOf[Anon_City]
  }
}

