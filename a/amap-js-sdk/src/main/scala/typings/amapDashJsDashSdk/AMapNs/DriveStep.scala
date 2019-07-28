package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveStep extends js.Object {
  var action: String
  var assist_action: String
  var cities: js.UndefOr[js.Array[ViaCity]] = js.undefined
  var distance: Double
  var end_location: LngLat
  var instruction: String
  var orientation: String
  var path: js.Array[LngLat]
  var road: String
  var start_location: LngLat
  var time: Double
  var tmcs: js.UndefOr[js.Array[TMC]] = js.undefined
  var toll_road: String
  var tolls: Double
  var tolls_distance: Double
}

object DriveStep {
  @scala.inline
  def apply(
    action: String,
    assist_action: String,
    distance: Double,
    end_location: LngLat,
    instruction: String,
    orientation: String,
    path: js.Array[LngLat],
    road: String,
    start_location: LngLat,
    time: Double,
    toll_road: String,
    tolls: Double,
    tolls_distance: Double,
    cities: js.Array[ViaCity] = null,
    tmcs: js.Array[TMC] = null
  ): DriveStep = {
    val __obj = js.Dynamic.literal(action = action, assist_action = assist_action, distance = distance, end_location = end_location, instruction = instruction, orientation = orientation, path = path, road = road, start_location = start_location, time = time, toll_road = toll_road, tolls = tolls, tolls_distance = tolls_distance)
    if (cities != null) __obj.updateDynamic("cities")(cities)
    if (tmcs != null) __obj.updateDynamic("tmcs")(tmcs)
    __obj.asInstanceOf[DriveStep]
  }
}

