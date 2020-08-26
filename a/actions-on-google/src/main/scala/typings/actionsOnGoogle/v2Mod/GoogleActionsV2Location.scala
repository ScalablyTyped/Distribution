package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.argumentArgumentMod._Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2Location extends _Argument {
  /**
    * City.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * Geo coordinates.
    * Requires the DEVICE_PRECISE_LOCATION permission.
    */
  var coordinates: js.UndefOr[GoogleTypeLatLng] = js.native
  /**
    * Display address, e.g., \"1600 Amphitheatre Pkwy, Mountain View, CA 94043\".
    * Requires the DEVICE_PRECISE_LOCATION permission.
    */
  var formattedAddress: js.UndefOr[String] = js.native
  /**
    * Name of the place.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notes about the location.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Phone number of the location, e.g. contact number of business location or
    * phone number for delivery location.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * place_id is used with Places API to fetch details of a place.
    * See https://developers.google.com/places/web-service/place-id
    */
  var placeId: js.UndefOr[String] = js.native
  /**
    * Postal address.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var postalAddress: js.UndefOr[GoogleTypePostalAddress] = js.native
  /**
    * Zip code.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var zipCode: js.UndefOr[String] = js.native
}

object GoogleActionsV2Location {
  @scala.inline
  def apply(): GoogleActionsV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Location]
  }
  @scala.inline
  implicit class GoogleActionsV2LocationOps[Self <: GoogleActionsV2Location] (val x: Self) extends AnyVal {
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCoordinates(value: GoogleTypeLatLng): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    @scala.inline
    def setFormattedAddress(value: String): Self = this.set("formattedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedAddress: Self = this.set("formattedAddress", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceId: Self = this.set("placeId", js.undefined)
    @scala.inline
    def setPostalAddress(value: GoogleTypePostalAddress): Self = this.set("postalAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalAddress: Self = this.set("postalAddress", js.undefined)
    @scala.inline
    def setZipCode(value: String): Self = this.set("zipCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipCode: Self = this.set("zipCode", js.undefined)
  }
  
}

