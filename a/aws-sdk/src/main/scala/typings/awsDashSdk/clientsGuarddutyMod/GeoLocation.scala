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
  def apply(Lat: js.UndefOr[Double] = js.undefined, Lon: js.UndefOr[Double] = js.undefined): GeoLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Lat)) __obj.updateDynamic("Lat")(Lat)
    if (!js.isUndefined(Lon)) __obj.updateDynamic("Lon")(Lon)
    __obj.asInstanceOf[GeoLocation]
  }
}

