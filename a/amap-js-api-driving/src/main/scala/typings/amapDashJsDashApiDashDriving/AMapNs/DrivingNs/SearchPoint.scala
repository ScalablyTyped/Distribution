package typings.amapDashJsDashApiDashDriving.AMapNs.DrivingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchPoint extends js.Object {
  /**
    * 城市
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * 关键词
    */
  var keyword: String
}

object SearchPoint {
  @scala.inline
  def apply(keyword: String, city: String = null): SearchPoint = {
    val __obj = js.Dynamic.literal(keyword = keyword)
    if (city != null) __obj.updateDynamic("city")(city)
    __obj.asInstanceOf[SearchPoint]
  }
}

