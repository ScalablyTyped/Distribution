package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groupbuy extends StObject {
  
  var count: Double = js.native
  
  var detail: String = js.native
  
  var discount: Double = js.native
  
  var etime: String = js.native
  
  var groupbuy_price: Double = js.native
  
  var original_price: Double = js.native
  
  var photos: js.Array[Photo] = js.native
  
  var provider: String = js.native
  
  var sold_num: Double = js.native
  
  var stime: String = js.native
  
  var ticket_address: String = js.native
  
  var ticket_tel: String = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
  
  var type_code: String = js.native
  
  var url: String = js.native
}
object Groupbuy {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GroupbuyMutableBuilder[Self <: Groupbuy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscount(value: Double): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtime(value: String): Self = StObject.set(x, "etime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbuy_price(value: Double): Self = StObject.set(x, "groupbuy_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_price(value: Double): Self = StObject.set(x, "original_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSold_num(value: Double): Self = StObject.set(x, "sold_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStime(value: String): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_address(value: String): Self = StObject.set(x, "ticket_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_tel(value: String): Self = StObject.set(x, "ticket_tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_code(value: String): Self = StObject.set(x, "type_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
