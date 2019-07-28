package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleBarViewModelProperties extends js.Object {
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar-ScaleBarViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object ScaleBarViewModelProperties {
  @scala.inline
  def apply(view: MapViewProperties = null): ScaleBarViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ScaleBarViewModelProperties]
  }
}

