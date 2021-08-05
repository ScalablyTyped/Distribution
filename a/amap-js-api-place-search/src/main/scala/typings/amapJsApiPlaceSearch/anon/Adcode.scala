package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Discount
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Groupbuy
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiPhoto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adcode extends StObject {
  
  /**
    * 所在区域编码
    */
  var adcode: String
  
  /**
    * 所在行政区名称
    */
  var adname: String
  
  /**
    * 所在城市编码
    */
  var citycode: String
  
  /**
    * 所在城市名称
    */
  var cityname: String
  
  /**
    * @deprecated 是否有优惠信息
    */
  var discount: Boolean
  
  /**
    * @deprecated 优惠信息
    */
  var discounts: js.UndefOr[js.Array[Discount]] = js.undefined
  
  /**
    * 电子邮箱
    */
  var email: String
  
  /**
    * 入口经纬度
    */
  var entr_location: LngLat | Null
  
  /**
    * 出口经纬度
    */
  var exit_location: LngLat | Null
  
  /**
    * @deprecated 是否有团购信息
    */
  var groupbuy: Boolean
  
  /**
    * @deprecated 团购信息
    */
  var groupbuys: js.UndefOr[js.Array[Groupbuy]] = js.undefined
  
  /**
    * 所在省份编码
    */
  var pcode: String
  
  /**
    * 照片
    */
  var photos: js.Array[PoiPhoto]
  
  /**
    * 所在省份
    */
  var pname: String
  
  /**
    * 邮编
    */
  var postcode: String
  
  /**
    * 网址
    */
  var website: String
}
object Adcode {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any], entr_location = null, exit_location = null)
    __obj.asInstanceOf[Adcode]
  }
  
  extension [Self <: Adcode](x: Self) {
    
    inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    inline def setAdname(value: String): Self = StObject.set(x, "adname", value.asInstanceOf[js.Any])
    
    inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    inline def setCityname(value: String): Self = StObject.set(x, "cityname", value.asInstanceOf[js.Any])
    
    inline def setDiscount(value: Boolean): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscounts(value: js.Array[Discount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: Discount*): Self = StObject.set(x, "discounts", js.Array(value :_*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEntr_location(value: LngLat): Self = StObject.set(x, "entr_location", value.asInstanceOf[js.Any])
    
    inline def setEntr_locationNull: Self = StObject.set(x, "entr_location", null)
    
    inline def setExit_location(value: LngLat): Self = StObject.set(x, "exit_location", value.asInstanceOf[js.Any])
    
    inline def setExit_locationNull: Self = StObject.set(x, "exit_location", null)
    
    inline def setGroupbuy(value: Boolean): Self = StObject.set(x, "groupbuy", value.asInstanceOf[js.Any])
    
    inline def setGroupbuys(value: js.Array[Groupbuy]): Self = StObject.set(x, "groupbuys", value.asInstanceOf[js.Any])
    
    inline def setGroupbuysUndefined: Self = StObject.set(x, "groupbuys", js.undefined)
    
    inline def setGroupbuysVarargs(value: Groupbuy*): Self = StObject.set(x, "groupbuys", js.Array(value :_*))
    
    inline def setPcode(value: String): Self = StObject.set(x, "pcode", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: js.Array[PoiPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosVarargs(value: PoiPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    inline def setPname(value: String): Self = StObject.set(x, "pname", value.asInstanceOf[js.Any])
    
    inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
  }
}
