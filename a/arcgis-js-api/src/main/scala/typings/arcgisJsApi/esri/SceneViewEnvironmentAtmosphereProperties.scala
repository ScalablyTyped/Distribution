package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.low
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewEnvironmentAtmosphereProperties extends Object {
  /**
    * Indicates the quality of the atmosphere visualization. The quality of the atmosphere may have a significant impact on performance. This setting does not have any effect in [local scenes](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode).
    *
    *   Known Value | Example
    *   ------------|---------
    *   low | ![scene-atmosphere](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-atmosphere.png)
    *   high | ![scene-atmosphere](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-atmosphere-realistic.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default low
    */
  var quality: js.UndefOr[low | high] = js.native
}

object SceneViewEnvironmentAtmosphereProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewEnvironmentAtmosphereProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewEnvironmentAtmosphereProperties]
  }
  @scala.inline
  implicit class SceneViewEnvironmentAtmospherePropertiesOps[Self <: SceneViewEnvironmentAtmosphereProperties] (val x: Self) extends AnyVal {
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
    def setQuality(value: low | high): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

