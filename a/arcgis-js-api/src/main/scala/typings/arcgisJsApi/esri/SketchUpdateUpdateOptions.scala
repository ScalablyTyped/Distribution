package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchUpdateUpdateOptions extends Object {
  /**
    * Indicates if the `rotation` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var enableRotation: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the `scale` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var enableScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if z-values can be modified when updating the graphic. When enabled, the height handle manipulator is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var enableZ: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether more than one selection can be made at once.  This applies to the shift+click interaction with the `transform` tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`. Only applies if `tool` is `transform` and is always `true` when transforming points that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default false
    */
  var preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @default true
    */
  var toggleToolOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the update tool. Specifies the update operation for the selected graphics. The provided tool will become the [activeTool](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#activeTool).  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * transform | This is the *default* tool for graphics with a [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry, [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry or graphics that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html) with a [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry. It allows one or multiple graphics to be scaled, rotated and moved by default. Its default behavior can be changed by setting the `enableRotation`, `enableScaling` or `preserveAspectRatio` arguments when calling the `update` method or setting them on the [defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions) property when the Sketch widget initializes.
    * reshape | This tool allows the entire graphic or individual vertices of the graphic to be moved. Vertices can be added or removed. This tool can only be used with a single graphic that has a [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    * move | This is the *default* tool for graphics with a [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry that do not use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html). It should be used for specific cases where you just want to move selected `polygon` and `polyline` graphics without additional options. Additionally, the `move` tool does not support toggling to different modes, since the `move` operation is built into both the `transform` and `reshape` tools by default.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  var tool: js.UndefOr[transform | reshape | move] = js.undefined
}

object SketchUpdateUpdateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    enableRotation: js.UndefOr[Boolean] = js.undefined,
    enableScaling: js.UndefOr[Boolean] = js.undefined,
    enableZ: js.UndefOr[Boolean] = js.undefined,
    multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined,
    preserveAspectRatio: js.UndefOr[Boolean] = js.undefined,
    toggleToolOnClick: js.UndefOr[Boolean] = js.undefined,
    tool: transform | reshape | move = null
  ): SketchUpdateUpdateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScaling)) __obj.updateDynamic("enableScaling")(enableScaling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableZ)) __obj.updateDynamic("enableZ")(enableZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleSelectionEnabled)) __obj.updateDynamic("multipleSelectionEnabled")(multipleSelectionEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveAspectRatio)) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleToolOnClick)) __obj.updateDynamic("toggleToolOnClick")(toggleToolOnClick.get.asInstanceOf[js.Any])
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchUpdateUpdateOptions]
  }
}

