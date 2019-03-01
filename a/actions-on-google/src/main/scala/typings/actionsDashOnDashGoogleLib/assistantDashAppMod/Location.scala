package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** Full, formatted street address. Requested with SupportedPermissions.DEVICE_PRECISE_LOCATION. */
  var address: java.lang.String
  /** Device city. Requested with SupportedPermissions.DEVICE_COARSE_LOCATION. */
  var city: java.lang.String
  /** Coordinates: {latitude, longitude}. Requested with SupportedPermissions.DEVICE_PRECISE_LOCATION. */
  var coordinates: Coordinates
  /** Zip code. Requested with SupportedPermissions.DEVICE_COARSE_LOCATION. */
  var zipCode: java.lang.String
}

object Location {
  @scala.inline
  def apply(
    address: java.lang.String,
    city: java.lang.String,
    coordinates: Coordinates,
    zipCode: java.lang.String
  ): Location = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("coordinates")(coordinates)
    __obj.updateDynamic("zipCode")(zipCode)
    __obj.asInstanceOf[Location]
  }
}

