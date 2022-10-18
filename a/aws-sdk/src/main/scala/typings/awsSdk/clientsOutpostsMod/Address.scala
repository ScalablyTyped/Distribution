package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * The first line of the address.
    */
  var AddressLine1: typings.awsSdk.clientsOutpostsMod.AddressLine1
  
  /**
    * The second line of the address.
    */
  var AddressLine2: js.UndefOr[typings.awsSdk.clientsOutpostsMod.AddressLine2] = js.undefined
  
  /**
    * The third line of the address.
    */
  var AddressLine3: js.UndefOr[typings.awsSdk.clientsOutpostsMod.AddressLine3] = js.undefined
  
  /**
    * The city for the address.
    */
  var City: typings.awsSdk.clientsOutpostsMod.City
  
  /**
    * The name of the contact.
    */
  var ContactName: js.UndefOr[typings.awsSdk.clientsOutpostsMod.ContactName] = js.undefined
  
  /**
    * The phone number of the contact.
    */
  var ContactPhoneNumber: js.UndefOr[typings.awsSdk.clientsOutpostsMod.ContactPhoneNumber] = js.undefined
  
  /**
    * The ISO-3166 two-letter country code for the address.
    */
  var CountryCode: typings.awsSdk.clientsOutpostsMod.CountryCode
  
  /**
    * The district or county for the address.
    */
  var DistrictOrCounty: js.UndefOr[typings.awsSdk.clientsOutpostsMod.DistrictOrCounty] = js.undefined
  
  /**
    * The municipality for the address.
    */
  var Municipality: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Municipality] = js.undefined
  
  /**
    * The postal code for the address.
    */
  var PostalCode: typings.awsSdk.clientsOutpostsMod.PostalCode
  
  /**
    * The state for the address.
    */
  var StateOrRegion: typings.awsSdk.clientsOutpostsMod.StateOrRegion
}
object Address {
  
  inline def apply(
    AddressLine1: AddressLine1,
    City: City,
    CountryCode: CountryCode,
    PostalCode: PostalCode,
    StateOrRegion: StateOrRegion
  ): Address = {
    val __obj = js.Dynamic.literal(AddressLine1 = AddressLine1.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], StateOrRegion = StateOrRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddressLine1(value: AddressLine1): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2(value: AddressLine2): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2Undefined: Self = StObject.set(x, "AddressLine2", js.undefined)
    
    inline def setAddressLine3(value: AddressLine3): Self = StObject.set(x, "AddressLine3", value.asInstanceOf[js.Any])
    
    inline def setAddressLine3Undefined: Self = StObject.set(x, "AddressLine3", js.undefined)
    
    inline def setCity(value: City): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setContactName(value: ContactName): Self = StObject.set(x, "ContactName", value.asInstanceOf[js.Any])
    
    inline def setContactNameUndefined: Self = StObject.set(x, "ContactName", js.undefined)
    
    inline def setContactPhoneNumber(value: ContactPhoneNumber): Self = StObject.set(x, "ContactPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setContactPhoneNumberUndefined: Self = StObject.set(x, "ContactPhoneNumber", js.undefined)
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setDistrictOrCounty(value: DistrictOrCounty): Self = StObject.set(x, "DistrictOrCounty", value.asInstanceOf[js.Any])
    
    inline def setDistrictOrCountyUndefined: Self = StObject.set(x, "DistrictOrCounty", js.undefined)
    
    inline def setMunicipality(value: Municipality): Self = StObject.set(x, "Municipality", value.asInstanceOf[js.Any])
    
    inline def setMunicipalityUndefined: Self = StObject.set(x, "Municipality", js.undefined)
    
    inline def setPostalCode(value: PostalCode): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setStateOrRegion(value: StateOrRegion): Self = StObject.set(x, "StateOrRegion", value.asInstanceOf[js.Any])
  }
}
