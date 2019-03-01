package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureViewModelProperties extends js.Object {
  /**
    * The [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used to represent the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#graphic)
    *
    * @default null
    */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  /**
    * The view associated with the Feature instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#view)
    *
    * @default null
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object FeatureViewModelProperties {
  @scala.inline
  def apply(graphic: GraphicProperties = null, view: MapViewProperties | SceneViewProperties = null): FeatureViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (graphic != null) __obj.updateDynamic("graphic")(graphic)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureViewModelProperties]
  }
}

