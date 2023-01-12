package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectLineMeasurement3DViewModelMeasurementValue extends StObject {
  
  /**
    * State of the measured value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#MeasurementValue)
    */
  var state: String
  
  /**
    * Textual representation of the measured value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#MeasurementValue)
    */
  var text: String
}
object DirectLineMeasurement3DViewModelMeasurementValue {
  
  inline def apply(state: String, text: String): DirectLineMeasurement3DViewModelMeasurementValue = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectLineMeasurement3DViewModelMeasurementValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectLineMeasurement3DViewModelMeasurementValue] (val x: Self) extends AnyVal {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
