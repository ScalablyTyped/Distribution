package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait District extends js.Object {
  var adcode: java.lang.String
  var boundaries: js.Array[LngLat]
  var center: LngLat
  var citycode: java.lang.String
  var districtList: js.Array[District]
  var level: java.lang.String
  var name: java.lang.String
}

object District {
  @scala.inline
  def apply(
    adcode: java.lang.String,
    boundaries: js.Array[LngLat],
    center: LngLat,
    citycode: java.lang.String,
    districtList: js.Array[District],
    level: java.lang.String,
    name: java.lang.String
  ): District = {
    val __obj = js.Dynamic.literal(adcode = adcode, boundaries = boundaries, center = center, citycode = citycode, districtList = districtList, level = level, name = name)
  
    __obj.asInstanceOf[District]
  }
}

