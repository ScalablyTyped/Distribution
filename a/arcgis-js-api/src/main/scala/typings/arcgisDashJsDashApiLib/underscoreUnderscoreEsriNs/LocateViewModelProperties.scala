package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateViewModelProperties
  extends GeolocationPositioningProperties
     with GoToProperties

object LocateViewModelProperties {
  @scala.inline
  def apply(
    geolocationOptions: js.Any = null,
    goToLocationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    goToOverride: GoToOverride = null,
    graphic: GraphicProperties = null,
    scale: scala.Int | scala.Double = null,
    view: MapViewProperties | SceneViewProperties = null
  ): LocateViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (geolocationOptions != null) __obj.updateDynamic("geolocationOptions")(geolocationOptions)
    if (!js.isUndefined(goToLocationEnabled)) __obj.updateDynamic("goToLocationEnabled")(goToLocationEnabled)
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(goToOverride)
    if (graphic != null) __obj.updateDynamic("graphic")(graphic)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateViewModelProperties]
  }
}

