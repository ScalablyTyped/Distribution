package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomViewModel extends Accessor {
  /**
    * Indicates if the view can zoom in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomIn)
    */
  var canZoomIn: scala.Boolean = js.native
  /**
    * Indicates if the view can zoom out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomOut)
    */
  var canZoomOut: scala.Boolean = js.native
  /**
    * The current state of the widget.  **Possible Values:** disabled | ready
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#state)
    *
    * @default disabled
    */
  val state: java.lang.String = js.native
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
    *
    *
    */
  def zoomIn(): scala.Unit = js.native
  /**
    * Zooms the view out by an LOD factor of 2.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#zoomOut)
    *
    *
    */
  def zoomOut(): scala.Unit = js.native
}

@JSGlobal("__esri.ZoomViewModel")
@js.native
class ZoomViewModelCls () extends ZoomViewModel {
  def this(properties: ZoomViewModelProperties) = this()
}

