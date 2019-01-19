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

