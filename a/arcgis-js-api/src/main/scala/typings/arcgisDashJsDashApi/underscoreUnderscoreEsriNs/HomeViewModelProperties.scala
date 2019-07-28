package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HomeViewModelProperties extends GoToProperties {
  /**
    * The view associated with the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
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
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
}

object HomeViewModelProperties {
  @scala.inline
  def apply(
    goToOverride: GoToOverride = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewpoint: ViewpointProperties = null
  ): HomeViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(goToOverride)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewpoint != null) __obj.updateDynamic("viewpoint")(viewpoint)
    __obj.asInstanceOf[HomeViewModelProperties]
  }
}

