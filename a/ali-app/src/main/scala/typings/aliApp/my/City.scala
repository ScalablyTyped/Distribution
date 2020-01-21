package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 选择城市 https://docs.alipay.com/mini/api/ui-city
trait City extends js.Object {
  	// 城市名
  var adCode: String
  var city: String
  	// 行政区划代码
  var spell: js.UndefOr[String] = js.undefined
}

object City {
  @scala.inline
  def apply(adCode: String, city: String, spell: String = null): City = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    if (spell != null) __obj.updateDynamic("spell")(spell.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
}

