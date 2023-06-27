package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributionViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * A collection of [AttributionItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#AttributionItem)s.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#items)
  		 */
  val items: Collection[AttributionItem] = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#state)
  		 */
  val state: disabled | ready | loading = js.native
  
  /**
  		 * The view from which the view model will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
