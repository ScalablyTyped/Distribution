package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnappingControlsViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for sketching.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls-SnappingControlsViewModel.html#snappingOptions)
  		 */
  var snappingOptions: SnappingOptions = js.native
  
  /**
  		 * The current state of the view model.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls-SnappingControlsViewModel.html#state)
  		 */
  val state: ready | disabled = js.native
  
  /**
  		 * The view associated with the SnappingControls widget instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls-SnappingControlsViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
