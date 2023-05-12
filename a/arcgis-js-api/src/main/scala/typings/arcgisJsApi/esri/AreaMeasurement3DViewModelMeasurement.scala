package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.euclidean
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurement3DViewModelMeasurement extends StObject {
  
  /**
    * The area of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var area: AreaMeasurement3DViewModelMeasurementValue
  
  /**
    * Describes the mode in which the measurement was taken.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var mode: euclidean | geodesic
  
  /**
    * The perimeter length of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var perimeterLength: AreaMeasurement3DViewModelMeasurementValue
}
object AreaMeasurement3DViewModelMeasurement {
  
  inline def apply(
    area: AreaMeasurement3DViewModelMeasurementValue,
    mode: euclidean | geodesic,
    perimeterLength: AreaMeasurement3DViewModelMeasurementValue
  ): AreaMeasurement3DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], perimeterLength = perimeterLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaMeasurement3DViewModelMeasurement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaMeasurement3DViewModelMeasurement] (val x: Self) extends AnyVal {
    
    inline def setArea(value: AreaMeasurement3DViewModelMeasurementValue): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setMode(value: euclidean | geodesic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPerimeterLength(value: AreaMeasurement3DViewModelMeasurementValue): Self = StObject.set(x, "perimeterLength", value.asInstanceOf[js.Any])
  }
}
