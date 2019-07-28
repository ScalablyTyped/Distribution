package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPSCoordinates extends js.Object {
  /**
    * The latitude coordinate of the location.
    */
  var Latitude: __double
  /**
    * The longitude coordinate of the location.
    */
  var Longitude: __double
}

object GPSCoordinates {
  @scala.inline
  def apply(Latitude: __double, Longitude: __double): GPSCoordinates = {
    val __obj = js.Dynamic.literal(Latitude = Latitude, Longitude = Longitude)
  
    __obj.asInstanceOf[GPSCoordinates]
  }
}

