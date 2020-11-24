package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Discount
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Groupbuy
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiPhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adcode extends js.Object {
  
  /**
    * 所在区域编码
    */
  var adcode: String = js.native
  
  /**
    * 所在行政区名称
    */
  var adname: String = js.native
  
  /**
    * 所在城市编码
    */
  var citycode: String = js.native
  
  /**
    * 所在城市名称
    */
  var cityname: String = js.native
  
  /**
    * @deprecated 是否有优惠信息
    */
  var discount: Boolean = js.native
  
  /**
    * @deprecated 优惠信息
    */
  var discounts: js.UndefOr[js.Array[Discount]] = js.native
  
  /**
    * 电子邮箱
    */
  var email: String = js.native
  
  /**
    * 入口经纬度
    */
  var entr_location: LngLat | Null = js.native
  
  /**
    * 出口经纬度
    */
  var exit_location: LngLat | Null = js.native
  
  /**
    * @deprecated 是否有团购信息
    */
  var groupbuy: Boolean = js.native
  
  /**
    * @deprecated 团购信息
    */
  var groupbuys: js.UndefOr[js.Array[Groupbuy]] = js.native
  
  /**
    * 所在省份编码
    */
  var pcode: String = js.native
  
  /**
    * 照片
    */
  var photos: js.Array[PoiPhoto] = js.native
  
  /**
    * 所在省份
    */
  var pname: String = js.native
  
  /**
    * 邮编
    */
  var postcode: String = js.native
  
  /**
    * 网址
    */
  var website: String = js.native
}
object Adcode {
  
  @scala.inline
  def apply(
    adcode: String,
    adname: String,
    citycode: String,
    cityname: String,
    discount: Boolean,
    email: String,
    groupbuy: Boolean,
    pcode: String,
    photos: js.Array[PoiPhoto],
    pname: String,
    postcode: String,
    website: String
  ): Adcode = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adcode]
  }
  
  @scala.inline
  implicit class AdcodeOps[Self <: Adcode] (val x: Self) extends AnyVal {
    
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
    def setAdname(value: String): Self = this.set("adname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityname(value: String): Self = this.set("cityname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscount(value: Boolean): Self = this.set("discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbuy(value: Boolean): Self = this.set("groupbuy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcode(value: String): Self = this.set("pcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: PoiPhoto*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[PoiPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPname(value: String): Self = this.set("pname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcode(value: String): Self = this.set("postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountsVarargs(value: Discount*): Self = this.set("discounts", js.Array(value :_*))
    
    @scala.inline
    def setDiscounts(value: js.Array[Discount]): Self = this.set("discounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscounts: Self = this.set("discounts", js.undefined)
    
    @scala.inline
    def setEntr_location(value: LngLat): Self = this.set("entr_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntr_locationNull: Self = this.set("entr_location", null)
    
    @scala.inline
    def setExit_location(value: LngLat): Self = this.set("exit_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit_locationNull: Self = this.set("exit_location", null)
    
    @scala.inline
    def setGroupbuysVarargs(value: Groupbuy*): Self = this.set("groupbuys", js.Array(value :_*))
    
    @scala.inline
    def setGroupbuys(value: js.Array[Groupbuy]): Self = this.set("groupbuys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupbuys: Self = this.set("groupbuys", js.undefined)
  }
}
