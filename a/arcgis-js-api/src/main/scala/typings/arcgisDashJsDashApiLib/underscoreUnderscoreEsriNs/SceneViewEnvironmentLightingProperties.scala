package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironmentLightingProperties
  extends stdLib.Object {
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default false
    */
  var ambientOcclusionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var cameraTrackingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The current date and time of the simulated sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default new Date("March 15, 2015 12:00:00")
    */
  var date: js.UndefOr[DateProperties] = js.undefined
  /**
    * Indicates whether to show shadows cast by the sun. Shadows are only displayed for real world 3D objects. Terrain doesn't cast shadows. In local scenes at small zoom levels, shadows are not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default false
    */
  var directShadowsEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object SceneViewEnvironmentLightingProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    ambientOcclusionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    cameraTrackingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    date: DateProperties = null,
    directShadowsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): SceneViewEnvironmentLightingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (!js.isUndefined(ambientOcclusionEnabled)) __obj.updateDynamic("ambientOcclusionEnabled")(ambientOcclusionEnabled)
    if (!js.isUndefined(cameraTrackingEnabled)) __obj.updateDynamic("cameraTrackingEnabled")(cameraTrackingEnabled)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(directShadowsEnabled)) __obj.updateDynamic("directShadowsEnabled")(directShadowsEnabled)
    __obj.asInstanceOf[SceneViewEnvironmentLightingProperties]
  }
}

