package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeoLocationRequest extends StObject {
  
  /**
    * For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route 53 supports the following continent codes:    AF: Africa    AN: Antarctica    AS: Asia    EU: Europe    OC: Oceania    NA: North America    SA: South America  
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
  
  /**
    * Amazon Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
  
  /**
    * The code for the subdivision, such as a particular state within the United States. For a list of US state abbreviations, see Appendix B: Two–Letter State and Possession Abbreviations on the United States Postal Service website. For a list of all supported subdivision codes, use the ListGeoLocations API.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
}
object GetGeoLocationRequest {
  
  inline def apply(): GetGeoLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGeoLocationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGeoLocationRequest] (val x: Self) extends AnyVal {
    
    inline def setContinentCode(value: GeoLocationContinentCode): Self = StObject.set(x, "ContinentCode", value.asInstanceOf[js.Any])
    
    inline def setContinentCodeUndefined: Self = StObject.set(x, "ContinentCode", js.undefined)
    
    inline def setCountryCode(value: GeoLocationCountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setSubdivisionCode(value: GeoLocationSubdivisionCode): Self = StObject.set(x, "SubdivisionCode", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionCodeUndefined: Self = StObject.set(x, "SubdivisionCode", js.undefined)
  }
}
