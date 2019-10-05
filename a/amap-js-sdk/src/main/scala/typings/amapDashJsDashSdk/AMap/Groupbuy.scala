package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groupbuy extends js.Object {
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
    val __obj = js.Dynamic.literal(count = count, detail = detail, discount = discount, etime = etime, groupbuy_price = groupbuy_price, original_price = original_price, photos = photos, provider = provider, sold_num = sold_num, stime = stime, ticket_address = ticket_address, ticket_tel = ticket_tel, title = title, type_code = type_code, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Groupbuy]
  }
}

