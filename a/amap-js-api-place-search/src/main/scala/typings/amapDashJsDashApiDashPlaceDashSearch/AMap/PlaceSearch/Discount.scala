package typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discount extends js.Object {
  /**
    * 优惠详情
    */
  var detail: String
  /**
    * 结束时间
    */
  var end_time: String
  /**
    * 图片信息列表
    */
  var photos: js.Array[PoiPhoto]
  /**
    * 来源标识
    */
  var provider: String
  /**
    * 已卖出数量
    */
  var sold_num: Double
  /**
    * 开始时间
    */
  var start_time: String
  /**
    * 优惠标题
    */
  var title: String
  /**
    * 来源url
    */
  var url: String
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
}

