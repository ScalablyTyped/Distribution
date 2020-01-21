package typings.amapJsSdk.AMap

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
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], entr_location = entr_location.asInstanceOf[js.Any], exit_location = exit_location.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
}

