package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceMeasurement2DViewModelMeasurement extends StObject {
  
  /**
    * Measurement line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  var geometry: Any
  
  /**
    * Line length (m).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#measurement)
    */
  var length: Double
}
object DistanceMeasurement2DViewModelMeasurement {
  
  inline def apply(geometry: Any, length: Double): DistanceMeasurement2DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMeasurement2DViewModelMeasurement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceMeasurement2DViewModelMeasurement] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: Any): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
