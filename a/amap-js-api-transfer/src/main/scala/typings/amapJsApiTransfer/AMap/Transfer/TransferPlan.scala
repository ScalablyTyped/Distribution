package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferPlan extends js.Object {
  
  /**
    * 此换乘方案价格，单位：元
    */
  var cost: Double = js.native
  
  /**
    * 此换乘方案全程距离，单位：米
    */
  var distance: Double = js.native
  
  /**
    * 是否夜间线路
    */
  var nightLine: Boolean = js.native
  
  /**
    * 此换乘方案的路径坐标集合
    */
  var path: js.Array[LngLat] = js.native
  
  /**
    * 此方案火车行驶距离，单位：米
    */
  var railway_distance: Double = js.native
  
  /**
    * 换乘路段列表，以每次换乘动结束作为分段点，将整个换乘方案分隔成若干 Segment（换乘路段）
    */
  var segments: js.Array[Segment] = js.native
  
  /**
    * 此方案出租车行驶距离，单位：米
    */
  var taxi_distance: Double = js.native
  
  /**
    * 预期时间，单位：秒
    */
  var time: Double = js.native
  
  /**
    * 此方案公交行驶距离，单位：米
    */
  var transit_distance: Double = js.native
  
  /**
    * 此方案总步行距离，单位：米
    */
  var walking_distance: Double = js.native
}
object TransferPlan {
  
  @scala.inline
  def apply(
    cost: Double,
    distance: Double,
    nightLine: Boolean,
    path: js.Array[LngLat],
    railway_distance: Double,
    segments: js.Array[Segment],
    taxi_distance: Double,
    time: Double,
    transit_distance: Double,
    walking_distance: Double
  ): TransferPlan = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], nightLine = nightLine.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], railway_distance = railway_distance.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], taxi_distance = taxi_distance.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit_distance = transit_distance.asInstanceOf[js.Any], walking_distance = walking_distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferPlan]
  }
  
  @scala.inline
  implicit class TransferPlanOps[Self <: TransferPlan] (val x: Self) extends AnyVal {
    
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
    def setCost(value: Double): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNightLine(value: Boolean): Self = this.set("nightLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: LngLat*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailway_distance(value: Double): Self = this.set("railway_distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxi_distance(value: Double): Self = this.set("taxi_distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransit_distance(value: Double): Self = this.set("transit_distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalking_distance(value: Double): Self = this.set("walking_distance", value.asInstanceOf[js.Any])
  }
}
