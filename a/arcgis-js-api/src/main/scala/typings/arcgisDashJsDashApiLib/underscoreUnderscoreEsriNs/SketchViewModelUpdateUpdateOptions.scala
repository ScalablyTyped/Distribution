package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelUpdateUpdateOptions
  extends stdLib.Object {
  /**
    * Indicates if the `rotation` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    *
    * @default true
    */
  var enableRotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the `scale` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    *
    * @default true
    */
  var enableScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    *
    * @default false
    */
  var preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    *
    * @default true
    */
  var toggleToolOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the update tool. Specifies the update operation for the selected graphics.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * transform | The *default* tool for graphics with [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) and [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries. It allows one or multiple graphics to be scaled, rotated and moved by default. Its default behavior can be changed by setting `enableRotation`, `enableScaling` or `preserveAspectRatio` properties when calling `update` method or setting them on [defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions) property when the widget initializes. This tool does not apply if selected graphics have only [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) or [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometries.
    * reshape | It allows the entire graphic or individual vertices of the graphic to be moved. Vertices can be added or removed. This tool can only be used with one graphic and the graphic's geometry has to be [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html).
    * move | The *default* tool for graphics with [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) and [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometries. It should be used for specific cases where you just want to move selected `polygon` and `polyline` graphics without additional options. Additionally, the `move` tool does not support toggling to different modes, since `move` operation is already built into both `transform` and `reshape` tools by default.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    */
  var tool: js.UndefOr[java.lang.String] = js.undefined
}

object SketchViewModelUpdateUpdateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    enableRotation: js.UndefOr[scala.Boolean] = js.undefined,
    enableScaling: js.UndefOr[scala.Boolean] = js.undefined,
    preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    toggleToolOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    tool: java.lang.String = null
  ): SketchViewModelUpdateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation)
    if (!js.isUndefined(enableScaling)) __obj.updateDynamic("enableScaling")(enableScaling)
    if (!js.isUndefined(preserveAspectRatio)) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (!js.isUndefined(toggleToolOnClick)) __obj.updateDynamic("toggleToolOnClick")(toggleToolOnClick)
    if (tool != null) __obj.updateDynamic("tool")(tool)
    __obj.asInstanceOf[SketchViewModelUpdateUpdateOptions]
  }
}

