package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var quality: js.UndefOr[String] = js.undefined
}

object SceneViewEnvironmentAtmosphereProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    quality: String = null
  ): SceneViewEnvironmentAtmosphereProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (quality != null) __obj.updateDynamic("quality")(quality)
    __obj.asInstanceOf[SceneViewEnvironmentAtmosphereProperties]
  }
}

