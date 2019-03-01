package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Latitude extends js.Object {
  var latitude: java.lang.String
  var longitude: java.lang.String
}

object Anon_Latitude {
  @scala.inline
  def apply(latitude: java.lang.String, longitude: java.lang.String): Anon_Latitude = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[Anon_Latitude]
  }
}

