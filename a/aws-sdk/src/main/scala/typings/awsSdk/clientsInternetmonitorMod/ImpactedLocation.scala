package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpactedLocation extends StObject {
  
  /**
    * The name of the network at an impacted location.
    */
  var ASName: String
  
  /**
    * The Autonomous System Number (ASN) of the network at an impacted location.
    */
  var ASNumber: Long
  
  /**
    * The cause of the impairment. There are two types of network impairments: Amazon Web Services network issues or internet issues. Internet issues are typically a problem with a network provider, like an internet service provider (ISP).
    */
  var CausedBy: js.UndefOr[NetworkImpairment] = js.undefined
  
  /**
    * The name of the city where the health event is located.
    */
  var City: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the country where the health event is located.
    */
  var Country: String
  
  /**
    * The country code where the health event is located. The ISO 3166-2 codes for the country is provided, when available. 
    */
  var CountryCode: js.UndefOr[String] = js.undefined
  
  /**
    * The calculated health at a specific location.
    */
  var InternetHealth: js.UndefOr[typings.awsSdk.clientsInternetmonitorMod.InternetHealth] = js.undefined
  
  /**
    * The latitude where the health event is located.
    */
  var Latitude: js.UndefOr[Double] = js.undefined
  
  /**
    * The longitude where the health event is located.
    */
  var Longitude: js.UndefOr[Double] = js.undefined
  
  /**
    * The metro area where the health event is located. Metro indicates a metropolitan region in the United States, such as the region around New York City. In non-US countries, this is a second-level subdivision. For example, in the United Kingdom, it could be a county, a London borough, a unitary authority, council area, and so on.
    */
  var Metro: js.UndefOr[String] = js.undefined
  
  /**
    * The service location where the health event is located.
    */
  var ServiceLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the health event at an impacted location.
    */
  var Status: HealthEventStatus
  
  /**
    * The subdivision location where the health event is located. The subdivision usually maps to states in most countries (including the United States). For United Kingdom, it maps to a country (England, Scotland, Wales) or province (Northern Ireland).
    */
  var Subdivision: js.UndefOr[String] = js.undefined
  
  /**
    * The subdivision code where the health event is located. The ISO 3166-2 codes for country subdivisions is provided, when available. 
    */
  var SubdivisionCode: js.UndefOr[String] = js.undefined
}
object ImpactedLocation {
  
  inline def apply(ASName: String, ASNumber: Long, Country: String, Status: HealthEventStatus): ImpactedLocation = {
    val __obj = js.Dynamic.literal(ASName = ASName.asInstanceOf[js.Any], ASNumber = ASNumber.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpactedLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImpactedLocation] (val x: Self) extends AnyVal {
    
    inline def setASName(value: String): Self = StObject.set(x, "ASName", value.asInstanceOf[js.Any])
    
    inline def setASNumber(value: Long): Self = StObject.set(x, "ASNumber", value.asInstanceOf[js.Any])
    
    inline def setCausedBy(value: NetworkImpairment): Self = StObject.set(x, "CausedBy", value.asInstanceOf[js.Any])
    
    inline def setCausedByUndefined: Self = StObject.set(x, "CausedBy", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setInternetHealth(value: InternetHealth): Self = StObject.set(x, "InternetHealth", value.asInstanceOf[js.Any])
    
    inline def setInternetHealthUndefined: Self = StObject.set(x, "InternetHealth", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "Latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "Longitude", js.undefined)
    
    inline def setMetro(value: String): Self = StObject.set(x, "Metro", value.asInstanceOf[js.Any])
    
    inline def setMetroUndefined: Self = StObject.set(x, "Metro", js.undefined)
    
    inline def setServiceLocation(value: String): Self = StObject.set(x, "ServiceLocation", value.asInstanceOf[js.Any])
    
    inline def setServiceLocationUndefined: Self = StObject.set(x, "ServiceLocation", js.undefined)
    
    inline def setStatus(value: HealthEventStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setSubdivision(value: String): Self = StObject.set(x, "Subdivision", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionCode(value: String): Self = StObject.set(x, "SubdivisionCode", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionCodeUndefined: Self = StObject.set(x, "SubdivisionCode", js.undefined)
    
    inline def setSubdivisionUndefined: Self = StObject.set(x, "Subdivision", js.undefined)
  }
}
