package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLatitude extends js.Object {
  var latitude: String
  var longitude: String
}

object AnonLatitude {
  @scala.inline
  def apply(latitude: String, longitude: String): AnonLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLatitude]
  }
}

