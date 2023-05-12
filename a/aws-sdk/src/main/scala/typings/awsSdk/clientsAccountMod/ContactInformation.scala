package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactInformation extends StObject {
  
  /**
    * The first line of the primary contact address.
    */
  var AddressLine1: AddressLine
  
  /**
    * The second line of the primary contact address, if any.
    */
  var AddressLine2: js.UndefOr[AddressLine] = js.undefined
  
  /**
    * The third line of the primary contact address, if any.
    */
  var AddressLine3: js.UndefOr[AddressLine] = js.undefined
  
  /**
    * The city of the primary contact address.
    */
  var City: typings.awsSdk.clientsAccountMod.City
  
  /**
    * The name of the company associated with the primary contact information, if any.
    */
  var CompanyName: js.UndefOr[typings.awsSdk.clientsAccountMod.CompanyName] = js.undefined
  
  /**
    * The ISO-3166 two-letter country code for the primary contact address.
    */
  var CountryCode: typings.awsSdk.clientsAccountMod.CountryCode
  
  /**
    * The district or county of the primary contact address, if any.
    */
  var DistrictOrCounty: js.UndefOr[typings.awsSdk.clientsAccountMod.DistrictOrCounty] = js.undefined
  
  /**
    * The full name of the primary contact address.
    */
  var FullName: typings.awsSdk.clientsAccountMod.FullName
  
  /**
    * The phone number of the primary contact information. The number will be validated and, in some countries, checked for activation.
    */
  var PhoneNumber: ContactInformationPhoneNumber
  
  /**
    * The postal code of the primary contact address.
    */
  var PostalCode: typings.awsSdk.clientsAccountMod.PostalCode
  
  /**
    * The state or region of the primary contact address. This field is required in selected countries.
    */
  var StateOrRegion: js.UndefOr[typings.awsSdk.clientsAccountMod.StateOrRegion] = js.undefined
  
  /**
    * The URL of the website associated with the primary contact information, if any.
    */
  var WebsiteUrl: js.UndefOr[typings.awsSdk.clientsAccountMod.WebsiteUrl] = js.undefined
}
object ContactInformation {
  
  inline def apply(
    AddressLine1: AddressLine,
    City: City,
    CountryCode: CountryCode,
    FullName: FullName,
    PhoneNumber: ContactInformationPhoneNumber,
    PostalCode: PostalCode
  ): ContactInformation = {
    val __obj = js.Dynamic.literal(AddressLine1 = AddressLine1.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactInformation] (val x: Self) extends AnyVal {
    
    inline def setAddressLine1(value: AddressLine): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2(value: AddressLine): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2Undefined: Self = StObject.set(x, "AddressLine2", js.undefined)
    
    inline def setAddressLine3(value: AddressLine): Self = StObject.set(x, "AddressLine3", value.asInstanceOf[js.Any])
    
    inline def setAddressLine3Undefined: Self = StObject.set(x, "AddressLine3", js.undefined)
    
    inline def setCity(value: City): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCompanyName(value: CompanyName): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setDistrictOrCounty(value: DistrictOrCounty): Self = StObject.set(x, "DistrictOrCounty", value.asInstanceOf[js.Any])
    
    inline def setDistrictOrCountyUndefined: Self = StObject.set(x, "DistrictOrCounty", js.undefined)
    
    inline def setFullName(value: FullName): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: ContactInformationPhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: PostalCode): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setStateOrRegion(value: StateOrRegion): Self = StObject.set(x, "StateOrRegion", value.asInstanceOf[js.Any])
    
    inline def setStateOrRegionUndefined: Self = StObject.set(x, "StateOrRegion", js.undefined)
    
    inline def setWebsiteUrl(value: WebsiteUrl): Self = StObject.set(x, "WebsiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "WebsiteUrl", js.undefined)
  }
}
