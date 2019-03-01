package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceViewModelProperties extends js.Object {
  /**
    * Indicates whether the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) and layers that are draped on the ground surface are excluded from the slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludeGroundSurface)
    */
  var excludeGroundSurface: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add layers to this collection to exclude them from the slice. Layers that are draped on the ground surface are not affected by this property and can be excluded from the slice using [excludeGroundSurface](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludeGroundSurface).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludedLayers)
    */
  var excludedLayers: js.UndefOr[CollectionProperties[LayerProperties | BuildingComponentSublayerProperties]] = js.undefined
}

object SliceViewModelProperties {
  @scala.inline
  def apply(
    excludeGroundSurface: js.UndefOr[scala.Boolean] = js.undefined,
    excludedLayers: CollectionProperties[LayerProperties | BuildingComponentSublayerProperties] = null
  ): SliceViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeGroundSurface)) __obj.updateDynamic("excludeGroundSurface")(excludeGroundSurface)
    if (excludedLayers != null) __obj.updateDynamic("excludedLayers")(excludedLayers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceViewModelProperties]
  }
}

