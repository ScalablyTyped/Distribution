package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options you can provide when performing a search.
  */
@js.native
trait SearchOptions extends StObject {
  
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: Coordinate = js.native
  
  /**
    * A Boolean value that indicates whether the search results should include addresses.
    */
  var includeAddresses: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that indicates whether the search results should include points of interest.
    */
  var includePointsOfInterest: js.UndefOr[Boolean] = js.native
  
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: String = js.native
  
  /**
    * A filter used to include or exclude point of interest categories in search results.
    */
  var pointOfInterestFilter: js.UndefOr[PointOfInterestFilter] = js.native
  
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: CoordinateRegion = js.native
}
object SearchOptions {
  
  @scala.inline
  def apply(coordinate: Coordinate, language: String, region: CoordinateRegion): SearchOptions = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAddresses(value: Boolean): Self = StObject.set(x, "includeAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAddressesUndefined: Self = StObject.set(x, "includeAddresses", js.undefined)
    
    @scala.inline
    def setIncludePointsOfInterest(value: Boolean): Self = StObject.set(x, "includePointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePointsOfInterestUndefined: Self = StObject.set(x, "includePointsOfInterest", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointOfInterestFilter(value: PointOfInterestFilter): Self = StObject.set(x, "pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointOfInterestFilterUndefined: Self = StObject.set(x, "pointOfInterestFilter", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
