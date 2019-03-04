package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoiList extends js.Object {
  var count: scala.Double
  var pageIndex: scala.Double
  var pageSize: scala.Double
  var pois: js.Array[Poi]
}

object PoiList {
  @scala.inline
  def apply(count: scala.Double, pageIndex: scala.Double, pageSize: scala.Double, pois: js.Array[Poi]): PoiList = {
    val __obj = js.Dynamic.literal(count = count, pageIndex = pageIndex, pageSize = pageSize, pois = pois)
  
    __obj.asInstanceOf[PoiList]
  }
}

