package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironment extends AnonymousAccessor {
  /**
    * Atmosphere conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphere: js.UndefOr[SceneViewEnvironmentAtmosphere] = js.undefined
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
  var background: js.UndefOr[Background] = js.undefined
  /**
    * Lighting conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var lighting: js.UndefOr[SceneViewEnvironmentLighting] = js.undefined
  /**
    * Indicates whether stars visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var starsEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object SceneViewEnvironment {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    atmosphere: SceneViewEnvironmentAtmosphere = null,
    atmosphereEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    background: Background = null,
    get: js.Function1[/* propertyName */ java.lang.String, _] = null,
    lighting: SceneViewEnvironmentLighting = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, SceneViewEnvironment]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], SceneViewEnvironment]) = null,
    starsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    watch: js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ] = null
  ): SceneViewEnvironment = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (atmosphere != null) __obj.updateDynamic("atmosphere")(atmosphere)
    if (!js.isUndefined(atmosphereEnabled)) __obj.updateDynamic("atmosphereEnabled")(atmosphereEnabled)
    if (background != null) __obj.updateDynamic("background")(background)
    if (get != null) __obj.updateDynamic("get")(get)
    if (lighting != null) __obj.updateDynamic("lighting")(lighting)
    if (set != null) __obj.updateDynamic("set")(set)
    if (!js.isUndefined(starsEnabled)) __obj.updateDynamic("starsEnabled")(starsEnabled)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[SceneViewEnvironment]
  }
}

