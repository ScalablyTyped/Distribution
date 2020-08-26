package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait City extends js.Object {
  var city: String = js.native
  var citycode: String = js.native
  var district: String = js.native
  var provice: String = js.native
}

object City {
  @scala.inline
  def apply(city: String, citycode: String, district: String, provice: String): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], provice = provice.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  @scala.inline
  implicit class CityOps[Self <: City] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvice(value: String): Self = this.set("provice", value.asInstanceOf[js.Any])
  }
  
}

