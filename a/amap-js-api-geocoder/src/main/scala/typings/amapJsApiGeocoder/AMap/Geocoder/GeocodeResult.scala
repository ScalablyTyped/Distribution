package typings.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeResult extends js.Object {
  /**
    * 地理编码结果
    */
  var geocodes: js.Array[Geocode] = js.native
  /**
    * 状态说明
    */
  var info: String = js.native
  /**
    * 地理编码结果数目
    */
  var resultNum: String = js.native
}

object GeocodeResult {
  @scala.inline
  def apply(geocodes: js.Array[Geocode], info: String, resultNum: String): GeocodeResult = {
    val __obj = js.Dynamic.literal(geocodes = geocodes.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], resultNum = resultNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResult]
  }
  @scala.inline
  implicit class GeocodeResultOps[Self <: GeocodeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeocodesVarargs(value: Geocode*): Self = this.set("geocodes", js.Array(value :_*))
    @scala.inline
    def setGeocodes(value: js.Array[Geocode]): Self = this.set("geocodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultNum(value: String): Self = this.set("resultNum", value.asInstanceOf[js.Any])
  }
  
}

