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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("adcode")(adcode)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("adname")(adname)
    __obj.updateDynamic("citycode")(citycode)
    __obj.updateDynamic("cityname")(cityname)
    __obj.updateDynamic("discount")(discount)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("entr_location")(entr_location)
    __obj.updateDynamic("exit_location")(exit_location)
    __obj.updateDynamic("groupbuy")(groupbuy)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pcode")(pcode)
    __obj.updateDynamic("pname")(pname)
    __obj.updateDynamic("postcode")(postcode)
    __obj.updateDynamic("tel")(tel)
    __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Poi]
  }
}

