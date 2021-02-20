package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApi.AMap.InfoWindow
import typings.amapJsApi.AMap.Marker
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Poi
import typings.std.HTMLDivElement
import typings.std.HTMLLIElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api-place-search.AMap.PlaceSearch.SelectChangeEventData & {  event :std.MouseEvent,   infoWindow :amap-js-api.AMap.InfoWindow<any>,   infoWindowContentDom :std.HTMLDivElement} */
@js.native
trait SelectChangeEventDataeven extends StObject {
  
  /**
    * 当前选中的POI的信息
    */
  var data: js.Array[Poi] = js.native
  
  var event: MouseEvent = js.native
  
  /**
    * 当前选中的POI的ID
    */
  var id: String = js.native
  
  /**
    * 索引
    */
  var index: Double = js.native
  
  var infoWindow: InfoWindow[_] = js.native
  
  var infoWindowContentDom: HTMLDivElement = js.native
  
  /**
    * 当前选中的POI在结果面板中对应的列表项
    */
  var listElement: HTMLLIElement = js.native
  
  /**
    * 当前选中的POI对应的在地图中的Marker对象
    */
  var marker: Marker[_] = js.native
}
object SelectChangeEventDataeven {
  
  @scala.inline
  def apply(
    data: js.Array[Poi],
    event: MouseEvent,
    id: String,
    index: Double,
    infoWindow: InfoWindow[_],
    infoWindowContentDom: HTMLDivElement,
    listElement: HTMLLIElement,
    marker: Marker[_]
  ): SelectChangeEventDataeven = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], infoWindow = infoWindow.asInstanceOf[js.Any], infoWindowContentDom = infoWindowContentDom.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEventDataeven]
  }
  
  @scala.inline
  implicit class SelectChangeEventDataevenMutableBuilder[Self <: SelectChangeEventDataeven] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Poi]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Poi*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoWindow(value: InfoWindow[_]): Self = StObject.set(x, "infoWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoWindowContentDom(value: HTMLDivElement): Self = StObject.set(x, "infoWindowContentDom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListElement(value: HTMLLIElement): Self = StObject.set(x, "listElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: Marker[_]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
