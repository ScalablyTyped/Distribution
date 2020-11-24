package typings.amapJsApiLineSearch.AMap.LineSearch

import typings.amapJsApi.AMap.Bounds
import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.amapJsApiLineSearch.AMap.LineSearch.LineInfo because Already inherited */ @js.native
trait LineInfoExt extends LineInfoBase {
  
  /**
    * 起步票价，单位：元
    */
  var basic_price: String = js.native
  
   // is string actually
  /**
    * 全程距离，单位：千米
    */
  var bounds: Bounds = js.native
  
  /**
    * 所属公交公司
    */
  var company: String = js.native
  
  /**
    * 全程距离，单位：千米
    */
  var distance: String = js.native
  
  /**
    * 末班车时间
    */
  var etime: String = js.native
  
  /**
    * 首班车时间
    */
  var stime: String = js.native
  
  /**
    * 全程票价，单位：元
    */
  var total_price: String = js.native
  
  /**
    * 途径站，包括首发站和终点站
    */
  var via_stops: js.Array[BusStop] = js.native
}
object LineInfoExt {
  
  @scala.inline
  def apply(
    basic_price: String,
    bounds: Bounds,
    citycode: String,
    company: String,
    distance: String,
    end_stop: String,
    etime: String,
    id: String,
    name: String,
    path: js.Array[LngLat],
    start_stop: String,
    stime: String,
    total_price: String,
    `type`: String,
    via_stops: js.Array[BusStop]
  ): LineInfoExt = {
    val __obj = js.Dynamic.literal(basic_price = basic_price.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], etime = etime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], total_price = total_price.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineInfoExt]
  }
  
  @scala.inline
  implicit class LineInfoExtOps[Self <: LineInfoExt] (val x: Self) extends AnyVal {
    
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
    def setBasic_price(value: String): Self = this.set("basic_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: String): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtime(value: String): Self = this.set("etime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStime(value: String): Self = this.set("stime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_price(value: String): Self = this.set("total_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia_stopsVarargs(value: BusStop*): Self = this.set("via_stops", js.Array(value :_*))
    
    @scala.inline
    def setVia_stops(value: js.Array[BusStop]): Self = this.set("via_stops", value.asInstanceOf[js.Any])
  }
}
