package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentProperties extends js.Object {
  /**
    * Specifies whether the atmosphere should be displayed. Typically this consists of haze and sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#atmosphereEnabled)
    *
    * @default true
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed. The default value of `null` displays a single, fully opaque, black color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#background)
    *
    * @default null
    */
  var background: js.UndefOr[BackgroundProperties] = js.undefined
  /**
    * Settings for defining the lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#lighting)
    */
  var lighting: js.UndefOr[LightingProperties] = js.undefined
  /**
    * Specifies whether stars should be displayed in the sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#starsEnabled)
    *
    * @default true
    */
  var starsEnabled: js.UndefOr[Boolean] = js.undefined
}

object EnvironmentProperties {
  @scala.inline
  def apply(
    atmosphereEnabled: js.UndefOr[Boolean] = js.undefined,
    background: BackgroundProperties = null,
    lighting: LightingProperties = null,
    starsEnabled: js.UndefOr[Boolean] = js.undefined
  ): EnvironmentProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(atmosphereEnabled)) __obj.updateDynamic("atmosphereEnabled")(atmosphereEnabled.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (lighting != null) __obj.updateDynamic("lighting")(lighting.asInstanceOf[js.Any])
    if (!js.isUndefined(starsEnabled)) __obj.updateDynamic("starsEnabled")(starsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentProperties]
  }
}

