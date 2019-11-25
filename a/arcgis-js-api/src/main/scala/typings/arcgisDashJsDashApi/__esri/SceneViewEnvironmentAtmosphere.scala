package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironmentAtmosphere extends AnonymousAccessor {
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

object SceneViewEnvironmentAtmosphere {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    get: /* propertyName */ String => _ = null,
    quality: String = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewEnvironmentAtmosphere]) with (js.Function1[/* props */ HashMap[_], SceneViewEnvironmentAtmosphere]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): SceneViewEnvironmentAtmosphere = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[SceneViewEnvironmentAtmosphere]
  }
}

