package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPSPointDimension extends js.Object {
  /**
    * The GPS coordinates to measure distance from.
    */
  var Coordinates: GPSCoordinates
  /**
    * The range, in kilometers, from the GPS coordinates.
    */
  var RangeInKilometers: js.UndefOr[__double] = js.undefined
}

object GPSPointDimension {
  @scala.inline
  def apply(Coordinates: GPSCoordinates, RangeInKilometers: Int | Double = null): GPSPointDimension = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates)
    if (RangeInKilometers != null) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSPointDimension]
  }
}

