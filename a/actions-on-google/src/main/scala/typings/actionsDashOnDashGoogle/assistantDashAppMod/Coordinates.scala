package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinates extends js.Object {
  /** Latitude coordinate. */
  var latitude: Double
  /** Longitude coordinate. */
  var longitude: Double
}

object Coordinates {
  @scala.inline
  def apply(latitude: Double, longitude: Double): Coordinates = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[Coordinates]
  }
}

