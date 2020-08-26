package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewEnvironmentProperties extends Object {
  /**
    * Atmosphere conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphere: js.UndefOr[SceneViewEnvironmentAtmosphereProperties] = js.native
  /**
    * Indicates whether atmosphere visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed. By default this is simply a single, fully opaque, black color. Currently [ColorBackground](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html) is the only type of background supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var background: js.UndefOr[BackgroundProperties] = js.native
  /**
    * Lighting conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var lighting: js.UndefOr[SceneViewEnvironmentLightingProperties] = js.native
  /**
    * Indicates whether stars visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var starsEnabled: js.UndefOr[Boolean] = js.native
}

object SceneViewEnvironmentProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewEnvironmentProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewEnvironmentProperties]
  }
  @scala.inline
  implicit class SceneViewEnvironmentPropertiesOps[Self <: SceneViewEnvironmentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtmosphere(value: SceneViewEnvironmentAtmosphereProperties): Self = this.set("atmosphere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtmosphere: Self = this.set("atmosphere", js.undefined)
    @scala.inline
    def setAtmosphereEnabled(value: Boolean): Self = this.set("atmosphereEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtmosphereEnabled: Self = this.set("atmosphereEnabled", js.undefined)
    @scala.inline
    def setBackground(value: BackgroundProperties): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setLighting(value: SceneViewEnvironmentLightingProperties): Self = this.set("lighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLighting: Self = this.set("lighting", js.undefined)
    @scala.inline
    def setStarsEnabled(value: Boolean): Self = this.set("starsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarsEnabled: Self = this.set("starsEnabled", js.undefined)
  }
  
}

