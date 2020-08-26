package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A place object returned from a geocoder lookup or reverse lookup.
  */
@js.native
trait Place extends js.Object {
  /**
    * The latitude and longitude for the place.
    */
  var coordinate: Coordinate = js.native
  /**
    * The country code associated with the place.
    */
  var countryCode: String = js.native
  /**
    * The address of the place, formatted using its country's conventions.
    */
  var formattedAddress: String = js.native
  /**
    * The name of the place.
    */
  var name: String = js.native
  /**
    * The geographic region associated with the place.
    */
  var region: CoordinateRegion = js.native
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
  @scala.inline
  implicit class PlaceOps[Self <: Place] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoordinate(value: Coordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedAddress(value: String): Self = this.set("formattedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
  }
  
}

