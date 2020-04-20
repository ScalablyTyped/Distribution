package typings.amapJsSdk.AMap

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
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], districtList = districtList.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[District]
  }
}

