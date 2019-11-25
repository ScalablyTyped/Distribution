package typings.amapDashJsDashSdk.AMap

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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], assist_action = assist_action.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], toll_road = toll_road.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
    if (cities != null) __obj.updateDynamic("cities")(cities.asInstanceOf[js.Any])
    if (tmcs != null) __obj.updateDynamic("tmcs")(tmcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveStep]
  }
}

