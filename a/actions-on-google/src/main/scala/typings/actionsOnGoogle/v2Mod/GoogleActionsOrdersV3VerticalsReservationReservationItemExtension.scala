package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsReservationReservationItemExtension extends StObject {
  
  /**
    * Confirmation code for this reservation.
    */
  var confirmationCode: js.UndefOr[String] = js.undefined
  
  /**
    * Any extra fields exchanged between merchant and google.
    */
  var `extension`: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
  
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
  def apply(): GoogleActionsOrdersV3VerticalsReservationReservationItemExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsReservationReservationItemExtension]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsReservationReservationItemExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmationCode(value: String): Self = StObject.set(x, "confirmationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationCodeUndefined: Self = StObject.set(x, "confirmationCode", js.undefined)
    
    @scala.inline
    def setExtension(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setLocation(value: GoogleActionsV2Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPartySize(value: Double): Self = StObject.set(x, "partySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartySizeUndefined: Self = StObject.set(x, "partySize", js.undefined)
    
    @scala.inline
    def setReservationTime(value: GoogleActionsOrdersV3Time): Self = StObject.set(x, "reservationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationTimeUndefined: Self = StObject.set(x, "reservationTime", js.undefined)
    
    @scala.inline
    def setStaffFacilitators(value: js.Array[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator]): Self = StObject.set(x, "staffFacilitators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaffFacilitatorsUndefined: Self = StObject.set(x, "staffFacilitators", js.undefined)
    
    @scala.inline
    def setStaffFacilitatorsVarargs(value: GoogleActionsOrdersV3VerticalsReservationStaffFacilitator*): Self = StObject.set(x, "staffFacilitators", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtensionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserAcceptableTimeRange(value: GoogleActionsOrdersV3Time): Self = StObject.set(x, "userAcceptableTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAcceptableTimeRangeUndefined: Self = StObject.set(x, "userAcceptableTimeRange", js.undefined)
    
    @scala.inline
    def setUserVisibleStatusLabel(value: String): Self = StObject.set(x, "userVisibleStatusLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVisibleStatusLabelUndefined: Self = StObject.set(x, "userVisibleStatusLabel", js.undefined)
  }
}
