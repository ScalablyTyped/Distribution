package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectLineMeasurement3D
  extends StObject
     with Widget_ {
  
  /**
  		 * The direct line measurement analysis object being created or modified by the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#analysis)
  		 */
  val analysis: DirectLineMeasurementAnalysis = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/DirectLineMeasurement3D#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unit)
  		 */
  var unit: SystemOrLengthUnit = js.native
  
  /**
  		 * List of unit systems (imperial, metric) and specific units for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#unitOptions)
  		 */
  var unitOptions: js.Array[SystemOrLengthUnit] = js.native
  
  /**
  		 * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#view)
  		 */
  var view: SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html#viewModel)
  		 */
  var viewModel: DirectLineMeasurement3DViewModel = js.native
}
