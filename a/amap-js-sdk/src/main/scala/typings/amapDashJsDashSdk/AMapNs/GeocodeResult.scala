package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeResult extends js.Object {
  var geocodes: js.Array[LngLat]
  var info: String
  var resultNum: Double
}

object GeocodeResult {
  @scala.inline
  def apply(geocodes: js.Array[LngLat], info: String, resultNum: Double): GeocodeResult = {
    val __obj = js.Dynamic.literal(geocodes = geocodes, info = info, resultNum = resultNum)
  
    __obj.asInstanceOf[GeocodeResult]
  }
}

