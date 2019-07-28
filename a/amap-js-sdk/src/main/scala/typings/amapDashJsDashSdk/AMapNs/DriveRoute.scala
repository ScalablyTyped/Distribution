package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveRoute extends js.Object {
  var distance: Double
  var policy: String
  var steps: js.Array[DriveStep]
  var time: Double
  var tolls: Double
  var tolls_distance: Double
}

object DriveRoute {
  @scala.inline
  def apply(
    distance: Double,
    policy: String,
    steps: js.Array[DriveStep],
    time: Double,
    tolls: Double,
    tolls_distance: Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal(distance = distance, policy = policy, steps = steps, time = time, tolls = tolls, tolls_distance = tolls_distance)
  
    __obj.asInstanceOf[DriveRoute]
  }
}

