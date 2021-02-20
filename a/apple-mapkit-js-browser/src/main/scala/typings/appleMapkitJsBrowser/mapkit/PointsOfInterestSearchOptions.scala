package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that you may provide when creating a search object.
  */
@js.native
trait PointsOfInterestSearchOptions extends StObject {
  
  /**
    * The center point of the request represented as latitude and longitude.
    */
  var center: js.UndefOr[Coordinate] = js.native
  
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * A filter used to include or exclude point of interest categories.
    */
  var pointOfInterestFilter: js.UndefOr[PointOfInterestFilter] = js.native
  
  /**
    * The distance provided in meters, or the longest distance derived from the center point to the region’s bounding box.
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * The region that bounds the area in which to fetch points of interest.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
}
object PointsOfInterestSearchOptions {
  
  @scala.inline
  def apply(): PointsOfInterestSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointsOfInterestSearchOptions]
  }
  
  @scala.inline
  implicit class PointsOfInterestSearchOptionsMutableBuilder[Self <: PointsOfInterestSearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setPointOfInterestFilter(value: PointOfInterestFilter): Self = StObject.set(x, "pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointOfInterestFilterUndefined: Self = StObject.set(x, "pointOfInterestFilter", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
