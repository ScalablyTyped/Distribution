package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groupbuy extends StObject {
  
  var count: Double
  
  var detail: String
  
  var discount: Double
  
  var etime: String
  
  var groupbuy_price: Double
  
  var original_price: Double
  
  var photos: js.Array[Photo]
  
  var provider: String
  
  var sold_num: Double
  
  var stime: String
  
  var ticket_address: String
  
  var ticket_tel: String
  
  var title: String
  
  var `type`: String
  
  var type_code: String
  
  var url: String
}
object Groupbuy {
  
  inline def apply(
    count: Double,
    detail: String,
    discount: Double,
    etime: String,
    groupbuy_price: Double,
    original_price: Double,
    photos: js.Array[Photo],
    provider: String,
    sold_num: Double,
    stime: String,
    ticket_address: String,
    ticket_tel: String,
    title: String,
    `type`: String,
    type_code: String,
    url: String
  ): Groupbuy = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], etime = etime.asInstanceOf[js.Any], groupbuy_price = groupbuy_price.asInstanceOf[js.Any], original_price = original_price.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], sold_num = sold_num.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], ticket_address = ticket_address.asInstanceOf[js.Any], ticket_tel = ticket_tel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], type_code = type_code.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groupbuy]
  }
  
  extension [Self <: Groupbuy](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDiscount(value: Double): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setEtime(value: String): Self = StObject.set(x, "etime", value.asInstanceOf[js.Any])
    
    inline def setGroupbuy_price(value: Double): Self = StObject.set(x, "groupbuy_price", value.asInstanceOf[js.Any])
    
    inline def setOriginal_price(value: Double): Self = StObject.set(x, "original_price", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value*))
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setSold_num(value: Double): Self = StObject.set(x, "sold_num", value.asInstanceOf[js.Any])
    
    inline def setStime(value: String): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
    
    inline def setTicket_address(value: String): Self = StObject.set(x, "ticket_address", value.asInstanceOf[js.Any])
    
    inline def setTicket_tel(value: String): Self = StObject.set(x, "ticket_tel", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setType_code(value: String): Self = StObject.set(x, "type_code", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
