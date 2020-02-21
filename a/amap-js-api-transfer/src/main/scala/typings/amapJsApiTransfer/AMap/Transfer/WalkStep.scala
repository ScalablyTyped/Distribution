package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkStep extends js.Object {
  /**
    * 本步行子路段完成后动作
    */
  var action: String
  /**
    * 步行子路段完成后辅助动作，一般为到达某个公交站点或目的地时返回
    */
  var assist_action: String
  /**
    * 步行子路段距离，单位：米
    */
  var distance: Double
  /**
    * 步行子路段描述
    */
  var instruction: String
  /**
    * 步行子路段坐标集合
    */
  var path: js.Array[LngLat]
  /**
    * 道路
    */
  var road: String
  /**
    * 步行子路段预计使用时间，单位：秒
    */
  var time: Double
}

object WalkStep {
  @scala.inline
  def apply(
    action: String,
    assist_action: String,
    distance: Double,
    instruction: String,
    path: js.Array[LngLat],
    road: String,
    time: Double
  ): WalkStep = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WalkStep]
  }
}

