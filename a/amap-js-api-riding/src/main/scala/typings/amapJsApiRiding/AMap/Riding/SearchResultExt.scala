package typings.amapJsApiRiding.AMap.Riding

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResultExt
  extends SearchResultCommon
     with SearchResult {
  
  /**
    * 骑行导航终点名称
    */
  var destinationName: String = js.native
  
  /**
    * 骑行导航终点
    */
  var end: PoiExt = js.native
  
  /**
    * 骑行导航起点名称
    */
  var originName: String = js.native
  
  /**
    * 骑行导航起点
    */
  var start: PoiExt = js.native
}
object SearchResultExt {
  
  @scala.inline
  def apply(
    count: Double,
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    routes: js.Array[RideRoute],
    start: PoiExt
  ): SearchResultExt = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultExt]
  }
  
  @scala.inline
  implicit class SearchResultExtOps[Self <: SearchResultExt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: PoiExt): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginName(value: String): Self = this.set("originName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: PoiExt): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
