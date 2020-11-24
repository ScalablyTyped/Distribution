package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait District extends js.Object {
  
  var adcode: String = js.native
  
  var boundaries: js.Array[LngLat] = js.native
  
  var center: LngLat = js.native
  
  var citycode: String = js.native
  
  var districtList: js.Array[District] = js.native
  
  var level: String = js.native
  
  var name: String = js.native
}
object District {
  
  @scala.inline
  def apply(
    adcode: String,
    boundaries: js.Array[LngLat],
    center: LngLat,
    citycode: String,
    districtList: js.Array[District],
    level: String,
    name: String
  ): District = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], districtList = districtList.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[District]
  }
  
  @scala.inline
  implicit class DistrictOps[Self <: District] (val x: Self) extends AnyVal {
    
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
    def setAdcode(value: String): Self = this.set("adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundariesVarargs(value: LngLat*): Self = this.set("boundaries", js.Array(value :_*))
    
    @scala.inline
    def setBoundaries(value: js.Array[LngLat]): Self = this.set("boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: LngLat): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictListVarargs(value: District*): Self = this.set("districtList", js.Array(value :_*))
    
    @scala.inline
    def setDistrictList(value: js.Array[District]): Self = this.set("districtList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
