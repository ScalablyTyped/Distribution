package typings.amapDashJsDashApiDashRiding.AMap.Riding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchPoint extends js.Object {
  // 地点名称
  var keyword: String
}

object SearchPoint {
  @scala.inline
  def apply(keyword: String): SearchPoint = {
    val __obj = js.Dynamic.literal(keyword = keyword)
  
    __obj.asInstanceOf[SearchPoint]
  }
}

