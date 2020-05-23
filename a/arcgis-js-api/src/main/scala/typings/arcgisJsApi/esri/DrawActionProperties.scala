package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawActionProperties extends js.Object {
  /**
    * Controls whether the created geometry will have z coordinates or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#hasZ)
    *
    * @default true
    */
  var hasZ: js.UndefOr[Double] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object DrawActionProperties {
  @scala.inline
  def apply(hasZ: js.UndefOr[Double] = js.undefined, view: MapViewProperties = null): DrawActionProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawActionProperties]
  }
}

