package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that constrain geocoder lookup results to a specific area or set a
  * language for results.
  */
trait GeocoderLookupOptions extends StObject {
  
  /**
    * Coordinates used to constrain the lookup results.
    */
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  
  /**
    * The language in which to display the lookup results.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * A list of countries in which to constrain the lookup results.
    */
  var limitToCountries: js.UndefOr[String] = js.undefined
  
  /**
    * A region in which to constrain lookup results.
    */
  var region: js.UndefOr[CoordinateRegion] = js.undefined
}
object GeocoderLookupOptions {
  
  inline def apply(): GeocoderLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderLookupOptions]
  }
  
  extension [Self <: GeocoderLookupOptions](x: Self) {
    
    inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLimitToCountries(value: String): Self = StObject.set(x, "limitToCountries", value.asInstanceOf[js.Any])
    
    inline def setLimitToCountriesUndefined: Self = StObject.set(x, "limitToCountries", js.undefined)
    
    inline def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
