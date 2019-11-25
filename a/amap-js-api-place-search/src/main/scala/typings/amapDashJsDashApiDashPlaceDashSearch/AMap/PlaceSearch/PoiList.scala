package typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoiList extends js.Object {
  /**
    * 查询结果总数
    */
  var count: Double
   // PlaceSearchPoiBase[] | PlaceSearchPoiExt[];
  /**
    * 页码
    */
  var pageIndex: Double
  /**
    * 单页结果数
    */
  var pageSize: Double
  /**
    * Poi列表
    */
  var pois: js.Array[Poi]
}

object PoiList {
  @scala.inline
  def apply(count: Double, pageIndex: Double, pageSize: Double, pois: js.Array[Poi]): PoiList = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pois = pois.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PoiList]
  }
}

