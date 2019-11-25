package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsReservationReservationItemExtension extends js.Object {
  /**
    * Confirmation code for this reservation.
    */
  var confirmationCode: js.UndefOr[String] = js.undefined
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Location of the service/event.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * The number of people.
    */
  var partySize: js.UndefOr[Double] = js.undefined
  /**
    * Time when the service/event is scheduled to occur.
    * Can be a time range, a date, or an exact date time.
    */
  var reservationTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  /**
    * Staff facilitators who will be servicing the reservation.
    * Ex. The hairstylist.
    */
  var staffFacilitators: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator]] = js.undefined
  /**
    * Required: Reservation status.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionStatus] = js.undefined
  /**
    * Type of reservation.
    * May be unset if none of the type options is applicable.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionType] = js.undefined
  /**
    * Time range that is acceptable to the user.
    */
  var userAcceptableTimeRange: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  /**
    * Required: User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsReservationReservationItemExtension {
  @scala.inline
  def apply(
    confirmationCode: String = null,
    extension: ApiClientObjectMap[_] = null,
    location: GoogleActionsV2Location = null,
    partySize: Int | Double = null,
    reservationTime: GoogleActionsOrdersV3Time = null,
    staffFacilitators: js.Array[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator] = null,
    status: GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionStatus = null,
    `type`: GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionType = null,
    userAcceptableTimeRange: GoogleActionsOrdersV3Time = null,
    userVisibleStatusLabel: String = null
  ): GoogleActionsOrdersV3VerticalsReservationReservationItemExtension = {
    val __obj = js.Dynamic.literal()
    if (confirmationCode != null) __obj.updateDynamic("confirmationCode")(confirmationCode.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (partySize != null) __obj.updateDynamic("partySize")(partySize.asInstanceOf[js.Any])
    if (reservationTime != null) __obj.updateDynamic("reservationTime")(reservationTime.asInstanceOf[js.Any])
    if (staffFacilitators != null) __obj.updateDynamic("staffFacilitators")(staffFacilitators.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userAcceptableTimeRange != null) __obj.updateDynamic("userAcceptableTimeRange")(userAcceptableTimeRange.asInstanceOf[js.Any])
    if (userVisibleStatusLabel != null) __obj.updateDynamic("userVisibleStatusLabel")(userVisibleStatusLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsReservationReservationItemExtension]
  }
}

