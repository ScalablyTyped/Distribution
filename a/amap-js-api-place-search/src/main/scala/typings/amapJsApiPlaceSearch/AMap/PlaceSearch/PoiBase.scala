package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoiBase extends js.Object {
  
  /**
    * 地址
    */
  var address: String = js.native
  
  var children: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 离中心点距离
    */
  var distance: Double = js.native
  
  /**
    * 全局唯一ID
    */
  var id: String = js.native
  
  /**
    * 兴趣点经纬度
    */
  var location: LngLat | Null = js.native
  
  /**
    * 名称
    */
  var name: String = js.native
  
  var shopinfo: String = js.native
  
  /**
    * 电话
    */
  var tel: String = js.native
  
  /**
    * 兴趣点类型
    */
  var `type`: String = js.native
}
object PoiBase {
  
  @scala.inline
  def apply(
    address: String,
    distance: Double,
    id: String,
    name: String,
    shopinfo: String,
    tel: String,
    `type`: String
  ): PoiBase = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shopinfo = shopinfo.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiBase]
  }
  
  @scala.inline
  implicit class PoiBaseOps[Self <: PoiBase] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShopinfo(value: String): Self = this.set("shopinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTel(value: String): Self = this.set("tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: js.Any*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setLocation(value: LngLat): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
  }
}
