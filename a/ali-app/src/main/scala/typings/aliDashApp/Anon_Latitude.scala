package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Latitude extends js.Object {
  var latitude: String
  var longitude: String
}

object Anon_Latitude {
  @scala.inline
  def apply(latitude: String, longitude: String): Anon_Latitude = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[Anon_Latitude]
  }
}

