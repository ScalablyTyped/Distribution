package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that you may provide when creating a search object.
  */
trait SearchConstructorOptions extends StObject {
  
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  
  /**
    * A Boolean value that indicates whether to limit the search results to the
    * user's current location, as determined by the web browser.
    */
  var getsUserLocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether the search results should include addresses.
    */
  var includeAddresses: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether the search results should include points of interest.
    */
  var includePointsOfInterest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether the search autocomplete results should include queries.
    */
  var includeQueries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * A string that constrains search results to within the provided countries.
    */
  var limitToCountries: js.UndefOr[String] = js.undefined
  
  /**
    * A filter used to include or exclude point of interest categories.
    */
  var pointOfInterestFilter: js.UndefOr[PointOfInterestFilter] = js.undefined
  
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: js.UndefOr[CoordinateRegion] = js.undefined
}
object SearchConstructorOptions {
  
  inline def apply(): SearchConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchConstructorOptions]
  }
  
  extension [Self <: SearchConstructorOptions](x: Self) {
    
    inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setGetsUserLocation(value: Boolean): Self = StObject.set(x, "getsUserLocation", value.asInstanceOf[js.Any])
    
    inline def setGetsUserLocationUndefined: Self = StObject.set(x, "getsUserLocation", js.undefined)
    
    inline def setIncludeAddresses(value: Boolean): Self = StObject.set(x, "includeAddresses", value.asInstanceOf[js.Any])
    
    inline def setIncludeAddressesUndefined: Self = StObject.set(x, "includeAddresses", js.undefined)
    
    inline def setIncludePointsOfInterest(value: Boolean): Self = StObject.set(x, "includePointsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setIncludePointsOfInterestUndefined: Self = StObject.set(x, "includePointsOfInterest", js.undefined)
    
    inline def setIncludeQueries(value: Boolean): Self = StObject.set(x, "includeQueries", value.asInstanceOf[js.Any])
    
    inline def setIncludeQueriesUndefined: Self = StObject.set(x, "includeQueries", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLimitToCountries(value: String): Self = StObject.set(x, "limitToCountries", value.asInstanceOf[js.Any])
    
    inline def setLimitToCountriesUndefined: Self = StObject.set(x, "limitToCountries", js.undefined)
    
    inline def setPointOfInterestFilter(value: PointOfInterestFilter): Self = StObject.set(x, "pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    inline def setPointOfInterestFilterUndefined: Self = StObject.set(x, "pointOfInterestFilter", js.undefined)
    
    inline def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
