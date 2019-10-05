package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocodePoi extends js.Object {
  var address: String
  var businessArea: String
  var direction: String
  var distance: Double
  var id: String
  var location: LngLat
  var name: String
  var tel: String
  var `type`: String
}

object ReGeocodePoi {
  @scala.inline
  def apply(
    address: String,
    businessArea: String,
    direction: String,
    distance: Double,
    id: String,
    location: LngLat,
    name: String,
    tel: String,
    `type`: String
  ): ReGeocodePoi = {
    val __obj = js.Dynamic.literal(address = address, businessArea = businessArea, direction = direction, distance = distance, id = id, location = location, name = name, tel = tel)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReGeocodePoi]
  }
}

