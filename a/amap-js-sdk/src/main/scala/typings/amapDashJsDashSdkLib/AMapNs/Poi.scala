package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poi extends js.Object {
  var adcode: java.lang.String
  var address: java.lang.String
  var adname: java.lang.String
  var citycode: java.lang.String
  var cityname: java.lang.String
  var discount: scala.Boolean
  var distance: scala.Double
  var email: java.lang.String
  var entr_location: LngLat
  var exit_location: LngLat
  var groupbuy: scala.Boolean
  var id: java.lang.String
  var location: LngLat
  var name: java.lang.String
  var pcode: java.lang.String
  var pname: java.lang.String
  var postcode: java.lang.String
  var tel: java.lang.String
  var `type`: java.lang.String
  var website: java.lang.String
}

object Poi {
  @scala.inline
  def apply(
    adcode: java.lang.String,
    address: java.lang.String,
    adname: java.lang.String,
    citycode: java.lang.String,
    cityname: java.lang.String,
    discount: scala.Boolean,
    distance: scala.Double,
    email: java.lang.String,
    entr_location: LngLat,
    exit_location: LngLat,
    groupbuy: scala.Boolean,
    id: java.lang.String,
    location: LngLat,
    name: java.lang.String,
    pcode: java.lang.String,
    pname: java.lang.String,
    postcode: java.lang.String,
    tel: java.lang.String,
    `type`: java.lang.String,
    website: java.lang.String
  ): Poi = {
    val __obj = js.Dynamic.literal(adcode = adcode, address = address, adname = adname, citycode = citycode, cityname = cityname, discount = discount, distance = distance, email = email, entr_location = entr_location, exit_location = exit_location, groupbuy = groupbuy, id = id, location = location, name = name, pcode = pcode, pname = pname, postcode = postcode, tel = tel, website = website)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Poi]
  }
}

