package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distServiceActionssdkConversationArgumentArgumentMod._Argument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2Location
  extends StObject
     with _Argument {
  
  /**
    * City.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * Geo coordinates.
    * Requires the DEVICE_PRECISE_LOCATION permission.
    */
  var coordinates: js.UndefOr[GoogleTypeLatLng] = js.undefined
  
  /**
    * Display address, e.g., \"1600 Amphitheatre Pkwy, Mountain View, CA 94043\".
    * Requires the DEVICE_PRECISE_LOCATION permission.
    */
  var formattedAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the place.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Notes about the location.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * Phone number of the location, e.g. contact number of business location or
    * phone number for delivery location.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * place_id is used with Places API to fetch details of a place.
    * See https://developers.google.com/places/web-service/place-id
    */
  var placeId: js.UndefOr[String] = js.undefined
  
  /**
    * Postal address.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var postalAddress: js.UndefOr[GoogleTypePostalAddress] = js.undefined
  
  /**
    * Zip code.
    * Requires the DEVICE_PRECISE_LOCATION or
    * DEVICE_COARSE_LOCATION permission.
    */
  var zipCode: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2Location {
  
  inline def apply(): GoogleActionsV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2Location] (val x: Self) extends AnyVal {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCoordinates(value: GoogleTypeLatLng): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
    
    inline def setFormattedAddressUndefined: Self = StObject.set(x, "formattedAddress", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setPostalAddress(value: GoogleTypePostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    inline def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
    
    inline def setZipCode(value: String): Self = StObject.set(x, "zipCode", value.asInstanceOf[js.Any])
    
    inline def setZipCodeUndefined: Self = StObject.set(x, "zipCode", js.undefined)
  }
}
