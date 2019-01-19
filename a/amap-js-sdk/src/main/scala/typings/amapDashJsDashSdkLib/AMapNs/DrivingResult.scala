package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingResult extends js.Object {
  var destination: LngLat | Poi
  var info: java.lang.String
  var origin: LngLat
  var routes: js.Array[DriveRoute]
  var start: Poi
  var taxi_cost: scala.Double
  var waypoints: Poi
}

