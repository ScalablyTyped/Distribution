package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViaCity extends js.Object {
  var adcode: String
  var citycode: String
  var districts: js.Array[District]
  var name: String
}

object ViaCity {
  @scala.inline
  def apply(adcode: String, citycode: String, districts: js.Array[District], name: String): ViaCity = {
    val __obj = js.Dynamic.literal(adcode = adcode, citycode = citycode, districts = districts, name = name)
  
    __obj.asInstanceOf[ViaCity]
  }
}

