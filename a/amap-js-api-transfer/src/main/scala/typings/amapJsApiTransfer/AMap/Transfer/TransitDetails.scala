package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitDetails extends js.Object {
  
  /**
    * 地铁站入口
    */
  var entrance: js.UndefOr[SubwayEntrance] = js.native
  
  /**
    * 地铁站出口
    */
  var exit: js.UndefOr[SubwayEntrance] = js.native
  
  /**
    * 此换乘段公交路线
    */
  var lines: js.Array[TransitLine] = js.native
  
  /**
    * 此换乘段的下车站
    */
  var off_station: Stop = js.native
  
  /**
    * 此换乘段的上车站
    */
  var on_station: Stop = js.native
  
  /**
    * 此换乘段公交部分（上车站-下车站）坐标集合
    */
  var path: js.Array[LngLat] = js.native
  
  /**
    * 途径公交站点数（不包括上车站和下车站）
    */
  var via_num: Double = js.native
  
  /**
    * 途径公交站点集合（不包括上车站和下车站）
    */
  var via_stops: js.Array[Stop] = js.native
}
object TransitDetails {
  
  @scala.inline
  def apply(
    lines: js.Array[TransitLine],
    off_station: Stop,
    on_station: Stop,
    path: js.Array[LngLat],
    via_num: Double,
    via_stops: js.Array[Stop]
  ): TransitDetails = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], off_station = off_station.asInstanceOf[js.Any], on_station = on_station.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitDetails]
  }
  
  @scala.inline
  implicit class TransitDetailsOps[Self <: TransitDetails] (val x: Self) extends AnyVal {
    
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
    def setLinesVarargs(value: TransitLine*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[TransitLine]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff_station(value: Stop): Self = this.set("off_station", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_station(value: Stop): Self = this.set("on_station", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: LngLat*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia_num(value: Double): Self = this.set("via_num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia_stopsVarargs(value: Stop*): Self = this.set("via_stops", js.Array(value :_*))
    
    @scala.inline
    def setVia_stops(value: js.Array[Stop]): Self = this.set("via_stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrance(value: SubwayEntrance): Self = this.set("entrance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrance: Self = this.set("entrance", js.undefined)
    
    @scala.inline
    def setExit(value: SubwayEntrance): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
