package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocodeResult extends js.Object {
  var info: String
  var regeocode: ReGeocode
}

object ReGeocodeResult {
  @scala.inline
  def apply(info: String, regeocode: ReGeocode): ReGeocodeResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocode = regeocode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReGeocodeResult]
  }
}

