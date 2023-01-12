package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.euclidean
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurementAnalysisResult extends StObject {
  
  /**
    * Measured area quantity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#AreaMeasurementAnalysisResult)
    */
  var area: Area
  
  /**
    * Describes the mode in which the measurement was taken.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#AreaMeasurementAnalysisResult)
    */
  var mode: euclidean | geodesic
  
  /**
    * Measured circumference of the measured area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#AreaMeasurementAnalysisResult)
    */
  var pathLength: Length
}
object AreaMeasurementAnalysisResult {
  
  inline def apply(area: Area, mode: euclidean | geodesic, pathLength: Length): AreaMeasurementAnalysisResult = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaMeasurementAnalysisResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaMeasurementAnalysisResult] (val x: Self) extends AnyVal {
    
    inline def setArea(value: Area): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setMode(value: euclidean | geodesic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPathLength(value: Length): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
  }
}
