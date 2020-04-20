package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`wire-frame`
import typings.arcgisJsApi.arcgisJsApiStrings.`x-ray`
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingFilterBlockFilterMode extends Object {
  /**
    * Defines the type of edges used to display a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) filtered in `wire-frame` mode. This property can only be used with `filterMode` of type `wire-frame`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var edges: js.UndefOr[SolidEdges3D | SketchEdges3D] = js.undefined
  /**
    * Defines how features are drawn while the filter is active. `solid` mode renders the features with the original texture. With `wire-frame` mode, only the edges of the features are shown. `x-ray` renders elements semi-transparent with white color. To ensure performance on client applications, it is not recommended to declare multiple filter blocks with the same filter mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    *
    * @default solid
    */
  var `type`: js.UndefOr[solid | `wire-frame` | `x-ray`] = js.undefined
}

object BuildingFilterBlockFilterMode {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    edges: SolidEdges3D | SketchEdges3D = null,
    `type`: solid | `wire-frame` | `x-ray` = null
  ): BuildingFilterBlockFilterMode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingFilterBlockFilterMode]
  }
}

