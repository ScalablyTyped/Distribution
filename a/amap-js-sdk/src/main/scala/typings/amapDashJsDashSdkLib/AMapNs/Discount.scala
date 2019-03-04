package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discount extends js.Object {
  var detail: java.lang.String
  var end_time: java.lang.String
  var photos: js.Array[Photo]
  var provider: java.lang.String
  var sold_num: java.lang.String
  var start_time: java.lang.String
  var title: java.lang.String
  var url: java.lang.String
}

object Discount {
  @scala.inline
  def apply(
    detail: java.lang.String,
    end_time: java.lang.String,
    photos: js.Array[Photo],
    provider: java.lang.String,
    sold_num: java.lang.String,
    start_time: java.lang.String,
    title: java.lang.String,
    url: java.lang.String
  ): Discount = {
    val __obj = js.Dynamic.literal(detail = detail, end_time = end_time, photos = photos, provider = provider, sold_num = sold_num, start_time = start_time, title = title, url = url)
  
    __obj.asInstanceOf[Discount]
  }
}

