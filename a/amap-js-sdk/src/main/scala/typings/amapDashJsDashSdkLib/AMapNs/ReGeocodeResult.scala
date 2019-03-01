package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocodeResult extends js.Object {
  var info: java.lang.String
  var regeocode: ReGeocode
}

object ReGeocodeResult {
  @scala.inline
  def apply(info: java.lang.String, regeocode: ReGeocode): ReGeocodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("regeocode")(regeocode)
    __obj.asInstanceOf[ReGeocodeResult]
  }
}

