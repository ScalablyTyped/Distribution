package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 坐标转换结果
  */
trait ConvertorResult extends js.Object {
  var info: String
  var locations: js.Array[LngLat]
}

object ConvertorResult {
  @scala.inline
  def apply(info: String, locations: js.Array[LngLat]): ConvertorResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertorResult]
  }
}

