package typings.amapDashJsDashApiDashArrivalDashRange.AMap.ArrivalRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  /**
    * 到达圈边界坐标点
    */
  var bounds: js.Array[js.Array[js.Array[js.Array[String]]]]
  /**
    * 提供的终点坐标是否在到达圈内
    */
  var inRange: js.UndefOr[js.Array[Boolean]] = js.undefined
  /**
    * 查询状态说明
    */
  var info: String
  // internal
  var infocode: String
}

object SearchResult {
  @scala.inline
  def apply(
    bounds: js.Array[js.Array[js.Array[js.Array[String]]]],
    info: String,
    infocode: String,
    inRange: js.Array[Boolean] = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], infocode = infocode.asInstanceOf[js.Any])
    if (inRange != null) __obj.updateDynamic("inRange")(inRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

