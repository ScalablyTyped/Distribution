package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HomeViewModelProperties extends GoToProperties {
  /**
    * The view associated with the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), or point of view, to zoom to when going home. The initial value is determined a few different ways:
    *   * If no [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is provided, the value is `null`.
    *   * If the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is ready, but the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is not defined, the  initial value of the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is determined when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) became ready.
    *   * If the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is ready and the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is defined by the user, the initial viewpoint value is the user-defined [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#viewpoint)
    *
    * @default null
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.native
}

object HomeViewModelProperties {
  @scala.inline
  def apply(): HomeViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HomeViewModelProperties]
  }
  @scala.inline
  implicit class HomeViewModelPropertiesOps[Self <: HomeViewModelProperties] (val x: Self) extends AnyVal {
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
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = this.set("viewpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewpoint: Self = this.set("viewpoint", js.undefined)
  }
  
}

