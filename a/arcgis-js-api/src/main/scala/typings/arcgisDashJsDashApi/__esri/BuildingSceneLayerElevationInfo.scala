package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`absolute-height`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingSceneLayerElevationInfo extends Object {
  /**
    * Defines how features are placed on the vertical axis (z). Currently only `absolute-height` mode is supported.
    *
    * Mode | Description
    * ------|------------
    * absolute-height | Features are placed at an absolute elevation (z-value) above sea level. This z-value is determined by summing up the `offset` value and the point's z-value. It doesn't take the elevation of the terrain into account. This is the only supported elevation mode for a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    */
  var mode: `absolute-height`
  /**
    * An elevation offset, which is added to the vertical position of each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    *
    * @default 0
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The unit for `offset` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    *
    * @default meters
    */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.undefined
}

object BuildingSceneLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: `absolute-height`,
    propertyIsEnumerable: PropertyKey => Boolean,
    offset: Int | Double = null,
    unit: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards = null
  ): BuildingSceneLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingSceneLayerElevationInfo]
  }
}

