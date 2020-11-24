package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groupbuy extends js.Object {
  
  /**
    * 团购总量
    */
  var count: Double = js.native
  
  /**
    * 团购详情
    */
  var detail: String = js.native
  
  /**
    * 折扣
    */
  var discount: Double = js.native
  
  /**
    * 团购结束时间
    */
  var etime: String = js.native
  
  /**
    * 折扣价
    */
  var groupbuy_price: Double = js.native
  
  /**
    * 原价
    */
  var original_price: Double = js.native
  
  /**
    * 图片信息
    */
  var photos: js.Array[PoiPhoto] = js.native
  
  /**
    * 来源标识
    */
  var provider: String = js.native
  
  /**
    * 已卖出数量
    */
  var sold_num: Double = js.native
  
  /**
    * 团购开始时间
    */
  var stime: String = js.native
  
  /**
    * 取票地址
    */
  var ticket_address: String = js.native
  
  /**
    * 取票电话
    */
  var ticket_tel: String = js.native
  
  /**
    * 团购标题
    */
  var title: String = js.native
  
  /**
    * 团购分类
    */
  var `type`: String = js.native
  
  /**
    * 团购分类代码
    */
  var type_code: String = js.native
  
  /**
    * 来源url
    */
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
    photos: js.Array[PoiPhoto],
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
  implicit class GroupbuyOps[Self <: Groupbuy] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscount(value: Double): Self = this.set("discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtime(value: String): Self = this.set("etime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbuy_price(value: Double): Self = this.set("groupbuy_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_price(value: Double): Self = this.set("original_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: PoiPhoto*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[PoiPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSold_num(value: Double): Self = this.set("sold_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStime(value: String): Self = this.set("stime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_address(value: String): Self = this.set("ticket_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_tel(value: String): Self = this.set("ticket_tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_code(value: String): Self = this.set("type_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
