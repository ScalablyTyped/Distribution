package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinates extends js.Object {
  /** Latitude coordinate. */
  var latitude: scala.Double
  /** Longitude coordinate. */
  var longitude: scala.Double
}

object Coordinates {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): Coordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[Coordinates]
  }
}

