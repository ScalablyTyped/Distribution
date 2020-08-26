package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomViewModelProperties extends js.Object {
  /**
    * Indicates if the view can zoom in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomIn)
    */
  var canZoomIn: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the view can zoom out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#canZoomOut)
    */
  var canZoomOut: js.UndefOr[Boolean] = js.native
  /**
    * The view from which to operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom-ZoomViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object ZoomViewModelProperties {
  @scala.inline
  def apply(): ZoomViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomViewModelProperties]
  }
  @scala.inline
  implicit class ZoomViewModelPropertiesOps[Self <: ZoomViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanZoomIn(value: Boolean): Self = this.set("canZoomIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanZoomIn: Self = this.set("canZoomIn", js.undefined)
    @scala.inline
    def setCanZoomOut(value: Boolean): Self = this.set("canZoomOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanZoomOut: Self = this.set("canZoomOut", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

