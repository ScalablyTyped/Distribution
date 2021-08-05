package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that you may provide when creating a search object.
  */
trait PointsOfInterestSearchOptions extends StObject {
  
  /**
    * The center point of the request represented as latitude and longitude.
    */
  var center: js.UndefOr[Coordinate] = js.undefined
  
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * A filter used to include or exclude point of interest categories.
    */
  var pointOfInterestFilter: js.UndefOr[PointOfInterestFilter] = js.undefined
  
  /**
    * The distance provided in meters, or the longest distance derived from the center point to the region’s bounding box.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * The region that bounds the area in which to fetch points of interest.
    */
  var region: js.UndefOr[CoordinateRegion] = js.undefined
}
object PointsOfInterestSearchOptions {
  
  inline def apply(): PointsOfInterestSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointsOfInterestSearchOptions]
  }
  
  extension [Self <: PointsOfInterestSearchOptions](x: Self) {
    
    inline def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPointOfInterestFilter(value: PointOfInterestFilter): Self = StObject.set(x, "pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    inline def setPointOfInterestFilterUndefined: Self = StObject.set(x, "pointOfInterestFilter", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRegion(value: CoordinateRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
