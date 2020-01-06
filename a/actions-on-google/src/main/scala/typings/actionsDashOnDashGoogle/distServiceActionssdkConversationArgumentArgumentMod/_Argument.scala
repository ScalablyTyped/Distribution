package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleTypeDate
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleTypeLatLng
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleTypePostalAddress
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleTypeTimeOfDay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Argument extends js.Object

object _Argument {
  @scala.inline
  def GoogleActionsV2Location(
    city: String = null,
    coordinates: GoogleTypeLatLng = null,
    formattedAddress: String = null,
    name: String = null,
    notes: String = null,
    phoneNumber: String = null,
    placeId: String = null,
    postalAddress: GoogleTypePostalAddress = null,
    zipCode: String = null
  ): _Argument = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (formattedAddress != null) __obj.updateDynamic("formattedAddress")(formattedAddress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    if (zipCode != null) __obj.updateDynamic("zipCode")(zipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Argument]
  }
  @scala.inline
  def GoogleRpcStatus(code: Int | Double = null, details: js.Array[ApiClientObjectMap[_]] = null, message: String = null): _Argument = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Argument]
  }
  @scala.inline
  def GoogleActionsV2DateTime(date: GoogleTypeDate = null, time: GoogleTypeTimeOfDay = null): _Argument = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Argument]
  }
}

