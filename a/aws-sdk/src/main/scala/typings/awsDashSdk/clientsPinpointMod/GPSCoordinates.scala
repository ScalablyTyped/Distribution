package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPSCoordinates extends js.Object {
  /**
    * The latitude coordinate of the location.
    */
  var Latitude: __double = js.native
  /**
    * The longitude coordinate of the location.
    */
  var Longitude: __double = js.native
}

object GPSCoordinates {
  @scala.inline
  def apply(Latitude: __double, Longitude: __double): GPSCoordinates = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GPSCoordinates]
  }
}

