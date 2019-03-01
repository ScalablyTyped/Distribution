package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 坐标转换结果
  */
trait ConvertorResult extends js.Object {
  var info: java.lang.String
  var locations: js.Array[LngLat]
}

object ConvertorResult {
  @scala.inline
  def apply(info: java.lang.String, locations: js.Array[LngLat]): ConvertorResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[ConvertorResult]
  }
}

