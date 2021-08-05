package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.euclidean
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectLineMeasurement3DViewModelMeasurement
  extends StObject
     with Object {
  
  /**
    * The direct distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var directDistance: DirectLineMeasurement3DViewModelMeasurementValue
  
  /**
    * The horizontal distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var horizontalDistance: DirectLineMeasurement3DViewModelMeasurementValue
  
  /**
    * Describes the mode in which the measurement was taken.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var measurementMode: euclidean | geodesic
  
  /**
    * The vertical distance between the two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
    */
  var verticalDistance: DirectLineMeasurement3DViewModelMeasurementValue
}
object DirectLineMeasurement3DViewModelMeasurement {
  
  inline def apply(
    constructor: js.Function,
    directDistance: DirectLineMeasurement3DViewModelMeasurementValue,
    hasOwnProperty: PropertyKey => Boolean,
    horizontalDistance: DirectLineMeasurement3DViewModelMeasurementValue,
    measurementMode: euclidean | geodesic,
    propertyIsEnumerable: PropertyKey => Boolean,
    verticalDistance: DirectLineMeasurement3DViewModelMeasurementValue
  ): DirectLineMeasurement3DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], directDistance = directDistance.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), horizontalDistance = horizontalDistance.asInstanceOf[js.Any], measurementMode = measurementMode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), verticalDistance = verticalDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelMeasurement]
  }
  
  extension [Self <: DirectLineMeasurement3DViewModelMeasurement](x: Self) {
    
    inline def setDirectDistance(value: DirectLineMeasurement3DViewModelMeasurementValue): Self = StObject.set(x, "directDistance", value.asInstanceOf[js.Any])
    
    inline def setHorizontalDistance(value: DirectLineMeasurement3DViewModelMeasurementValue): Self = StObject.set(x, "horizontalDistance", value.asInstanceOf[js.Any])
    
    inline def setMeasurementMode(value: euclidean | geodesic): Self = StObject.set(x, "measurementMode", value.asInstanceOf[js.Any])
    
    inline def setVerticalDistance(value: DirectLineMeasurement3DViewModelMeasurementValue): Self = StObject.set(x, "verticalDistance", value.asInstanceOf[js.Any])
  }
}
