package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocodePoi extends js.Object {
  var address: java.lang.String
  var businessArea: java.lang.String
  var direction: java.lang.String
  var distance: scala.Double
  var id: java.lang.String
  var location: LngLat
  var name: java.lang.String
  var tel: java.lang.String
  var `type`: java.lang.String
}

object ReGeocodePoi {
  @scala.inline
  def apply(
    address: java.lang.String,
    businessArea: java.lang.String,
    direction: java.lang.String,
    distance: scala.Double,
    id: java.lang.String,
    location: LngLat,
    name: java.lang.String,
    tel: java.lang.String,
    `type`: java.lang.String
  ): ReGeocodePoi = {
    val __obj = js.Dynamic.literal(address = address, businessArea = businessArea, direction = direction, distance = distance, id = id, location = location, name = name, tel = tel)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReGeocodePoi]
  }
}

