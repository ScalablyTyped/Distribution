package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReGeocodePoi extends js.Object {
  var address: String = js.native
  var businessArea: String = js.native
  var direction: String = js.native
  var distance: Double = js.native
  var id: String = js.native
  var location: LngLat = js.native
  var name: String = js.native
  var tel: String = js.native
  var `type`: String = js.native
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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], businessArea = businessArea.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocodePoi]
  }
  @scala.inline
  implicit class ReGeocodePoiOps[Self <: ReGeocodePoi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setBusinessArea(value: String): Self = this.set("businessArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LngLat): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTel(value: String): Self = this.set("tel", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

