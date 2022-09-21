package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.euclidean
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectLineMeasurementAnalysisResult
  extends StObject
     with Object {
  
  /**
    * Measured distance between start and endpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#DirectLineMeasurementAnalysisResult)
    */
  var distance: Length
  
  /**
    * Horizontal distance measured as the euclidean distance between the point with higher elevation and the other point with its elevation changed to match the first point's elevation (moved along surface normal).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#DirectLineMeasurementAnalysisResult)
    */
  var horizontalDistance: Length
  
  /**
    * Specifies whether the `distance` measurement uses euclidean or geodesic units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#DirectLineMeasurementAnalysisResult)
    */
  var mode: euclidean | geodesic
  
  /**
    * Vertical distance measured as the absolute difference of the elevation of the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-DirectLineMeasurementAnalysisView3D.html#DirectLineMeasurementAnalysisResult)
    */
  var verticalDistance: Length
}
object DirectLineMeasurementAnalysisResult {
  
  inline def apply(
    constructor: js.Function,
    distance: Length,
    hasOwnProperty: PropertyKey => Boolean,
    horizontalDistance: Length,
    mode: euclidean | geodesic,
    propertyIsEnumerable: PropertyKey => Boolean,
    verticalDistance: Length
  ): DirectLineMeasurementAnalysisResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), horizontalDistance = horizontalDistance.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), verticalDistance = verticalDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectLineMeasurementAnalysisResult]
  }
  
  extension [Self <: DirectLineMeasurementAnalysisResult](x: Self) {
    
    inline def setDistance(value: Length): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setHorizontalDistance(value: Length): Self = StObject.set(x, "horizontalDistance", value.asInstanceOf[js.Any])
    
    inline def setMode(value: euclidean | geodesic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setVerticalDistance(value: Length): Self = StObject.set(x, "verticalDistance", value.asInstanceOf[js.Any])
  }
}
