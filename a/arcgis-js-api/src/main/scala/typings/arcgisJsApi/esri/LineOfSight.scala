package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOfSight
  extends StObject
     with Widget_ {
  
  /**
  		 * The line of sight analysis object being created or modified by the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html#analysis)
  		 */
  val analysis: LineOfSightAnalysis = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/LineOfSight#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html#view)
  		 */
  var view: SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html#viewModel)
  		 */
  var viewModel: LineOfSightViewModel = js.native
}
