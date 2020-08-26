package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 选择城市 https://docs.alipay.com/mini/api/ui-city
@js.native
trait City extends js.Object {
      // 城市名
  var adCode: String = js.native
  var city: String = js.native
      // 行政区划代码
  var spell: js.UndefOr[String] = js.native
}

object City {
  @scala.inline
  def apply(adCode: String, city: String): City = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
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
    def setAdCode(value: String): Self = this.set("adCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpell(value: String): Self = this.set("spell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpell: Self = this.set("spell", js.undefined)
  }
  
}

