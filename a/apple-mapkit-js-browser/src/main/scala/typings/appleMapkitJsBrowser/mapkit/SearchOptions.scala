package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options you can provide when performing a search.
  */
trait SearchOptions extends StObject {
  
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: Coordinate
  
  /**
    * A Boolean value that indicates whether the search results should include addresses.
    */
  var includeAddresses: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether the search results should include points of interest.
    */
  var includePointsOfInterest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: String
  
  /**
    * A filter used to include or exclude point of interest categories in search results.
    */
  var pointOfInterestFilter: js.UndefOr[PointOfInterestFilter] = js.undefined
  
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: CoordinateRegion
}
object SearchOptions {
  
  inline def apply(coordinate: Coordinate, language: String, region: CoordinateRegion): SearchOptions = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  
  extension [Self <: SearchOptions](x: Self) {
    
    inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setIncludeAddresses(value: Boolean): Self = StObject.set(x, "includeAddresses", value.asInstanceOf[js.Any])
    
    inline def setIncludeAddressesUndefined: Self = StObject.set(x, "includeAddresses", js.undefined)
    
    inline def setIncludePointsOfInterest(value: Boolean): Self = StObject.set(x, "includePointsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setIncludePointsOfInterestUndefined: Self = StObject.set(x, "includePointsOfInterest", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setPointOfInterestFilter(value: PointOfInterestFilter): Self = StObject.set(x, "pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    inline def setPointOfInterestFilterUndefined: Self = StObject.set(x, "pointOfInterestFilter", js.undefined)
    
    inline def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
