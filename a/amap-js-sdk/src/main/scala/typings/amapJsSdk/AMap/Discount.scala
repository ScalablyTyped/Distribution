package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discount extends StObject {
  
  var detail: String
  
  var end_time: String
  
  var photos: js.Array[Photo]
  
  var provider: String
  
  var sold_num: String
  
  var start_time: String
  
  var title: String
  
  var url: String
}
object Discount {
  
  @scala.inline
  def apply(
    detail: String,
    end_time: String,
    photos: js.Array[Photo],
    provider: String,
    sold_num: String,
    start_time: String,
    title: String,
    url: String
  ): Discount = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], sold_num = sold_num.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discount]
  }
  
  @scala.inline
  implicit class DiscountMutableBuilder[Self <: Discount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotos(value: js.Array[Photo]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: Photo*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSold_num(value: String): Self = StObject.set(x, "sold_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
