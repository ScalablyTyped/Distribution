package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomViewModelProperties extends js.Object {
  /**
    * Indicates if the view can zoom in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomIn)
    */
  var canZoomIn: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the view can zoom out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomOut)
    */
  var canZoomOut: js.UndefOr[Boolean] = js.undefined
  /**
    * The view from which to operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object ZoomViewModelProperties {
  @scala.inline
  def apply(
    canZoomIn: js.UndefOr[Boolean] = js.undefined,
    canZoomOut: js.UndefOr[Boolean] = js.undefined,
    view: MapViewProperties | SceneViewProperties = null
  ): ZoomViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canZoomIn)) __obj.updateDynamic("canZoomIn")(canZoomIn)
    if (!js.isUndefined(canZoomOut)) __obj.updateDynamic("canZoomOut")(canZoomOut)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomViewModelProperties]
  }
}

