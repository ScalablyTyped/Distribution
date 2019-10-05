package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironmentLightingProperties extends Object {
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default false
    */
  var ambientOcclusionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var cameraTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The current date and time of the simulated sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default new Date("March 15, 2015 12:00:00")
    */
  var date: js.UndefOr[DateProperties] = js.undefined
  /**
    * Indicates whether to show shadows cast by the sun. Shadows are only displayed for real world 3D objects. Terrain doesn't cast shadows. In local scenes at small zoom levels, shadows are not displayed. For more control on which 3D objects cast shadows use the `castShadows` property available on [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows), [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#castShadows), [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#castShadows), and [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default false
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.undefined
}

object SceneViewEnvironmentLightingProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    ambientOcclusionEnabled: js.UndefOr[Boolean] = js.undefined,
    cameraTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    date: DateProperties = null,
    directShadowsEnabled: js.UndefOr[Boolean] = js.undefined
  ): SceneViewEnvironmentLightingProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(ambientOcclusionEnabled)) __obj.updateDynamic("ambientOcclusionEnabled")(ambientOcclusionEnabled)
    if (!js.isUndefined(cameraTrackingEnabled)) __obj.updateDynamic("cameraTrackingEnabled")(cameraTrackingEnabled)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(directShadowsEnabled)) __obj.updateDynamic("directShadowsEnabled")(directShadowsEnabled)
    __obj.asInstanceOf[SceneViewEnvironmentLightingProperties]
  }
}

