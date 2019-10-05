package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoLocation extends js.Object {
  /**
    * Latitude information of remote IP address.
    */
  var Lat: js.UndefOr[Double] = js.undefined
  /**
    * Longitude information of remote IP address.
    */
  var Lon: js.UndefOr[Double] = js.undefined
}

object GeoLocation {
  @scala.inline
  def apply(Lat: Int | scala.Double = null, Lon: Int | scala.Double = null): GeoLocation = {
    val __obj = js.Dynamic.literal()
    if (Lat != null) __obj.updateDynamic("Lat")(Lat.asInstanceOf[js.Any])
    if (Lon != null) __obj.updateDynamic("Lon")(Lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoLocation]
  }
}

