package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoiList extends js.Object {
  var count: Double
  var pageIndex: Double
  var pageSize: Double
  var pois: js.Array[Poi]
}

object PoiList {
  @scala.inline
  def apply(count: Double, pageIndex: Double, pageSize: Double, pois: js.Array[Poi]): PoiList = {
    val __obj = js.Dynamic.literal(count = count, pageIndex = pageIndex, pageSize = pageSize, pois = pois)
  
    __obj.asInstanceOf[PoiList]
  }
}

