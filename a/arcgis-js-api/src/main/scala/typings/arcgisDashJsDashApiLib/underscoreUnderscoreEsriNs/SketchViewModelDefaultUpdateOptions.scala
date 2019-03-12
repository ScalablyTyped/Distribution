package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchViewModelDefaultUpdateOptions
  extends stdLib.Object {
  /**
    * Indicates if the `rotation` operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    *
    * @default true
    */
  var enableRotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the `scale` operation will be enabled when updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    *
    * @default true
    */
  var enableScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    *
    * @default false
    */
  var preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    *
    * @default true
    */
  var toggleToolOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of the update tool. The default tool is `move` for graphics with `point` and `multipoint` geometries and `transform` for graphics with `polygon` and `polyline` geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var tool: js.UndefOr[java.lang.String] = js.undefined
}

object SketchViewModelDefaultUpdateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    enableRotation: js.UndefOr[scala.Boolean] = js.undefined,
    enableScaling: js.UndefOr[scala.Boolean] = js.undefined,
    preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    toggleToolOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    tool: java.lang.String = null
  ): SketchViewModelDefaultUpdateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation)
    if (!js.isUndefined(enableScaling)) __obj.updateDynamic("enableScaling")(enableScaling)
    if (!js.isUndefined(preserveAspectRatio)) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (!js.isUndefined(toggleToolOnClick)) __obj.updateDynamic("toggleToolOnClick")(toggleToolOnClick)
    if (tool != null) __obj.updateDynamic("tool")(tool)
    __obj.asInstanceOf[SketchViewModelDefaultUpdateOptions]
  }
}

