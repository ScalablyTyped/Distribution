package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationCoordinates extends js.Object {
  var latitude: Double
  var longitude: Double
}

object LocationCoordinates {
  @scala.inline
  def apply(latitude: Double, longitude: Double): LocationCoordinates = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[LocationCoordinates]
  }
}

