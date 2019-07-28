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
  def apply(Coordinates: GPSCoordinates, RangeInKilometers: js.UndefOr[__double] = js.undefined): GPSPointDimension = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates)
    if (!js.isUndefined(RangeInKilometers)) __obj.updateDynamic("RangeInKilometers")(RangeInKilometers)
    __obj.asInstanceOf[GPSPointDimension]
  }
}

