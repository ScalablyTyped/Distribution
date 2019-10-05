package typings.amapDashJsDashApiDashDriving.AMap.Driving

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveStep extends js.Object {
  /**
    * 本驾车子路段完成后动作
    */
  var action: String
  /**
    * 驾车子路段完成后辅助动作，一般为到达某个目的地时返回
    */
  var assistant_action: String
  /**
    * 途径城市列表
    */
  var cities: js.UndefOr[js.Array[ViaCity]] = js.undefined
  /**
    * 此路段距离，单位：米
    */
  var distance: Double
  /**
    * 此路段终点
    */
  var end_location: LngLat
  /**
    * 此路段说明
    */
  var instruction: String
  /**
    * 驾车方向
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
    * 此路段起点
    */
  var start_location: LngLat
  /**
    * 此路段预计使用时间，单位：秒
    */
  var time: Double
  /**
    * 实时交通信息列表
    */
  var tmcs: js.UndefOr[js.Array[TMC]] = js.undefined
  var tmcsPaths: js.UndefOr[js.Array[TMCsPath]] = js.undefined
  /**
    * 收费路段长度，单位：米
    */
  var toll_distance: Double
  /**
    * 主要收费道路
    */
  var toll_road: String
  /**
    * 此段收费，单位：元
    */
  var tolls: Double
}

object DriveStep {
  @scala.inline
  def apply(
    action: String,
    assistant_action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double,
    toll_distance: Double,
    toll_road: String,
    tolls: Double,
    cities: js.Array[ViaCity] = null,
    tmcs: js.Array[TMC] = null,
    tmcsPaths: js.Array[TMCsPath] = null
  ): DriveStep = {
    val __obj = js.Dynamic.literal(action = action, assistant_action = assistant_action, distance = distance, end_location = end_location, instruction = instruction, orientation = orientation, path = path, road = road, start_location = start_location, time = time, toll_distance = toll_distance, toll_road = toll_road, tolls = tolls)
    if (cities != null) __obj.updateDynamic("cities")(cities)
    if (tmcs != null) __obj.updateDynamic("tmcs")(tmcs)
    if (tmcsPaths != null) __obj.updateDynamic("tmcsPaths")(tmcsPaths)
    __obj.asInstanceOf[DriveStep]
  }
}

