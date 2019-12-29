package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceViewModelProperties extends js.Object {
  /**
    * Indicates whether the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) and layers that are draped on the ground surface are excluded from the slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludeGroundSurface)
    *
    * @default false
    */
  var excludeGroundSurface: js.UndefOr[Boolean] = js.undefined
  /**
    * Add layers to this collection to exclude them from the slice. Layers that are draped on the ground surface are not affected by this property
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludedLayers)
    */
  var excludedLayers: js.UndefOr[CollectionProperties[LayerProperties | BuildingComponentSublayerProperties]] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}

object SliceViewModelProperties {
  @scala.inline
  def apply(
    excludeGroundSurface: js.UndefOr[Boolean] = js.undefined,
    excludedLayers: CollectionProperties[LayerProperties | BuildingComponentSublayerProperties] = null,
    view: SceneViewProperties = null
  ): SliceViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeGroundSurface)) __obj.updateDynamic("excludeGroundSurface")(excludeGroundSurface.asInstanceOf[js.Any])
    if (excludedLayers != null) __obj.updateDynamic("excludedLayers")(excludedLayers.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceViewModelProperties]
  }
}

