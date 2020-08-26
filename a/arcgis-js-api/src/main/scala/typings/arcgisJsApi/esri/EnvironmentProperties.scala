package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentProperties extends js.Object {
  /**
    * Specifies whether the atmosphere should be displayed. Typically this consists of haze and sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#atmosphereEnabled)
    *
    * @default true
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed. The default value of `null` displays a single, fully opaque, black color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#background)
    *
    * @default null
    */
  var background: js.UndefOr[BackgroundProperties] = js.native
  /**
    * Settings for defining the lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#lighting)
    */
  var lighting: js.UndefOr[LightingProperties] = js.native
  /**
    * Specifies whether stars should be displayed in the sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#starsEnabled)
    *
    * @default true
    */
  var starsEnabled: js.UndefOr[Boolean] = js.native
}

object EnvironmentProperties {
  @scala.inline
  def apply(): EnvironmentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentProperties]
  }
  @scala.inline
  implicit class EnvironmentPropertiesOps[Self <: EnvironmentProperties] (val x: Self) extends AnyVal {
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
    def setAtmosphereEnabled(value: Boolean): Self = this.set("atmosphereEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtmosphereEnabled: Self = this.set("atmosphereEnabled", js.undefined)
    @scala.inline
    def setBackground(value: BackgroundProperties): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setLighting(value: LightingProperties): Self = this.set("lighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLighting: Self = this.set("lighting", js.undefined)
    @scala.inline
    def setStarsEnabled(value: Boolean): Self = this.set("starsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarsEnabled: Self = this.set("starsEnabled", js.undefined)
  }
  
}

