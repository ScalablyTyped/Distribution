package typings.amapJsSdk.AMap

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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiList]
  }
}

