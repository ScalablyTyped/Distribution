package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoLocationDetails extends StObject {
  
  /**
    * The two-letter code for the continent.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
  
  /**
    * The full name of the continent.
    */
  var ContinentName: js.UndefOr[GeoLocationContinentName] = js.undefined
  
  /**
    * The two-letter code for the country.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
  
  /**
    * The name of the country.
    */
  var CountryName: js.UndefOr[GeoLocationCountryName] = js.undefined
  
  /**
    * The code for the subdivision, such as a particular state within the United States. For a list of US state abbreviations, see Appendix B: Two–Letter State and Possession Abbreviations on the United States Postal Service website. For a list of all supported subdivision codes, use the ListGeoLocations API.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
  
  /**
    * The full name of the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.undefined
}
object GeoLocationDetails {
  
  inline def apply(): GeoLocationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationDetails]
  }
  
  extension [Self <: GeoLocationDetails](x: Self) {
    
    inline def setContinentCode(value: GeoLocationContinentCode): Self = StObject.set(x, "ContinentCode", value.asInstanceOf[js.Any])
    
    inline def setContinentCodeUndefined: Self = StObject.set(x, "ContinentCode", js.undefined)
    
    inline def setContinentName(value: GeoLocationContinentName): Self = StObject.set(x, "ContinentName", value.asInstanceOf[js.Any])
    
    inline def setContinentNameUndefined: Self = StObject.set(x, "ContinentName", js.undefined)
    
    inline def setCountryCode(value: GeoLocationCountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setCountryName(value: GeoLocationCountryName): Self = StObject.set(x, "CountryName", value.asInstanceOf[js.Any])
    
    inline def setCountryNameUndefined: Self = StObject.set(x, "CountryName", js.undefined)
    
    inline def setSubdivisionCode(value: GeoLocationSubdivisionCode): Self = StObject.set(x, "SubdivisionCode", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionCodeUndefined: Self = StObject.set(x, "SubdivisionCode", js.undefined)
    
    inline def setSubdivisionName(value: GeoLocationSubdivisionName): Self = StObject.set(x, "SubdivisionName", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionNameUndefined: Self = StObject.set(x, "SubdivisionName", js.undefined)
  }
}
