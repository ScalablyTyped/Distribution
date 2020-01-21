package typings.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchReGeocodeResult extends js.Object {
  /**
    * 状态说明
    */
  var info: String
  /**
    * 批量逆地理编码结果
    */
  var regeocodes: js.Array[ReGeocode]
}

object BatchReGeocodeResult {
  @scala.inline
  def apply(info: String, regeocodes: js.Array[ReGeocode]): BatchReGeocodeResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocodes = regeocodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchReGeocodeResult]
  }
}

