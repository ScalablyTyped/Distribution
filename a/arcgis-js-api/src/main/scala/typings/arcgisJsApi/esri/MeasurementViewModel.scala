package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`direct-line`
import typings.arcgisJsApi.arcgisJsApiStrings.area
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.distance
import typings.arcgisJsApi.arcgisJsApiStrings.measured
import typings.arcgisJsApi.arcgisJsApiStrings.measuring
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeasurementViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * Specifies the current measurement tool to display.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeTool)
  		 */
  var activeTool: area | distance | `direct-line` = js.native
  
  /**
  		 * View model of the active measurement widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeViewModel)
  		 */
  var activeViewModel: AreaMeasurement2DViewModel | AreaMeasurement3DViewModel | DirectLineMeasurement3DViewModel | DistanceMeasurement2DViewModel = js.native
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the area values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#areaUnit)
  		 */
  var areaUnit: SystemOrAreaUnit = js.native
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#linearUnit)
  		 */
  var linearUnit: SystemOrLengthUnit = js.native
  
  /**
  		 * The ViewModel's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#state)
  		 */
  val state: disabled | ready | measuring | measured = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
