package typings.amapJsApiCitySearch.AMap.CitySearch

import typings.amapJsApi.AMap.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResult extends js.Object {
  
  /**
    * 地区编号
    */
  var adcode: String = js.native
  
  /**
    * 城市范围
    */
  var bounds: Bounds = js.native
  
  /**
    * 城市名称
    */
  var city: String = js.native
  
  /**
    * 成功信息
    */
  var info: String = js.native
  
  /**
    * 查询信息码
    */
  var infocode: String = js.native
  
  /**
    * 省份
    */
  var province: String = js.native
  
  var rectangle: String = js.native
  
  /**
    * 查询状态
    */
  var status: String = js.native
}
object SearchResult {
  
  @scala.inline
  def apply(
    adcode: String,
    bounds: Bounds,
    city: String,
    info: String,
    infocode: String,
    province: String,
    rectangle: String,
    status: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], rectangle = rectangle.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfocode(value: String): Self = this.set("infocode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangle(value: String): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
