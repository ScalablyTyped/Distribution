package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPSPointDimension extends js.Object {
  /**
    * Coordinate to measure distance from.
    */
  var Coordinates: js.UndefOr[GPSCoordinates] = js.undefined
  /**
    * Range in kilometers from the coordinate.
    */
  var RangeInKilometers: js.UndefOr[__double] = js.undefined
}

object GPSPointDimension {
  @scala.inline
  def apply(Coordinates: GPSCoordinates = null, RangeInKilometers: js.UndefOr[__double] = js.undefined): GPSPointDimension = {
    val __obj = js.Dynamic.literal()
    if (Coordinates != null) __obj.updateDynamic("Coordinates")(Coordinates)
    if (!js.isUndefined(RangeInKilometers)) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers)
    __obj.asInstanceOf[GPSPointDimension]
  }
}

