package typings.amapJsApiStationSearch.AMap.StationSearch

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StationInfo extends js.Object {
  
  /**
    * 区域编码
    */
  var adcode: String = js.native
  
  /**
    * 途经此站点的公交路线列表
    */
  var buslines: js.Array[Busline] = js.native
  
  /**
    * 城市编码
    */
  var citycode: String = js.native
  
  /**
    * 公交站点id，该id是唯一标识
    */
  var id: String = js.native
  
  /**
    * 公交站点经纬度
    */
  var location: LngLat = js.native
  
  /**
    * 公交站点名称
    */
  var name: String = js.native
}
object StationInfo {
  
  @scala.inline
  def apply(
    adcode: String,
    buslines: js.Array[Busline],
    citycode: String,
    id: String,
    location: LngLat,
    name: String
  ): StationInfo = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], buslines = buslines.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StationInfo]
  }
  
  @scala.inline
  implicit class StationInfoOps[Self <: StationInfo] (val x: Self) extends AnyVal {
    
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
    def setBuslinesVarargs(value: Busline*): Self = this.set("buslines", js.Array(value :_*))
    
    @scala.inline
    def setBuslines(value: js.Array[Busline]): Self = this.set("buslines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LngLat): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
