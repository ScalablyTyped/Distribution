package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A place object returned from a geocoder lookup or reverse lookup.
  */
trait Place extends js.Object {
  /**
    * The latitude and longitude for the place.
    */
  var coordinate: Coordinate
  /**
    * The country code associated with the place.
    */
  var countryCode: String
  /**
    * The address of the place, formatted using its country's conventions.
    */
  var formattedAddress: String
  /**
    * The name of the place.
    */
  var name: String
  /**
    * The geographic region associated with the place.
    */
  var region: CoordinateRegion
}

object Place {
  @scala.inline
  def apply(
    coordinate: Coordinate,
    countryCode: String,
    formattedAddress: String,
    name: String,
    region: CoordinateRegion
  ): Place = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Place]
  }
}

