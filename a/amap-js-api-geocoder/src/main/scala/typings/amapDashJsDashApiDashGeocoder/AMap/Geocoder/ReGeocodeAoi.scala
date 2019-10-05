package typings.amapDashJsDashApiDashGeocoder.AMap.Geocoder

import typings.amapDashJsDashApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReGeocodeAoi extends js.Object {
  var adcode: String
  var area: String
  var id: String
  var location: LngLat
  var name: String
  var `type`: String
}

object ReGeocodeAoi {
  @scala.inline
  def apply(adcode: String, area: String, id: String, location: LngLat, name: String, `type`: String): ReGeocodeAoi = {
    val __obj = js.Dynamic.literal(adcode = adcode, area = area, id = id, location = location, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReGeocodeAoi]
  }
}

