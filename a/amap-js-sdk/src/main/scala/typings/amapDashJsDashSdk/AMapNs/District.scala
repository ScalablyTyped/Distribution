package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait District extends js.Object {
  var adcode: String
  var boundaries: js.Array[LngLat]
  var center: LngLat
  var citycode: String
  var districtList: js.Array[District]
  var level: String
  var name: String
}

object District {
  @scala.inline
  def apply(
    adcode: String,
    boundaries: js.Array[LngLat],
    center: LngLat,
    citycode: String,
    districtList: js.Array[District],
    level: String,
    name: String
  ): District = {
    val __obj = js.Dynamic.literal(adcode = adcode, boundaries = boundaries, center = center, citycode = citycode, districtList = districtList, level = level, name = name)
  
    __obj.asInstanceOf[District]
  }
}

