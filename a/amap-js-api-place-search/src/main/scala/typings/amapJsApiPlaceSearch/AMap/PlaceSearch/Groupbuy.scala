package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groupbuy extends js.Object {
  /**
    * 团购总量
    */
  var count: Double
  /**
    * 团购详情
    */
  var detail: String
  /**
    * 折扣
    */
  var discount: Double
  /**
    * 团购结束时间
    */
  var etime: String
  /**
    * 折扣价
    */
  var groupbuy_price: Double
  /**
    * 原价
    */
  var original_price: Double
  /**
    * 图片信息
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
    * 团购开始时间
    */
  var stime: String
  /**
    * 取票地址
    */
  var ticket_address: String
  /**
    * 取票电话
    */
  var ticket_tel: String
  /**
    * 团购标题
    */
  var title: String
  /**
    * 团购分类
    */
  var `type`: String
  /**
    * 团购分类代码
    */
  var type_code: String
  /**
    * 来源url
    */
  var url: String
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
}

