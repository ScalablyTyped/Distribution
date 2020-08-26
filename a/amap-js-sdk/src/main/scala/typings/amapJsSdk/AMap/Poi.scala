package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Poi extends js.Object {
  var adcode: String = js.native
  var address: String = js.native
  var adname: String = js.native
  var citycode: String = js.native
  var cityname: String = js.native
  var discount: Boolean = js.native
  var distance: Double = js.native
  var email: String = js.native
  var entr_location: LngLat = js.native
  var exit_location: LngLat = js.native
  var groupbuy: Boolean = js.native
  var id: String = js.native
  var location: LngLat = js.native
  var name: String = js.native
  var pcode: String = js.native
  var pname: String = js.native
  var postcode: String = js.native
  var tel: String = js.native
  var `type`: String = js.native
  var website: String = js.native
}

object Poi {
  @scala.inline
  def apply(
    adcode: String,
    address: String,
    adname: String,
    citycode: String,
    cityname: String,
    discount: Boolean,
    distance: Double,
    email: String,
    entr_location: LngLat,
    exit_location: LngLat,
    groupbuy: Boolean,
    id: String,
    location: LngLat,
    name: String,
    pcode: String,
    pname: String,
    postcode: String,
    tel: String,
    `type`: String,
    website: String
  ): Poi = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entr_location = entr_location.asInstanceOf[js.Any], exit_location = exit_location.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
  @scala.inline
  implicit class PoiOps[Self <: Poi] (val x: Self) extends AnyVal {
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
    def setAdcode(value: String): Self = this.set("adcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdname(value: String): Self = this.set("adname", value.asInstanceOf[js.Any])
    @scala.inline
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCityname(value: String): Self = this.set("cityname", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscount(value: Boolean): Self = this.set("discount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntr_location(value: LngLat): Self = this.set("entr_location", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit_location(value: LngLat): Self = this.set("exit_location", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupbuy(value: Boolean): Self = this.set("groupbuy", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LngLat): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPcode(value: String): Self = this.set("pcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPname(value: String): Self = this.set("pname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostcode(value: String): Self = this.set("postcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTel(value: String): Self = this.set("tel", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
  }
  
}

