package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReGeocodeResult extends js.Object {
  var info: String = js.native
  var regeocode: ReGeocode = js.native
}

object ReGeocodeResult {
  @scala.inline
  def apply(info: String, regeocode: ReGeocode): ReGeocodeResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocode = regeocode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocodeResult]
  }
  @scala.inline
  implicit class ReGeocodeResultOps[Self <: ReGeocodeResult] (val x: Self) extends AnyVal {
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
    def setRegeocode(value: ReGeocode): Self = this.set("regeocode", value.asInstanceOf[js.Any])
  }
  
}

