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
    val __obj = js.Dynamic.literal(detail = detail, end_time = end_time, photos = photos, provider = provider, sold_num = sold_num, start_time = start_time, title = title, url = url)
  
    __obj.asInstanceOf[Discount]
  }
}

