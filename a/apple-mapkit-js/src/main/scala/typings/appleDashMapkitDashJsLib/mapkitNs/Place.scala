package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
  var coordinate: Coordinate
  var countryCode: java.lang.String
  var formattedAddress: java.lang.String
  var name: java.lang.String
  var region: CoordinateRegion
}

object Place {
  @scala.inline
  def apply(
    coordinate: Coordinate,
    countryCode: java.lang.String,
    formattedAddress: java.lang.String,
    name: java.lang.String,
    region: CoordinateRegion
  ): Place = {
    val __obj = js.Dynamic.literal(coordinate = coordinate, countryCode = countryCode, formattedAddress = formattedAddress, name = name, region = region)
  
    __obj.asInstanceOf[Place]
  }
}

