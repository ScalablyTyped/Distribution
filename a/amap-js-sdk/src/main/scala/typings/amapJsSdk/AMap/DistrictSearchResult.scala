package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistrictSearchResult extends js.Object {
  var districtList: js.Array[District] = js.native
  var info: String = js.native
}

object DistrictSearchResult {
  @scala.inline
  def apply(districtList: js.Array[District], info: String): DistrictSearchResult = {
    val __obj = js.Dynamic.literal(districtList = districtList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchResult]
  }
  @scala.inline
  implicit class DistrictSearchResultOps[Self <: DistrictSearchResult] (val x: Self) extends AnyVal {
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
    def setDistrictListVarargs(value: District*): Self = this.set("districtList", js.Array(value :_*))
    @scala.inline
    def setDistrictList(value: js.Array[District]): Self = this.set("districtList", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
  }
  
}

