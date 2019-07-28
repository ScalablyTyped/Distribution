package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CityInfo extends js.Object {
  var adcode: String
  var citycode: String
  var count: Double
  var name: String
}

object CityInfo {
  @scala.inline
  def apply(adcode: String, citycode: String, count: Double, name: String): CityInfo = {
    val __obj = js.Dynamic.literal(adcode = adcode, citycode = citycode, count = count, name = name)
  
    __obj.asInstanceOf[CityInfo]
  }
}

