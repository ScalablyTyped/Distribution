package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
  var coordinate: Coordinate
  var countryCode: String
  var formattedAddress: String
  var name: String
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
    val __obj = js.Dynamic.literal(coordinate = coordinate, countryCode = countryCode, formattedAddress = formattedAddress, name = name, region = region)
  
    __obj.asInstanceOf[Place]
  }
}

