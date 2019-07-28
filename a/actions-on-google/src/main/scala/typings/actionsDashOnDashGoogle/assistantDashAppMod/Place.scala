package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends Location {
  /**
    * Used with Places API to fetch details of a place.
    * See {@link https://developers.google.com/places/web-service/place-id}
    */
  var placeId: String
}

object Place {
  @scala.inline
  def apply(address: String, city: String, coordinates: Coordinates, placeId: String, zipCode: String): Place = {
    val __obj = js.Dynamic.literal(address = address, city = city, coordinates = coordinates, placeId = placeId, zipCode = zipCode)
  
    __obj.asInstanceOf[Place]
  }
}

