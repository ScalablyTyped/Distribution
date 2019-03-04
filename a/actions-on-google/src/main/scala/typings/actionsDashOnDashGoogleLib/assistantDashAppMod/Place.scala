package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends Location {
  /**
    * Used with Places API to fetch details of a place.
    * See {@link https://developers.google.com/places/web-service/place-id}
    */
  var placeId: java.lang.String
}

object Place {
  @scala.inline
  def apply(
    address: java.lang.String,
    city: java.lang.String,
    coordinates: Coordinates,
    placeId: java.lang.String,
    zipCode: java.lang.String
  ): Place = {
    val __obj = js.Dynamic.literal(address = address, city = city, coordinates = coordinates, placeId = placeId, zipCode = zipCode)
  
    __obj.asInstanceOf[Place]
  }
}

