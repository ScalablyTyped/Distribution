package typings.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchReGeocodeResult extends js.Object {
  
  /**
    * 状态说明
    */
  var info: String = js.native
  
  /**
    * 批量逆地理编码结果
    */
  var regeocodes: js.Array[ReGeocode] = js.native
}
object BatchReGeocodeResult {
  
  @scala.inline
  def apply(info: String, regeocodes: js.Array[ReGeocode]): BatchReGeocodeResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocodes = regeocodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReGeocodeResult]
  }
  
  @scala.inline
  implicit class BatchReGeocodeResultOps[Self <: BatchReGeocodeResult] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegeocodesVarargs(value: ReGeocode*): Self = this.set("regeocodes", js.Array(value :_*))
    
    @scala.inline
    def setRegeocodes(value: js.Array[ReGeocode]): Self = this.set("regeocodes", value.asInstanceOf[js.Any])
  }
}
