package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeResult extends js.Object {
  var geocodes: js.Array[LngLat]
  var info: java.lang.String
  var resultNum: scala.Double
}

object GeocodeResult {
  @scala.inline
  def apply(geocodes: js.Array[LngLat], info: java.lang.String, resultNum: scala.Double): GeocodeResult = {
    val __obj = js.Dynamic.literal(geocodes = geocodes, info = info, resultNum = resultNum)
  
    __obj.asInstanceOf[GeocodeResult]
  }
}

