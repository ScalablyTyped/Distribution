package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteIpDetails extends StObject {
  
  /**
    * The city information of the remote IP address.
    */
  var City: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.City] = js.undefined
  
  /**
    * The country code of the remote IP address.
    */
  var Country: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Country] = js.undefined
  
  /**
    * The location information of the remote IP address.
    */
  var GeoLocation: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.GeoLocation] = js.undefined
  
  /**
    * The IPv4 remote address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.undefined
  
  /**
    * The ISP organization information of the remote IP address.
    */
  var Organization: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Organization] = js.undefined
}
object RemoteIpDetails {
  
  inline def apply(): RemoteIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteIpDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteIpDetails] (val x: Self) extends AnyVal {
    
    inline def setCity(value: City): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: Country): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setGeoLocation(value: GeoLocation): Self = StObject.set(x, "GeoLocation", value.asInstanceOf[js.Any])
    
    inline def setGeoLocationUndefined: Self = StObject.set(x, "GeoLocation", js.undefined)
    
    inline def setIpAddressV4(value: String): Self = StObject.set(x, "IpAddressV4", value.asInstanceOf[js.Any])
    
    inline def setIpAddressV4Undefined: Self = StObject.set(x, "IpAddressV4", js.undefined)
    
    inline def setOrganization(value: Organization): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "Organization", js.undefined)
  }
}
