package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.measured
import typings.arcgisJsApi.arcgisJsApiStrings.measuring
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurement2DViewModel extends StObject {
  
  /**
  		 * Clears the current measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clear)
  		 */
  def clear(): scala.Unit
  
  /**
  		 * When the coordinate system is projected (other than web mercator) then perimeters less than this threshold will be computed planimetrically.
  		 *
  		 * @default 100000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#geodesicDistanceThreshold)
  		 */
  var geodesicDistanceThreshold: Double
  
  /**
  		 * The area and perimeter of the measurement polygon in square meters and meters respectively.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
  		 */
  val measurement: AreaMeasurement2DViewModelMeasurement
  
  /**
  		 * This property returns the locale specific representation of the area and perimeter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
  		 */
  val measurementLabel: AreaMeasurement2DViewModelMeasurementLabel
  
  /**
  		 * Starts a new measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#start)
  		 */
  def start(): scala.Unit
  
  /**
  		 * The ViewModel's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#state)
  		 */
  val state: disabled | ready | measuring | measured
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the area values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unit)
  		 */
  var unit: SystemOrAreaUnit
  
  /**
  		 * List of available units and unit systems (imperial, metric) for displaying the area values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unitOptions)
  		 */
  var unitOptions: js.Array[SystemOrAreaUnit]
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#view)
  		 */
  var view: MapView
}
object AreaMeasurement2DViewModel {
  
  inline def apply(
    clear: () => scala.Unit,
    geodesicDistanceThreshold: Double,
    measurement: AreaMeasurement2DViewModelMeasurement,
    measurementLabel: AreaMeasurement2DViewModelMeasurementLabel,
    start: () => scala.Unit,
    state: disabled | ready | measuring | measured,
    unit: SystemOrAreaUnit,
    unitOptions: js.Array[SystemOrAreaUnit],
    view: MapView
  ): AreaMeasurement2DViewModel = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), geodesicDistanceThreshold = geodesicDistanceThreshold.asInstanceOf[js.Any], measurement = measurement.asInstanceOf[js.Any], measurementLabel = measurementLabel.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), state = state.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitOptions = unitOptions.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaMeasurement2DViewModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaMeasurement2DViewModel] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => scala.Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGeodesicDistanceThreshold(value: Double): Self = StObject.set(x, "geodesicDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setMeasurement(value: AreaMeasurement2DViewModelMeasurement): Self = StObject.set(x, "measurement", value.asInstanceOf[js.Any])
    
    inline def setMeasurementLabel(value: AreaMeasurement2DViewModelMeasurementLabel): Self = StObject.set(x, "measurementLabel", value.asInstanceOf[js.Any])
    
    inline def setStart(value: () => scala.Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setState(value: disabled | ready | measuring | measured): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: SystemOrAreaUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitOptions(value: js.Array[SystemOrAreaUnit]): Self = StObject.set(x, "unitOptions", value.asInstanceOf[js.Any])
    
    inline def setUnitOptionsVarargs(value: SystemOrAreaUnit*): Self = StObject.set(x, "unitOptions", js.Array(value*))
    
    inline def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
