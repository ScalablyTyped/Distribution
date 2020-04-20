package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationResult extends js.Object {
  var accuracy: Double
  var info: String
  var isConverted: Boolean
  var position: LngLat
}

object GeolocationResult {
  @scala.inline
  def apply(accuracy: Double, info: String, isConverted: Boolean, position: LngLat): GeolocationResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isConverted = isConverted.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationResult]
  }
}

