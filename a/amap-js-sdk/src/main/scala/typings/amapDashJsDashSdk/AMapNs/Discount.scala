package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discount extends js.Object {
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
    val __obj = js.Dynamic.literal(detail = detail, end_time = end_time, photos = photos, provider = provider, sold_num = sold_num, start_time = start_time, title = title, url = url)
  
    __obj.asInstanceOf[Discount]
  }
}

