package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchDefaultUpdateOptions extends Object {
  /**
    * Indicates if the `rotation` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    *
    * @default true
    */
  var enableRotation: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the `scale` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    *
    * @default true
    */
  var enableScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether more than one selection can be made at once. This pertains to shift+click interaction with the `transform` tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    *
    * @default true
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`. Only applies if `tool` is `transform` and is always `true` when transforming points that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    *
    * @default false
    */
  var preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    *
    * @default true
    */
  var toggleToolOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the update tool. The default tool is `transform` for graphics with polygon and polyline geometries and `move` for graphics with point and multipoint geometries. However, if a graphic with point geometry uses a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), the default tool is `transform`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var tool: js.UndefOr[String] = js.undefined
}

object SketchDefaultUpdateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    enableRotation: js.UndefOr[Boolean] = js.undefined,
    enableScaling: js.UndefOr[Boolean] = js.undefined,
    multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined,
    preserveAspectRatio: js.UndefOr[Boolean] = js.undefined,
    toggleToolOnClick: js.UndefOr[Boolean] = js.undefined,
    tool: String = null
  ): SketchDefaultUpdateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(enableRotation)) __obj.updateDynamic("enableRotation")(enableRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScaling)) __obj.updateDynamic("enableScaling")(enableScaling.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleSelectionEnabled)) __obj.updateDynamic("multipleSelectionEnabled")(multipleSelectionEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveAspectRatio)) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleToolOnClick)) __obj.updateDynamic("toggleToolOnClick")(toggleToolOnClick.asInstanceOf[js.Any])
    if (tool != null) __obj.updateDynamic("tool")(tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchDefaultUpdateOptions]
  }
}

