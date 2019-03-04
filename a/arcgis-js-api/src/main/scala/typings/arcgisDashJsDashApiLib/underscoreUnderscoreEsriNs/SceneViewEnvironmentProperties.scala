package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironmentProperties
  extends stdLib.Object {
  /**
    * Atmosphere conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphere: js.UndefOr[SceneViewEnvironmentAtmosphereProperties] = js.undefined
  /**
    * Indicates whether atmosphere visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphereEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed. By default this is simply a single, fully opaque, black color. Currently [ColorBackground](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html) is the only type of background supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var background: js.UndefOr[BackgroundProperties] = js.undefined
  /**
    * Lighting conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var lighting: js.UndefOr[SceneViewEnvironmentLightingProperties] = js.undefined
  /**
    * Indicates whether stars visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var starsEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object SceneViewEnvironmentProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    atmosphere: SceneViewEnvironmentAtmosphereProperties = null,
    atmosphereEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    background: BackgroundProperties = null,
    lighting: SceneViewEnvironmentLightingProperties = null,
    starsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): SceneViewEnvironmentProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (atmosphere != null) __obj.updateDynamic("atmosphere")(atmosphere)
    if (!js.isUndefined(atmosphereEnabled)) __obj.updateDynamic("atmosphereEnabled")(atmosphereEnabled)
    if (background != null) __obj.updateDynamic("background")(background)
    if (lighting != null) __obj.updateDynamic("lighting")(lighting)
    if (!js.isUndefined(starsEnabled)) __obj.updateDynamic("starsEnabled")(starsEnabled)
    __obj.asInstanceOf[SceneViewEnvironmentProperties]
  }
}

