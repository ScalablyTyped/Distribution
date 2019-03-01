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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("businessArea")(businessArea)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("tel")(tel)
    __obj.asInstanceOf[ReGeocodePoi]
  }
}

