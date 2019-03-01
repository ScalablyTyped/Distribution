package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationCoordinates extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object LocationCoordinates {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): LocationCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[LocationCoordinates]
  }
}

