package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResultCommon extends js.Object {
  
  /**
    * 驾车规划终点坐标
    */
  var destination: LngLat = js.native
  
  /**
    * 成功状态说明
    */
  var info: String = js.native
  
  /**
    * 驾车规划起点坐标
    */
  var origin: LngLat = js.native
  
  /**
    * 驾车规划路线列表
    */
  var routes: js.Array[DriveRoute] = js.native
  
  /**
    * 打车费用，仅extensions为“all”时返回
    * 单位：元
    */
  var taxi_cost: js.UndefOr[Double] = js.native
}
object SearchResultCommon {
  
  @scala.inline
  def apply(destination: LngLat, info: String, origin: LngLat, routes: js.Array[DriveRoute]): SearchResultCommon = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultCommon]
  }
  
  @scala.inline
  implicit class SearchResultCommonOps[Self <: SearchResultCommon] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: LngLat): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: LngLat): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: DriveRoute*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[DriveRoute]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxi_cost(value: Double): Self = this.set("taxi_cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxi_cost: Self = this.set("taxi_cost", js.undefined)
  }
}
