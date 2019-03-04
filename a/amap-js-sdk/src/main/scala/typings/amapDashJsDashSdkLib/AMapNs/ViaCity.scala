package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViaCity extends js.Object {
  var adcode: java.lang.String
  var citycode: java.lang.String
  var districts: js.Array[District]
  var name: java.lang.String
}

object ViaCity {
  @scala.inline
  def apply(
    adcode: java.lang.String,
    citycode: java.lang.String,
    districts: js.Array[District],
    name: java.lang.String
  ): ViaCity = {
    val __obj = js.Dynamic.literal(adcode = adcode, citycode = citycode, districts = districts, name = name)
  
    __obj.asInstanceOf[ViaCity]
  }
}

