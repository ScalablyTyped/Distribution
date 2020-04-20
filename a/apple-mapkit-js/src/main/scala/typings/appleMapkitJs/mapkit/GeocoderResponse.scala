package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from a geocoder lookup or reverse lookup.
  */
trait GeocoderResponse extends js.Object {
  var results: js.Array[Place]
}

object GeocoderResponse {
  @scala.inline
  def apply(results: js.Array[Place]): GeocoderResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResponse]
  }
}

