package typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocodeResult extends js.Object {
  /**
    * 状态说明
    */
  var info: String
  /**
    * 逆地理编码结果
    */
  var regeocode: ReGeocode
}

object ReGeocodeResult {
  @scala.inline
  def apply(info: String, regeocode: ReGeocode): ReGeocodeResult = {
    val __obj = js.Dynamic.literal(info = info, regeocode = regeocode)
  
    __obj.asInstanceOf[ReGeocodeResult]
  }
}

