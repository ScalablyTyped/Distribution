package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodeResult extends js.Object {
  
  var geocodes: js.Array[LngLat] = js.native
  
  var info: String = js.native
  
  var resultNum: Double = js.native
}
object GeocodeResult {
  
  @scala.inline
  def apply(geocodes: js.Array[LngLat], info: String, resultNum: Double): GeocodeResult = {
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
    def setGeocodesVarargs(value: LngLat*): Self = this.set("geocodes", js.Array(value :_*))
    
    @scala.inline
    def setGeocodes(value: js.Array[LngLat]): Self = this.set("geocodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultNum(value: Double): Self = this.set("resultNum", value.asInstanceOf[js.Any])
  }
}
