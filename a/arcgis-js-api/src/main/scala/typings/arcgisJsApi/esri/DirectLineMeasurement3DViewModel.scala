package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.measured
import typings.arcgisJsApi.arcgisJsApiStrings.measuring
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectLineMeasurement3DViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * The direct line measurement analysis object being created or modified by the view model.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#analysis)
  		 */
  val analysis: DirectLineMeasurementAnalysis = js.native
  
  /**
  		 * Clears the current measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#clear)
  		 */
  def clear(): scala.Unit = js.native
  
  /**
  		 * The current measurement calculated between the two points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#measurement)
  		 */
  val measurement: DirectLineMeasurement3DViewModelMeasurement = js.native
  
  /**
  		 * Starts a new measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#start)
  		 */
  def start(): scala.Unit = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#state)
  		 */
  val state: disabled | ready | measuring | measured = js.native
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#unit)
  		 */
  var unit: SystemOrLengthUnit = js.native
  
  /**
  		 * List of unit systems (imperial, metric) and specific units for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#unitOptions)
  		 */
  var unitOptions: js.Array[SystemOrLengthUnit] = js.native
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D-DirectLineMeasurement3DViewModel.html#view)
  		 */
  var view: SceneView = js.native
}
