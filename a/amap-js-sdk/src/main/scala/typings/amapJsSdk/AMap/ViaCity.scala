package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViaCity extends js.Object {
  var adcode: String = js.native
  var citycode: String = js.native
  var districts: js.Array[District] = js.native
  var name: String = js.native
}

object ViaCity {
  @scala.inline
  def apply(adcode: String, citycode: String, districts: js.Array[District], name: String): ViaCity = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], districts = districts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViaCity]
  }
  @scala.inline
  implicit class ViaCityOps[Self <: ViaCity] (val x: Self) extends AnyVal {
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
    def setAdcode(value: String): Self = this.set("adcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistrictsVarargs(value: District*): Self = this.set("districts", js.Array(value :_*))
    @scala.inline
    def setDistricts(value: js.Array[District]): Self = this.set("districts", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

