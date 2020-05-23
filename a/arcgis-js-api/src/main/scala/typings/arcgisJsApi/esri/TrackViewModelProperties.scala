package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackViewModelProperties
  extends GeolocationPositioningProperties
     with GoToProperties

object TrackViewModelProperties {
  @scala.inline
  def apply(
    geolocationOptions: js.Any = null,
    goToLocationEnabled: js.UndefOr[Boolean] = js.undefined,
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Unit = null,
    graphic: GraphicProperties = null,
    scale: js.UndefOr[Double] = js.undefined,
    view: MapViewProperties | SceneViewProperties = null
  ): TrackViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (geolocationOptions != null) __obj.updateDynamic("geolocationOptions")(geolocationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(goToLocationEnabled)) __obj.updateDynamic("goToLocationEnabled")(goToLocationEnabled.get.asInstanceOf[js.Any])
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2(goToOverride))
    if (graphic != null) __obj.updateDynamic("graphic")(graphic.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackViewModelProperties]
  }
}

