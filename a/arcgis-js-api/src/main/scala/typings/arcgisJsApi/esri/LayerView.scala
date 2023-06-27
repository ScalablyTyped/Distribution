package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerView
  extends StObject
     with Accessor
     with corePromise
     with Identifiable {
  
  /**
  		 * The layer being viewed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#layer)
  		 */
  val layer: Layer = js.native
  
  /**
  		 * Indicates if the	 [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#spatialReference) of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) is supported by the layer view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#spatialReferenceSupported)
  		 */
  val spatialReferenceSupported: Boolean = js.native
  
  /**
  		 * Value is `true` if the layer is suspended (i.e., layer will not redraw or update itself when the extent changes).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#suspended)
  		 */
  val suspended: Boolean = js.native
  
  /**
  		 * Value is `true` when the layer is updating; for example, if it is in the process of fetching data.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#updating)
  		 */
  val updating: Boolean = js.native
  
  /**
  		 * When `true`, the layer is visible in the view.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#visible)
  		 */
  var visible: Boolean = js.native
}
