package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionRemoteIpDetails extends StObject {
  
  /**
    * The city where the remote IP address is located.
    */
  var City: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.City] = js.undefined
  
  /**
    * The country where the remote IP address is located.
    */
  var Country: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Country] = js.undefined
  
  /**
    * The coordinates of the location of the remote IP address.
    */
  var GeoLocation: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.GeoLocation] = js.undefined
  
  /**
    * The IP address.
    */
  var IpAddressV4: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The internet service provider (ISP) organization associated with the remote IP address.
    */
  var Organization: js.UndefOr[IpOrganizationDetails] = js.undefined
}
object ActionRemoteIpDetails {
  
  inline def apply(): ActionRemoteIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionRemoteIpDetails]
  }
  
  extension [Self <: ActionRemoteIpDetails](x: Self) {
    
    inline def setCity(value: City): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: Country): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setGeoLocation(value: GeoLocation): Self = StObject.set(x, "GeoLocation", value.asInstanceOf[js.Any])
    
    inline def setGeoLocationUndefined: Self = StObject.set(x, "GeoLocation", js.undefined)
    
    inline def setIpAddressV4(value: NonEmptyString): Self = StObject.set(x, "IpAddressV4", value.asInstanceOf[js.Any])
    
    inline def setIpAddressV4Undefined: Self = StObject.set(x, "IpAddressV4", js.undefined)
    
    inline def setOrganization(value: IpOrganizationDetails): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "Organization", js.undefined)
  }
}
