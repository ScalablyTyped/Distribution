package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Discount
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Groupbuy
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiPhoto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adcode extends StObject {
  
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
  implicit class AdcodeMutableBuilder[Self <: Adcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdname(value: String): Self = StObject.set(x, "adname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityname(value: String): Self = StObject.set(x, "cityname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscount(value: Boolean): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscounts(value: js.Array[Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    @scala.inline
    def setDiscountsVarargs(value: Discount*): Self = StObject.set(x, "discounts", js.Array(value :_*))
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntr_location(value: LngLat): Self = StObject.set(x, "entr_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntr_locationNull: Self = StObject.set(x, "entr_location", null)
    
    @scala.inline
    def setExit_location(value: LngLat): Self = StObject.set(x, "exit_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit_locationNull: Self = StObject.set(x, "exit_location", null)
    
    @scala.inline
    def setGroupbuy(value: Boolean): Self = StObject.set(x, "groupbuy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbuys(value: js.Array[Groupbuy]): Self = StObject.set(x, "groupbuys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbuysUndefined: Self = StObject.set(x, "groupbuys", js.undefined)
    
    @scala.inline
    def setGroupbuysVarargs(value: Groupbuy*): Self = StObject.set(x, "groupbuys", js.Array(value :_*))
    
    @scala.inline
    def setPcode(value: String): Self = StObject.set(x, "pcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    @scala.inline
    def setPname(value: String): Self = StObject.set(x, "pname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
  }
}
