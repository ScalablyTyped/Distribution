package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discount extends js.Object {
  /**
    * 优惠详情
    */
  var detail: String = js.native
  /**
    * 结束时间
    */
  var end_time: String = js.native
  /**
    * 图片信息列表
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
    * 开始时间
    */
  var start_time: String = js.native
  /**
    * 优惠标题
    */
  var title: String = js.native
  /**
    * 来源url
    */
  var url: String = js.native
}

object Discount {
  @scala.inline
  def apply(
    detail: String,
    end_time: String,
    photos: js.Array[PoiPhoto],
    provider: String,
    sold_num: Double,
    start_time: String,
    title: String,
    url: String
  ): Discount = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], sold_num = sold_num.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discount]
  }
  @scala.inline
  implicit class DiscountOps[Self <: Discount] (val x: Self) extends AnyVal {
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
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd_time(value: String): Self = this.set("end_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotosVarargs(value: PoiPhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[PoiPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSold_num(value: Double): Self = this.set("sold_num", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_time(value: String): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

