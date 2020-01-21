package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributionViewModelProperties extends js.Object {
  /**
    * The view from which the view model will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object AttributionViewModelProperties {
  @scala.inline
  def apply(view: MapViewProperties | SceneViewProperties = null): AttributionViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributionViewModelProperties]
  }
}

