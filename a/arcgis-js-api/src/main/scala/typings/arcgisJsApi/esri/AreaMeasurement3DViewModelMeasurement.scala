package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.euclidean
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurement3DViewModelMeasurement
  extends StObject
     with Object {
  
  /**
    * The area of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var area: MeasurementValue
  
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
  var perimeterLength: MeasurementValue
}
object AreaMeasurement3DViewModelMeasurement {
  
  inline def apply(
    area: MeasurementValue,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: euclidean | geodesic,
    perimeterLength: MeasurementValue,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurement3DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], perimeterLength = perimeterLength.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AreaMeasurement3DViewModelMeasurement]
  }
  
  extension [Self <: AreaMeasurement3DViewModelMeasurement](x: Self) {
    
    inline def setArea(value: MeasurementValue): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setMode(value: euclidean | geodesic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPerimeterLength(value: MeasurementValue): Self = StObject.set(x, "perimeterLength", value.asInstanceOf[js.Any])
  }
}
