package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironmentProperties extends Object {
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
  var atmosphereEnabled: js.UndefOr[Boolean] = js.undefined
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
  var starsEnabled: js.UndefOr[Boolean] = js.undefined
}

object SceneViewEnvironmentProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    atmosphere: SceneViewEnvironmentAtmosphereProperties = null,
    atmosphereEnabled: js.UndefOr[Boolean] = js.undefined,
    background: BackgroundProperties = null,
    lighting: SceneViewEnvironmentLightingProperties = null,
    starsEnabled: js.UndefOr[Boolean] = js.undefined
  ): SceneViewEnvironmentProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (atmosphere != null) __obj.updateDynamic("atmosphere")(atmosphere.asInstanceOf[js.Any])
    if (!js.isUndefined(atmosphereEnabled)) __obj.updateDynamic("atmosphereEnabled")(atmosphereEnabled.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (lighting != null) __obj.updateDynamic("lighting")(lighting.asInstanceOf[js.Any])
    if (!js.isUndefined(starsEnabled)) __obj.updateDynamic("starsEnabled")(starsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewEnvironmentProperties]
  }
}

