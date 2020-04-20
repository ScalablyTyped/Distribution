package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchPoint extends js.Object {
  /**
    * 关键词
    */
  var keyword: String
}

object SearchPoint {
  @scala.inline
  def apply(keyword: String): SearchPoint = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPoint]
  }
}

