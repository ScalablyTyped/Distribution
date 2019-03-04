package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsAltitude extends AnonymousAccessor {
  /**
    * The maximum allowed camera altitude (in meters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default EARTH_RADIUS * 4
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum allowed camera altitude (in meters).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default -∞
    */
  var min: js.UndefOr[scala.Double] = js.undefined
}

object SceneViewConstraintsAltitude {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    get: js.Function1[/* propertyName */ java.lang.String, _] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    set: (js.Function2[
      /* propertyName */ java.lang.String, 
      /* value */ js.Any, 
      SceneViewConstraintsAltitude
    ]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], SceneViewConstraintsAltitude]) = null,
    watch: js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ] = null
  ): SceneViewConstraintsAltitude = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (get != null) __obj.updateDynamic("get")(get)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[SceneViewConstraintsAltitude]
  }
}

