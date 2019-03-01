package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveRoute extends js.Object {
  var distance: scala.Double
  var policy: java.lang.String
  var steps: js.Array[DriveStep]
  var time: scala.Double
  var tolls: scala.Double
  var tolls_distance: scala.Double
}

object DriveRoute {
  @scala.inline
  def apply(
    distance: scala.Double,
    policy: java.lang.String,
    steps: js.Array[DriveStep],
    time: scala.Double,
    tolls: scala.Double,
    tolls_distance: scala.Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("policy")(policy)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("tolls")(tolls)
    __obj.updateDynamic("tolls_distance")(tolls_distance)
    __obj.asInstanceOf[DriveRoute]
  }
}

