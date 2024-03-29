package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurement3DViewModelMeasurementValue extends StObject {
  
  /**
  		 * State of the measured value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#MeasurementValue)
  		 */
  var state: String
  
  /**
  		 * Textual representation of the measured value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#MeasurementValue)
  		 */
  var text: String
}
object AreaMeasurement3DViewModelMeasurementValue {
  
  inline def apply(state: String, text: String): AreaMeasurement3DViewModelMeasurementValue = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaMeasurement3DViewModelMeasurementValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaMeasurement3DViewModelMeasurementValue] (val x: Self) extends AnyVal {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
