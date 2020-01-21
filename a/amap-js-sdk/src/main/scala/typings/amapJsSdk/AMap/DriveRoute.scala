package typings.amapJsSdk.AMap

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
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DriveRoute]
  }
}

