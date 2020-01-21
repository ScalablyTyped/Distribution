package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import typings.amapJsApi.AMap.Marker
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectChangeEventData extends js.Object {
  /**
    * 当前选中的POI的信息
    */
  var data: js.Array[Poi]
  /**
    * 当前选中的POI的ID
    */
  var id: String
  /**
    * 索引
    */
  var index: Double
  /**
    * 当前选中的POI在结果面板中对应的列表项
    */
  var listElement: HTMLLIElement
  /**
    * 当前选中的POI对应的在地图中的Marker对象
    */
  var marker: Marker[_]
}

object SelectChangeEventData {
  @scala.inline
  def apply(data: js.Array[Poi], id: String, index: Double, listElement: HTMLLIElement, marker: Marker[_]): SelectChangeEventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectChangeEventData]
  }
}

