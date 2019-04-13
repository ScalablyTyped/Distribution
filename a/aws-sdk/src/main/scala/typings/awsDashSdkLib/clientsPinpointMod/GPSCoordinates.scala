package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPSCoordinates extends js.Object {
  /**
    * Latitude
    */
  var Latitude: js.UndefOr[__double] = js.undefined
  /**
    * Longitude
    */
  var Longitude: js.UndefOr[__double] = js.undefined
}

object GPSCoordinates {
  @scala.inline
  def apply(Latitude: js.UndefOr[__double] = js.undefined, Longitude: js.UndefOr[__double] = js.undefined): GPSCoordinates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Latitude)) __obj.updateDynamic("Latitude")(Latitude)
    if (!js.isUndefined(Longitude)) __obj.updateDynamic("Longitude")(Longitude)
    __obj.asInstanceOf[GPSCoordinates]
  }
}

