package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poi extends js.Object {
  var adcode: String
  var address: String
  var adname: String
  var citycode: String
  var cityname: String
  var discount: Boolean
  var distance: Double
  var email: String
  var entr_location: LngLat
  var exit_location: LngLat
  var groupbuy: Boolean
  var id: String
  var location: LngLat
  var name: String
  var pcode: String
  var pname: String
  var postcode: String
  var tel: String
  var `type`: String
  var website: String
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
    val __obj = js.Dynamic.literal(adcode = adcode, address = address, adname = adname, citycode = citycode, cityname = cityname, discount = discount, distance = distance, email = email, entr_location = entr_location, exit_location = exit_location, groupbuy = groupbuy, id = id, location = location, name = name, pcode = pcode, pname = pname, postcode = postcode, tel = tel, website = website)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Poi]
  }
}

