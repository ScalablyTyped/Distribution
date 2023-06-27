package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnappingControls
  extends StObject
     with Widget_ {
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/SnappingControls#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#iconClass)
  		 */
  var iconClass: String = js.native
  
  /**
  		 * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for sketching.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#snappingOptions)
  		 */
  var snappingOptions: SnappingOptions = js.native
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for the SnappingControls widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#viewModel)
  		 */
  var viewModel: SnappingControlsViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#visibleElements)
  		 */
  var visibleElements: SnappingControlsVisibleElements = js.native
}
