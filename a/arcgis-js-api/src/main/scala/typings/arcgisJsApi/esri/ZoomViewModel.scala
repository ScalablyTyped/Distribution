package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * Indicates if the view can zoom in.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomIn)
  		 */
  var canZoomIn: Boolean = js.native
  
  /**
  		 * Indicates if the view can zoom out.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomOut)
  		 */
  var canZoomOut: Boolean = js.native
  
  /**
  		 * The current state of the widget.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#state)
  		 */
  val state: disabled | ready = js.native
  
  /**
  		 * The view from which to operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * Zooms the view in by an LOD factor of 0.5.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#zoomIn)
  		 */
  def zoomIn(): scala.Unit = js.native
  
  /**
  		 * Zooms the view out by an LOD factor of 2.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#zoomOut)
  		 */
  def zoomOut(): scala.Unit = js.native
}
