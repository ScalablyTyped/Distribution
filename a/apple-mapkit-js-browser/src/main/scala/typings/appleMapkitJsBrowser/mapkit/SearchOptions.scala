package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options you can provide when performing a search.
  */
@js.native
trait SearchOptions extends js.Object {
  
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
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoordinate(value: Coordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAddresses(value: Boolean): Self = this.set("includeAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAddresses: Self = this.set("includeAddresses", js.undefined)
    
    @scala.inline
    def setIncludePointsOfInterest(value: Boolean): Self = this.set("includePointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePointsOfInterest: Self = this.set("includePointsOfInterest", js.undefined)
    
    @scala.inline
    def setPointOfInterestFilter(value: PointOfInterestFilter): Self = this.set("pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointOfInterestFilter: Self = this.set("pointOfInterestFilter", js.undefined)
  }
}
