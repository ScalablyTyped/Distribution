package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsReservationReservationItemExtension extends js.Object {
  
  /**
    * Confirmation code for this reservation.
    */
  var confirmationCode: js.UndefOr[String] = js.native
  
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Location of the service/event.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.native
  
  /**
    * The number of people.
    */
  var partySize: js.UndefOr[Double] = js.native
  
  /**
    * Time when the service/event is scheduled to occur.
    * Can be a time range, a date, or an exact date time.
    */
  var reservationTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  
  /**
    * Staff facilitators who will be servicing the reservation.
    * Ex. The hairstylist.
    */
  var staffFacilitators: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator]] = js.native
  
  /**
    * Required: Reservation status.
    */
  var status: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionStatus] = js.native
  
  /**
    * Type of reservation.
    * May be unset if none of the type options is applicable.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionType] = js.native
  
  /**
    * Time range that is acceptable to the user.
    */
  var userAcceptableTimeRange: js.UndefOr[GoogleActionsOrdersV3Time] = js.native
  
  /**
    * Required: User visible label/string for the status.
    * Max allowed length is 50 chars.
    */
  var userVisibleStatusLabel: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3VerticalsReservationReservationItemExtension {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsReservationReservationItemExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsReservationReservationItemExtension]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionOps[Self <: GoogleActionsOrdersV3VerticalsReservationReservationItemExtension] (val x: Self) extends AnyVal {
    
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
    def setConfirmationCode(value: String): Self = this.set("confirmationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmationCode: Self = this.set("confirmationCode", js.undefined)
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[_]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setLocation(value: GoogleActionsV2Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPartySize(value: Double): Self = this.set("partySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartySize: Self = this.set("partySize", js.undefined)
    
    @scala.inline
    def setReservationTime(value: GoogleActionsOrdersV3Time): Self = this.set("reservationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationTime: Self = this.set("reservationTime", js.undefined)
    
    @scala.inline
    def setStaffFacilitatorsVarargs(value: GoogleActionsOrdersV3VerticalsReservationStaffFacilitator*): Self = this.set("staffFacilitators", js.Array(value :_*))
    
    @scala.inline
    def setStaffFacilitators(value: js.Array[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator]): Self = this.set("staffFacilitators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaffFacilitators: Self = this.set("staffFacilitators", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserAcceptableTimeRange(value: GoogleActionsOrdersV3Time): Self = this.set("userAcceptableTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAcceptableTimeRange: Self = this.set("userAcceptableTimeRange", js.undefined)
    
    @scala.inline
    def setUserVisibleStatusLabel(value: String): Self = this.set("userVisibleStatusLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleStatusLabel: Self = this.set("userVisibleStatusLabel", js.undefined)
  }
}
