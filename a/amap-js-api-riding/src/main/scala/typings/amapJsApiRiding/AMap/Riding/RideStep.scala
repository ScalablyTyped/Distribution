package typings.amapJsApiRiding.AMap.Riding

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RideStep extends js.Object {
  /**
    * 本骑行子路段完成后动作
    */
  var action: String
  /**
    * @deprecated
    * 本骑行子路段完成后辅助动作，一般为到达某个目的地时返回
    * 文档中有此字段但是实际代码中并没有返回
    */
  var assist_action: js.UndefOr[String] = js.undefined
  /**
    * 此路段距离，单位：米
    */
  var distance: Double
  /**
    * 本路段的终点坐标
    */
  var end_location: LngLat
  /**
    * 此路段说明，如“沿北京南站路骑行565米右转”
    */
  var instruction: String
  /**
    * 步行方向
    */
  var orientation: String
  /**
    * 此路段坐标集合
    */
  var path: js.Array[LngLat]
  /**
    * 道路
    */
  var road: String
  /**
    * 本路段的起点坐标
    */
  var start_location: LngLat
  /**
    * 此路段预计使用时间，单位：秒
    */
  var time: Double
}

object RideStep {
  @scala.inline
  def apply(
    action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double,
    assist_action: String = null
  ): RideStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (assist_action != null) __obj.updateDynamic("assist_action")(assist_action.asInstanceOf[js.Any])
    __obj.asInstanceOf[RideStep]
  }
}

