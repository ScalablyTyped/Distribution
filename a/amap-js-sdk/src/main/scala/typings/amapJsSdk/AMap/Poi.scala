package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Poi extends StObject {
  
  var adcode: String
  
  var address: String
  
  var adname: String
  
  var citycode: String
  
  var cityname: String
  
  var discount: Boolean
  
  var distance: Double
  
  var email: String
  
  var entr_location: LngLat
  
  var exit_location: LngLat
  
  var groupbuy: Boolean
  
  var id: String
  
  var location: LngLat
  
  var name: String
  
  var pcode: String
  
  var pname: String
  
  var postcode: String
  
  var tel: String
  
  var `type`: String
  
  var website: String
}
object Poi {
  
  inline def apply(
    adcode: String,
    address: String,
    adname: String,
    citycode: String,
    cityname: String,
    discount: Boolean,
    distance: Double,
    email: String,
    entr_location: LngLat,
    exit_location: LngLat,
    groupbuy: Boolean,
    id: String,
    location: LngLat,
    name: String,
    pcode: String,
    pname: String,
    postcode: String,
    tel: String,
    `type`: String,
    website: String
  ): Poi = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entr_location = entr_location.asInstanceOf[js.Any], exit_location = exit_location.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
  
  extension [Self <: Poi](x: Self) {
    
    inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAdname(value: String): Self = StObject.set(x, "adname", value.asInstanceOf[js.Any])
    
    inline def setCitycode(value: String): Self = StObject.set(x, "citycode", value.asInstanceOf[js.Any])
    
    inline def setCityname(value: String): Self = StObject.set(x, "cityname", value.asInstanceOf[js.Any])
    
    inline def setDiscount(value: Boolean): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEntr_location(value: LngLat): Self = StObject.set(x, "entr_location", value.asInstanceOf[js.Any])
    
    inline def setExit_location(value: LngLat): Self = StObject.set(x, "exit_location", value.asInstanceOf[js.Any])
    
    inline def setGroupbuy(value: Boolean): Self = StObject.set(x, "groupbuy", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPcode(value: String): Self = StObject.set(x, "pcode", value.asInstanceOf[js.Any])
    
    inline def setPname(value: String): Self = StObject.set(x, "pname", value.asInstanceOf[js.Any])
    
    inline def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    inline def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
  }
}
