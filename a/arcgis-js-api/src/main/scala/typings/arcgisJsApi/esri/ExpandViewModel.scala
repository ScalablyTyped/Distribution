package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * Automatically collapses the expand widget instance when the view's viewpoint updates.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#autoCollapse)
  		 */
  var autoCollapse: Boolean = js.native
  
  /**
  		 * Whether the widget is currently expanded or not.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#expanded)
  		 */
  var expanded: Boolean = js.native
  
  /**
  		 * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#group)
  		 */
  var group: String = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#state)
  		 */
  val state: ready | disabled = js.native
  
  /**
  		 * The view in which the Expand is used.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
