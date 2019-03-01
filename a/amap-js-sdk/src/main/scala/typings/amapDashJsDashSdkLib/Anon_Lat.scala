package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lat extends js.Object {
  var lat: scala.Double
  var lng: scala.Double
}

object Anon_Lat {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): Anon_Lat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lng")(lng)
    __obj.asInstanceOf[Anon_Lat]
  }
}

