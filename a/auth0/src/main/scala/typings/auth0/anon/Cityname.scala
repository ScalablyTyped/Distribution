package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cityname extends StObject {
  
  /** Full city name in English. */
  var city_name: js.UndefOr[String] = js.undefined
  
  /** Continent the country is located within. Can be AF (Africa), AN (Antarctica), AS (Asia), EU (Europe), NA (North America), OC (Oceania) or SA (South America). */
  var continent_code: js.UndefOr[String] = js.undefined
  
  /** Two-letter Alpha-2 ISO 3166-1 country code. */
  var country_code: js.UndefOr[String] = js.undefined
  
  /** Three-letter Alpha-3 ISO 3166-1 country code. */
  var country_code3: js.UndefOr[String] = js.undefined
  
  /** Full country name in English. */
  var country_name: js.UndefOr[String] = js.undefined
  
  /** Global latitude (horizontal) position. */
  var latitude: js.UndefOr[String] = js.undefined
  
  /** Global longitude (vertical) position. */
  var longitude: js.UndefOr[String] = js.undefined
  
  /** Time zone name as found in the IANA tz database. https?://www.iana.org/time-zones */
  var time_zone: js.UndefOr[String] = js.undefined
}
object Cityname {
  
  inline def apply(): Cityname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cityname]
  }
  
  extension [Self <: Cityname](x: Self) {
    
    inline def setCity_name(value: String): Self = StObject.set(x, "city_name", value.asInstanceOf[js.Any])
    
    inline def setCity_nameUndefined: Self = StObject.set(x, "city_name", js.undefined)
    
    inline def setContinent_code(value: String): Self = StObject.set(x, "continent_code", value.asInstanceOf[js.Any])
    
    inline def setContinent_codeUndefined: Self = StObject.set(x, "continent_code", js.undefined)
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setCountry_code3(value: String): Self = StObject.set(x, "country_code3", value.asInstanceOf[js.Any])
    
    inline def setCountry_code3Undefined: Self = StObject.set(x, "country_code3", js.undefined)
    
    inline def setCountry_codeUndefined: Self = StObject.set(x, "country_code", js.undefined)
    
    inline def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
    
    inline def setCountry_nameUndefined: Self = StObject.set(x, "country_name", js.undefined)
    
    inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
