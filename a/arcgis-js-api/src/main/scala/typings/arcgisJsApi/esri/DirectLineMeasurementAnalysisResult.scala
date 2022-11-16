package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.euclidean
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectLineMeasurementAnalysisResult extends StObject {
  
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
  
  inline def apply(distance: Length, horizontalDistance: Length, mode: euclidean | geodesic, verticalDistance: Length): DirectLineMeasurementAnalysisResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], horizontalDistance = horizontalDistance.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], verticalDistance = verticalDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectLineMeasurementAnalysisResult]
  }
  
  extension [Self <: DirectLineMeasurementAnalysisResult](x: Self) {
    
    inline def setDistance(value: Length): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setHorizontalDistance(value: Length): Self = StObject.set(x, "horizontalDistance", value.asInstanceOf[js.Any])
    
    inline def setMode(value: euclidean | geodesic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setVerticalDistance(value: Length): Self = StObject.set(x, "verticalDistance", value.asInstanceOf[js.Any])
  }
}
