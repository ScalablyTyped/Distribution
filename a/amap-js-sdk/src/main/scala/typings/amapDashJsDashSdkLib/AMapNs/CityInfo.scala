package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityInfo extends js.Object {
  var adcode: java.lang.String
  var citycode: java.lang.String
  var count: scala.Double
  var name: java.lang.String
}

object CityInfo {
  @scala.inline
  def apply(adcode: java.lang.String, citycode: java.lang.String, count: scala.Double, name: java.lang.String): CityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adcode")(adcode)
    __obj.updateDynamic("citycode")(citycode)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CityInfo]
  }
}

