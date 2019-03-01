package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groupbuy extends js.Object {
  var count: scala.Double
  var detail: java.lang.String
  var discount: scala.Double
  var etime: java.lang.String
  var groupbuy_price: scala.Double
  var original_price: scala.Double
  var photos: js.Array[Photo]
  var provider: java.lang.String
  var sold_num: scala.Double
  var stime: java.lang.String
  var ticket_address: java.lang.String
  var ticket_tel: java.lang.String
  var title: java.lang.String
  var `type`: java.lang.String
  var type_code: java.lang.String
  var url: java.lang.String
}

object Groupbuy {
  @scala.inline
  def apply(
    count: scala.Double,
    detail: java.lang.String,
    discount: scala.Double,
    etime: java.lang.String,
    groupbuy_price: scala.Double,
    original_price: scala.Double,
    photos: js.Array[Photo],
    provider: java.lang.String,
    sold_num: scala.Double,
    stime: java.lang.String,
    ticket_address: java.lang.String,
    ticket_tel: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    type_code: java.lang.String,
    url: java.lang.String
  ): Groupbuy = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("discount")(discount)
    __obj.updateDynamic("etime")(etime)
    __obj.updateDynamic("groupbuy_price")(groupbuy_price)
    __obj.updateDynamic("original_price")(original_price)
    __obj.updateDynamic("photos")(photos)
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("sold_num")(sold_num)
    __obj.updateDynamic("stime")(stime)
    __obj.updateDynamic("ticket_address")(ticket_address)
    __obj.updateDynamic("ticket_tel")(ticket_tel)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("type_code")(type_code)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Groupbuy]
  }
}

