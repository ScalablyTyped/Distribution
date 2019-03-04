package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveStep extends js.Object {
  var action: java.lang.String
  var assist_action: java.lang.String
  var cities: js.UndefOr[js.Array[ViaCity]] = js.undefined
  var distance: scala.Double
  var end_location: LngLat
  var instruction: java.lang.String
  var orientation: java.lang.String
  var path: js.Array[LngLat]
  var road: java.lang.String
  var start_location: LngLat
  var time: scala.Double
  var tmcs: js.UndefOr[js.Array[TMC]] = js.undefined
  var toll_road: java.lang.String
  var tolls: scala.Double
  var tolls_distance: scala.Double
}

object DriveStep {
  @scala.inline
  def apply(
    action: java.lang.String,
    assist_action: java.lang.String,
    distance: scala.Double,
    end_location: LngLat,
    instruction: java.lang.String,
    orientation: java.lang.String,
    path: js.Array[LngLat],
    road: java.lang.String,
    start_location: LngLat,
    time: scala.Double,
    toll_road: java.lang.String,
    tolls: scala.Double,
    tolls_distance: scala.Double,
    cities: js.Array[ViaCity] = null,
    tmcs: js.Array[TMC] = null
  ): DriveStep = {
    val __obj = js.Dynamic.literal(action = action, assist_action = assist_action, distance = distance, end_location = end_location, instruction = instruction, orientation = orientation, path = path, road = road, start_location = start_location, time = time, toll_road = toll_road, tolls = tolls, tolls_distance = tolls_distance)
    if (cities != null) __obj.updateDynamic("cities")(cities)
    if (tmcs != null) __obj.updateDynamic("tmcs")(tmcs)
    __obj.asInstanceOf[DriveStep]
  }
}

