package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferPlan extends js.Object {
  /**
    * 此换乘方案价格，单位：元
    */
  var cost: Double
  /**
    * 此换乘方案全程距离，单位：米
    */
  var distance: Double
  /**
    * 是否夜间线路
    */
  var nightLine: Boolean
  /**
    * 此换乘方案的路径坐标集合
    */
  var path: js.Array[LngLat]
  /**
    * 此方案火车行驶距离，单位：米
    */
  var railway_distance: Double
  /**
    * 换乘路段列表，以每次换乘动结束作为分段点，将整个换乘方案分隔成若干 Segment（换乘路段）
    */
  var segments: js.Array[Segment]
  /**
    * 此方案出租车行驶距离，单位：米
    */
  var taxi_distance: Double
  /**
    * 预期时间，单位：秒
    */
  var time: Double
  /**
    * 此方案公交行驶距离，单位：米
    */
  var transit_distance: Double
  /**
    * 此方案总步行距离，单位：米
    */
  var walking_distance: Double
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
}

